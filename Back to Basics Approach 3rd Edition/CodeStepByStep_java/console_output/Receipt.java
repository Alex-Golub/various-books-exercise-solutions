package CodeStepByStep_java.console_output;

/**
 * @author Mr.Dr.Professor
 * @since 21-Feb-21 8:45 PM
 */
/*public*/ class Receipt {
  public static void main(String[] args) {
    // Compute total owed, assuming 8% tax and 15% tip
    int subTotal = 38 + 40 + 30;
    double tax = subTotal * .08;
    double tip = subTotal * .15;

    System.out.println("Subtotal: " + subTotal);
    System.out.println("Tax: " + tax);
    System.out.println("Tip: " + tip);
    System.out.println("Total: " + (subTotal + tax + tip));
  }
}
