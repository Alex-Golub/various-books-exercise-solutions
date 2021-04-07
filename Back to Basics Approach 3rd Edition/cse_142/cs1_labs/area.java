package cse_142.cs1_labs;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab4/area
 *
 * test #1:area(1)
 * return:3.141592653589793
 * result: pass
 *
 * test #2:area(2)
 * return:12.566370614359172
 * result: pass
 *
 * test #3:area(12.34)
 * return:478.38790628097786
 * result: pass
 *
 * test #4:area(0)
 * return:0.0
 * result: pass
 *
 *
 * @author Alex Golub
 * @since 05-Apr-21 2:51 PM
 */
class area {
  public static double area(double r) {
    return Math.PI * r * r;
  }
}
