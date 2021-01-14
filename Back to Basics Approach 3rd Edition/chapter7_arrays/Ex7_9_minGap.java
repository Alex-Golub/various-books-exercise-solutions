package chapter7_arrays;

/**
 * 9. Write a method called minGap that accepts an integer array
 * as a parameter and returns the minimum difference or
 * gap between adjacent values in the array, where the gap is defined
 * as the later value minus the earlier value.
 *
 * For example, in the array [1, 3, 6, 7, 12],
 * the first gap is 2 (3 - 1),
 * the second gap is 3 (6 - 3),
 * the third gap is 1 (7 - 6),
 * and the fourth gap is 5 (12 - 7).
 *
 * So your method should return 1 if passed this array.
 * The minimum gap could be a negative number if the list is not in sorted order.
 * If you are passed an array with fewer than two elements, return 0.
 *
 * @author Mr.Dr.Professor
 * @since 08-Jan-21 10:54 PM
 */
class Ex7_9_minGap {

  // if gap >= 0 then list in ASC order
  // if gap == 0 then list empty or have the same elements
  // if gap becomes negative list in not sorted
  public static int minGap(int[] list) {
    if (list == null || list.length < 2)
      return 0;

    int minGap = list[1] - list[0];
    for (int i = 1; i < list.length - 1; i++)
      minGap = Math.min(list[i + 1] - list[i], minGap);
    return minGap;
  }
}
