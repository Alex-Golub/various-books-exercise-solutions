package org.mrdrprof.solutions.chapter6_Methods;

import java.util.Random;

/**
 * *6.5 (Sort three numbers)
 *
 * @author Mr.Dr.Professor
 * @since 28-Jan-21 12:24 PM
 */
class Ex6_5_sortThree {
  public static void main(String[] args) {
    Random rand = new Random();
    for (int i = 0; i <= 10; i++) {
      displaySortedNumbers(rand.nextInt(10),
                           rand.nextInt(10),
                           rand.nextInt(10));
    }
  }

  // Sort three numbers in DESC order
  public static void displaySortedNumbers(double a, double b, double c) {
    double temp;
    if (b < c) {
      temp = b;
      b = c;
      c = temp;
    }
    if (a < b) {
      temp = a;
      a = b;
      b = temp;
    }
    if (b < c) {
      temp = b;
      b = c;
      c = temp;
    }

    System.out.println(a + " " + b + " " + c);
  }
}
