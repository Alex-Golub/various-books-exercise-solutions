package cse_142.cs1_sections.section07_arrays;

/**
 * https://practiceit.cs.washington.edu/problem/view/567?categoryid=120
 *
 * test #1:isPalindrome("radar")
 * return:true
 * result: pass
 *
 * test #2:isPalindrome("TOOT")
 * return:true
 * result: pass
 *
 * test #3:isPalindrome("Mom")
 * return:true
 * result: pass
 *
 * test #4:isPalindrome("a")
 * return:true
 * result: pass
 *
 * test #5:isPalindrome("")
 * return:true
 * result: pass
 *
 * test #6:isPalindrome("RaceCAr")
 * return:true
 * result: pass
 *
 * test #7:isPalindrome("Stuart")
 * return:false
 * result: pass
 *
 * test #8:isPalindrome("sillY")
 * return:false
 * result: pass
 *
 * test #9:isPalindrome("madam im madam")
 * return:false
 * result: pass
 *
 * test #10:isPalindrome("ok")
 * return:false
 * result: pass
 *
 * @author Alex Golub
 * @since 04-Apr-21 11:51 AM
 */
class isPalindrome {
  // method should be case-insensitive;
  public static boolean isPalindrome(String s) {
    s = s.toLowerCase(); // String is immutable thus not changing the callers String
    int length = s.length();

    for (int i = 0; i < length / 2; i++) {
      if (s.charAt(i) != s.charAt(length - i - 1)) {
        return false;
      }
    }

    return true;
  }
}
