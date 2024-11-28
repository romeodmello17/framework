package com.ty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Car {
	@Id
	private int cid;
	
	private String brand;
	
	private double price;
	
	@OneToOne
	private Engine engine;
	
	public Car() {
		
	}
	
	
	public Car(int cid, String brand, double price) {
		this.cid = cid;
		this.brand = brand;
		this.price = price;
	}



	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}
