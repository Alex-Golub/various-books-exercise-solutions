package cse_142.cs1_exams.midterms;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm7/quadrant
 *
 * test #1: quadrant(12.4, 17.8)
 *          return:1
 *          result: pass
 *
 * test #2: quadrant(-2.3, 3.5)
 *          return:2
 *          result: pass
 *
 * test #3: quadrant(-15.2, -3.1)
 *          return:3
 *          result: pass
 *
 * test #4: quadrant(4.5, -4.5)
 *          return:4
 *          result: pass
 *
 * test #5: quadrant(0.0, 0.0)
 *          return:0
 *          result: pass
 *
 * test #6: quadrant(12.5, 0.0)
 *          return:0
 *          result: pass
 *
 * test #7: quadrant(0.0, 2.3)
 *          return:0
 *          result: pass
 *
 * @author Alex Golub
 * @since 10-Apr-21 5:22 PM
 */
class quadrant {
  public static int quadrant(double x, double y) {
    if (Math.abs(x) < 1e-10 || Math.abs(y) < 1e-10) {
      return 0;
    }

    return x > 0.0 ? (y > 0.0 ? 1 : 4) : (y > 0.0 ? 2 : 3);
  }
}
