package com.lodewyk.gof.decorator.toppings;

import com.lodewyk.gof.decorator.Pizza;

public class  Cheese extends ToppingDecorator {

	Pizza pizza;
	
	public Cheese(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Cheese";
	}

	@Override
	public double cost() {
		return 0.25 + pizza.cost();
	}

}
