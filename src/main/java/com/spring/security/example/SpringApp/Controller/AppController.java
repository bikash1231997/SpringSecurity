package com.spring.security.example.SpringApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.security.example.SpringApp.User.Model.UserModel;

@Controller
@RequestMapping("/")
public class AppController {

	@GetMapping("/")
	public String redirectToLogin() {
		return "redirect:/login";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/home")
	public String home() {
		System.out.println("hello home");
		return "welcome";
	}

	@PostMapping("/home")
	public void home(UserModel model) throws Exception {
		System.out.println("hello post   : -" + model.getUsername() + model.getPassword());
	}
}