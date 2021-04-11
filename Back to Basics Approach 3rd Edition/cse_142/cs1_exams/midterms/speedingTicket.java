package cse_142.cs1_exams.midterms;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm12/speedingTicket
 *
 * @author Alex Golub
 * @since 11-Apr-21 8:14 PM
 */
class speedingTicket {
  public static void main(String[] args) {
    System.out.println(speedingTicket(58, 55, false) + " => " + 	false);
    System.out.println(speedingTicket(51, 55, false) + " => " + 	false);
    System.out.println(speedingTicket(42, 35, false) + " => " + 	true);
    System.out.println(speedingTicket(30, 35, false) + " => " + 	true);
    System.out.println(speedingTicket(45, 30, true) + " => " + 	true);
    System.out.println(speedingTicket(49, 40, true) + " => " + 	false);
    System.out.println(speedingTicket(22, 30, true) + " => " + 	false);
    System.out.println(speedingTicket(102, 15, false) + " => " + 	true);
    System.out.println(speedingTicket(100, 98, true) + " => " + true);
  }

  public static boolean speedingTicket(int speed, int limit, boolean ateDonut) {
    return speed >= 100 ||
           (ateDonut && speed - limit >= 10) ||
           (!ateDonut && Math.abs(limit - speed) >= 5);
  }
}
