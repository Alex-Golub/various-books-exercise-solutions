package CodeStepByStep_java.arrays;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

/**
 * Write a method named computeAverage that computes and returns
 * the mean of all elements in an array of integers.
 *
 * Constraints:
 * You may assume that the array contains at least one element.
 * Your method should not modify the elements of the array.
 *
 * @author Mr.Dr.Professor
 * @since 14-Jan-21 11:36 PM
 */
class computeAverage {
  public static double computeAverage(int[] list) {
    return Arrays.stream(list).average().getAsDouble();
  }
}
