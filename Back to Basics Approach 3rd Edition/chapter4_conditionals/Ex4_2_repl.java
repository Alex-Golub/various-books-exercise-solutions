package chapter4_conditionals;

/**
 * 2. Write a method called repl that accepts a String and a number of
 * repetitions as parameters and returns the
 * String concatenated that many times.
 *
 * @author Mr.Dr.Professor
 * @since 10-Dec-20 12:52 PM
 */
class Ex4_2_repl {
  public static String repl(String s, int n) {
    String res = "";
    for (int i = 0; i < n; i++)
      res += s;
    return s;
  }
}
