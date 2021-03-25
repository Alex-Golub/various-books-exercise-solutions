package chapter10_Object_Oriented_Thinking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * **10.25 (New string split method)
 * Implement the following new method that returns
 * an array of strings consisting of the substrings
 * split by the matching delimiters, including the
 * matching delimiters.
 *
 * split("ab#12#453", "#")   => [ab, #, 12, #, 453]
 * split("a?b?gf#e", "[?#]") => [a, ?, b, ?, gf, #, e]
 *
 * @author Mr.Dr.Professor
 * @since 25-Mar-21 3:20 PM
 */
/*public*/ class Ex10_25_split {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(split("ab#12#453", "#")));
    System.out.println(Arrays.toString(split("a?b?gf#e", "?")));
  }

  /**
   * splitting can be by array of delimiters or by single delimiter
   */
  public static String[] split(String s, String regex) {
    String[] tokens = {};
    switch (splitBy(regex)) {
      case "single":
        tokens = splitBySingle(s, regex);
        break;
      case "array":
        tokens = splitByArray(s, regex);
        break;
    }

    return tokens;
  }

  private static String[] splitBySingle(String s, String delimiter) {
    List<String> temp = new ArrayList<>();
    int newIndex = 0;

    for (int i = 0; i < s.length() - delimiter.length(); i++) {
      String substring = s.substring(i, i + delimiter.length());

      if (delimiter.equals(substring)) {
        temp.add(s.substring(newIndex, i));
        temp.add(delimiter);
        newIndex = i + delimiter.length();
      }
    }

    temp.add(s.substring(newIndex)); // copy leftovers
    return temp.toArray(new String[0]);
  }

  private static String[] splitByArray(String s, String regex) {
    char[] regexChars = getRegex(regex);
    List<String> temp = new ArrayList<>();
    int newIndex = 0;

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);

      for (char regexChar : regexChars) {
        if (ch == regexChar) {
          if (newIndex != i)
            temp.add(s.substring(newIndex, i));

          temp.add("" + regexChar);
          newIndex = i + 1;
        }
      }
    }

    temp.add(s.substring(newIndex));
    return temp.toArray(new String[0]);
  }

  private static char[] getRegex(String regex) {
    if (regex.charAt(0) != '[' && regex.charAt(regex.length() - 1) != ']')
      return regex.toCharArray();

    return regex.substring(1, regex.length() - 1)
            .toCharArray();
  }

  private static String splitBy(String regex) {
    return regex.charAt(0) == '[' && regex.charAt(regex.length() - 1) == ']' ?
           "array" : "single";
  }
}
