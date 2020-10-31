/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 */
public class TicketMachine {
    private int price;    // The price of a ticket from this machine
    private int balance;  // The amount of money entered by a customer so far
    private int total;    // The total amount of money collected by this machine.

    /**
     * Create a machine that issues tickets.
     * Each ticket price is fixed to 1000 cents.
     */
    public TicketMachine() {
        price = 1_000;
        balance = 0;
        total = 0;
    }

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int cost) {
        price = cost;
        balance = 0;
        total = 0;
    }

    /**
     * Return the price of a ticket.
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets a new price for a ticket.
     */
    public void setPrice(int newPrice) {
        price = newPrice;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Return total amount of money collected by this machine.
     */
    public int getTotal() {
        return total;
    }

    /**
     * Receive an amount of money from a customer.
     */
    public void insertMoney(int amount) {
        balance = balance + amount;
    }

    /**
     * Promat user to insert correct amount of money to buy ticket.
     */
    public void prompt() {
        System.out.println("Please insert the correct amount of money.");
    }

    /**
     * Print the price of a single ticket.
     */
    public void showPrice() {
        System.out.println("The price of a ticket is " + price + " cents.");
    }

    /**
     * Collect money from machine.
     */
    public void empty() {
        total = 0;
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket() {
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = 0;
    }
}