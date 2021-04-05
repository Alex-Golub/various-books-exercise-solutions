package cse_142.cs1_sections.section07_arrays;

/**
 * https://practiceit.cs.washington.edu/problem/view/3912?categoryid=120
 *
 * test #1:isSorted({16.1, 12.3, 22.2, 14.4})
 * return:false
 * result: pass
 *
 * test #2:isSorted({1.5, 4.3, 7.0, 19.5, 25.1, 46.2})
 * return:true
 * result: pass
 *
 * test #3:isSorted({42.0})
 * return:true
 * result: pass
 *
 * test #4:isSorted({42.0, 27.0})
 * return:false
 * result: pass
 *
 * test #5:isSorted({1.5, 4.3, 7.0, 19.5, 7.8, 25.1, 46.2})
 * return:false
 * result: pass
 *
 * @author Alex Golub
 * @since 04-Apr-21 11:50 AM
 */
class isSorted {
  // pre: list.length >= 1
  public static boolean isSorted(double[] list) {
    for (int i = 0; i < list.length - 1; i++) {
      if (list[i] > list[i + 1]) {
        return false;
      }
    }

    return true;
  }
}
