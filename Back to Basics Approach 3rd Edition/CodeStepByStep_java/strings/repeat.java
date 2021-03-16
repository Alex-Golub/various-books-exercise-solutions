package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/repeat
 *
 * repeat("hello", 3)                => "hellohellohello"
 * repeat("abc", 5)                  => "abcabcabcabcabc"
 * repeat("?", 10)                   => "??????????"
 * repeat("  a   long   string ", 2) => "  a   long   string   a   long   string "
 * repeat("abcde", 1)                => "abcde"
 * repeat("abcde", 0)                => ""
 * repeat("", 100)                   => ""
 *
 * @author Mr.Dr.Professor
 * @since 15/03/2021 00:02
 */
/*public*/ class repeat {
  public static String repeat(String s, int n) {
    StringBuilder sb = new StringBuilder();
    while (n-- > 0) {
      sb.append(s);
    }
    return sb.toString();
  }
}
