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
import usedcar.model.Quote;
import usedcar.service.UserService;

@Controller
public class CustomerController {

	@Autowired
	Customerdao customerdao;
	@Autowired
	Admindao admindao;
	@Autowired
	UserService userservice;

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

		int r = userservice.login(email, password);
		if (r == 1) {
			Customer customer = customerdao.fetchcustomer(email, password);
			List<Car> car = customerdao.fetchCar();

			m.addAttribute("car", car);
			m.addAttribute("customer", customer);
			return jconst.custhome;
		}

		return jconst.error;
	}

	@RequestMapping(path = "/cardetails", method = RequestMethod.POST)
	public String CarDetails(@RequestParam("carid") int carid, @RequestParam("email") String email, Model m) {

		Car car = customerdao.carDetails(carid);
		m.addAttribute("car", car);
		m.addAttribute("email", email);

		return jconst.custCarDetails;
	}

	@RequestMapping(path = "/makeoffer", method = RequestMethod.POST)
	public String makeOffer(@ModelAttribute Quote quote, Model m) {
		int r = customerdao.makeOffer(quote);
		return jconst.custQuoteSuccess;

	}

	@RequestMapping(path = "filter", method = RequestMethod.POST)
	public String filter(@RequestParam("email") String email, Model m) {
		List<Color> color = admindao.fetchColor();
		List<Manafacturer> manafact = admindao.fetchManafact();
		m.addAttribute("color", color);
		m.addAttribute("manafact", manafact);
		m.addAttribute("email", email);
		return jconst.custFilter;
	}

	@RequestMapping(path = "/sortmct", method = RequestMethod.POST)
	public String sortmct(@RequestParam("color") String color, @RequestParam("manafacturer") String manafacturer,
			@RequestParam("transmission") String transmission, Model m) {

		List<Car> car = userservice.sort();
		return "";
	}

}
