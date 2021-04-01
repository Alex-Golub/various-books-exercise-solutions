package chapter09_inheritance_and_interfaces;

interface Asset {
  double getMarketValue();
  double getProfit();
}

/**
 * 13. Add an equals method to the Cash class introduced in this chapter.
 * Two cash objects are considered equal if they
 * represent the same amount of money.
 */
class Cash implements Asset {
  private double amount;

  Cash(double amount) {
    this.amount = amount;
  }

  public double getMarketValue() {
    return amount;
  }

  public double getProfit() {
    return 0.0;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Cash other = (Cash) o;
    return amount == other.amount;
  }
}

class DividendStock extends Stock {
  private double dividends;

  DividendStock(String symbol, double currentPrice) {
    super(symbol, currentPrice);
    dividends = 0.0;
  }

  public double getMarketValue() {
    return super.getMarketValue() + dividends;
  }

  public void payDividend(double amountPerShare) {
    dividends += amountPerShare * getTotalShares();
  }
}

class MutualFund extends ShareAsset {
  private double totalShares;

  MutualFund(String symbol, double currentPrice) {
    super(symbol, currentPrice);
    totalShares = 0.0;
  }

  public double getMarketValue() {
    return totalShares * getCurrentPrice();
  }

  public double getTotalShares() {
    return totalShares;
  }

  public void purchase(double shares, double pricePerShare) {
    totalShares += shares;
    addCost(shares * pricePerShare);
  }
}


class Stock extends ShareAsset {
  private int totalShares;

  Stock(String symbol, double currentPrice) {
    super(symbol, currentPrice);
    totalShares = 0;
  }

  public double getMarketValue() {
    return totalShares * getCurrentPrice();
  }

  public int getTotalShares() {
    return totalShares;
  }

  public void purchase(int shares, double pricePerShare) {
    totalShares += shares;
    addCost(shares * pricePerShare);
  }
}

abstract class ShareAsset implements Asset {
  private String symbol;
  private double totalCost;
  private double currentPrice;

  ShareAsset(String symbol, double currentPrice) {
    this.symbol = symbol;
    this.currentPrice = currentPrice;
    totalCost = 0.0;
  }

  public void addCost(double cost) {
    totalCost += cost;
  }

  public double getCurrentPrice() {
    return currentPrice;
  }

  public void setCurrentPrice(double currentPrice) {
    this.currentPrice = currentPrice;
  }

  public abstract double getMarketValue();

  public double getProfit() {
    return getMarketValue() - totalCost;
  }

  public double getTotalCost() {
    return totalCost;
  }
}

class AssetExample {
  public static void main(String[] args) {
    Asset[] investments = new Asset[4];
    investments[0] = new Stock("MSFT", 10);
    investments[1] = new Cash(500.00);
    investments[2] = new Cash(1200.54);
    investments[3] = new Stock("INTC", 30);

    for (Asset investment : investments) {
      System.out.println(investment);
      System.out.println("Market value is: " +
                         investment.getMarketValue() +
                         ", profit is: " +
                         investment.getProfit());
      System.out.println();
    }
  }
}
