/*package com.book.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.book.model.AuthorisedUser;
@Repository
@Transactional
public class AutorisedUserDAOImpl implements AuthorisedUserDAO {
	@Autowired
	SessionFactory sf;
	@Override
	public void save(AuthorisedUser ob) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().saveOrUpdate(ob);
		
	}

}*/
