package com.agile.bangalore.ekart.service;

import java.util.List;

import com.agile.bangalore.ekart.entities.MobileDto;
import com.agile.bangalore.ekart.entities.OrderDto;

public interface MobileService {
	
	void addmobile(MobileDto mobileDto);
	
	
	
	List<MobileDto> getAllMobile();
	List<OrderDto> getAllCartItems();

}
