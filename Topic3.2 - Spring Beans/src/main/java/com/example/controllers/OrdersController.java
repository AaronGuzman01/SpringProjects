package com.example.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.models.OrderModel;
import com.example.services.OrdersBusinessServiceInterface;

@Controller
@RequestMapping("/orders")
public class OrdersController {
	// Dependency injection
	OrdersBusinessServiceInterface service;
	
	@Autowired
	public OrdersController(OrdersBusinessServiceInterface service) {
		super();
		this.service = service;
	}

	@GetMapping("/")
	public String showAllOrders(Model model) {
		// generate some orders
		// this version of the app will send a hard-coded list of orders
		List<OrderModel> orders = service.getOrders();
		
		model.addAttribute("title", "Here is what I want to do this summer");
		model.addAttribute("orders", orders);
		
		return "orders.html";
	}
}
