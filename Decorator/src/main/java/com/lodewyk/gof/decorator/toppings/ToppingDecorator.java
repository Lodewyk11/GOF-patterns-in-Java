package com.lodewyk.gof.decorator.toppings;

import com.lodewyk.gof.decorator.Pizza;

public abstract class ToppingDecorator extends Pizza {
	
	public abstract String getDescription();
}
