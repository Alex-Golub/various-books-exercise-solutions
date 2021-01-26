package chapter5_Loops;

/**
 * *5.18 (Display four patterns using loops)
 * Use nested loops that display the following
 * patterns in four separate programs:
 *
 * @author Mr.Dr.Professor
 * @since 22-Jan-21 2:02 PM
 */
class Ex5_18_patterns {
  static final int LINES = 10;

  public static void main(String[] args) {
    System.out.println("Pattern A");
    patternA();

    System.out.println("\nPattern B");
    patternB();

    System.out.println("\nPattern C");
    patternC();

    System.out.println("\nPattern D");
    patternD();

  }

  // * * * * * * *
  //   * * * * * *
  //     * * * * *
  //       * * * *
  //         * * *
  //           * *
  //             *
  private static void patternD() {
    for (int i = 0; i < LINES; i++) {
      spaces(i + 1);
      asterisks(LINES - i);
      System.out.println();
    }
  }

  //             *
  //           * *
  //         * * *
  //       * * * *
  //     * * * * *
  //   * * * * * *
  // * * * * * * *
  private static void patternC() {
    for (int i = 1; i <= LINES; i++) {
      spaces(LINES - i + 1);
      asterisks(i);
      System.out.println();
    }
  }

  private static void asterisks(int i) {
    for (int j = 1; j <= i; j++) {
      System.out.print("*");
      if (j + 1 <= i) {
        System.out.print(" ");
      }
    }
  }

  private static void spaces(int i) {
    for (int j = 1; j <= i; j++) {
      System.out.print(" ");
      if (j + 1 <= i) {
        System.out.print(" ");
      }
    }
  }

  // * * * * * * *
  // * * * * * *
  // * * * * *
  // * * * *
  // * * *
  // * *
  // *
  private static void patternB() {
    for (int i = 0; i < LINES; i++) {
      asterisks(LINES - i);
      System.out.println();
    }
  }

  // *
  // * *
  // * * *
  // * * * *
  // * * * * *
  // * * * * * *
  // * * * * * * *
  private static void patternA() {
    for (int i = 1; i <= LINES; i++) {
      asterisks(i);
      System.out.println();
    }
  }
}
