package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/reverseWordOrder
 *
 * reverseWordOrder("Hello what is your name?") => "name? your is what Hello"
 * reverseWordOrder("hello")                    => "hello"
 * reverseWordOrder("how are you")              => "you are how"
 * reverseWordOrder("a b c d")                  => "d c b a"
 * reverseWordOrder("")                         => ""
 *
 * @author Mr.Dr.Professor
 * @since 15/03/2021 20:53
 */
/*public*/ class reverseWordOrder {
  public static void main(String[] args) {
    System.out.println(reverseWordOrder("Hello what is your name?"));
  }

  public static String reverseWordOrder(String s) {
    StringBuilder sb = new StringBuilder();
    int i = s.length() - 1, j = i;

    while (true) {
      // find where word is starting
      while (i >= 0 && s.charAt(i) != ' ') {
        i--;
      }

      // extract word (same as s.substring(i + 1, j + 1))
      sb.append(s, i + 1, j + 1);

      // if this was the last word we are done
      if (i < 0) {
        break;
      }

      // there might be more words, find the last character of the next word
      sb.append(" ");
      while (i >= 0 && s.charAt(i) == ' ') {
        i--;
      }

      // pont to last character of the newly found word
      j = i;
    }

    return sb.toString();
  }
}
