package CodeStepByStep_java.loops;

/**
 * https://www.codestepbystep.com/problem/view/java/loops/starsPrint
 *
 * A)            B)       C)
 * **********    *        1
 * **********    **       22
 * **********    ***      333
 * **********    ****     4444
 * **********    *****    55555
 *
 * @author Mr.Dr.Professor
 * @since 04-Mar-21 12:51 PM
 */
/*public*/ class starsPrint {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.print("*");
      }
      System.out.println();   // to end the line
    }

    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }
}
