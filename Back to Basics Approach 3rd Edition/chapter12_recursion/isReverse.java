package chapter12_recursion;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp3/chapter12/e12-isReverse
 *
 * @author Alex Golub
 * @since 06-May-21, 3:39 PM
 */
class isReverse {
  public static void main(String[] args) {
    System.out.println(isReverse("CSE143", "341esc") == true);
    System.out.println(isReverse("Madam", "MaDAm") == true);
    System.out.println(isReverse("Q", "Q") == true);
    System.out.println(isReverse("", "") == true);
    System.out.println(isReverse("e via n", "N aIv E") == true);
    System.out.println(isReverse("Go! Go", "OG !OG") == true);
    System.out.println(isReverse("Obama", "McCain") == false);
    System.out.println(isReverse("banana", "nanaba") == false);
    System.out.println(isReverse("hello!!", "olleh") == false);
    System.out.println(isReverse("", "x") == false);
    System.out.println(isReverse("madam I", "i m adam") == false);
    System.out.println(isReverse("ok", "oko") == false);
  }
  
  public static boolean isReverse(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    
    // The empty string, as well as any one-letter string, is considered
    // to be its own reverse.
    if (s.length() == 0) {
      return true;
    }
    
    // method is case-insensitive
    char firstChar = Character.toLowerCase(s.charAt(0));
    char lastChar = Character.toLowerCase(t.charAt(t.length() - 1));
    
    return firstChar == lastChar && isReverse(s.substring(1), t.substring(0, t.length() - 1));
  }
}
