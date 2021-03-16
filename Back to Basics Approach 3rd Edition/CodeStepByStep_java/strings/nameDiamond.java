package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/nameDiamond
 *
 * @author Mr.Dr.Professor
 * @since 14/03/2021 00:08
 */
/*public*/ class nameDiamond {
  public static void main(String[] args) {
    nameDiamond("MARTY");
  }

  public static void nameDiamond(String s) {
    for (int i = 0; i < s.length(); i++) {
      System.out.println(s.substring(0, i + 1));
    }

    for (int i = 0; i < s.length(); i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(" ");
      }

      System.out.println(s.substring(i + 1));
    }
  }
}
