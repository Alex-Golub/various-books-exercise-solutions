package cse_142.cs1_labs;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab8/swapPoints
 *
 * @author Alex Golub
 * @since 07-Apr-21 4:10 PM
 */
class swapPoints {
  public static void swapPoints(Point p1, Point p2) {
    int temp = p1.x;
    p1.x = p2.x;
    p2.x = temp;

    temp = p1.y;
    p1.y = p2.y;
    p2.y = temp;
  }
}
