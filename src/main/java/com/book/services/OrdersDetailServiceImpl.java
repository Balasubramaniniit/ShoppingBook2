package com.book.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.dao.OrdersDetailDAO;
import com.book.model.OrdersDetail;

@Service
public class OrdersDetailServiceImpl implements OrdersDetailService {

	@Autowired
	private OrdersDetailDAO ordersDetailDAO;
	@Override
	public void create(OrdersDetail ordersDetail) {
		// TODO Auto-generated method stub
		ordersDetailDAO.create(ordersDetail);
	}

	
}
