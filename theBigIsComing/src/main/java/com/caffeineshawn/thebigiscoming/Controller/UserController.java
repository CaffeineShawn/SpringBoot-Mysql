package com.caffeineshawn.thebigiscoming.Controller;

import com.caffeineshawn.thebigiscoming.Entity.Book;
import com.caffeineshawn.thebigiscoming.Service.UserService;
import com.caffeineshawn.thebigiscoming.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping
    public Iterable findAll() {
        return userService.findAllUser();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @GetMapping("/{username}")
    public User findByUsername(@PathVariable String username) {
        return userService.findUserByUserName(username);
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public  User create(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public ResponseEntity<String> userLogin(@RequestBody User user) {

        User validatingUser = userService.findUserByUserName(user.username);
        if (validatingUser == null || validatingUser.getPassword() == user.getPassword()) {
            return new ResponseEntity<String>("Error: Could not found registered user.", HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<String>("Login Success", HttpStatus.OK);
        }


    }



}

