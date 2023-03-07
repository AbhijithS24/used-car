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
import usedcar.dao.Customerdao;
import usedcar.model.Car;
import usedcar.model.Customer;

@Controller
public class CustomerController {

	@Autowired
	Customerdao customerdao;

	Jspconstants jconst = new Jspconstants();

	@RequestMapping("/loginpage")
	public String loginpage() {
		return jconst.login;
	}

	@RequestMapping("/customerregister")
	public String customerregister() {
		return jconst.custregister;
	}

	@RequestMapping(path = "/processregister", method = RequestMethod.POST)
	public String customerlogin(@ModelAttribute Customer customer, Model m) {
		int r = customerdao.insert(customer);
		m.addAttribute("customer", customer);
		return jconst.registered;
	}

	@RequestMapping(path = "/customerlogin", method = RequestMethod.POST)
	public String userlogin(@RequestParam("email") String email, @RequestParam("password") String password, Model m) {
		int r = customerdao.customerlogin(email, password);
		if (r == 1) {
			Customer customer = customerdao.fetchcustomer(email, password);
			List<Car> car = customerdao.fetchCar();
			m.addAttribute("car", car);
			m.addAttribute("customer", customer);
			return jconst.custhome;
		}

		return jconst.error;
	}
}
