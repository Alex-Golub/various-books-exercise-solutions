package chapter5_logic_and_loops;

/**
 * 10. Write a method called hopscotch that accepts an
 * integer number of “hops” as its parameter and prints a pattern of
 * numbers that resembles a hopscotch board.
 * A “hop” is a three-number sequence where the output shows two
 * numbers on a line, followed by one number on its own line.
 * 0 hops is a board up to 1; one hop is a board up to 4; two
 * hops is a board up to 7; and so on.
 *
 * @author Mr.Dr.Professor
 * @since 21-Dec-20 12:09 PM
 */
class Ex5_10_hopscotch {
  public static void main(String[] args) {
    hopscotch(-1); // no no output
    System.out.println("-".repeat(10));
    hopscotch(0);  // 1
    System.out.println("-".repeat(10));
    hopscotch(5);  // up to 16
    System.out.println("-".repeat(10));
    hopscotch(10); // up to 31
  }

  public static void hopscotch(int hops) {
    if (hops < 0) return;

    System.out.println("   1");
    for (int i = 1; hops > 0; i += 3, hops--) {
      System.out.printf("%d     %d\n", i + 1, i + 2);
      System.out.printf("   %d\n", i + 3);
    }
  }

}
