package com.lodewyk.gof.decorator;

import com.lodewyk.gof.decorator.bases.Hawaiian;
import com.lodewyk.gof.decorator.bases.Italian;
import com.lodewyk.gof.decorator.toppings.Cheese;
import com.lodewyk.gof.decorator.toppings.Mushroom;

public class TestDecorator {
	
	public static void main(String[] args) {
        Pizza pizza = new Hawaiian("Large");

        pizza = new Mushroom(pizza);

        pizza = new Cheese(pizza);

        Pizza pizza1 = new Italian("Medium");
        
        pizza1 = new Cheese(pizza1);
        
        pizza1 = new Italian("medium");

        System.out.println("Pizza Order");

        System.out.println("===========");

        System.out.println("");

        System.out.println("Pizza 1: " + pizza.getDescription() + " " + pizza.cost());

        System.out.println("Pizza 2: " + pizza1.getDescription() + " " + pizza1.cost());
	}

}
