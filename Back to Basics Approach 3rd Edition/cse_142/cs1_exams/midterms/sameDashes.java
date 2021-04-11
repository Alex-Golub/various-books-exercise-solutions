package cse_142.cs1_exams.midterms;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm14/sameDashes
 *
 * @author Alex Golub
 * @since 11-Apr-21 9:32 PM
 */
class sameDashes {
  public static boolean sameDashes(String s1, String s2) {
    int i = 0, j = 0;
    while (i < s1.length() && j < s2.length()) {
      if (s1.charAt(i++) == '-' ^ s2.charAt(j++) == '-') {
        return false;
      }
    }

    while (i < s1.length()) {
      if (s1.charAt(i++) == '-') {
        return false;
      }
    }

    while (j < s2.length()) {
      if (s2.charAt(j++) == '-') {
        return false;
      }
    }

    return true;
  }
}
