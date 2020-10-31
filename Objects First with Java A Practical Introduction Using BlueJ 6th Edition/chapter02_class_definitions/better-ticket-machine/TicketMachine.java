 /**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 */
public class TicketMachine {
  private int price;    // The price of a ticket from this machine.
  private int balance;  // The amount of money entered by a customer so far.
  private int total;    // The total amount of money collected by this machine.

  /**
   * Create a machine that issues tickets of the given price.
   */
  public TicketMachine(int cost) {
    price = cost;
    balance = 0;
    total = 0;
  }

  /**
   * @Return The price of a ticket.
   */
  public int getPrice() {
    return price;
  }

  /**
   * Return The amount of money already inserted for the
   * next ticket.
   */
  public int getBalance() {
    return balance;
  }

  /**
   * Receive an amount of money from a customer.
   * Check that the amount is sensible.
   */
  public void insertMoney(int amount) {
    if (amount > 0) {
      balance = balance + amount;
    } else {
      System.out.println("Use a positive amount rather than: " +
              amount);
    }
  }

  /**
   * Print a ticket if enough money has been inserted, and
   * reduce the current balance by the ticket price. Print
   * an error message if more money is required.
   * @param discount - print 25% discounted ticket or regular
   */
  public void printTicket(boolean discount) {
    price *= discount ? 0.75 : 1;
    int amountLeftToPay = price - balance;
    if (amountLeftToPay <= 0) {
      // Simulate the printing of a ticket.
      System.out.println("##################");
      System.out.println("# The BlueJ Line");
      System.out.println("# Ticket");
      System.out.println("# " + price + " cents.");
      System.out.println("##################");
      System.out.println();

      total += price;    // Update the total collected with the price.
      balance -= price;  // Reduce the balance by the price
    } else {
      System.out.println("You must insert at least: " +
              amountLeftToPay + " more cents.");

    }
  }

  /**
   * Return the money in the balance.
   * The balance is cleared.
   */
  public int refundBalance() {
    int amountToRefund;
    amountToRefund = balance;
    return balance;
  }

  /**
   * Take all accumulated money from the machine
   */
  public int emptyMachine() {
    int accumulated = total;
    total = 0;
    return accumulated;
  }
}
