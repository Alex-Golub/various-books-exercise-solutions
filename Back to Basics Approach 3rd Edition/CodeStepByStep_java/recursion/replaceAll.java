package CodeStepByStep.java.recursion;

/**
 * https://www.codestepbystep.com/problem/view/java/recursion/replaceAll
 *
 * NB: method is case-sensitive
 *
 * @author Alex Golub
 * @since 09-May-21, 4:13 PM
 */
class replaceAll {
  public static String replaceAll(String s, char from, char to) {
    if (s.length() == 0) {
      return "";
    } else {
      char firstChar = s.charAt(0);
      return (firstChar == from ? to : firstChar) + replaceAll(s.substring(1), from, to);
    }
  }
}

/*
f("abcdc", 'c', 'X') -> 'a' + f("bcdc", 'c', 'X')
  f("bcdc", 'c', 'X') -> 'b' + f("cdc", 'c', 'X')
    f("cdc", 'c', 'X') -> 'X' + f("dc", 'c', 'X')
      f("dc", 'c', 'X') -> 'd' + f("c", 'c', 'X')
        f("c", 'c', 'X') -> 'X' + f("", 'c', 'X')
          f("", 'c', 'X') -> ""
        f("c", 'c', 'X') -> 'X' + "" -> "X"
      f("dc", 'c', 'X') -> 'd' + "X" -> "dX"
    f("cdc", 'c', 'X') -> 'X' + "dX" -> "XdX"
  f("bcdc", 'c', 'X') -> 'b' + "XdX" -> "bXdX"
f("abcdc", 'c', 'X') -> 'a' + "bXdX" -> "abXdX"
*/
