package org.mrdrprof.solutions.chapter6_Methods;

/**
 * 6.8 (Conversions between mile and kilometer)
 *
 * @author Mr.Dr.Professor
 * @since 28-Jan-21 1:30 PM
 */
class Ex6_8_milesKmsConversion {
  static final double KILOMETERS_PER_MILE = 1.60934;

  public static void main(String[] args) {
    final int FROM = 1;
    final int UP_TO = 10;

    System.out.printf("%-10s%-10s   |   %-15s%-10s\n",
                      "Miles", "Kilometers", "Kilometers", "Miles");
    System.out.println("-".repeat(57));

    for (int i = FROM; i <= UP_TO; i++) {
      int kilometers = 5 * i + 15; // linear ratio

      System.out.printf("%-10d%-10.3f   |   %-15d%-10.3f\n",
                        i, mileToKilometer(i), kilometers, kilometerToMile(kilometers)
      );
    }
  }

  public static double mileToKilometer(double mile) {
    if (mile < 0)
      throw new IllegalArgumentException("Negative value: " + mile);

    return mile * KILOMETERS_PER_MILE;
  }

  public static double kilometerToMile(double kilometer) {
    if (kilometer < 0)
      throw new IllegalArgumentException("Negative value: " + kilometer);

    return kilometer / KILOMETERS_PER_MILE;
  }

}
