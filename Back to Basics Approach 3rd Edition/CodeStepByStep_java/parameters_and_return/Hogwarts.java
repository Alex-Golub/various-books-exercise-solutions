package CodeStepByStep_java.parameters_and_return;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/Hogwarts
 *
 * NOTE: First trace by hand and then check you answer by running the program
 *
 * @author Mr.Dr.Professor
 * @since 26-Feb-21 9:47 PM
 */
/*public*/ class Hogwarts {
  public static void main(String[] args) {
    bludger(2001);
  }

  private static void bludger(int y) {
    int x = y / 1000;
    int z = x + y;
    x = quaffle(z, y);
    System.out.printf("bludger: x = %d, y = %d, z = %d\n", x, y, z);
  }

  private static int quaffle(int x, int y) {
    int z = snitch(x + y, y);
    y /= z;
    System.out.printf("quaffle: x = %d, y = %d, z = %d\n", x, y, z);
    return z;
  }

  private static int snitch(int x, int y) {
    y = x / (x % 10);
    System.out.printf("snitch: x = %d, y = %d\n", x, y);
    return y;
  }
}
