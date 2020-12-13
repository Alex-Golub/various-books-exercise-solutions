package chapter4_conditionals;

/**
 * 17. Write a method called stutter that accepts a parameter and returns
 * the String with its characters returns repeated twice.
 *
 * @author Mr.Dr.Professor
 * @since 10-Dec-20 8:49 PM
 */
class Ex4_17_stutter {
  public static String stutter(String s) {
    String res = "";
    int n = s.length();
    for (int i = 0; i < n; i++)
      res += s.charAt(i) + "" + s.charAt(i);
    return res;
  }
}
