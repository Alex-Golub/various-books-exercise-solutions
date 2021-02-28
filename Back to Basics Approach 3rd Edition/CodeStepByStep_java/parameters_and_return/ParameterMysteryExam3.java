package CodeStepByStep_java.parameters_and_return;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/ParameterMysteryExam3
 *
 * @author Mr.Dr.Professor
 * @since 27-Feb-21 12:08 AM
 */
/*public*/ class ParameterMysteryExam3 {
  public static void main(String[] args) {
    int a = 5;
    int b = 1;
    int c = 3;
    int three = a;
    int one = b + 1;

    axiom(a, b, c);
    axiom(c, three, 10);
    three = axiom(b + c, one + three, a + one);
    a++;
    b = 0;
    a = axiom(three, 2, one);
  }

  public static int axiom(int c, int b, int a) {
    System.out.println(a + " + " + c + " = " + b);
    return a + b;
  }
}
