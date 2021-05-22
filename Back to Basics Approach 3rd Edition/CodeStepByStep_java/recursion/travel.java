package CodeStepByStep.java.recursion;

/**
 * https://www.codestepbystep.com/problem/view/java/recursion/travel
 *
 * Traveling in the 2-D plane from (0, 0) to (x, y) by repeatedly using one of three moves:
 * East (E): move right 1 (increase x)
 * North (N): move up 1 (increase y)
 * Northeast (NE): move up 1 and right 1 (increase both x and y)
 *
 * You may assume that the x/y values passed are non-negative.
 * If x and y are both 0, print a blank line.
 *
 * @author Alex Golub
 * @since 09-May-21, 3:11 PM
 */
class travel {
  public static void main(String[] args) {
    travel(1, 2);
  }
  
  // pre: x, y >= 0
  public static void travel(int x, int y) {
    travel(x, y, 0, 0, "");
  }
  
  private static void travel(int x, int y, int currX, int currY, String path) {
    if (x < currX || y < currY) {
      return;
    } else if (x == currX && y == currY) {
      System.out.println(path);
    } else {
      travel(x, y, currX + 1, currY, path + "E ");
      travel(x, y, currX, currY + 1, path + "N ");
      travel(x, y, currX + 1, currY + 1, path + "NE ");
    }
  }
}
