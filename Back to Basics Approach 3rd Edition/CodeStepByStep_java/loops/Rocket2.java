package CodeStepByStep_java.loops;

/**
 * https://www.codestepbystep.com/problem/view/java/loops/Rocket2
 *
 * SIZE 5:
 *          /**\
 *         //**\\
 *        ///**\\\
 *       ////**\\\\
 *      /////**\\\\\
 *     //////**\\\\\\
 *    ///////**\\\\\\\
 *   ////////**\\\\\\\\
 *  /////////**\\\\\\\\\
 * +=*=*=*=*=*=*=*=*=*=*+
 * |..../\......../\....|
 * |.../\/\....../\/\...|
 * |../\/\/\..../\/\/\..|
 * |./\/\/\/\../\/\/\/\.|
 * |/\/\/\/\/\/\/\/\/\/\|
 * |\/\/\/\/\/\/\/\/\/\/|
 * |.\/\/\/\/..\/\/\/\/.|
 * |..\/\/\/....\/\/\/..|
 * |...\/\/......\/\/...|
 * |....\/........\/....|
 * +=*=*=*=*=*=*=*=*=*=*+
 * |\/\/\/\/\/\/\/\/\/\/|
 * |.\/\/\/\/..\/\/\/\/.|
 * |..\/\/\/....\/\/\/..|
 * |...\/\/......\/\/...|
 * |....\/........\/....|
 * |..../\......../\....|
 * |.../\/\....../\/\...|
 * |../\/\/\..../\/\/\..|
 * |./\/\/\/\../\/\/\/\.|
 * |/\/\/\/\/\/\/\/\/\/\|
 * +=*=*=*=*=*=*=*=*=*=*+
 *          /**\
 *         //**\\
 *        ///**\\\
 *       ////**\\\\
 *      /////**\\\\\
 *     //////**\\\\\\
 *    ///////**\\\\\\\
 *   ////////**\\\\\\\\
 *  /////////**\\\\\\\\\
 *
 * @author Mr.Dr.Professor
 * @since 04-Mar-21 2:01 PM
 */
/*public*/ class Rocket2 {
  public static final int SIZE = 3;

  public static void main(String[] args) {
    triangle();
    separator();
    section();
    invertedSection();
    separator();
    invertedSection();
    section();
    separator();
    triangle();
  }

  private static void printCharacter(String pattern, int times) {
    for (int i = 1; i <= times; i++) {
      System.out.print(pattern);
    }
  }

  private static void invertedSection() {
    for (int i = 1; i <= SIZE; i++) {
      System.out.print("|");
      printCharacter(".", i - 1);
      printCharacter("\\/", SIZE - i + 1);
      printCharacter(".", 2 * (i - 1));
      printCharacter("\\/", SIZE - i + 1);
      printCharacter(".", i - 1);
      System.out.println("|");
    }
  }

  private static void section() {
    for (int i = 1; i <= SIZE; i++) {
      System.out.print("|");
      printCharacter(".", SIZE - i);
      printCharacter("/\\", i);
      printCharacter(".", 2 * (SIZE - i));
      printCharacter("/\\", i);
      printCharacter(".", SIZE - i);
      System.out.println("|");
    }
  }

  public static void separator() {
    System.out.print("+");
    printCharacter("=*", SIZE * 2);
    System.out.println("+");
  }

  // size = 3 => (1) 3x + y = 5 (number of leading spaces)
  // size = 5 => (2) 5x + y = 9
  // (2) - (1) => 2x = 4 => x = 2
  // y = 9 - 5x = 9 - 5 * 2 = 9 - 10 = -1
  // k = x * SIZE + y = 2 * SIZE - 1
  public static void triangle() {
    for (int i = 1; i <= 2 * SIZE - 1; i++) {
      printCharacter(" ", 2 * SIZE - i);
      printCharacter("/", i);
      printCharacter("**", 1);
      printCharacter("\\", i);
      System.out.println();
    }
  }
}
