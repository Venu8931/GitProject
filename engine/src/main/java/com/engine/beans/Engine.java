package com.engine.beans;

import org.springframework.beans.factory.annotation.Required;

public class Engine {
	
	private Motor motor;
	
	@Required
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "Engine [motor=" + motor + "]";
	}
	
	

}
