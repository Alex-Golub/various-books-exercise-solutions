package CodeStepByStep.java.recursion;

/**
 * https://www.codestepbystep.com/problem/view/java/recursion/numberSequence
 * https://www.codestepbystep.com/problem/view/java/recursion/mirrorSequence
 *
 * numberSequence(1);	1
 * numberSequence(2);	1 1
 * numberSequence(3);	2 1 2
 * numberSequence(4);	2 1 1 2
 * numberSequence(5);	3 2 1 2 3
 * numberSequence(6);	3 2 1 1 2 3
 * numberSequence(7);	4 3 2 1 2 3 4
 * numberSequence(8);	4 3 2 1 1 2 3 4
 * numberSequence(9);	5 4 3 2 1 2 3 4 5
 * numberSequence(10); 5 4 3 2 1 1 2 3 4 5
 *
 * @author Alex Golub
 * @since 12-May-21, 1:19 PM
 */
class numberSequence {
  public static void main(String[] args) {
    numberSequence(1);
    System.out.println();
    numberSequence(2);
    System.out.println();
    numberSequence(3);
    System.out.println();
    numberSequence(4);
  }
  
  public static void numberSequence(int n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    } else if (n == 1) {
      System.out.print("1");
    } else if (n == 2) {
      System.out.print("1 1");
    } else {
      int edge = (n + 1) / 2;
      System.out.print(edge + " ");
      numberSequence(n - 2);
      System.out.print(" " + edge);
    }
  }
}
