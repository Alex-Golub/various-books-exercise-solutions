package CodeStepByStep.java.recursion;

/**
 * https://www.codestepbystep.com/problem/view/java/recursion/printRange
 *
 * 1. The first half should be printed with the greater-than character (">")
 * separating consecutive values.
 * 2. The second half should be printed with the less-than character ("<")
 * separating consecutive values.
 * 3. When there are two values in the middle of the range,
 * those two values should be separated by a pair of dashes ("--")
 *
 * @author Alex Golub
 * @since 09-May-21, 4:26 PM
 */
class printRange {
  public static void main(String[] args) {
    printRange(1, 9);
    System.out.println();
    printRange(1, 10);
    System.out.println();
    printRange(23, 29);
    System.out.println();
    printRange(13, 14);
    System.out.println();
    printRange(-8, -8);
    System.out.println();
  }
  
  public static void printRange(int x, int y) {
    if (x > y) {
      throw new IllegalArgumentException();
    } else if (x == y) {
      System.out.print(x);
    } else if (x + 1 == y) {
      System.out.print(x + " -- " + y);
    } else {
      System.out.print(x + " > ");
      printRange(x + 1, y - 1);
      System.out.print(" < " + y);
    }
  }
}

/*
f(1, 5) -> 1 > f(2, 4) < 5
  f(2, 4) -> 2 > f(3, 3) < 4
    f(3, 3) -> 3
  f(2, 4) -> 2 > 3 < 4
f(1, 5) -> 1 > 2 > 3 < 4 < 5

f(3, 8) -> 3 > f(4, 7) < 8
  f(4, 7) -> 4 > f(5, 6) < 7
    f(5, 6) -> 5 -- 6
  f(4, 7) -> 4 > 5 -- 6 < 7
f(3, 8) -> 3 > 4 > 5 -- 6 < 7 < 8
*/
