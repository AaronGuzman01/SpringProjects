package com.example.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.models.OrderModel;

public class OrdersBusinessService2 implements OrdersBusinessServiceInterface{

	@Override
	public void test() {
		System.out.print("OrderBusinessService is working");
		
	}

	@Override
	public List<OrderModel> getOrders() {
		List<OrderModel> orders = new ArrayList<OrderModel>();
		
		orders.add(new OrderModel(0L, "AAA", "Big Mac", 3.0f, 1));
		orders.add(new OrderModel(1L, "AAB", "Large Fries", 2.50f, 5));
		orders.add(new OrderModel(2L, "AAC", "Chicken Nuggets", 1.75f, 2));
		orders.add(new OrderModel(3L, "AAD", "Coke", 0.99f, 1));
		orders.add(new OrderModel(4L, "AAE", "Apple Pie", 0.40f, 1));
		
		return orders;
	}

}
