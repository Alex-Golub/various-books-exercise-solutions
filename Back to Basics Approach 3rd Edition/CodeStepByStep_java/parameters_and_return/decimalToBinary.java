package CodeStepByStep_java.parameters_and_return;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/decimalToBinary
 *
 * Write a method named decimalToBinary that accepts an integer
 * as a parameter and returns an integer whose digits look like
 * that number's representation in binary (base-2).
 * For example, the call of decimalToBinary(43) should return 101011.
 *
 * Constraints:
 * 1. Do not use a string in your solution.
 * 2. Also do not use any built-in base conversion methods like Integer.toString.
 *
 * @author Mr.Dr.Professor
 * @since 24-Feb-21 5:40 PM
 */
/*public*/ class decimalToBinary {
  public static void main(String[] args) {
    System.out.println(decimalToBinary(43));
  }

  public static int decimalToBinary(int decimal) {
    int binary = 0;
    int factor = 1;

    while (decimal != 0) {
      binary += decimal % 2 * factor;
      decimal /= 2;
      factor *= 10;
    }

    return binary;
  }
}
