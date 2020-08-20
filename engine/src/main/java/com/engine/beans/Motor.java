package com.engine.beans;

public class Motor {
	
	private int id;
	private String name;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Motor [id=" + id + ", name=" + name + "]";
	}
	
	

}
