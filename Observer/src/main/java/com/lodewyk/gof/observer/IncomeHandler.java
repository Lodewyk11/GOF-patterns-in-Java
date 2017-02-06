package com.lodewyk.gof.observer;

public class IncomeHandler implements Observer {

	private Subject stockData;

	public IncomeHandler(Subject stockData) {
		this.stockData = stockData;
		stockData.addObserver(this);
	}

	public void update(String stockSymbol, float stockValue, int stockUnits) {
		System.out.println("IncomeHandler received changes, updating stock data");
	}

}
