package com.lodewyk.gof.decorator;

public abstract class Pizza {

	protected String description;
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
	
}
