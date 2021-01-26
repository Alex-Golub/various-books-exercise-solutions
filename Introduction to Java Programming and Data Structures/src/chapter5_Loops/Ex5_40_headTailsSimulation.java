package chapter5_Loops;

/**
 * 5.40 (Simulation: heads or tails)
 *
 * @author Mr.Dr.Professor
 * @since 25-Jan-21 6:56 PM
 */
class Ex5_40_headTailsSimulation {
  public static void main(String[] args) {
    final int FLIPS = 2_000_000;
    int       heads = 0, tails = 0;

    for (int i = 1; i <= FLIPS; i++) {
      if (Math.random() < 0.5) heads++;
      else tails++;
    }

    System.out.printf("Heads: %,d\nTails: %,d\n", heads, tails);
  }
}
