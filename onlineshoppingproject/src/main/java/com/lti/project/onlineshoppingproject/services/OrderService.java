package com.lti.project.onlineshoppingproject.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lti.project.onlineshoppingproject.beans.Order;
import com.lti.project.onlineshoppingproject.exceptions.OrderException;


@Service("orderService")
public interface OrderService {
	
	public abstract int addNewOrder(Order o) throws OrderException;
	
	public abstract Order findOrderById(int ordId);
	
	public abstract int updateQuantity(int ordId,int quantity);
	
	public abstract void deleteRecord(int ordId);
	
	public abstract List<Order> orderList();
	
	public abstract Order addOrder(Order order,int prdId);
	
	

}
