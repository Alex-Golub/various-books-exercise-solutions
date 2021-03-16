package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/containsTwice
 *
 * @author Mr.Dr.Professor
 * @since 13-Mar-21 8:36 PM
 */
/*public*/ class containsTwice {
  public static void main(String[] args) {
    System.out.println(containsTwice("Cartoon Character", 'C'));
  }

  public static boolean containsTwice(String s, char c) {
    int occurred = 0;

    for (int i = 0; i < s.length() && occurred < 2; i++) {
      occurred += s.charAt(i) == c ? 1 : 0;
    }

    return occurred == 2;
  }
}
