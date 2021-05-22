package chapter12_recursion;

/**
 * @author Alex Golub
 * @since 03-May-21, 2:00 PM
 */
class parenthesize {
  public static void main(String[] args) {
    System.out.println(parenthesize("Joe Doe", 2));
    System.out.println(parenthesize("Hello", 5));
    System.out.println(parenthesize("Fun", 0));
    System.out.println(parenthesize("Java is life", 1));
    System.out.println(parenthesize("No", -1));
  }
  
  public static String parenthesize(String s, int n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    } else if (n == 0) {
      return s;
    }
    
    return "(" + parenthesize(s, n - 1) + ")";
  }
}
