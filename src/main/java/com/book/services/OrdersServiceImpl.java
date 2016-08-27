package com.book.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.dao.OrdersDAO;
import com.book.model.Orders;

@Service
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	private OrdersDAO ordersDAO;
	
	@Override
	public Orders create(Orders orders) {
		// TODO Auto-generated method stub
		return ordersDAO.create(orders);
	}

}
