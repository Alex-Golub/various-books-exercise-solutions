package cse_142.cs1_exams.midterms;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm8/isPowerOfTwo
 *
 * @author Alex Golub
 * @since 11-Apr-21 5:35 PM
 */
class isPowerOfTwo {
  public static void main(String[] args) {
    System.out.println(isPowerOfTwo(1));
  }

  public static boolean isPowerOfTwo(int n) {
    if (n <= 0)
      return false;

    double toBase2 = Math.log(n) / Math.log(2);
    return (int) (Math.ceil(toBase2)) == (int) (Math.floor(toBase2));
  }
}
