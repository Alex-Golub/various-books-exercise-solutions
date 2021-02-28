package CodeStepByStep_java.parameters_and_return;

/**
 * @author Mr.Dr.Professor
 * @since 27-Feb-21 12:10 AM
 */
public class ParameterMysteryExam4 {
  public static void main(String[] args) {
    int x = 5;
    int y = 1;
    int z = 9;
    int w = y + 2;

    surprise(x, y);
    x = surprise(z, w);
    w++;
    z = surprise(w, x);
    surprise(y, z);
  }

  public static int surprise(int y, int x) {
    x++;
    System.out.println(x + " " + y);
    y--;
    return x;
  }
}