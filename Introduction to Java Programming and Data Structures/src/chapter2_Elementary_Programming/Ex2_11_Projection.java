package chapter2_Elementary_Programming;

import java.util.Scanner;

/**
 * 2.11 (Population projection)
 * Rewrite Programming Exercise 1.11 to prompt the user
 * to enter the number of years and display the population after the number of years.
 *
 * Created by ag on 13-Oct-20 5:55 PM 
 */
class Ex2_11_Projection {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of years: ");
    int years = scanner.nextInt();

    long       currentPopulation   = 312_032_486;
    final long SECONDS_PER_YEAR    = 365 * 24 * 60 * 60;
    final long BIRTH_PER_YEAR      = SECONDS_PER_YEAR / 7;
    final long DEATHS_PER_YEAR     = SECONDS_PER_YEAR / 13;
    final long IMMIGRANTS_PER_YEAR = SECONDS_PER_YEAR / 45;

    long projection = currentPopulation +
        years * (BIRTH_PER_YEAR + IMMIGRANTS_PER_YEAR - DEATHS_PER_YEAR);
    System.out.printf("The population in %d years is %,d", years, projection);
  }
}
