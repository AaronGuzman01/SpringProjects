package com.example.services;

import java.util.List;

import com.example.models.OrderModel;

public interface OrdersBusinessServiceInterface {
	public void test();
	
	public List<OrderModel> getOrders();
	
	public void init();
	
	public void destroy();
	
	// future methods
	
	// searchOrders(String searchTerm)
	
	// addOrder(OrderModel new0)
	
	// deleteOrder(Long id)
	
	// updateOrder(OrderModel updateMe)
	
	// getOneOrder(Long id)
	
	
}
