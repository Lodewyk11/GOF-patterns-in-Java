package com.lodewyk.gof.observer;

public interface Observer {
	
	public void update(String stockSymbol, float stockValue, int stockUnits);

}
