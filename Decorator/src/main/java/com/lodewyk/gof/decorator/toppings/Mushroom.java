package com.lodewyk.gof.decorator.toppings;

import com.lodewyk.gof.decorator.Pizza;

public class Mushroom extends ToppingDecorator{

	private Pizza pizza;
	
	public Mushroom(Pizza pizza) {
		this.pizza = pizza;
	}
	
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Mushroom";
	}

	@Override
	public double cost() {
		return 0.25 + pizza.cost();
	}

}
