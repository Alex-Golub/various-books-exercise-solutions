package chapter7_arrays;

/**
 * 6. Write a method called stdev that returns the
 * standard deviation of an array of integers.
 *
 * @author Mr.Dr.Professor
 * @since 08-Jan-21 8:26 PM
 */
class Ex7_6_stdev {
  public static void main(String[] args) {
    int[] test = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
    System.out.println(stdev(test));
  }

  public static double stdev(int[] list) {
    double avg     = average(list);
    double diffSum = differenceSum(list, avg);
    return Math.sqrt(diffSum / (list.length - 1));
  }

  private static double differenceSum(int[] list, double avg) {
    double sum = 0;
    for (int n : list)
      sum += (n - avg) * (n - avg);
    return sum;
  }

  private static double average(int[] list) {
    int sum = 0;
    for (int n : list)
      sum += n;
    return 1.0 * sum / list.length;
  }
}
