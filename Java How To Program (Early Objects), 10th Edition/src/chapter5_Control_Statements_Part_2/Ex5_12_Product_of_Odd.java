package chapter5_Control_Statements_Part_2;

/**
 * 5.12 (Calculating the Product of Odd Integers)
 *  Write an application that calculates the product of the odd integers from 1 to 15.
 *
 * Created by ag on 12-Jul-20 7:31 PM
 */
class Ex5_12_Product_of_Odd {
  public static void main(String[] args) {
    int product = 1;
    final int TO = 15; // NOTE: watch out for integer overflow, Integer max value is 2^31 - 1

    for (int i = 1; i < TO; i += 2) {
      System.out.print(i + " * ");
      product *= i;
    }

    System.out.printf("%d = %,d", TO, product * TO);
  }
}
