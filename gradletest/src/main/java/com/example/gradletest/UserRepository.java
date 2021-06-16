package com.example.gradletest;

import org.springframework.data.repository.CrudRepository;
import com.example.gradletest.Entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

}