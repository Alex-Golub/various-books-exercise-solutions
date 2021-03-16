package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/isPalindrome
 *
 * @author Mr.Dr.Professor
 * @since 13/03/2021 23:24
 */
/*public*/ class isPalindrome {
  public static boolean isPalindrome(String s) {
    int length = s.length();
    s = s.toLowerCase();

    for (int i = 0; i < length / 2; i++) {
      if (s.charAt(i) != s.charAt(length - i - 1)) {
        return false;
      }
    }

    return true;
  }
}
