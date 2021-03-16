package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/swapPairs
 *
 * swapPairs("example")              => "xemalpe"
 * swapPairs("hello there")          => "ehll ohtree"
 * swapPairs("Martin Douglas Stepp") => "aMtrniD uolgsaS etpp"
 * swapPairs("AB")                   => "BA"
 * swapPairs("X")                    => "X"
 * swapPairs("")                     => ""
 *
 * @author Mr.Dr.Professor
 * @since 16/03/2021 20:58
 */
/*public*/ class swapPairs {
  public static void main(String[] args) {
    System.out.println(swapPairs("abcd"));
    System.out.println(swapPairs("abc"));
  }

  public static String swapPairs(String s) {
    StringBuilder builder = new StringBuilder();
    int i = 0;
    while (i < s.length() - 1) {
      char first = s.charAt(i);
      char second = s.charAt(i + 1);
      builder.append(second).append(first);
      i += 2;
    }

    // If s is odd length string assign last character
    // to end of builder
    if (i < s.length()) {
      builder.append(s.charAt(i));
    }

    return builder.toString();
  }
}
