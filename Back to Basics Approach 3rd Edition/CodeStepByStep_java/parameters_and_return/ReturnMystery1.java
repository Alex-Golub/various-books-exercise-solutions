package CodeStepByStep_java.parameters_and_return;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/ReturnMystery1
 *
 * @author Mr.Dr.Professor
 * @since 28-Feb-21 9:57 PM
 */
/*public*/ class ReturnMystery1 {
  public static void main(String[] args) {
    int a = 4;
    int b = 2;
    int c = 5;

    a = mystery(c, b);
    c = mystery(b, a);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }

  public static int mystery(int b, int c) {
    return c + 2 * b;
  }
}
