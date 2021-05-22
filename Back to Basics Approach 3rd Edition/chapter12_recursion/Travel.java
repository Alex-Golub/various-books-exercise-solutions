package chapter12_recursion;

/**
 * Backtracking examples
 *
 * @author Alex Golub
 * @since 05-May-21, 8:57 PM
 */
class Travel {
  public static void main(String[] args) {
    travel(2, 2);
  }
  
  public static void travel(int x, int y) { // print all paths of length (x + y)
//    travel(x + y, "moves:");
    travel(0, 0, x + y, "moves:");
  }
  
  private static void travel(int currX, int currY, int stepsLeft, String path) {
    if (stepsLeft == 0) {
      System.out.println(path + " (" + currX + ", " + currY + ")");
    } else {
      travel(currX, currY + 1, stepsLeft - 1, path + " N"); // go N
      travel(currX + 1, currY, stepsLeft - 1, path + " E"); // go E
      travel(currX + 1, currY + 1, stepsLeft - 1, path + " NE"); // go NE
    }
  }
  
  private static void travel(int stepsLeft, String path) {
    if (stepsLeft == 0) {
      System.out.println(path);
    } else {
      travel(stepsLeft - 1, path + " N");
      travel(stepsLeft - 1, path + " E");
      travel(stepsLeft - 1, path + " NE");
    }
  }
}
