package cse_142.cs1_labs;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab7/swapAll
 *
 * test #1: swapAll({11, 42, -5, 27, 0, 89}, {10, 20, 30, 40, 50, 60});
 *          parameters:{10, 20, 30, 40, 50, 60}
 *                     {11, 42, -5, 27, 0, 89}
 *          result: pass
 *
 * test #2: swapAll({10, 20, 30, 40, 50, 60, 70}, {777, 666, 555, 444, 333, 222, 111});
 *          parameters:{777, 666, 555, 444, 333, 222, 111}
 *                     {10, 20, 30, 40, 50, 60, 70}
 *          result: pass
 *
 * test #3: swapAll({42}, {999});
 *          parameters:{999}
 *                     {42}
 *          result: pass
 *
 * test #4: swapAll({}, {});
 *          parameters:{}
 *                     {}
 *          result: pass
 *
 * @author Alex Golub
 * @since 07-Apr-21 3:46 PM
 */
class swapAll {

  // pre: a != null && b != null && a.length == b.length
  public static void swapAll(int[] a, int[] b) {
    for (int i = 0; i < a.length; i++) {
      swap(a, b, i);
    }
  }

  private static void swap(int[] a1, int[] a2, int i) {
    int temp = a1[i];
    a1[i] = a2[i];
    a2[i] = temp;
  }
}
