package CodeStepByStep.java.recursion;

/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/moveToEnd
 *
 * If the character is a letter of the alphabet, all occurrences of that letter
 * in either upper or lowercase should be moved to the end and converted to uppercase.
 *
 * @author Alex Golub
 * @since 12-May-21, 2:27 PM
 */
class moveToEnd {
  public static void main(String[] args) {
    System.out.println(moveToEnd("abAcAdae", 'a')); // "bcdeAAAA"
    System.out.println(moveToEnd("g", 'g')); // "G"
    System.out.println(moveToEnd("", 'g')); // "G"
  }
  
  public static String moveToEnd(String s, char c) {
    return moveToEnd(s, Character.toUpperCase(c), s.length());
  }
  
  private static String moveToEnd(String s, char c, int n) {
    if (n == 0) {
      return s;
    }
    if (Character.toUpperCase(s.charAt(0)) == c) {
      return moveToEnd(s.substring(1), c, n - 1) + c;
    } else {
      return s.charAt(0) + moveToEnd(s.substring(1), c, n - 1);
    }
  }
}
