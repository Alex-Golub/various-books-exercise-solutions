package CodeStepByStep_java.console_output;

import java.util.Scanner;

/**
 * @author Mr.Dr.Professor
 * @since 21-Feb-21 8:49 PM
 */
/*public*/ class Receipt2 {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("What was the meal cost? $");

    // Calculate total owed, assuming 8% tax / 15% tip
    int subtotal = console.nextInt();
    double tax = subtotal * .08;
    double tip = subtotal * .15;
    double total = subtotal + tax + tip;

    System.out.println("Subtotal: " + subtotal);
    System.out.println("Tax: " + tax);
    System.out.println("Tip: " + tip);
    System.out.println("Total: " + total);
  }
}
