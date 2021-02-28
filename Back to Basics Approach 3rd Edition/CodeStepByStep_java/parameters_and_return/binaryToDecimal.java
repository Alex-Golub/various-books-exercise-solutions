package CodeStepByStep_java.parameters_and_return;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/binaryToDecimal
 *
 * Write a method named binaryToDecimal that accepts an integer parameter
 * whose digits are meant to represent binary (base-2) digits,
 * and returns an integer of that number's representation in decimal (base-10).
 * For example, the call of binaryToDecimal(101011) should return 43.
 *
 * Constraints:
 * 1. Do not use a string in your solution.
 * 2. Also do not use any built-in base conversion methods like Integer.toString.
 *
 * @author Mr.Dr.Professor
 * @since 24-Feb-21 2:07 PM
 */
/*public*/ class binaryToDecimal {
  public static void main(String[] args) {
    System.out.println(binaryToDecimal(101011));
  }

  public static int binaryToDecimal(int n) {
    int res = 0;
    for (int i = 0; n != 0; i++) {
      res += n % 10 * Math.pow(2, i);
      n /= 10;
    }

    return res;
  }
}
