package com.lodewyk.gof.decorator.bases;

import com.lodewyk.gof.decorator.Pizza;

public class Italian extends Pizza {

	public Italian(String description) {
		this.description = description + ", Italian";
	}
	
	@Override
	public double cost() {
		return 1.20;
	}
}
