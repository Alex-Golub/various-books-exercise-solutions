package chapter4_Control_Statements_Part_1._4_22_Tabular;

/**
 * 4.22 (Tabular Output) Write a Java application that uses looping to print the following table of
 * values:
 *      N     10*N    100*N     1000*N
 *      1     10      100       1000
 *      2     20      200       2000
 *      3     30      300       3000
 *      4     40      400       4000
 *      5     50      500       5000
 *
 * Created by ag on 26-Jun-20 2:12 PM
 */
class TabularOutputTest {
  public static void main(String[] args) {

    System.out.printf("%-8s%-8s%-8s%-8s%n", "N", "10*N", "100*N", "1000*N");
    int n = 1;
    while (n <= 50) {
      System.out.printf("%-8d%-8d%-8d%-8d%n", n, n * 10, n * 100, n * 1000);
      n++;
    }

  }
}
