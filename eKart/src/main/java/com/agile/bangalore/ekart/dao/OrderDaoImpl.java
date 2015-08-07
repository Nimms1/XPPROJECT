package com.agile.bangalore.ekart.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;

import com.agile.bangalore.ekart.entities.MobileDto;
import com.agile.bangalore.ekart.entities.OrderDto;

public class OrderDaoImpl<T> extends AbstractDao<Integer, OrderDao> implements  OrderDao{
	
	public void placeOrder(OrderDto orderDto){
		persist(orderDto);
	}

	@SuppressWarnings("unchecked")
	public List<OrderDto> getAllOrderDetails(){
		Criteria criteria = createEntityCriteria();
		return (List<OrderDto>) criteria.list();
	}

	public void placeOrder(MobileDto mobileDto) {
		// TODO Auto-generated method stub
		
	}
}