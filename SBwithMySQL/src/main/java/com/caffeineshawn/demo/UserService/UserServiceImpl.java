package com.caffeineshawn.demo.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void create(String name_id, String name, Integer id) {
		jdbcTemplate.update("insert into test.huji(name_id, name,id ) values(?, ?, ?)", name_id, name, id);
	}

	@Override
	public void deleteByName(String name) {
		jdbcTemplate.update("delete from test.huji where NAME = ?", name);
	}

//	@Override
//	public void updateByName(String name) {
//		jdbcTemplate.update("UPDATE FROM test.huji where )
//	}

	@Override
	public Integer getAllUsers() {
		return jdbcTemplate.queryForObject("select count(1) from test.huji", Integer.class);
	}

	@Override
	public void deleteAllUsers() {
		jdbcTemplate.update("delete from test.huji");
	}
}