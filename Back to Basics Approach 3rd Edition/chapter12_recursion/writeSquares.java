package chapter12_recursion;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp3/chapter12/e6-writeSquares
 *
 * Call	Valued       Returned
 * writeSquares(5);  25, 9, 1, 4, 16
 * writeSquares(1);  1
 * writeSquares(8);  49, 25, 9, 1, 4, 16, 36, 64
 *
 * @author Alex Golub
 * @since 06-May-21, 12:18 PM
 */
class writeSquares {
  public static void main(String[] args) {
    writeSquares(5);
    System.out.println();
    writeSquares(8);
  }
  
  public static void writeSquares(int n) {
    if (n < 1) {
      throw new IllegalArgumentException();
    }
    
    if (n == 1) {
      System.out.print("1");
    } else if (n % 2 == 1) { // odd squares come first
      System.out.print(n * n + ", ");
      writeSquares(n - 1);
    } else {
      writeSquares(n - 1);
      System.out.print(", " + n * n);
    }
  }
}

/*
f(5) -> 25, f(4)
  f(4) -> f(3), 16
    f(3) -> 9, f(2)
      f(2) -> f(1), 4
        f(1) -> 1
      f(2) -> 1, 4
    f(3) -> 9, 1, 4
  f(4) -> 9, 1, 4, 16
f(5) -> 25, 9, 1, 4, 16
*/
