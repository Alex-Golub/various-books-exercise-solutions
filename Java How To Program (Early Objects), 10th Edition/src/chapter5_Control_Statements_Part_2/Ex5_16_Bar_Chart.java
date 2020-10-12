package chapter5_Control_Statements_Part_2;

import java.util.Scanner;

/**
 * 5.16 (Bar Chart Printing Program)
 * One interesting application of computers is to display graphs and bar charts.
 * Write an application that reads five numbers between 1 and 30.
 * For each number that’s read, your program should display the same number of
 * adjacent asterisks.
 * For example, if your program reads the number 7, it should display *******.
 * Display the bars of asterisks after you read all five numbers.
 *
 * Created by ag on 21-Jul-20 9:04 PM
 */
class Ex5_16_Bar_Chart {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter 1st number (1-30): ");
    int a = check(scanner.nextInt());
    System.out.print("Enter 2nd number (1-30): ");
    int b = check(scanner.nextInt());
    System.out.print("Enter 3rd number (1-30): ");
    int c = check(scanner.nextInt());
    System.out.print("Enter 4th number (1-30): ");
    int d = check(scanner.nextInt());
    System.out.print("Enter 5th number (1-30): ");
    int e = check(scanner.nextInt());

    drawAsterisks(a);
    drawAsterisks(b);
    drawAsterisks(c);
    drawAsterisks(d);
    drawAsterisks(e);

    System.out.println();

    // Using Java 11 repeat method
    System.out.println("a=" + a + " |" + "*".repeat(a) + "|");
    System.out.println("b=" + b + " |" + "*".repeat(b) + "|");
    System.out.println("c=" + c + " |" + "*".repeat(c) + "|");
    System.out.println("d=" + d + " |" + "*".repeat(d) + "|");
    System.out.println("e=" + e + " |" + "*".repeat(e) + "|");

  }

  private static void drawAsterisks(int n) {
    System.out.print("n=" + n + " |");
    for (int i = 0; i < n; i++) System.out.print("*");
    System.out.print("|\n");
  }

  private static int check(int num) {
    return num > 30 ? 30 : Math.max(num, 1);
  }
}
