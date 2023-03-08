package usedcar.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import usedcar.model.Car;
import usedcar.model.Customer;
import usedcar.model.Quote;

@Repository
public class Customerdaoimpl implements Customerdao {

	private JdbcTemplate jdbctemplate;

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	public int insert(Customer customer) {

		String query = "insert into customer(name,house_name,place,pincode,email,password) values(?,?,?,?,?,?)";
		int r = this.jdbctemplate.update(query, customer.getName(), customer.getHouse_name(), customer.getPlace(),
				customer.getPincode(), customer.getEmail(), customer.getPassword());
		return r;
	}

	public int customerlogin(String email, String password) {
		String query = "SELECT COUNT(*) FROM customer WHERE email = ? AND password =?";
		int r = this.jdbctemplate.queryForObject(query, Integer.class, email, password);
		return r;
	}

	public int adminlogin(String email, String password) {
		String query = "SELECT COUNT(*) FROM customer WHERE email = ? and password =? and isadmin= 1";
		int r = this.jdbctemplate.queryForObject(query, Integer.class, email, password);
		return r;
	}

	public Customer fetchcustomer(String email, String password) {

		String query = "Select * from customer where email=? and password=?";
		RowMapper<Customer> rowMapper = new Custmapperimpl();
		Customer customer = this.jdbctemplate.queryForObject(query, rowMapper, email, password);

		return customer;
	}

	public List<Car> fetchCar() {
		String query = "select * from car";
		RowMapper<Car> carMapper = new Carmapperimpl();
		List<Car> car = this.jdbctemplate.query(query, carMapper);
		return car;
	}

	public Car carDetails(int id) {
		String query = "select * from car where ad_id=?";
		RowMapper<Car> carMapper = new Carmapperimpl();
		Car car = this.jdbctemplate.queryForObject(query, carMapper, id);
		return car;
	}

	public int makeOffer(Quote quote) {
		String query = "insert into quote(ad_id,model,manafacturer,email,remarks,quote) values (?,?,?,?,?,?) ";
		int r = this.jdbctemplate.update(query, quote.getAd_id(), quote.getModel(), quote.getManafacturer(),
				quote.getEmail(), quote.getRemarks(), quote.getQuote());
		return r;
	}

}
