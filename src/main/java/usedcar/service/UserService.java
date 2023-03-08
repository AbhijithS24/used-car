package usedcar.service;

import java.util.List;

import usedcar.model.Car;

public interface UserService {

	public int login(String email, String password);

	public List<Car> sort(String color, String manafactuer, String transmission);

}
