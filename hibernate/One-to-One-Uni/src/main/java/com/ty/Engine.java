package com.ty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Engine {
	@Id
	private int eid;
	
	private int cc;
	
	private String type;

	public Engine() {
		
	}
	
	public Engine(int eid, int cc, String type) {
		this.eid = eid;
		this.cc = cc;
		this.type = type;
	}
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
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
