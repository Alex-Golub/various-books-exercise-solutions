package chapter12_recursion;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp5/chapter12/e10-digitMatch
 *
 * @author Alex Golub
 * @since 06-May-21, 2:14 PM
 */
class digitMatch {
  public static void main(String[] args) {
    System.out.println(digitMatch(38, 34) + " -> " + 1);
    System.out.println(digitMatch(5, 5552) + " -> " + 0);
    System.out.println(digitMatch(892, 892) + " -> " + 3);
    System.out.println(digitMatch(298892, 7892) + " -> " + 3);
    System.out.println(digitMatch(380, 0) + " -> " + 1);
    System.out.println(digitMatch(123456, 654321) + " -> " + 0);
    System.out.println(digitMatch(1234567, 67) + " -> " + 2);
  }
  
  public static int digitMatch(int a, int b) {
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException();
    }
  
    boolean d = a % 10 == b % 10;
    if (a < 10 || b < 10) {
      return d ? 1 : 0;
    }
    
    return (d ? 1 : 0) + digitMatch(a / 10, b / 10);
  }
}
