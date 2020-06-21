package chapter9_Objects_Classes._9_2;

/**
 * 9.2 (The Stock class) Following the example of the Circle class in Section 9.2,
 * design a class named Stock that contains:
 * ■■ A string data field named symbol for the stock’s symbol.
 * ■■ A string data field named name for the stock’s name.
 * ■■ A double data field named previousClosingPrice that stores the stock
 * price for the previous day.
 * ■■ A double data field named currentPrice that stores the stock price for the
 * current time.
 * ■■ A constructor that creates a stock with the specified symbol and name.
 * ■■ A method named getChangePercent() that returns the percentage changed
 * from previousClosingPrice to currentPrice.
 *
 * Draw the UML diagram for the class then implement the class.
 *
 * Write a test program that creates a Stock object with the stock symbol ORCL,
 * the name Oracle Corporation, and the previous closing price of 34.5.
 * Set a new current price to 34.35 and display the price-change percentage.
 *
 * Created by ag on 16-May-20 12:50 AM
 */
class StockTest {
    public static void main(String[] args) {
        Stock oracle = new Stock("ORCL", "Oracle Corporation");
        oracle.setPreviousClosingPrice(34.5);
        oracle.setCurrentPrice(34.35);

        System.out.printf("%-10s %-20s %-10s %-10s %-10s%n",
                "Symbol", "Name", "PCP", "CP", "PC");

        System.out.printf("%-10s %-20s %-10.2f %-10.2f %-10.2f",
                oracle.getSymbol(), oracle.getName(), oracle.getPreviousClosingPrice(),
                oracle.getCurrentPrice(), oracle.getChangePercent());

    }
}
