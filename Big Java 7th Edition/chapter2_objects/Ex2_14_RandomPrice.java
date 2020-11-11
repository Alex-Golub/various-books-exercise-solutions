package chapter2_objects;

import java.util.Random;

/**
 * •• E2.14
 * Write a program RandomPrice that prints a random price between
 * $10.00 and $19.95 every time the program is run.
 *
 * Created by ag on 08-Nov-20 2:24 PM
 */
class Ex2_14_RandomPrice {
  public static void main(String[] args) {
    Random       rnd  = new Random();
    final double LOW  = 10;
    final double HIGH = 19.95;

    // 19.95 - 10.00 = 9.95
    // 10 + ([0, 1) * 9.95)
    // => 10 + [0, 9.9499999)
    // => [10.0, 19.94999]
    for (int i = 0; i <= 1000; i++) {
      double price = LOW + rnd.nextDouble() * (HIGH - LOW);
      System.out.println("Price: $" + (int) (price * 100) / 100.0);
    }
  }
}
