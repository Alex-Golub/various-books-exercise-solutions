package cse_142.cs1_exams.finals;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final7/arraySum
 *
 * If the arrays a1 and a2 are not the same length, the result returned
 * by your method should have as many elements as the larger of the two arrays.
 *
 * @author Alex Golub
 * @since 14-Apr-21 9:56 PM
 */
class arraySum {
  public static double[] arraySum(double[] a1, double[] a2) {
    double[] sumArr = new double[Math.max(a1.length, a2.length)];
    int i = 0, j = 0;

    while (i < a1.length && j < a2.length) {
      sumArr[i] = a1[i] + a2[j];
      i++;
      j++;
    }

    System.arraycopy(a1, i, sumArr, i, a1.length - i);
    System.arraycopy(a2, j, sumArr, j, a2.length - j);

    return sumArr;
  }

//  public static double[] arraySum(double[] a1, double[] a2) {
//    double[] a3 = new double[Math.max(a1.length, a2.length)];
//    for (int i = 0; i < a1.length; i++) a3[i] += a1[i];
//    for (int i = 0; i < a2.length; i++) a3[i] += a2[i];
//    return a3;
//  }
}
