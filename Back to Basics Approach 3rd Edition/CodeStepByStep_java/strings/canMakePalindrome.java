package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/canMakePalindrome
 *
 * if you can make that string into a palindrome by
 * deleting at most 1 character, or false if that is not possible.
 *
 * The empty string and all one-character strings are also
 * palindromes by our definition.
 *
 * @author Mr.Dr.Professor
 * @since 13-Mar-21 8:08 PM
 */
/*public*/ class canMakePalindrome {
  public static void main(String[] args) {
    System.out.println(canMakePalindrome("raycecar"));
    System.out.println(canMakePalindrome("abxa"));
    System.out.println(canMakePalindrome("pretend"));
  }

  public static boolean canMakePalindrome(String s) {
    int i = 0, j = s.length() - 1;
    while (i < j && s.charAt(i) == s.charAt(j)) {
      i++;
      j--;
    }

    return i >= j ||
           isPalindrome(s.substring(i + 1, j + 1)) ||
           isPalindrome(s.substring(i, j));
  }

  public static boolean isPalindrome(String s) {
    int length = s.length();
    for (int i = 0; i < length / 2; i++) {
      if (s.charAt(i) != s.charAt(length - i - 1)) {
        return false;
      }
    }

    return true;
  }
}
