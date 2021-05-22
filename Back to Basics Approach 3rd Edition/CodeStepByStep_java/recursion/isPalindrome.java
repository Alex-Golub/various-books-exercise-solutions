package CodeStepByStep.java.recursion;

/**
 * https://www.codestepbystep.com/problem/view/java/recursion/isPalindrome
 *
 * @author Alex Golub
 * @since 09-May-21, 2:36 PM
 */
class isPalindrome {
  public static boolean isPalindrome(String s) {
    if (s.length() <= 1) {
      return true;
    } else {
      char first = Character.toLowerCase(s.charAt(0));
      char last = Character.toLowerCase(s.charAt(s.length() - 1));
      return first == last && isPalindrome(s.substring(1, s.length() - 1));
    }
  }
}
