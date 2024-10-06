package com.bptn.course._02_week_2_Big_Coding;

public class Stock {
	public String tickerSymbol;
	public String companyName;
	public int price;
	public double percentChange;
	public int totalShares;
	public long marketCap;

	public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
		this.tickerSymbol = tickerSymbol.toUpperCase();
		this.companyName = companyName;
		this.price = price;
		this.totalShares = totalShares;
		this.percentChange = 0.0;
		this.marketCap = (long) totalShares * price;

	}

	public void adjustPrice(int change) {
		int oldPrice = this.price;
		this.price += change;
		this.percentChange = ((double) change / oldPrice) * 100;
		this.marketCap = (long) this.totalShares * this.price;
	}

	@Override
	public String toString() {
		return "Ticker Symbol: " + this.tickerSymbol + "\n" + "Company: " + this.companyName + "\n" + "Current Price: $"
				+ this.price + " (" + this.percentChange + "%)\n" + "Market Cap: $" + this.marketCap;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
		System.out.println(stock);
		stock.adjustPrice(20);
		System.out.println(stock);

	}

}
