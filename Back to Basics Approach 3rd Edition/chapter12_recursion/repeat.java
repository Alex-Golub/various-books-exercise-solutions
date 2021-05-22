package chapter12_recursion;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp3/chapter12/e11-repeat
 *
 * @author Alex Golub
 * @since 06-May-21, 3:07 PM
 */
class repeat {
  public static void main(String[] args) {
    System.out.println(repeat("hello", 3));
    System.out.println(repeat("this is fun", 1));
  }
  
  public static String repeat(String s, int n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
  
    if (n == 0) {
      return "";
    }
    
    String half = repeat(s, n / 2);
    return (n % 2 == 0 ? "" : s) + half + half;
  }
}

/*
f("a", 6) -> half = f("a", 3)
  f("a", 3) -> half = f("a", 1)
    f("a", 1) -> half = f("a", 0)
      f("a", 0) -> ""
    f("a", 1) -> half = ""; "a"
  f("a", 3) -> half = "a"; "aaa"
f("a", 6) -> half = "aaa"; "aaaaaa"
*/
