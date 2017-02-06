package com.lodewyk.gof.observer;

import java.util.ArrayList;
import java.util.List;

public class StockData implements Subject {

	private String stockSymbol;
	private float stockValue;
	private int stockUnits;
	private List<Observer> observers;
	
	public StockData() {
		observers = new ArrayList<Observer>();
	}
	
	public void addObserver(Observer o) {
		observers.add(o);
		
	}

	public void removeObserver(Observer o) {
		observers.remove(o);		
	}

	public void notifyObservers() {
		for(Observer o : observers)
			o.update(stockSymbol, stockValue, stockUnits);
	}
	
	public void setStockData(String stockSymbol, float stockValue, int stockUnits) {
		this.stockSymbol = stockSymbol;
		this.stockValue = stockValue;
		this.stockUnits = stockUnits;
		setDataChanged();
	}
	
	private void setDataChanged() {
		this.notifyObservers();
	}

}
