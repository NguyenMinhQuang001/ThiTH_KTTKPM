package com.example.ShipperService.VO;

import java.io.Serializable;

import com.example.ShipperService.Model.ShipperOOD;

public class CustomerOfShipper implements Serializable{
	private ShipperOOD shipperOOD;
	private Customer customer;
	public CustomerOfShipper() {
		super();
	}
	public CustomerOfShipper(ShipperOOD shipperOOD, Customer customer) {
		super();
		this.shipperOOD = shipperOOD;
		this.customer = customer;
	}
	public ShipperOOD getshipperOOD() {
		return shipperOOD;
	}
	public void setshipperOOD(ShipperOOD shipperOOD) {
		this.shipperOOD = shipperOOD;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "CustomerOfShipper [shipperOOD=" + shipperOOD + ", customer=" + customer + "]";
	}

	
	
}
