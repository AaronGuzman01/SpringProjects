package com.example.controllers;

import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.models.LoginModel;

@Controller
public class LoginController {
	@GetMapping("/")
	public String displayLoginForm(Model model) {
		model.addAttribute("loginModel", new LoginModel());
		return "loginForm.html";
	}
	
	@PostMapping("/processLogin")
	public String processLogin(@Valid LoginModel loginModel, BindingResult bindingResults, Model model) {
		if (bindingResults.hasErrors()) {
			model.addAttribute("loginModel", loginModel);
			return "loginForm.html";
		}
		model.addAttribute("loginModel", loginModel);
		return "loginResults.html";
	}
}
