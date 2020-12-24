package chapter5_logic_and_loops;

/**
 * 3. Write a method called toBinary that accepts an
 * integer as a parameter and returns a String containing that
 * integer’s binary representation.
 *
 * @author Mr.Dr.Professor
 * @since 19-Dec-20 6:21 PM
 */
class Ex5_3_toBinary {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      int rnd = (int) (Math.random() * 257);
      System.out.printf("toBinary(%d) = %s\n",
              rnd, toBinary(rnd));

      // Using built in method from Integer class
      System.out.printf("Integer.toBinaryString(%d) = %s\n\n",
              rnd, Integer.toBinaryString(rnd));
    }
  }

  // We can also use Integer.toString(
  public static String toBinary(int n) {
    if (n == 0)
      return "0";

    StringBuilder res = new StringBuilder();
    n = n < 0 ? -n : n;
    while (n != 0) {
      res.insert(0, n % 2);
      n /= 2;
    }

    return res.toString();
  }
}
