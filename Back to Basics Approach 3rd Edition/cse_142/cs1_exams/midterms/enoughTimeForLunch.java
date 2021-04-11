package cse_142.cs1_exams.midterms;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm3/enoughTimeForLunch
 *
 * The method should return true if the gap between the two times is long
 * enough to eat lunch: that is, if the second time is at least 45 minutes
 * after the first time.
 *
 * test #1: enoughTimeForLunch(11, 00, 11, 59)
 *          return:true
 *          result: pass
 *
 * test #2: enoughTimeForLunch(12, 30, 13, 00)
 *          return:false
 *          result: pass
 *
 * test #3: enoughTimeForLunch(12, 30, 13, 15)
 *          return:true
 *          result: pass
 *
 * test #4: enoughTimeForLunch(14, 20, 17, 02)
 *          return:true
 *          result: pass
 *
 * test #5: enoughTimeForLunch(12, 30, 9, 30)
 *          return:false
 *          result: pass
 *
 * test #6: enoughTimeForLunch(12, 00, 11, 55)
 *          return:false
 *          result: pass
 *
 * @author Alex Golub
 * @since 10-Apr-21 11:52 AM
 */
class enoughTimeForLunch {
  public static void main(String[] args) {
    System.out.println(enoughTimeForLunch(11, 00, 11, 59) + " => " + true);
    System.out.println(enoughTimeForLunch(12, 30, 13, 00) + " => " + false);
    System.out.println(enoughTimeForLunch(12, 30, 13, 15) + " => " + true);
    System.out.println(enoughTimeForLunch(14, 20, 17, 02) + " => " + true);
    System.out.println(enoughTimeForLunch(12, 30, 9, 30) + " => " + false);
    System.out.println(enoughTimeForLunch(12, 00, 11, 55) + " => " + false);
  }

  public static boolean enoughTimeForLunch(int h1, int m1, int h2, int m2) {
    return 60 * h2 + m2 >= 45 + 60 * h1 + m1;
  }
}
