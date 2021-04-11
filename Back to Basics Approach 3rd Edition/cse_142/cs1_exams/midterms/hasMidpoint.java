package cse_142.cs1_exams.midterms;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm1/hasMidpoint
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm14/hasMidpoint
 *
 * test #1: hasMidpoint(1, 2, 3)
 *          return:true
 *          result: pass
 *
 * test #2: hasMidpoint(2, 10, 6)
 *          return:true
 *          result: pass
 *
 * test #3: hasMidpoint(0, -50, -25)
 *          return:true
 *          result: pass
 *
 * test #4: hasMidpoint(21, 9, 58)
 *          return:false
 *          result: pass
 *
 * test #5: hasMidpoint(-2, 9, 27)
 *          return:false
 *          result: pass
 *
 * @author Alex Golub
 * @since 07-Apr-21 9:25 PM
 */
class hasMidpoint {
  public static boolean hasMidpoint(int a, int b, int c) {
    double m1 = (a + b) / 2.0;
    double m2 = (a + c) / 2.0;
    double m3 = (b + c) / 2.0;

    return Math.ceil(m1) == Math.floor(m1) && (int) m1 == c ||
           Math.ceil(m2) == Math.floor(m2) && (int) m2 == b ||
           Math.ceil(m3) == Math.floor(m3) && (int) m3 == a;
  }
}
