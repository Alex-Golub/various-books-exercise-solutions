package CodeStepByStep_java.parameters_and_return;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/ParameterMysteryExam2
 *
 * @author Mr.Dr.Professor
 * @since 27-Feb-21 12:01 AM
 */
/*public*/ class ParameterMysteryExam2 {
  public static void main(String[] args) {
    String x = "happy";
    String y = "pumpkin";
    String z = "orange";
    String pumpkin = "sleepy";
    String orange = "vampire";

    orange(y, x, z);
    x = orange(x, z, y);
    orange(pumpkin, z, "y");
    z = "green";
    orange("x", "pumpkin", z);
    orange(x, z, orange);
  }

  private static String orange(String z, String y, String x) {
    System.out.println(y + " and " + z + " were " + x);
    return x + y + z;
  }
}
