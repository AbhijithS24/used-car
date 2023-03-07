package usedcar.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import usedcar.model.Color;

public class Colormapperimpl implements RowMapper<Color> {

	public Color mapRow(ResultSet rs, int rowNum) throws SQLException {

		Color color = new Color();
		color.setName(rs.getString(1));

		return color;
	}

}
