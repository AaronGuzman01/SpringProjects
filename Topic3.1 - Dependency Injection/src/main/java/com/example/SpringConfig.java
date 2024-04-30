package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.services.OrdersBusinessService;
import com.example.services.OrdersBusinessServiceInterface;

@Configuration
public class SpringConfig {
	@Bean(name="orderBusinessService")
	public OrdersBusinessServiceInterface getOrdersBusiness() {
		return new OrdersBusinessService();
	}
}
