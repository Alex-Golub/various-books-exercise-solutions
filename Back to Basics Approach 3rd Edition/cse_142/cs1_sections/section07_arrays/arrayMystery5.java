package cse_142.cs1_sections.section07_arrays;

/**
 * https://practiceit.cs.washington.edu/problem/view/3900?categoryid=120
 *
 * {8}                    => [8]
 * {14, 7}                => [14,8]
 * {7, 1, 3, 2, 0, 4}     => [7,2,3,3,1,4]
 * {10, 8, 9, 5, 5}       => [10,9,9,6,6]
 * {12, 11, 10, 10, 8, 7} => [12,12,11,11,9,8]
 *
 * @author Alex Golub
 * @since 04-Apr-21 11:42 AM
 */
class arrayMystery5 {
  public static void arrayMystery5(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] > nums[i + 1]) {
        nums[i + 1]++;
      }
    }
  }
}
