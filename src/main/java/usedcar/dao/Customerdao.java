package usedcar.dao;

import java.util.List;

import usedcar.model.Car;
import usedcar.model.Customer;
import usedcar.model.Quote;

public interface Customerdao {

	public int insert(Customer customer);

	public int customerlogin(String email, String password);

	public int adminlogin(String email, String password);

	public Customer fetchcustomer(String email, String password);

	public List<Car> fetchCar();

	public Car carDetails(int id);

	public int makeOffer(Quote quote);

}
