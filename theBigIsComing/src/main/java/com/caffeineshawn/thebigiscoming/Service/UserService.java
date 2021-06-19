package com.caffeineshawn.thebigiscoming.Service;

import com.caffeineshawn.thebigiscoming.Entity.User;
import com.caffeineshawn.thebigiscoming.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findUserByUserName(String username) {
        return userRepository.findUserByUsername(username);
    }

    public boolean userExistOrNot(String username) {
        User user = findUserByUserName(username);
        return user != null ;
    }

    public Iterable findAllUser() {
        return userRepository.findAll();
    }

    public User registerUser(User user) {
         return userRepository.save(user);
    }
}
