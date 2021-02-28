package CodeStepByStep_java.parameters_and_return;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/ParameterMysteryExam1
 *
 * @author Mr.Dr.Professor
 * @since 26-Feb-21 11:54 PM
 */
/*public*/ class ParameterMysteryExam1 {
  public static void main(String[] args) {
    String x = "java";
    String y = "tyler";
    String z = "tv";
    String rugby = "hamburger";
    String java = "donnie";

    hamburger(x, y, z);
    hamburger(z, x, y);
    hamburger("rugby", z, java);
    y = hamburger(y, rugby, "x");
    hamburger(y, y, "java");
  }

  private static String hamburger(String y, String z, String x) {
    System.out.println(z + " and " + x + " like " + y);
    return z;
  }
}
