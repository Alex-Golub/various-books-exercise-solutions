package org.mrdrprof.solutions.chapter6_Methods;

/**
 * @author Mr.Dr.Professor
 * @since 28-Jan-21 1:50 PM
 */
class Ex6_9_poundsKiloConversion {
  static final double KILOGRAMS_PER_POUND = 0.453;
  static final double POUNDS_PER_KILOGRAM = 2.204;

  public static void main(String[] args) {
    final int FROM  = 1;
    final int UP_TO = 199;

    System.out.printf("%-12s%-10s   |   %-15s%-10s\n",
                      "Kilograms", "Pounds", "Pounds", "Kilograms");
    System.out.println("-".repeat(57));

    for (int i = FROM; i <= UP_TO; i += 2) {
      double pounds = 2.5 * i + 17.5; // linear ratio

      System.out.printf("%-12d%-10.1f   |   %-15d%-10.2f\n",
                        i, kilogramToPound(i), (int) pounds, poundToKilogram(pounds)
      );
    }
  }

  public static double kilogramToPound(double kilogram) {
    if (kilogram < 0)
      throw new IllegalArgumentException("Negative value: " + kilogram);

    return kilogram / KILOGRAMS_PER_POUND;
  }

  public static double poundToKilogram(double pound) {
    if (pound < 0)
      throw new IllegalArgumentException("Negative value: " + pound);

    return pound / POUNDS_PER_KILOGRAM;
  }


}
