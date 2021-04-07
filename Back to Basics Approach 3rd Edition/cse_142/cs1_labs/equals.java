package cse_142.cs1_labs;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab7/equals
 *
 * test #1: equals({1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6})
 *          return:true
 *          result: pass
 *
 * test #2: equals({1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 7})
 *          return:false
 *          result: pass
 *
 * test #3: equals({1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6, 7})
 *          return:false
 *          result: pass
 *
 * test #4: equals({10, 20, 30}, {30, 20, 10})
 *          return:false
 *          result: pass
 *
 * test #5: equals({-1, 5, 10, 16, 17, 2, -4}, {-1, 5, 10, 16, 17, 1, -4})
 *          return:false
 *          result: pass
 *
 * test #6: equals({42}, {42})
 *          return:true
 *          result: pass
 *
 * test #7: equals({42}, {67})
 *          return:false
 *          result: pass
 *
 * test #8: equals({42, 85}, {42})
 *          return:false
 *          result: pass
 *
 * test #9: equals({}, {})
 *          return:true
 *          result: pass
 *
 * test #10 :equals({42}, {})
 *          return:false
 *          result: pass
 *
 * test #11 :equals({}, {42, 11})
 *          return:false
 *          result: pass
 *
 * @author Alex Golub
 * @since 07-Apr-21 3:54 PM
 */
class equals {

  // pre: You may not call Arrays.equals in your solution.
  public static boolean equals(int[] a1, int[] a2) {
    if (a1.length != a2.length) {
      return false;
    }

    for (int i = 0; i < a1.length; i++) {
      if (a1[i] != a2[i]) {
        return false;
      }
    }

    return true;
  }
}
