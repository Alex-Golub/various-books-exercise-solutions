package chapter5_Loops;

/**
 * 5.3 (Conversion from Cº to Fº)
 * Write a program that displays the following table
 *
 * @author Mr.Dr.Professor
 * @since 21-Jan-21 1:57 PM
 */
class Ex5_3_cToF {
  public static void main(String[] args) {
    System.out.printf("%-10s%10s\n", "Celsius", "Fahrenheit");
    for (int c = 0; c <= 100; c += 2) {
      System.out.printf("%-10d%10.1f\n", c, c * 9.0 / 5 + 32);
    }
  }
}
