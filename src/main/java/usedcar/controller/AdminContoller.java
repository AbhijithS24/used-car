package usedcar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import usedcar.constants.Jspconstants;
import usedcar.dao.Admindao;
import usedcar.dao.Customerdao;
import usedcar.model.Car;
import usedcar.model.Color;
import usedcar.model.Customer;
import usedcar.model.Manafacturer;

@Controller
@RequestMapping("/admin")
public class AdminContoller {

	@Autowired
	Customerdao customerdao;
	@Autowired
	Admindao admindao;

	Jspconstants jconst = new Jspconstants();

	@RequestMapping(path = "/adminlogin", method = RequestMethod.POST)
	public String userlogin(@RequestParam("email") String email, @RequestParam("password") String password, Model m) {
		int r = customerdao.adminlogin(email, password);
		if (r == 1) {
			Customer admin = customerdao.fetchcustomer(email, password);
			m.addAttribute("admin", admin);

			return jconst.adhome;
		}
		return jconst.error;
	}

	@RequestMapping("/adcar")
	public String adcar(Model m) {

		List<Color> color = admindao.fetchColor();
		List<Manafacturer> manafact = admindao.fetchManafact();
		m.addAttribute("color", color);
		m.addAttribute("manafact", manafact);
		return jconst.adcar;
	}

	@RequestMapping(path = "/postcar", method = RequestMethod.POST)
	public String postad(@ModelAttribute Car car) {
		int r = admindao.postad(car);
		return jconst.adSuccess;
	}

	@RequestMapping("/viewcust")
	public String viewCust(Model m) {
		List<Customer> cust = admindao.fetchCustomer();
		m.addAttribute("cust", cust);
		return jconst.adViewcust;
	}

	@RequestMapping("/makeadmin")
	public String makeadmin(@RequestParam("email") String email) {

		int r = admindao.makeAdmin(email);
		return "";
	}
}
