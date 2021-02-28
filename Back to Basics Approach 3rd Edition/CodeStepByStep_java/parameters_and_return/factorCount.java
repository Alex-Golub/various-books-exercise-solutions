package CodeStepByStep_java.parameters_and_return;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/factorCount
 *
 * Write a method named factorCount that accepts an integer
 * (assumed to be positive) as its parameter and returns a count
 * of its positive factors.
 *
 * For example, the eight factors of 24 are 1, 2, 3, 4, 6, 8, 12, and 24,
 * so the call of factorCount(24) should return 8.
 *
 * @author Mr.Dr.Professor
 * @since 24-Feb-21 5:55 PM
 */
/*public*/ class factorCount {
  public static void main(String[] args) {
    System.out.println(factorCount(12) + " => " + 6);
    System.out.println(factorCount(24) + " => " + 8);
    System.out.println(factorCount(7) + " => " + 2);
    System.out.println(factorCount(420) + " => " + 24);
    System.out.println(factorCount(625) + " => " + 5);
    System.out.println(factorCount(1) + " => " + 1);
    System.out.println(factorCount(Integer.MAX_VALUE));
  }

  public static int factorCount(int n) {
    int factors = 0;

    for (int i = 1; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {

        // e.g. numbers that are perfect
        // squares (4, 9, 16, 25..)
        if (i * i == n) {
          factors++;
        } else {
          factors += 2;
        }
      }
    }

    return factors;
  }
}
