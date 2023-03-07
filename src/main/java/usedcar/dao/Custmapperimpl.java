package usedcar.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import usedcar.model.Customer;

public class Custmapperimpl implements RowMapper<Customer> {

	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {

		Customer customer = new Customer();
		customer.setName(rs.getString(1));
		customer.setHouse_name(rs.getString(2));
		customer.setPlace(rs.getString(3));
		customer.setPincode(rs.getInt(4));
		customer.setEmail(rs.getString(5));
		customer.setPassword(rs.getString(6));

		return customer;

	}

}
