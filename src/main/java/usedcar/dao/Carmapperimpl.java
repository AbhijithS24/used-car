package usedcar.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import usedcar.model.Car;

public class Carmapperimpl implements RowMapper<Car> {

	public Car mapRow(ResultSet rs, int rowNum) throws SQLException {
		Car car = new Car();
		car.setAd_id(rs.getInt(1));
		car.setImgurl(rs.getString(2));
		car.setModel(rs.getString(3));
		car.setManafacturer(rs.getString(4));
		car.setYear(rs.getInt(5));
		car.setTransmission(rs.getString(6));
		car.setColor(rs.getString(7));
		car.setKmdriven(rs.getInt(8));
		car.setPrice(rs.getInt(9));

		return car;

	}

}
