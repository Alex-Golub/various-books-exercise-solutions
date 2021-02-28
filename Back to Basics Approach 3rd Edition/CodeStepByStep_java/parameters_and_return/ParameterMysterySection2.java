package CodeStepByStep_java.parameters_and_return;

/**
 * @author Mr.Dr.Professor
 * @since 27-Feb-21 12:13 AM
 */
/*public*/ class ParameterMysterySection2 {
  public static void main(String[] args) {
    int a = 137;
    int b = 42;

    System.out.println("a = " + a);
    foo(b);
    System.out.println("a = " + a);
    System.out.println("b = " + b);

    a = bar(b, a + b);
    System.out.println("a = " + a);
    a = bar(a, b);
    System.out.println("a = " + a);
  }

  public static void foo(int a) {
    System.out.println("a = " + a);
    a = 160;
  }

  public static int bar(int c, int b) {
    int d = b - c;
    System.out.println("d = " + d);
    return d % 10;
  }
}
