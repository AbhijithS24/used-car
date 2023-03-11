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

	public List<Car> filter(String color, String manafacturer, String transmission) {
		StringBuilder queryBuilder = new StringBuilder("SELECT * FROM car WHERE ");

		if (!color.isBlank()) {
			queryBuilder.append("color = '" + color + "'");

			if (!transmission.isBlank()) {
				queryBuilder.append(" AND transmission = '" + transmission + "'");
			}

			if (!manafacturer.isBlank()) {
				queryBuilder.append(" AND manafacturer = '" + manafacturer + "'");
			}
		} else if (!transmission.isBlank()) {
			queryBuilder.append("transmission = '" + transmission + "'");

			if (!manafacturer.isBlank()) {
				queryBuilder.append(" AND manafacturer = '" + manafacturer + "'");
			}
		} else if (!manafacturer.isBlank()) {
			queryBuilder.append("manafacturer = '" + manafacturer + "'");
		}

		String query = queryBuilder.toString();
		List<Car> car = customerdao.filter(query);
		return car;
	}

}
