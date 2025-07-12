package org.example;

public class StockPriceService {
    private final MarketApi api;

    public StockPriceService(MarketApi api) {
        this.api = api;
        System.out.println("StockPriceService initialized with MarketApi.");
    }

    public String fetchPriceReport(String ticker) {
        System.out.println("Fetching price for ticker: " + ticker);
        double price = api.getCurrentPrice(ticker);
        String report = String.format("Current price of %s is $%.2f", ticker, price);
        System.out.println("Generated report: " + report);
        return report;
    }
}
