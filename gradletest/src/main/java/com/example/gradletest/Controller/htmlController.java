package com.example.gradletest.Controller;


import com.example.gradletest.Entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "saveUser", method = RequestMethod.POST)
@ResponseBody
public class htmlController {
	public void saveUser(@RequestBody List<User> users) {
		System.out.println(users);
	}
}
