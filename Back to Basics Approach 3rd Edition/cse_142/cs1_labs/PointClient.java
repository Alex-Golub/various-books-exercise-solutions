package cse_142.cs1_labs;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab8/PointClient
 *
 * p1 is (8, 2)
 * p2 is (4, 3)
 * p1's distance from origin is 8.246211251235321
 * p1 is now (9, 4)
 * p2 is now (3, 13)
 *
 * @author Alex Golub
 * @since 07-Apr-21 4:04 PM
 */
class PointClient {
  public static void main(String[] args) {

    // construct two Point objects, one at (8, 2) and one at (4, 3)
    Point p1 = new Point(8, 2);
    Point p2 = new Point(4, 3);

    // display the two Point objects' state
    System.out.println("p1 is " + p1);
    System.out.println("p2 is " + p2);

    // display p1 distance from origin
    System.out.println("p1's distance from origin is " + p1.distanceFromOrigin());

    p1.translate(1, 2);
    p2.translate(-1, 10);

    // display the two Point objects' state again
    System.out.println("p1 is now " + p1);
    System.out.println("p2 is now " + p2);
  }
}
