package CodeStepByStep_java.loops;

/**
 * https://www.codestepbystep.com/problem/view/java/loops/SpaceNeedle
 *
 * SIZE 4:
 *             ||
 *             ||
 *             ||
 *             ||
 *          __/||\__
 *       __/:::||:::\__
 *    __/::::::||::::::\__
 * __/:::::::::||:::::::::\__
 * |""""""""""""""""""""""""|
 * \_/\/\/\/\/\/\/\/\/\/\/\_/
 *   \_/\/\/\/\/\/\/\/\/\_/
 *     \_/\/\/\/\/\/\/\_/
 *       \_/\/\/\/\/\_/
 *             ||
 *             ||
 *             ||
 *             ||
 *          |%%||%%|
 *          |%%||%%|
 *          |%%||%%|
 *          |%%||%%|
 *          |%%||%%|
 *          |%%||%%|
 *          |%%||%%|
 *          |%%||%%|
 *          |%%||%%|
 *          |%%||%%|
 *          |%%||%%|
 *          |%%||%%|
 *          |%%||%%|
 *          |%%||%%|
 *          |%%||%%|
 *          |%%||%%|
 *          __/||\__
 *       __/:::||:::\__
 *    __/::::::||::::::\__
 * __/:::::::::||:::::::::\__
 * |""""""""""""""""""""""""|
 *
 * @author Mr.Dr.Professor
 * @since 04-Mar-21 2:33 PM
 */
/*public*/ class SpaceNeedle {
  static final int SIZE = 4;

  public static void main(String[] args) {
    post();
    upperBase();
    separator();
    lowerBase();
    post();
    floors();
    upperBase();
    separator();
  }

  public static void printCharacter(String s, int times) {
    for (int i = 0; i < times; i++) {
      System.out.print(s);
    }
  }

  public static void post() {
    for (int i = 0; i < SIZE; i++) {
      printCharacter(" ", 3 * SIZE);
      System.out.println("||");
    }
  }

  public static void floors() {
    for (int i = 0; i < SIZE * SIZE; i++) {
      printCharacter(" ", 2 * SIZE + 1);
      for (int j = 0; j < 2; j++) {
        System.out.print("|");
        printCharacter("%", SIZE - 2);
        System.out.print("|");
      }
      System.out.println();
    }
  }

  public static void separator() {
    System.out.print("|");
    printCharacter("\"", 6 * SIZE);
    System.out.println("|");
  }

  public static void lowerBase() {
    for (int i = 0; i < SIZE; i++) {
      printCharacter(" ", 2 * i);
      printCharacter("\\_/", 1);
      printCharacter("\\/", -2 * i + 3 * SIZE - 2);
      System.out.println("\\_/");
    }
  }

  public static void upperBase() {
    for (int i = 0; i < SIZE; i++) {
      printCharacter(" ", -3 * i + 3 * SIZE - 3);
      printCharacter("__/", 1);
      printCharacter(":", 3 * i);
      printCharacter("||", 1);
      printCharacter(":", 3 * i);
      System.out.println("\\__");
    }
  }
}
