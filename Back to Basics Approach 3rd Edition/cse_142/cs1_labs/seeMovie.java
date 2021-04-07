package cse_142.cs1_labs;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab4/seeMovie
 *
 * test #1:seeMovie(3.50, 2);
 * console output:
 * very interested
 * result: pass
 *
 * test #2:seeMovie(4.99, 0);
 * console output:
 * very interested
 * result: pass
 *
 * test #3:seeMovie(5.00, 0);
 * console output:
 * not interested
 * result: pass
 *
 * test #4:seeMovie(18.00, 4);
 * console output:
 * not interested
 * result: pass
 *
 * test #5:seeMovie(12.00, 3);
 * console output:
 * not interested
 * result: pass
 *
 * test #6:seeMovie(13.50, 5);
 * console output:
 * sort-of interested
 * result: pass
 *
 * test #7:seeMovie(12.00, 5);
 * console output:
 * sort-of interested
 * result: pass
 *
 * test #8:seeMovie(7.25, 5);
 * console output:
 * very interested
 * result: pass
 *
 * test #9:seeMovie(11.99, 5);
 * console output:
 * very interested
 * result: pass
 *
 * test #10:seeMovie(5.00, 2);
 * console output:
 * sort-of interested
 * result: pass
 *
 * test #11:seeMovie(7.00, 4);
 * console output:
 * sort-of interested
 * result: pass
 *
 * test #12:seeMovie(11.99, 3);
 * console output:
 * sort-of interested
 * result: pass
 *
 * @author Alex Golub
 * @since 05-Apr-21 2:31 PM
 */
class seeMovie {
  public static void seeMovie(double cost, int stars) {
    if (cost < 5.00 || (stars == 5 && cost < 12.00)) {
      System.out.println("very interested");
    } else if ((cost >= 12 && stars == 5.00) ||
               ((cost >= 5.00 && cost <= 11.99) && (stars >= 2 && stars <= 4))) {
      System.out.println("sort-of interested");
    } else {
      System.out.println("not interested");
    }
  }
}
