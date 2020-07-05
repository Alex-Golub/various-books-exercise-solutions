package chapter4_Control_Statements_Part_1._4_39_Growth;

import java.util.Scanner;

/**
 * Get estimates for the current world population and its growth rate (the percentage by
 * which it’s likely to increase this year).
 * Write a program that calculates world population growth
 * each year for the next 75 years, using the simplifying assumption that the current growth rate will stay
 * constant.
 *
 * Print the results in a table.
 * The first column should display the year from year 1 to year
 * 75. The second column should display the anticipated world population at the end of that year.
 * The third column should display the numerical increase in the world population that would occur
 * that year. Using your results, determine the year in which the population would be double what it
 * is today, if this year’s growth rate were to persist.
 *
 * Created by ag on 02-Jul-20 9:23 PM
 */
class GrowthTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // https://www.worldometers.info/world-population/
    int year = 2020;
    double yearlyChange = 0.0105; // 1.05%
    long initialPopulation = 7_794_798_739L;
    long previousYearPopulation = 7_794_798_739L;

    final int TIME_PERIOD_IN_YEARS = 75;
    int yearDoublePopulation = 0;
    boolean yearFound = false;

    System.out.printf("%-8s%-15s%-15s%n", "Year", "Population", "Increase");
    System.out.println("-".repeat(31));
    for (int i = 0; i < TIME_PERIOD_IN_YEARS; i++) {
      long increase = (long) (previousYearPopulation + previousYearPopulation * yearlyChange) - previousYearPopulation;
      System.out.printf("%-8d%-15d%-15d%n", year, previousYearPopulation, increase);
      previousYearPopulation += increase;

      if (!yearFound && previousYearPopulation >= initialPopulation * 2) {
        yearDoublePopulation = year;
        yearFound = true;
      }

      year++;
    }

    System.out.println("\nIn year " + yearDoublePopulation + " population will be doubled then in 2020");
  }
}

