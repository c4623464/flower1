package com.flower1.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.flower1.dao.IOrderDAO;
import com.flower1.model.Orders;

public class OrderDAO implements IOrderDAO {
	private SessionFactory sessionFactory; 
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public Orders saveOrder(Orders order) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		 Transaction ts=session.beginTransaction();
		 session.save(order);
		 ts.commit();
		 session.close();
		return order;
	}

}
