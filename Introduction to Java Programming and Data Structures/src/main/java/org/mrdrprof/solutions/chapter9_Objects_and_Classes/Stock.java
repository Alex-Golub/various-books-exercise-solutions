package org.mrdrprof.solutions.chapter9_Objects_and_Classes;

/**
 * 9.2 (The Stock class)
 *
 * @author Mr.Dr.Professor
 * @since 19/03/2021 11:58
 */
/*public*/ class Stock {
  private String symbol;
  private String name;
  private double previousClosingPrice;
  private double currentPrice;

  public Stock(String symbol, String name) {
    this.symbol = symbol;
    this.name = name;
  }

  public double getChangePercent() {
    return 100 * (currentPrice - previousClosingPrice) / previousClosingPrice;
  }

  public String getSymbol() {
    return symbol;
  }

  public String getName() {
    return name;
  }

  public double getPreviousClosingPrice() {
    return previousClosingPrice;
  }

  public void setPreviousClosingPrice(double previousClosingPrice) {
    this.previousClosingPrice = previousClosingPrice;
  }

  public double getCurrentPrice() {
    return currentPrice;
  }

  public void setCurrentPrice(double currentPrice) {
    this.currentPrice = currentPrice;
  }

  public static void main(String[] args) {
    Stock oracleStock = new Stock("ORCL", "Oracle Corporation");
    oracleStock.setPreviousClosingPrice(34.5);
    oracleStock.setCurrentPrice(34.35);
    System.out.printf("Price change: %.2f%%", oracleStock.getChangePercent());
  }
}
