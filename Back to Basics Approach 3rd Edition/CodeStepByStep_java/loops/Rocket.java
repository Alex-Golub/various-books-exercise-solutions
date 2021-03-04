package CodeStepByStep_java.loops;

/**
 * https://www.codestepbystep.com/problem/view/java/loops/Rocket
 *
 *      /**\
 *     //**\\
 *    ///**\\\
 *   ////**\\\\
 *  /////**\\\\\
 * +=*=*=*=*=*=*+
 * |../\..../\..|
 * |./\/\../\/\.|
 * |/\/\/\/\/\/\|
 * |\/\/\/\/\/\/|
 * |.\/\/..\/\/.|
 * |..\/....\/..|
 * +=*=*=*=*=*=*+
 * |\/\/\/\/\/\/|
 * |.\/\/..\/\/.|
 * |..\/....\/..|
 * |../\..../\..|
 * |./\/\../\/\.|
 * |/\/\/\/\/\/\|
 * +=*=*=*=*=*=*+
 *      /**\
 *     //**\\
 *    ///**\\\
 *   ////**\\\\
 *  /////**\\\\\
 *
 * @author Mr.Dr.Professor
 * @since 04-Mar-21 1:20 PM
 */
/*public*/ class Rocket {
  public static void main(String[] args) {
    triangle(5);
    separator(14);
    section(3);
    invertedSection(3);
    separator(14);
    invertedSection(3);
    section(3);
    separator(14);
    triangle(5);
  }

  private static void printCharacter(String pattern, int times) {
    for (int i = 1; i <= times; i++) {
      System.out.print(pattern);
    }
  }

  private static void invertedSection(int height) {
    for (int i = 1; i <= height; i++) {
      System.out.print("|");
      printCharacter(".", i - 1);
      printCharacter("\\/", height - i + 1);
      printCharacter(".", 2 * (i - 1));
      printCharacter("\\/", height - i + 1);
      printCharacter(".", i - 1);
      System.out.println("|");
    }
  }

  private static void section(int height) {
    for (int i = 1; i <= height; i++) {
      System.out.print("|");
      printCharacter(".", height - i);
      printCharacter("/\\", i);
      printCharacter(".", 2 * (height - i));
      printCharacter("/\\", i);
      printCharacter(".", height - i);
      System.out.println("|");
    }
  }

  public static void separator(int length) {
    System.out.print("+");
    printCharacter("=*", (length - 2) / 2);
    System.out.println("+");
  }

  public static void triangle(int height) {
    for (int i = 1; i <= height; i++) {
      printCharacter(" ", 6 - i);
      printCharacter("/", i);
      printCharacter("**", 1);
      printCharacter("\\", i);
      System.out.println();
    }
  }
}
