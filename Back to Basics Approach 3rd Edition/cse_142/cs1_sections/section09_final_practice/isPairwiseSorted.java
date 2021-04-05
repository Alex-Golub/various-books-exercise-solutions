package cse_142.cs1_sections.section09_final_practice;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/sections/section9/isPairwiseSorted
 *
 * If the array has an odd length, then your method should ignore the value at the end.
 * You may not construct any extra data structures to solve this problem.
 *
 * test #1:isPairwiseSorted({})
 * return:true
 * result: pass
 *
 * test #2:isPairwiseSorted({6})
 * return:true
 * result: pass
 *
 * test #3:isPairwiseSorted({4, 12})
 * return:true
 * result: pass
 *
 * test #4:isPairwiseSorted({8, 5})
 * return:false
 * result: pass
 *
 * test #5:isPairwiseSorted({3, 8, 2, 15, -3, 5, 2, 3, 4, 4, 3, 1})
 * return:false
 * result: pass
 *
 * test #6:isPairwiseSorted({8, 13, 92, 92, 4, 4})
 * return:true
 * result: pass
 *
 * test #7:isPairwiseSorted({1, 3, 5, 7, 9, 8})
 * return:false
 * result: pass
 *
 * @author Alex Golub
 * @since 05-Apr-21 11:09 AM
 */
class isPairwiseSorted {
  public static void main(String[] args) {
    System.out.println(isPairwiseSorted(new int[]{}) + " => " + true);
    System.out.println(isPairwiseSorted(new int[]{6}) + " => " + true);
    System.out.println(isPairwiseSorted(new int[]{4, 12}) + " => " + true);
    System.out.println(isPairwiseSorted(new int[]{8, 5}) + " => " + false);
    System.out.println(isPairwiseSorted(new int[]{3, 8, 2, 15, -3, 5, 2, 3, 4, 4, 3, 1}) + " => " + false);
    System.out.println(isPairwiseSorted(new int[]{8, 13, 92, 92, 4, 4}) + " => " + true);
    System.out.println(isPairwiseSorted(new int[]{1, 3, 5, 7, 9, 8}) + " => " + false);
  }

  public static boolean isPairwiseSorted(int[] list) {
    for (int i = 1; i < list.length; i += 2) {
      if (list[i] < list[i - 1]) {
        return false;
      }
    }
    return true;
  }
}
