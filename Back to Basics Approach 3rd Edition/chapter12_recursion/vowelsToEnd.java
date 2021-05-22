package chapter12_recursion;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp5/chapter12/e15-vowelsToEnd
 *
 * The vowels should appear in reverse order of what they were in the original word
 *
 * @author Alex Golub
 * @since 22-May-21, 4:24 PM
 */
class vowelsToEnd {
  public static void main(String[] args) {
    System.out.println(vowelsToEnd("beautifully"));
  }
  
  public static String vowelsToEnd(String s) {
    if (s.length() == 0) return "";
    boolean isVowel = "aeiouAEIOU".contains(s.substring(0, 1));
    if (isVowel) {
      return vowelsToEnd(s.substring(1)) + s.charAt(0);
    }
    return s.charAt(0) + vowelsToEnd(s.substring(1));
  }
}
