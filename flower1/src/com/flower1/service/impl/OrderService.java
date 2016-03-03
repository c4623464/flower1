package com.flower1.service.impl;

import com.flower1.dao.IOrderDAO;
import com.flower1.model.Orders;
import com.flower1.service.IOrderService;

public class OrderService implements IOrderService {
	private IOrderDAO orderDAO;
	
	
	
	public IOrderDAO getOrderDAO() {
		return orderDAO;
	}



	public void setOrderDAO(IOrderDAO orderDAO) {
		orderDAO = orderDAO;
	}



	public Orders saveOrder(Orders order) {
		// TODO Auto-generated method stub
		return orderDAO.saveOrder(order);
	}

}
