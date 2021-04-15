package cse_142.cs1_exams.finals;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final5/contains
 *
 * @author Alex Golub
 * @since 13-Apr-21 10:32 PM
 */
class contains {
  public static void main(String[] args) {
    int[] list1 = {1, 6, 2, 1, 4, 1, 2, 1, 8};
    int[] list2 = {1, 2, 1};
    System.out.println(contains(list1, list2));
  }

  public static boolean contains(int[] a1, int[] a2) {
    for (int i = 0; i <= a1.length - a2.length; i++) {
      int count = 0;

      for (int j = 0; j < a2.length; j++) {
        if (a1[i + j] == a2[j]) {
          count++;
        }
      }

      if (count == a2.length) { // there was one occurrence of a2 in a2
        return true;
      }
    }

    return false;
  }
}
