package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/isRotation
 *
 * isRotation("abcde", "deabc")       => true
 * isRotation("abcde", "abcde")       => true
 * isRotation("543210", "054321")     => true
 * isRotation("COMPUTER", "UTERCOMP") => true
 * isRotation("x", "x")               => true
 * isRotation("", "")                 => true
 * isRotation("x", "x")               => true
 * isRotation("abcde", "edcba")       => false
 * isRotation("abcde", "abcd")        => false
 * isRotation("543210", "543211")     => false
 * isRotation("COMPUTER", "COMPTUER") => false
 * isRotation("x", "y")               => false
 * isRotation("x", "")                => false
 * isRotation("", "y")                => false
 *
 * @author Mr.Dr.Professor
 * @since 13/03/2021 23:26
 */
/*public*/ class isRotation {
  public static boolean isRotation(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }

    String combined = s1 + s1;
    return combined.contains(s1) && combined.contains(s2);
  }
}
