package com.agile.bangalore.ekart.dao;

import java.util.List;

import com.agile.bangalore.ekart.entities.MobileDto;
import com.agile.bangalore.ekart.entities.OrderDto;

public interface OrderDao {

	void placeOrder(MobileDto mobileDto);

	List<OrderDto> getAllOrderDetails();
}
