package com.lodewyk.gof.observer;

public class TestObserver {
	
	public static void main(String[] args) {
		
		//Initialize subject
		StockData stockData = new StockData();
		
		//Initializing observers
		Observer incomeHandler = new IncomeHandler(stockData);
		
		Observer andreSin = new AndreSeObserver(stockData);
		
		stockData.setStockData("ABCD", 489.50f, 1000);
		
		
		
		
		
		
	}

}
