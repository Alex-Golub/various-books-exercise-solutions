package cse_142.cs1_labs;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab4/pay
 *
 * test #1:pay(5.50, 6)
 *         return:33.0
 *         result: pass
 *
 * test #2:pay(4.00, 11)
 *         return:50.0
 *         result: pass
 *
 * test #3:pay(10.00, 40)
 *         return:560.0
 *         result: pass
 *
 * test #4:pay(0.25, 7)
 *         return:1.75
 *         result: pass
 *
 * test #5:pay(0.00, 20)
 *         return:0.0
 *         result: pass
 *
 * test #6:pay(9.00, 0)
 *         return:0.0
 *         result: pass
 *
 * @author Alex Golub
 * @since 05-Apr-21 2:52 PM
 */
class pay {
  public static double pay (double salary, int hours) {
    return hours <= 8 ?
           hours * salary :
           8 * salary + (hours - 8) * salary * 1.5;
  }
}
