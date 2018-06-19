package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import entity.User;

public class UserMapper implements RowMapper<User>{
	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setPatiekaloGrupe(rs.getString("patiekalogrupe"));
		user.setPatiekaloPav(rs.getString("patiekalopav"));
		user.setKalorijuSk(rs.getInt("kalorijusk"));
		user.setKaina(rs.getDouble("kaina"));
		return user;
	}
}
