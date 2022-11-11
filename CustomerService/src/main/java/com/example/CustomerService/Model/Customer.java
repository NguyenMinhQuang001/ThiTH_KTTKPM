package com.example.CustomerService.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer implements Serializable{
	@Id
	private int customerId;
	private String name;
	private double price;
	public Customer() {
		super();
	}
	public Customer(int customerId, String name, double price) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.price = price;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", price=" + price + "]";
	}
	
}
