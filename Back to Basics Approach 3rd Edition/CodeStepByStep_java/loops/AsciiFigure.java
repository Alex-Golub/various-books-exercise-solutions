package CodeStepByStep_java.loops;

/**
 * https://www.codestepbystep.com/problem/view/java/loops/AsciiFigure
 *
 * SIZE 3            SIZE 5
 * ////////\\\\\\\\  ////////////////\\\\\\\\\\\\\\\\
 * ////********\\\\  ////////////********\\\\\\\\\\\\
 * ****************  ////////****************\\\\\\\\
 *                   ////************************\\\\
 *                   ********************************
 *
 * @author Mr.Dr.Professor
 * @since 03-Mar-21 4:03 PM
 */
/*public*/ class AsciiFigure {
  public static final int SIZE = 7;

  // SIZE 3 number of / => 8
  // SIZE 5 number of / => 16
  // (i, #of/) = (0, 8), (1, 4) => y = -4x + 8
  // constant 8 should be depended on SIZE
  // SIZE 3: 3x + y = 8
  // SIZE 5: 5x + y = 16
  // => x = 4, y = -4
  // => y = -4x + (4 * SIZE - 4)
  public static void main(String[] args) {
    for (int i = 0; i < SIZE; i++) {
      printCharTimes(4 * (SIZE - 1) - 4 * i, '/');
      printCharTimes(8 * i, '*');
      printCharTimes(4 * (SIZE - 1) - 4 * i, '\\');
      System.out.println();
    }
  }

  private static void printCharTimes(int t, char c) {
    for (int i = 0; i < t; i++) {
      System.out.print(c);
    }
  }
}
