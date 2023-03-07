package usedcar.dao;

import java.util.List;

import usedcar.model.Car;
import usedcar.model.Color;
import usedcar.model.Customer;
import usedcar.model.Manafacturer;

public interface Admindao {

	public List<Color> fetchColor();

	public List<Manafacturer> fetchManafact();

	public int postad(Car car);

	public List<Customer> fetchCustomer();

	public int makeAdmin(String email);
}
