package CodeStepByStep.java.recursion;

/**
 * https://www.codestepbystep.com/problem/view/java/recursion/hanoi
 *
 * you may only move one disk at a time from peg to peg;
 * no disk may be placed on top of a smaller disk.
 *
 * @author Alex Golub
 * @since 22-May-21, 3:08 PM
 */
class hanoi {
  public static void main(String[] args) {
    hanoi(3, 1, 3);
  }
  
  public static void hanoi(int n, int from, int to) {
    int temp;
    if (from == 1 && to == 2 || from == 2 && to == 1) {
      temp = 3;
    } else if (from == 2 && to == 3 || from == 3 && to == 2) {
      temp = 1;
    } else {
      temp = 2;
    }
    
    hanoi(n, from, temp, to);
  }
  
  private static void hanoi(int n, int from, int temp, int to) {
    if (n == 0) return;
    hanoi(n - 1, from, to, temp);
    System.out.println("move disk " + n + " from peg " + from + " to peg " + to);
    hanoi(n - 1, temp, from, to);
  }
}
