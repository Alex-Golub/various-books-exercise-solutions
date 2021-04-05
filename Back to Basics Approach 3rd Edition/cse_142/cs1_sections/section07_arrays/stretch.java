package cse_142.cs1_sections.section07_arrays;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/sections/section7/stretch
 *
 * test #1:stretch({18, 7, 4, 24, 11})
 * return:{9, 9, 4, 3, 2, 2, 12, 12, 6, 5}
 * result: pass
 *
 * test #2:stretch({87, 14, 67, 3, 0, 1, 19, 29})
 * return:{44, 43, 7, 7, 34, 33, 2, 1, 0, 0, 1, 0, 10, 9, 15, 14}
 * result: pass
 *
 * test #3:stretch({42})
 * return:{21, 21}
 * result: pass
 *
 * test #4:stretch({})
 * return:{}
 * result: pass
 *
 * @author Alex Golub
 * @since 04-Apr-21 1:33 PM
 */
class stretch {
  public static int[] stretch(int[] list) {
    int length = list.length;
    int[] stretched = new int[2 * length];

    for (int i = 0; i < length; i++) {
      int half = list[i] / 2;
      stretched[2 * i] = half + (list[i] % 2 == 0 ? 0 : 1);
      stretched[2 * i + 1] = half;
    }

    return stretched;
  }
}
