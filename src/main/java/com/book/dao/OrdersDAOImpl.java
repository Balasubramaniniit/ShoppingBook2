package com.book.dao;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.book.model.Orders;
@Repository
@Transactional
public class OrdersDAOImpl implements OrdersDAO {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public Orders create(Orders orders) {
		Session session=sessionFactory.openSession();
		session.save(orders);
//		transaction.commit();
		session.close();
		return orders;
	}

}
