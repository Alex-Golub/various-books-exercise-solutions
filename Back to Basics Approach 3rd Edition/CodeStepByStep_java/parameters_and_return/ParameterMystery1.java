package CodeStepByStep_java.parameters_and_return;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/ParameterMystery1
 *
 * @author Mr.Dr.Professor
 * @since 26-Feb-21 11:52 PM
 */
/*public*/ class ParameterMystery1 {
  public static void main(String[] args) {
    int x = 9;
    int y = 2;
    int z = 5;

    mystery(z, y, x);
    mystery(y, x, z);
  }

  public static void mystery(int x, int z, int y) {
    System.out.println(z + ", " + (y - x));
  }
}
