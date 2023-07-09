package org.mrdrprof.solutions.chapter5_Loops;

/**
 * @author Mr.Dr.Professor
 * @since 21-Jan-21 2:04 PM
 */
class Ex5_5_cToFtoC {
  public static void main(String[] args) {
    System.out.printf("%-10s%10s   |   %-10s%10s\n",
                      "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");
    for (int celsius = 0; celsius <= 100; celsius += 2) {
      double cToF = celsius * 9.0 / 5 + 32;

      // (c, f) = (0, 20)
      //          (2, 25)
      // y - 20 = (25 - 20) / (2 - 0) (x - 0)
      // y = 2.5x + 20
      int    fahrenheit = (int) (2.5 * celsius + 20);
      double fToC       = 5 * (fahrenheit - 32) / 9.0;

      System.out.printf("%-10d%10.3f   |   %-10d%10.3f\n",
                        celsius, cToF, fahrenheit, fToC);
    }
  }
}
