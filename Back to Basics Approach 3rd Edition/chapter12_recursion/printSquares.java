package chapter12_recursion;

import java.util.LinkedList;
import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp3/chapter12/e22-printSquares
 *
 * @author Alex Golub
 * @since 17-May-21, 11:59 AM
 */
class printSquares {
  public void printSquares(int n) {
    List<Integer> list = new LinkedList<>();
    printSquares(n, list, 1);
  }
  
  private void printSquares(int n, List<Integer> list, int i) {
    if (n < 0) { // don't process negative values
      return;
    }
    
    if (n == 0) {
//      printHelper(list); // already implemented method
      return;
    }
    
    // Note that the maximum possible integer that can be part of
    // a sum of squares for an integer n is the square root of n.
    if (i * i > n) {
      return;
    }
    
    list.add(i);
    printSquares(n - i * i, list, i + 1); // choose
    list.remove(list.size() - 1); // undo
    printSquares(n, list, i + 1);
  }
}
