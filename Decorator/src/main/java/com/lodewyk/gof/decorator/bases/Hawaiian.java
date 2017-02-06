package com.lodewyk.gof.decorator.bases;

import com.lodewyk.gof.decorator.Pizza;

public class Hawaiian extends Pizza {

	public Hawaiian(String description) {
		this.description = description + ", Hawaiian";
	}
	
	@Override
	public double cost() {
		return 1.30;
	}

}
