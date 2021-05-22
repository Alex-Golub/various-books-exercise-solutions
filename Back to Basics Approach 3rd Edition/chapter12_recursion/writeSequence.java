package chapter12_recursion;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp3/chapter12/e3-writeSequence
 *
 * @author Alex Golub
 * @since 06-May-21, 11:27 AM
 */
class writeSequence {
  public static void main(String[] args) {
    writeSequence(1);
    System.out.println();
    writeSequence(2);
    System.out.println();
    writeSequence(3);
  }
  
  public static void writeSequence(int n) {
    if (n < 1) {
      throw new IllegalArgumentException();
    }
    if (n == 1) {
      System.out.print("1");
    } else if (n == 2) { // if n is even number
      System.out.print("1 1");
    } else {
      int e = ((int) Math.ceil(n / 2.0));
      System.out.print(e + " ");
      writeSequence(n - 2);
      System.out.print(" " + e);
    }
  }
}

/*
f(4) -> "2 f(2) 2"
  f(2) -> "1 1"
f(4) -> "2 1 1 2"

f(5) -> "3 f(3) 3"
  f(3) -> "2 f(1) 2"
    f(1) -> "1"
  f(3) -> "2 1 2"
f(5) -> "3 2 1 2 3"
 */
