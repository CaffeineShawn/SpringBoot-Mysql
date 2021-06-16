package com.caffeineshawn.demo;

import com.caffeineshawn.demo.UserService.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SBwithMySqlApplicationTests {
	@Autowired
	private UserService userService;

	@Before
	public void setUp() {
		userService.deleteAllUsers();
		System.out.println("清空user表");
	}

	@Test
	public void test() throws Exception {
		System.out.println("插入5个用户");
		userService.create("114514", "shenbishuzi",1);
		userService.create("1919810","diyicishijiedazhan", 2);
		userService.create("114", "baishitong",3);
		userService.create("514", "wuyaosi",4);
		userService.create("8964","tiananmen", 5);
		// 查数据库，应该有5个用户
		Assert.assertEquals(5, userService.getAllUsers().intValue());
		// 删除两个用户
		userService.deleteByName("shenbishuzi");
		userService.deleteByName("wuyaosi");
		// 查数据库，应该有5个用户
		Assert.assertEquals(3, userService.getAllUsers().intValue());
	}
}
