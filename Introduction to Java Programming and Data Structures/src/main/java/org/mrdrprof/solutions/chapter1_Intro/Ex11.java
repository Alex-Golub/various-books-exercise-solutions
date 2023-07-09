package org.mrdrprof.solutions.chapter1_Intro;

/**
 * *1.11 (Population projection)
 * The U.S. Census Bureau projects population based on the following assumptions:
 * ■ One birth every 7 seconds
 * ■ One death every 13 seconds
 * ■ One new immigrant every 45 seconds
 * Write a program to display the population for each of the next five years.
 * Assume that the current population is 312,032,486, and one year has 365 days.
 *
 * Created by ag on 30-Sep-20 10:57 PM 
 */
class Ex11 {
  public static void main(String[] args) {
    double current = 312_032_486;
    final double BIRTH_PER_YEAR      = 365.0 * 24 * 60 * 60 / 7;
    final double DEATHS_PER_YEAR     = 365.0 * 24 * 60 * 60 / 13;
    final double IMMIGRANTS_PER_YEAR = 365.0 * 24 * 60 * 60 / 45;

    current = current - DEATHS_PER_YEAR + BIRTH_PER_YEAR + IMMIGRANTS_PER_YEAR;
    System.out.printf("Year 1: %,.0f%n", current);

    current = current - DEATHS_PER_YEAR + BIRTH_PER_YEAR + IMMIGRANTS_PER_YEAR;
    System.out.printf("Year 2: %,.0f%n", current);

    current = current - DEATHS_PER_YEAR + BIRTH_PER_YEAR + IMMIGRANTS_PER_YEAR;
    System.out.printf("Year 3: %,.0f%n", current);

    current = current - DEATHS_PER_YEAR + BIRTH_PER_YEAR + IMMIGRANTS_PER_YEAR;
    System.out.printf("Year 4: %,.0f%n", current);

    current = current - DEATHS_PER_YEAR + BIRTH_PER_YEAR + IMMIGRANTS_PER_YEAR;
    System.out.printf("Year 5: %,.0f%n", current);
  }
}
