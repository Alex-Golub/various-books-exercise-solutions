package chapter8_classes;

/**
 * Responsibility's:
 * - Store a stock’s symbol.
 * - Store accumulated information about the investor’s purchases of the stock.
 * - Record a purchase of the stock.
 * - Compute the total profit/loss for the stock.
 *
 * @author Mr.Dr.Professor
 * @since 17-Jan-21 11:14 AM
 */
class Stock {
  private String symbol;
  private int    totalShares;
  private double totalCost;

  public Stock(String symbol) {
    if (symbol == null)
      throw new NullPointerException("symbol is null");

    this.symbol = symbol;
    totalShares = 0;
    totalCost = 0.0;
  }

  // pre: shares >= 0 && pricePerShare >= 0
  public void purchase(int shares, double pricePerShare) {
    if (shares < 0 || pricePerShare < 0)
      throw new IllegalArgumentException();

    totalShares += shares;
    totalCost += shares * pricePerShare;
  }

  // profit = ([total shares] * [current share price]) - (total cost)
  // pre: currentPrice >= 0
  public double getProfit(double currentPrice) {
    if (currentPrice < 0)
      throw new IllegalArgumentException();

    return totalShares * currentPrice - totalCost;
  }

  // Ex8_10_clear
  // Resets this Stock’s number of shares purchased and total cost to 0
  public void clear() {
    totalShares = 0;
    totalCost = 0;
  }

}
