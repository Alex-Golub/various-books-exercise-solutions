package CodeStepByStep_java.if_else;

/**
 * https://www.codestepbystep.com/problem/view/java/ifelse/dateIsBefore
 *
 * @author Mr.Dr.Professor
 * @since 01-Mar-21 1:38 AM
 */
/*public*/ class dateIsBefore {
  public static void main(String[] args) {
    System.out.println(dateIsBefore(6, 3, 9, 20) + " => " + true);
    System.out.println(dateIsBefore(10, 1, 2, 25) + " => " + false);
    System.out.println(dateIsBefore(8, 15, 8, 15) + " => " + false);
    System.out.println(dateIsBefore(8, 15, 8, 16) + " => " + true);
  }

  public static boolean dateIsBefore(int m1, int d1, int m2, int d2) {
    return m1 < m2 || (m1 == m2 && d1 < d2);
  }
}
