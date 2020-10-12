package chapter5_Control_Statements_Part_2;

/**
 * 5.13 (Factorials)
 *  Factorials are used frequently in probability problems.
 *  The factorial of a positive integer n (written n! and pronounced “n factorial”) is equal to
 *  the product of the positive integers from 1 to n.
 *
 *  Write an application that calculates the factorials of 1 through 20. Use type long. Display the
 *  results in tabular format.
 *  What difficulty might prevent you from calculating the factorial of 100?
 *
 * Created by ag on 12-Jul-20 7:39 PM
 */
class Ex5_13_Factorial {
  public static void main(String[] args) {
    long factorial = 1; // 0! == 1
    final int N = 20; // N!

    System.out.printf("%-4s%-10s%n%s%n", "n", "n!", "-".repeat(6));
    for (int i = 1; i <= N; i++) {
      factorial *= i;
      System.out.printf("%-4d%,-10d%n", i, factorial);
    }

    // NOTE: in 21! long will overflow because 21! is greater then long max value which is
    // 9,223,372,036,854,775,807
    // To calculate factorial without overflowing (say of 100!) we can use BigInteger class which
    // will be discussed later.
  }
}
