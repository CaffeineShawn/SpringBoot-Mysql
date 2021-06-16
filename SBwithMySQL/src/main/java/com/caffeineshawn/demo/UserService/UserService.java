package com.caffeineshawn.demo.UserService;

public interface UserService {
	void create(String name_id, String name, Integer age);
	void deleteByName(String name);
//	void updateByName(String name);
	Integer getAllUsers();
	void deleteAllUsers();
}