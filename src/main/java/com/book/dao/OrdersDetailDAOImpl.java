package com.book.dao;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.book.model.Orders;
import com.book.model.OrdersDetail;
@Repository
@Transactional
public class OrdersDetailDAOImpl implements OrdersDetailDAO {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void create(OrdersDetail ordersDetail) {
		Session session=sessionFactory.openSession();
		session.save(ordersDetail);
//		transaction.commit();
		session.close();
		
	}

}
