package CodeStepByStep.java.recursion;

/**
 * https://www.codestepbystep.com/problem/view/java/recursion/printBinary
 *
 * @author Alex Golub
 * @since 12-May-21, 12:37 PM
 */
class printBinary {
  public static void main(String[] args) {
    printBinary(43);
    System.out.println();
    printBinary(-6);
    System.out.println();
    printBinary(0);
    System.out.println();
    printBinary(1);
  }
  
  public static void printBinary(int n) {
    if (n < 0) {
      System.out.print("-");
      printBinary(-n);
    } else if (n > 1) {
      printBinary(n / 2);
      System.out.print(n % 2);
    } else {
      System.out.print(n);
    }
  }
}
