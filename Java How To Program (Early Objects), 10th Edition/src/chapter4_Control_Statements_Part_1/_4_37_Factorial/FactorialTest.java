package chapter4_Control_Statements_Part_1._4_37_Factorial;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * a) Write an application that reads a non-negative integer and computes and prints its factorial.
 *
 * b) Write an application that estimates the value of the mathematical constant e by using
 * the following formula. Allow the user to enter the number of terms to calculate.
 *
 * c) Write an application that computes the value of ex by using the following formula.
 * Allow the user to enter the number of terms to calculate.
 *
 * Created by ag on 29-Jun-20 5:02 PM
 */
class Factorial {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    boolean exit = false;
    while (!exit) {
      menu();
      String choice = scanner.nextLine();
      switch (choice) {
        case "1":
          factorialInput(scanner);
          break;

        case "2":
          eInput(scanner);
          break;

        case "3":
          ePowerXInput(scanner);
          break;

        case "0":
          exit = true;
          break;

        default:
          System.out.println("No such choice, try again");
      }

      System.out.println();
    }

    System.out.println("Bye!");
  }

  private static void menu() {
    System.out.print(
            "1. Factorial\n" +
            "2. Estimation of e by no. of terms\n" +
            "3. Estimation of e^x by no. of terms\n" +
            "0. Exit\n" +
            "Enter you choice: "
    );
  }

  /** a) Write an application that reads a non-negative integer and computes and prints its factorial. */
  private static void factorialInput(Scanner scanner) {
    System.out.print("Enter non-negative number to compute factorial: ");
    int n = Integer.parseInt(scanner.nextLine());

    if (n < 0) {
      System.out.println("Error: given number is negative, try again");
      return;
    }

//    System.out.printf("Factorial: %d! = %d%n", n, factorial(n));
    System.out.printf("Factorial: %d! = %d%n", n, factorial2(n)); // get factorial of any number
  }

  private static long factorial(int n) {
    long result = 1;
    while (n > 1) {
      result = Math.multiplyExact(result, n); // long overflow if large result
      n--;
    }

    return result;
  }

  /* Alternative way with BigInteger we can get factorial of any number */
  private static BigInteger factorial2(int n) {
    BigInteger result = BigInteger.ONE;
    while (n-- > 1)
      result = result.multiply(BigInteger.valueOf(n));

    return result;
  }

  /** b) Estimates the value of the mathematical constant e. */
  private static void eInput(Scanner scanner) {
    System.out.print("Enter number of terms (> 0): ");
    int terms = Integer.parseInt(scanner.nextLine());

    if (terms <= 0) {
      System.out.println("Please enter grater then zero, try again");
      return;
    }

    System.out.println("e = " + calculateE(terms));
  }

  private static double calculateE(int terms) {
    double e = 0;
    for (int i = 0; i < terms; i++)
      e += 1.0 / factorial(i);

    return e;
  }

  /** c) computes the value of e^x */
  private static void ePowerXInput(Scanner scanner) {
    System.out.print("Enter value of x: ");
    int x = Integer.parseInt(scanner.nextLine());

    System.out.print("Enter number of terms (> 0): ");
    int terms = Integer.parseInt(scanner.nextLine());

    if (terms <= 0) {
      System.out.println("Please enter grater then zero, try again");
      return;
    }

    System.out.println("e^x = " + calculateEPowX(x, terms));
  }

  private static double calculateEPowX(int x, int terms) {
    if (terms == 1) return 1;

    double e = 1;
    for (int i = 1; i < terms; i++) {
      e += Math.pow(x, i) / factorial(i);
    }

    return e;
  }

}
