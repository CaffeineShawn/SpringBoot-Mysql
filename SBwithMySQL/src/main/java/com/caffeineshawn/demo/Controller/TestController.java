package com.caffeineshawn.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.caffeineshawn.demo.UserService.UserServiceImpl;
import javax.jws.Oneway;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
public class TestController {
	@Autowired
	private JdbcTemplate jdbcTemplate;


	@RequestMapping("/getUser")
	public List<Map<String, Object>> getDbType() {
		String sql = "SELECT * from test.huji";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		for (Map<String, Object> map : list) {
			Set<Map.Entry<String, Object>> entries = map.entrySet();
			if (entries != null) {
				Iterator<Map.Entry<String, Object>> iterator = entries.iterator();
				while (!iterator.hasNext()) {
					Map.Entry<String, Object> entry = (Map.Entry<String, Object>) iterator.next();
					Object key = entry.getKey();
					Object value = entry.getValue();
					System.out.println(key + ":" + value);
				}
			}
		}
		return list;
	}

	@RequestMapping("/deleteUser/{name}")
	public List<Map<String, Object>> deleteUserMapping(@PathVariable("name") String name) {
		String sql = "SELECT * FROM test.huji";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		if (list == null) {
			return null;
		} else {
			UserServiceImpl userService = new UserServiceImpl();
			userService.deleteByName(name);
			return getDbType();
		}
	}


}
