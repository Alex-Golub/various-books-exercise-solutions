package CodeStepByStep.java.recursion;

/**
 * https://www.codestepbystep.com/problem/view/java/recursion/isSubsequence
 *
 * 1. A string is a subsequence of another if it contains the same letters
 * in the same order, but not necessary consecutively.
 * 2. You can assume both strings are already lowercased.
 *
 * isSubsequence("computer", "core")        => false
 * isSubsequence("computer", "cope")        => true
 * isSubsequence("see plus plus", "splsls") => true
 * isSubsequence("banana", "aaabnn")        => false
 * isSubsequence("banana", "anan")          => true
 * isSubsequence("MA", "MM")                => false
 *
 * @author Alex Golub
 * @since 12-May-21, 3:38 PM
 */
class isSubsequence {
  public static boolean isSubsequence(String s1, String s2) {
    if (s2.length() == 0) { // s2 exhausted no matter what the length of s1, s2 IS subsequence of s1
      return true;
    } else if (s1.length() == 0) { // s2 has not been exhausted but s1 is thus s2 NOT subsequence of s1
      return false;
    }
    
    return s1.charAt(0) == s2.charAt(0) ?
           isSubsequence(s1.substring(1), s2.substring(1)) : // char match, advanced both
           isSubsequence(s1.substring(1), s2); // no match, look ahead in s1
  }
}
