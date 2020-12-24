package chapter5_logic_and_loops;

/**
 * 2. Write a method called gcd that accepts two integers as
 * parameters and returns the greatest common divisor (GCD)
 * of the two numbers.
 *
 * @author Mr.Dr.Professor
 * @since 19-Dec-20 5:57 PM
 */
class Ex5_2_gcd {
  public static void main(String[] args) {
    System.out.println("gcd(24, 84) = " + gcd(24, 84));       // 12
    System.out.println("gcd(105, 45) = " + gcd(105, 45));     // 15
    System.out.println("gcd(0, 8) = " + gcd(0, 8));           // 8
    System.out.println("gcd(-512, -12) = " + gcd(-512, -12)); // 4

    System.out.println("\n!!!Corner cases!!!");
    System.out.println("gcd(13, 13) = " + gcd(13, 13));       // 13
    System.out.println("gcd(37, 600) = " + gcd(37, 600));     // 1
    System.out.println("gcd(20, 100) = " + gcd(20, 100));     // 20
    System.out.println("gcd(624129, 2061517) = " + gcd(624129, 2061517)); // 18913
  }

  // Euclid's Algorithm
  public static int gcd(int a, int b) {
    while (b != 0) {
      int tmp = a;
      a = b;
      b = tmp % b;
    }

    return Math.abs(a);
  }
}
