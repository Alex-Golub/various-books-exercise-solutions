package chapter3_parameters_and_objects;

/**
 * 1. Write a program that produces images of Christmas trees as output.
 * It should have a method with two parameters:
 * one for the number of segments in the tree and one for the height of
 * each segment. For example, the tree shown here
 * on the left has three segments of height 4 and the one on the right
 * has two segments of height 5:
 *
 *      *            *
 *     ***          ***
 *    *****        *****
 *   *******      *******
 *     ***       *********
 *    *****         ***
 *   *******       *****
 *  *********     *******
 *    *****      *********
 *   *******    ***********
 *  *********        *
 * ***********       *
 *      *         *******
 *      *
 *   *******
 *
 * @author Mr.Dr.Professor
 * @since 21-Nov-20 8:46 PM
 */
class PP3_1_Christmas_Trees {
  static final int SEGMENTS = 3;
  static final int HEIGHT = 4;

  public static void main(String[] args) {
    christmasTree(SEGMENTS, HEIGHT);
    // TODO
  }

  public static void christmasTree(int segments, int height) {
    for (int i = 0; i < segments; i++)
      printSegment(i, height);
  }

  public static void printSegment(int segment, int height) {
    for (int i = 0; i < height; i++) {
      printChar(' ', height + 1 - segment - i);
      printChar('*', 2 * segment + 2 * i + 1);
      System.out.println();
    }
  }

  public static void printChar(char c, int n) {
    for (int i = 0; i < n; i++)
      System.out.print(c);
  }

}
