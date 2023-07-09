package org.mrdrprof.solutions.chapter5_Loops;

import java.text.DecimalFormat;

/**
 * **5.7 (Financial application: compute future tuition)
 * Suppose that the tuition for a university is $10,000 this year
 * and increases 6% every year. In one year, the tuition
 * will be $10,600. Write a program that computes the tuition
 * in ten years and the total cost of four years’ worth of tuition
 * after the tenth year.
 *
 * @author Mr.Dr.Professor
 * @since 21-Jan-21 5:51 PM
 */
class Ex5_7_futureTuition {
  public static void main(String[] args) {
    double       tuitionCost = 10_000;
    final double INCREASE    = 1.06;
    final int    YEARS       = 10;

    System.out.printf("%-5s%15s\n", "Year", "Cost");
    for (int i = 1; i <= YEARS; i++) {
      tuitionCost *= INCREASE;
      System.out.printf("%-5s%15s\n",
                        i, DecimalFormat.getCurrencyInstance().format(tuitionCost));
    }

    // after tenth year total cost for period of 4 years
    double totalCost = tuitionCost;
    for (int i = 2; i <= 4; i++) {
      tuitionCost *= INCREASE;
      totalCost += tuitionCost;
    }

    System.out.println("\nTotal cost after 10th year 4 years "
                       + DecimalFormat.getCurrencyInstance().format(totalCost));
  }
}
