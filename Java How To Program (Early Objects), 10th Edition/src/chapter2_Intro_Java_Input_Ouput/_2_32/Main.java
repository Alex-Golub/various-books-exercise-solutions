package chapter2_Intro_Java_Input_Ouput._2_32;

import java.util.Scanner;

/**
 * 2.32 (Negative, Positive and Zero Values) Write a program that inputs five numbers and determines
 * and prints the number of negative numbers input, the number of positive numbers input and
 * the number of zeros input.
 *
 * Created by ag on 15-Jun-20 1:36 PM
 */
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int positive = 0;
    int negative = 0;
    int zero = 0;

    System.out.print("Enter 1st integer: ");
    int n1 = scanner.nextInt();
    if (n1 > 0)
      positive++;
    else if (n1 < 0)
      negative++;
    else
      zero++;

    System.out.print("Enter 2nd integer: ");
    int n2 = scanner.nextInt();
    if (n2 > 0)
      positive++;
    else if (n2 < 0)
      negative++;
    else
      zero++;

    System.out.print("Enter 3rd integer: ");
    int n3 = scanner.nextInt();
    if (n3 > 0)
      positive++;
    else if (n3 < 0)
      negative++;
    else
      zero++;

    System.out.print("Enter 4th integer: ");
    int n4 = scanner.nextInt();
    if (n4 > 0)
      positive++;
    else if (n4 < 0)
      negative++;
    else
      zero++;

    System.out.print("Enter 5th integer: ");
    int n5 = scanner.nextInt();
    if (n5 > 0)
      positive++;
    else if (n5 < 0)
      negative++;
    else
      zero++;

    System.out.printf("Positive(s): %d%nNegative(s): %d%nZero(s): %d%n",
            positive, negative, zero);
  }
}
