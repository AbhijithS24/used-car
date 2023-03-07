package usedcar.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import usedcar.model.Car;
import usedcar.model.Color;
import usedcar.model.Customer;
import usedcar.model.Manafacturer;

@Repository
public class Admindaoimpl implements Admindao {

	private JdbcTemplate jdbctemplate;

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	public List<Color> fetchColor() {
		String query = "select * from color";
		RowMapper<Color> rowMapper = new Colormapperimpl();
		List<Color> color = this.jdbctemplate.query(query, rowMapper);
		return color;

	}

	public int adcar(Car car) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Manafacturer> fetchManafact() {
		String query = "select * from manafacturer";
		RowMapper<Manafacturer> rowMapper = new Manafactmapperimpl();
		List<Manafacturer> manafact = this.jdbctemplate.query(query, rowMapper);
		return manafact;
	}

	public int postad(Car car) {
		String query = "insert into car(imgurl,model,manafacturer,year,transmission,color,kmdriven,price) values (?,?,?,?,?,?,?,?) ";
		int r = this.jdbctemplate.update(query, car.getImgurl(), car.getModel(), car.getManafacturer(), car.getYear(),
				car.getTransmission(), car.getColor(), car.getKmdriven(), car.getPrice());

		return r;
	}

	public List<Customer> fetchCustomer() {
		String query = "select * from customer ";
		RowMapper<Customer> custMapper = new Custmapperimpl();
		List<Customer> customer = this.jdbctemplate.query(query, custMapper);
		return customer;
	}

	public int makeAdmin(String email) {
		String query = "update cutomer set isadmin=1 where email =?";
		int r = this.jdbctemplate.update(query, email);
		return r;
	}

}
