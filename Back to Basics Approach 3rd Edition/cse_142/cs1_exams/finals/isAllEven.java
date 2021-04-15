package cse_142.cs1_exams.finals;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final1/isAllEven
 *
 * @author Alex Golub
 * @since 12-Apr-21 5:44 PM
 */
class isAllEven {
  public static boolean isAllEven(int[] arr) {
    for (int ele : arr) {
      if (ele % 2 == 1) {
        return false;
      }
    }

    return true;
  }
}
