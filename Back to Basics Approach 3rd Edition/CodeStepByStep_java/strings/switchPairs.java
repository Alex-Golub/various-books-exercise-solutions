package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/switchPairs
 *
 * switchPairs("example")     => "xemalpe"
 * switchPairs("hello there") => "ehll ohtree"
 * switchPairs("homework")    => "ohemowkr"
 * switchPairs("x")           => "x"
 * switchPairs("")            => ""
 *
 * @author Mr.Dr.Professor
 * @since 16/03/2021 21:04
 */
/*public*/ class switchPairs {
  public static String switchPairs(String s) {
    StringBuilder builder = new StringBuilder();
    int i = 0;
    while (i < s.length() - 1) {
      builder.append(s.charAt(i + 1)).append(s.charAt(i));
      i += 2;
    }

    if (i < s.length()) {
      builder.append(s.charAt(i));
    }

    return builder.toString();
  }
}
