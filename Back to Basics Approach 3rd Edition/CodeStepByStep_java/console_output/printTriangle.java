package CodeStepByStep_java.console_output;

/**
 * Write a method named printTriangle that uses for loops to
 * produce the following output:
 *
 * #
 * ##
 * ###
 * ####
 * #####
 * ######
 *
 * @author Mr.Dr.Professor
 * @since 21-Feb-21 9:40 PM
 */
/*public*/ class printTriangle {
  public static void main(String[] args) {
    printTriangle();
  }

  public static void printTriangle() {
    int n = 6;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("#");
      }
      System.out.println();
    }
  }
}
