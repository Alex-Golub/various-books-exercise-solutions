package chapter8_classes;

import java.util.Scanner;

/**
 * Responsibility's:
 * - Prompt for each stock’s symbol.
 * - Prompt for the number of purchases of each stock.
 * - Read each purchase (number of shares and price per share) from the console.
 * - Print the total profit/loss of each stock.
 * - Compare the two total profits/losses and print a message about which stock
 * generated higher profits.
 *
 * @author Mr.Dr.Professor
 * @since 17-Jan-21 11:19 AM
 */
class StockMain {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);

    // first stock
    System.out.print("First stock's symbol: ");
    String symbol1 = console.next();
    Stock  stock1  = new Stock(symbol1);
    double profit1 = makePurchases(stock1, console);

    // second stock
    System.out.print("Second stock's symbol: ");
    String symbol2 = console.next();
    Stock  stock2  = new Stock(symbol2);
    double profit2 = makePurchases(stock2, console);

    // report which stock made more money
    if (profit1 > profit2) {
      System.out.println(symbol1 + " was more " +
                         "profitable than " + symbol2 + ".");
    } else if (profit2 > profit1) {
      System.out.println(symbol2 + " was more " +
                         "profitable than " + symbol1 + ".");
    } else {  // profit1 == profit2
      System.out.println(symbol1 + " and " + symbol2 +
                         " are equally profitable.");
    }
  }

  // Makes purchases of stock and returns the profit.
  public static double makePurchases(Stock currentStock,
                                     Scanner console) {
    System.out.print("How many purchases did you make? ");
    int numPurchases = console.nextInt();

    // ask about each purchase
    for (int i = 1; i <= numPurchases; i++) {
      System.out.print(i +
                       ": How many shares, at what price per share? ");
      int    numShares     = console.nextInt();
      double pricePerShare = console.nextDouble();

      // ask the Stock object to record this purchase
      currentStock.purchase(numShares, pricePerShare);
    }

    // use the Stock object to compute profit
    System.out.print("What is today's price per share? ");
    double currentPrice = console.nextDouble();

    double profit = currentStock.getProfit(currentPrice);
    System.out.println("Net profit/loss: $" + profit);
    System.out.println();
    return profit;
  }
}
