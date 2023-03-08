package usedcar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import usedcar.dao.Customerdao;
import usedcar.model.Car;

@Service
public class UserServiceimpl implements UserService {

	@Autowired
	Customerdao customerdao;

	public int login(String email, String password) {
		int r = customerdao.customerlogin(email, password);
		return r;
	}

	public List<Car> sort(String color, String manafactuer, String transmission) {
		if()
		return null;
	}

}
