package chapter2_Intro_Java_Input_Ouput._2_17;

import java.util.Scanner;

/**
 * 2.17 (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
 * user and displays the sum, average, product, smallest and largest of the numbers.
 * Use the techniques shown in Fig. 2.15.
 * [Note: The calculation of the average in this exercise should result in an integer
 * representation of the average. So, if the sum of the values is 7, the average should be 2, not
 * 2.3333….]
 *
 * Created by ag on 15-Jun-20 12:17 PM
 */
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first integer: ");
    int n1 = scanner.nextInt();

    System.out.print("Enter second integer: ");
    int n2 = scanner.nextInt();

    System.out.print("Enter third integer: ");
    int n3 = scanner.nextInt();

    System.out.printf("%d + %d + %d = %d%n", n1, n2, n3, (n1 + n2 + n3));
    System.out.printf("%d + %d + %d / 3 = %d%n", n1, n2, n3, (n1 + n2 + n3) / 3);
    System.out.printf("%d * %d * %d = %d%n", n1, n2, n3, (n1 * n2 * n3));

    // Find maximal from three numbers
    if (n1 > n2 && n1 > n3)
      System.out.println("Largest: " + n1);
    else if (n2 > n1 && n2 > n3)
      System.out.println("Largest: " + n2);
    else
      System.out.println("Largest: " + n3);

    // Find minimum from three
    if (n1 < n2 && n1 < n3)
      System.out.println("Smallest: " + n1);
    else if (n2 < n1 && n2 < n3)
      System.out.println("Smallest: " + n2);
    else
      System.out.println("Smallest: " + n3);
  }
}
