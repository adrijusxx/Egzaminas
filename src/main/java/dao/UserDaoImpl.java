package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import entity.User;
import mapper.UserMapper;

public class UserDaoImpl implements UserDao{
	
	public final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public UserDaoImpl (JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<User> getAll() {
		String sql = "SELECT * FROM egzaminas";
		return jdbcTemplate.query(sql, new UserMapper());
	}
	
	@Override
	public void save(User user) {
		String sql = "INSERT INTO egzaminas (patiekalogrupe, patiekalopav, kalorijusk, kaina) VALUES (?, ?, ?, ?)";
		jdbcTemplate.update(sql, user.getPatiekaloGrupe(), user.getPatiekaloPav(), user.getKalorijuSk(), user.getKaina());
	}
	
	@Override
	public User getById(int id) {
		String sql = "SELECT * FROM egzaminas where id = ?";
		return jdbcTemplate.queryForObject(sql, new UserMapper(), id);
	}
	
	@Override
	public void update(User user) {
		String sql = "UPDATE egzaminas SET patiekalogrupe = ?, patiekalopav = ?, kalorijusk = ?, kaina = ? WHERE id = ?";
		jdbcTemplate.update(sql, user.getPatiekaloGrupe(), user.getPatiekaloPav(), user.getKalorijuSk(), user.getKaina(), user.getId());
	}
	
	@Override
	public void delete(int id) {
		String sql = "DELETE FROM egzaminas WHERE id = ?";
		jdbcTemplate.update(sql, id);
	}
}
