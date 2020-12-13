package chapter4_conditionals;

import java.util.Scanner;

/**
 * 10. Write a method called printGPA calculates a student’s
 * grade point average.
 *
 * @author Mr.Dr.Professor
 * @since 10-Dec-20 5:33 PM
 */
class Ex4_10_printGPA {
  public static void main(String[] args) {
    printGPA();
  }

  public static void printGPA() {
    System.out.print("Enter a student record: ");
    Scanner sc = new Scanner(System.in);

    String name = sc.next();
    int    n    = sc.nextInt();
    int    sum  = 0;
    for (int i = 0; i < n; i++)
      sum += sc.nextInt();

    System.out.println(name + "'s grade is " + 1.0 * sum / n);
  }
}
