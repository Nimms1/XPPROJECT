package com.agile.bangalore.ekart.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class OrderDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int order_id;
	
	@NotNull
	@Digits(integer = 15, fraction = 0)
	private int mobile_id;
	
	@NotNull
	@Digits(integer = 15, fraction = 0)
	private int emp_id;
	
	

	public int getOrder_id() {
		return order_id;
	}



	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}



	public int getMobile_id() {
		return mobile_id;
	}



	public void setMobile_id(int mobile_id) {
		this.mobile_id = mobile_id;
	}



	public int getEmp_id() {
		return emp_id;
	}



	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}



	public String getOrder_status() {
		return order_status;
	}



	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}



	@Size(min = 3, max = 50)
	@Column(name = "order_status", nullable = false)
	private String order_status;
	
	
	
}
