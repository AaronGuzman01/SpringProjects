package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import com.example.services.OrdersBusinessService;
import com.example.services.OrdersBusinessService2;
import com.example.services.OrdersBusinessServiceInterface;

@Configuration
public class SpringConfig {
	@Bean(name="orderBusinessService", initMethod="init", destroyMethod="destroy")
	@RequestScope
	public OrdersBusinessServiceInterface getOrdersBusiness() {
		return new OrdersBusinessService2();
	}
}
