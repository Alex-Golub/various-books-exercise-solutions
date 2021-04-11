package cse_142.cs1_exams.midterms;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/misc/repeatQuote
 *
 * test #2:repeatQuote("how are you? ", 3);
 * console output:
 * \how are you? :how are you? :how are you? \
 * result: pass
 *
 * @author Alex Golub
 * @since 11-Apr-21 9:41 PM
 */
class repeatQuote {
  public static void repeatQuote(String s, int n) {
    System.out.print("\\");
    if (n > 0) {
      System.out.print(s);

      for (int i = 1; i < n; i++) {
        System.out.print(":" + s);
      }
    }
    System.out.print("\\");
  }
}
