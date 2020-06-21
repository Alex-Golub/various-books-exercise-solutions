package chapter2_Intro_Java_Input_Ouput._2_16_Comparing;

import java.util.Scanner;

/**
 * 2.16 (Comparing Integers) Write an application that asks the user to enter two integers, obtains
 * them from the user and displays the larger number followed by the words "is larger".
 * If the numbers are equal, print the message "These numbers are equal".
 * Use the techniques shown in Fig. 2.15.
 *
 * Created by ag on 15-Jun-20 12:13 PM
 */
class Comparing {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first integer: ");
    int n1 = scanner.nextInt();

    System.out.print("Enter second integer: ");
    int n2 = scanner.nextInt();

    if (n1 > n2)
      System.out.println(n1 + " is larger");
    else if (n2 > n1)
      System.out.println(n2 + " is larger");
    else
      System.out.println("These numbers are equal");
  }
}
