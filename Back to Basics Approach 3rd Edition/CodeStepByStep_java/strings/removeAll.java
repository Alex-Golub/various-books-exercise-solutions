package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/removeAll
 *
 * removeAll("Summer is here!", 'e') => "Summr is hr!"
 * removeAll("this is a test", 't')  => "his is a es"
 * removeAll("---0---", '-')         => "0"
 * removeAll("banana", 't')          => "banana"
 * removeAll("xxxxx", 'x')           => ""
 * removeAll("", ' ')                => ""
 *
 * @author Mr.Dr.Professor
 * @since 14/03/2021 23:45
 */
/*public*/ class removeAll {
  public static void main(String[] args) {
    System.out.println(removeAll("aaaaaabc", 'a'));
  }

  public static String removeAll(String s, char c) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      char curChar = s.charAt(i);
      if (s.charAt(i) != c) {
        sb.append(curChar);
      }
    }
    return sb.toString();
  }
}
