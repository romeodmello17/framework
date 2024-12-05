package com.ty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Engine {
	@Id
	private int e_id;
	private int cc;
	private String type;

	@OneToOne(mappedBy = "engine")
	private Car car;

	public Engine() {

	}

	public Engine(int e_id, int cc, String type) {
		this.e_id = e_id;
		this.cc = cc;
		this.type = type;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
