package com.example.ShipperService.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ShipperOOD implements Serializable{
	@Id
	private int shipperId;
	private String name;
	private double price;
	private int km;
	private int customerId;
	
	public ShipperOOD() {
		super();
	}
	
	public int getShipperId() {
		return shipperId;
	}
	public void setShipperId(int shipperId) {
		this.shipperId = shipperId;
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
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public ShipperOOD(int shipperId, String name, double price, int km, int customerId) {
		super();
		this.shipperId = shipperId;
		this.name = name;
		this.price = price;
		this.km = km;
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "ShipperOOD [shipperId=" + shipperId + ", name=" + name + ", price=" + price + ", km=" + km
				+ ", customerId=" + customerId + "]";
	}
	
}
