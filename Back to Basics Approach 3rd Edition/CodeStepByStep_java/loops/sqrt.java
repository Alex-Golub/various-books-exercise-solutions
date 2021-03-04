package CodeStepByStep_java.loops;

/**
 * https://www.codestepbystep.com/problem/view/java/loops/sqrt
 *
 * The challenge here is that you must not use Math.sqrt or Math.pow or
 * other library methods to calculate the square root;
 * rather, you must compute it yourself.
 * You should return the square root as a truncated integer;
 * for example, the square root of 7 is approximately 2.65,
 * but your method should return 2.
 *
 * You may assume that the value of N passed is a positive integer.
 *
 * @author Mr.Dr.Professor
 * @since 04-Mar-21 12:14 PM
 */
/*public*/ class sqrt {
  public static void main(String[] args) {
    System.out.println(sqrt(8326658));
  }

  // Babylonian method
  public static int sqrt(int n) {
    final double EPSILON = 1e-10;
    double next, last = 1;

    while (true) {
      next = (last * last + n) / (2 * last);

      if (Math.abs(next - last) < EPSILON) {
        break;
      }

      System.out.printf("last = %.2f, next = %.2f\n", last, next);
      last = next;
    }

    return (int) next;
  }

  // using binary search efficient but overflow for big integers
//  public static int sqrt(int n) {
//    int start = 0, end = n / 2, ans = 0;
//
//    while (start <= end) {
//      int mid = (start + end) / 2;
//
//      if (Math.multiplyExact(mid, mid) == n) { // integer overflow
//        return mid;
//      }
//
//      if (mid * mid < n) {
//        start = mid + 1;
//        ans = mid; // floor of square root
//      } else {
//        end = mid - 1;
//      }
//    }
//
//    return ans;
//  }

//  public static int sqrt(int n) {
//    int i = 1;
//    while (i * i <= n) {
//      i++;
//    }
//    return i - 1;
//  }
}
