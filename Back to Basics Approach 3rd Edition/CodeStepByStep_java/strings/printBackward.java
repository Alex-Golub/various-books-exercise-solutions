package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/printBackward
 *
 * @author Mr.Dr.Professor
 * @since 14/03/2021 00:31
 */
/*public*/ class printBackward {
  public static void main(String[] args) {
    printBackward("Alex");
  }

  public static void printBackward(String s) {
    for (int i = s.length() - 1; i >= 0; i--) {
      System.out.print(s.charAt(i));
    }
  }
}
