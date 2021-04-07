package cse_142.cs1_labs;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab7/stutter
 *
 * test #1: stutter({11, -4, 0, 777})
 *          return:{11, 11, -4, -4, 0, 0, 777, 777}
 *          result: pass
 *
 * test #2: stutter({42})
 *          return:{42, 42}
 *          result: pass
 *
 * test #3: stutter({})
 *          return:{}
 *          result: pass
 *
 * @author Alex Golub
 * @since 07-Apr-21 3:42 PM
 */
class stutter {
  // pre: arr != mull
  public static int[] stutter(int[] arr) {
    int[] stuttered = new int[2 * arr.length];
    for (int i = 0; i < arr.length; i++) {
      stuttered[2 * i] = stuttered[2 * i + 1] = arr[i];
    }
    return stuttered;
  }
}
