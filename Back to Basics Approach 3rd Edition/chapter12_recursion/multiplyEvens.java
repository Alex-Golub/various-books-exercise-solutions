package chapter12_recursion;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp4/chapter12/e8-multiplyEvens
 *
 * @author Alex Golub
 * @since 06-May-21, 1:15 PM
 */
class multiplyEvens {
  public static int multiplyEvens(int n) {
    if (n < 1) {
      throw new IllegalArgumentException();
    }
    
    return n == 1 ? 2 : 2 * n * multiplyEvens(n - 1);
  }
}

/*
f(3) -> 2 * 3 * f(2)
  f(2) -> 2 * 2 * f(1)
    f(1) -> 2 * 1 = 2
  f(2) -> 2 * 2 * 2 = 8
f(3) -> 2 * 3 * 8 = 48
 */
