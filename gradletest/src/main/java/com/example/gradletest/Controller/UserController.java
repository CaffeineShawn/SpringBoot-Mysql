package com.example.gradletest.Controller;

import com.example.gradletest.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;

import com.example.gradletest.Entity.User;

@Controller
public class UserController {
	@Autowired

	private UserRepository userRepository;

	@GetMapping("/greeting")
	public String greetingForm(Model model) {
		model.addAttribute("user", new User());
		return "greeting";
	}

	@PostMapping("/greeting")
	public String greetingSubmit(@ModelAttribute User user) {
		User newUser = new User();

		newUser.setName(user.getName());
		newUser.setMail(user.getMail());
		newUser.setTel(user.getTel());
		newUser.setMessage(user.getMessage());
		userRepository.save(user);

		return "result";
	}

	@GetMapping("/all")
	public String getMessage(Model model) {
		Iterable<User> users = userRepository.findAll();

		model.addAttribute("users", users);
		return "all";
	}
}