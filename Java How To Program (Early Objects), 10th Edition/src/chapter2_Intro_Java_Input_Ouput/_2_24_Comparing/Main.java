package chapter2_Intro_Java_Input_Ouput._2_24_Comparing;

import java.util.Scanner;

/**
 * 2.24 (Largest and Smallest Integers) Write an application that reads five integers and determines
 * and prints the largest and smallest integers in the group. Use only the programming techniques you
 * learned in this chapter.
 *
 * Created by ag on 15-Jun-20 12:39 PM
 */
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter 1st integer: ");
    int n1 = scanner.nextInt();

    System.out.print("Enter 2nd integer: ");
    int n2 = scanner.nextInt();

    System.out.print("Enter 3rd integer: ");
    int n3 = scanner.nextInt();

    System.out.print("Enter 4th integer: ");
    int n4 = scanner.nextInt();

    System.out.print("Enter 5th integer: ");
    int n5 = scanner.nextInt();

    // Find maximal from five numbers
    if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5)
      System.out.println("Largest: " + n1);
    else if (n2 > n1 && n2 > n3 && n2 > n4 && n2 > n5)
      System.out.println("Largest: " + n2);
    else if (n3 > n1 && n3 > n2 && n3 > n4 && n3 > n5)
      System.out.println("Largest: " + n3);
    else if (n4 > n1 && n4 > n2 && n4 > n3 && n3 > n5)
      System.out.println("Largest: " + n4);
    else
      System.out.println("Largest: " + n5);

    // Find minimum from five
    if (n1 < n2 && n1 < n3 && n1 < n4 && n1 < n5)
      System.out.println("Smallest: " + n1);
    else if (n2 < n1 && n2 < n3 && n2 < n4 && n2 < n5)
      System.out.println("Smallest: " + n2);
    else if (n3 < n1 && n3 < n2 && n3 < n4 && n3 < n5)
      System.out.println("Smallest: " + n3);
    else if (n4 < n1 && n4 < n2 && n4 < n3 && n3 < n5)
      System.out.println("Smallest: " + n4);
    else
      System.out.println("Smallest: " + n5);
  }
}
