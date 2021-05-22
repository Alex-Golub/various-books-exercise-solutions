package chapter12_recursion;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp3/chapter12/e2-writeNums
 *
 * @author Alex Golub
 * @since 06-May-21, 11:18 AM
 */
class writeNums {
  public static void main(String[] args) {
    writeNums(1);
    System.out.println();
    writeNums(2);
    System.out.println();
    writeNums(3);
  }
  
  public static void writeNums(int n) {
    if (n < 1) throw new IllegalArgumentException();
    if (n == 1) {
      System.out.print("1");
    } else {
      writeNums(n - 1);
      System.out.print(", " + n);
    }
  }
}

/*
f(3) -> f(2)
  f(2) -> f(1)
    f(1) -> "1"
  f(2) -> ", 2"
f(3) -> ", 3"

=> "1, 2, 3"
 */
