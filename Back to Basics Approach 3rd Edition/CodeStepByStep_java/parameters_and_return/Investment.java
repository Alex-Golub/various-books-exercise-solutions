package CodeStepByStep_java.parameters_and_return;

import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/Investment
 *
 * @author Mr.Dr.Professor
 * @since 26-Feb-21 10:07 PM
 */
/*public*/ class Investment {
  static final int INVESTORS = 2;
  static final Scanner console = new Scanner(System.in);

  enum Category {
    WEAK(10), MEDIUM(50);

    private final int upperbound;
    private Category(int upperbound) {
      this.upperbound = upperbound;
    }
  }

  public static void main(String[] args) {
    for (int i = 1; i <= INVESTORS; i++) {
      investment(i);
      System.out.println();
    }

    System.out.println("Have a nice day!");
  }

  private static void investment(int i) {
    System.out.println("Investor #" + i + ":");
    System.out.print("Initial amount? ");
    double principal = console.nextDouble();

    System.out.print("Interest rate%? ");
    double interestRate = console.nextDouble();

    System.out.print("Num. of months? ");
    int months = console.nextInt();

    double amount = calculateAmount(principal, months, interestRate);
    System.out.printf("Final amount = $%.2f\n", amount);

    double profit = amount - principal;
    long profitPercent = Math.round(100.0 * profit / principal);
    System.out.printf("Profit = $%.2f (%d%%)\n", profit, profitPercent);

    if (profitPercent > Category.MEDIUM.upperbound) {
      System.out.println("strong");
    } else if (profitPercent > Category.WEAK.upperbound) {
      System.out.println("medium");
    } else {
      System.out.println("weak");
    }
  }

  private static double calculateAmount(double p, int t, double r) {
    return p * Math.pow(1 + r, t);
  }
}
