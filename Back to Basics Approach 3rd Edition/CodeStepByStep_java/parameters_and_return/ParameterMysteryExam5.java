package CodeStepByStep_java.parameters_and_return;

/**
 * @author Mr.Dr.Professor
 * @since 27-Feb-21 12:11 AM
 */
public class ParameterMysteryExam5 {
  public static void main(String[] args) {
    int a = 10;
    int b = 4;
    int c = a + b;

    int d = mystery(a, b, c);
    b--;
    c = mystery(c, d, a);
    mystery(a, c, b);
    System.out.println(a + " " + b + " " + c + " " + d);
  }

  public static int mystery(int b, int c, int a) {
    c++;
    System.out.println(c + " " + a + " " + b);
    return a + 2;
  }
}
