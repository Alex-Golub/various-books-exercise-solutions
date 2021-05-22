package chapter12_recursion;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp5/chapter12/e1-starString
 *
 * @author Alex Golub
 * @since 06-May-21, 11:02 AM
 */
class starString {
  public static void main(String[] args) {
    System.out.println(starString(0));
    System.out.println(starString(1));
    System.out.println(starString(2));
  }
  
  public static String starString(int n) {
    if (n < 0) throw new IllegalArgumentException();
    if (n == 0) return "*";
    return starString(n - 1) + starString(n - 1);
  }
}

/*
m(4) -> m(3) + m(3)
  m(3) -> m(2) + m(2)
    m(2) -> m(1) + m(1)
      m(1) -> m(0) + m(0)
        m(0) -> *
      m(1) -> **
    m(2) -> ****
  m(3) -> ****
m(4) -> ********
 */
