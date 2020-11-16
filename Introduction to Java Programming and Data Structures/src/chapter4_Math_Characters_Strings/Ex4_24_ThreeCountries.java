package chapter4_Math_Characters_Strings;

import java.util.Scanner;

/**
 * *4.24 (Enter three countries)
 * Write a program that prompts the user to enter three countries
 * and displays them in descending order.
 *
 * @author Mr.Dr.Professor
 * @since 16-Nov-20 6:52 PM
 */
class Ex4_24_ThreeCountries {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first country: ");
    String country1 = scanner.next();
    System.out.print("Enter the second country: ");
    String country2 = scanner.next();
    System.out.print("Enter the third country: ");
    String country3 = scanner.next();

    String temp;
    if (country1.compareTo(country2) < 0) {
      temp = country1;
      country1 = country2;
      country2 = temp;
    }

    if (country2.compareTo(country3) < 0) {
      temp = country2;
      country2 = country3;
      country3 = temp;
    }

    if (country1.compareTo(country2) < 0) {
      temp = country1;
      country1 = country2;
      country2 = temp;
    }

    System.out.println("The three countries in descending order are " +
            country1 + " " + country2 + " " + country3);

  }
}
