package chapter5_Loops;

/**
 * 5.6 (Conversion from square meter to ping)
 * Write a program that displays the following
 * two tables side by side
 * (note that 1 ping = 3.305 square meters)
 *
 * @author Mr.Dr.Professor
 * @since 21-Jan-21 2:22 PM
 */
class Ex5_6_sqmToPing {
  static final double SQM_PER_PING = 3.305;

  public static void main(String[] args) {
    System.out.printf("%-8s%15s   |   %-15s%8s\n",
                      "Ping", "Square meter", "Square meter", "Ping");

    for (int ping = 10; ping <= 80; ping += 5) {
      double pingToSqm = ping * SQM_PER_PING;

      // (ping, sqm) = (10, 30)
      //               (15, 35)
      // y - 30 = (35 - 30) / (15 - 10) (x - 10)
      // y = x + 20
      int    sqm       = ping + 20;
      double sqmToPing = sqm / 3.305;

      System.out.printf("%-8d%15.3f   |   %-8d%15.3f\n",
                        ping, pingToSqm, sqm, sqmToPing);
    }

  }
}
