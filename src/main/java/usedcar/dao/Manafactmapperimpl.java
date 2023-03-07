package usedcar.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import usedcar.model.Manafacturer;

public class Manafactmapperimpl implements RowMapper<Manafacturer> {

	public Manafacturer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Manafacturer manafact = new Manafacturer();
		manafact.setName(rs.getString(1));

		return manafact;
	}

}
