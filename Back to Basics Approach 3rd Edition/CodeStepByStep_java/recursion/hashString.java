package CodeStepByStep.java.recursion;

/**
 * https://www.codestepbystep.com/problem/view/java/recursion/hashString
 *
 * @author Alex Golub
 * @since 09-May-21, 2:17 PM
 */
class hashString {
  public static void main(String[] args) {
    System.out.println(hashString(0).equals("#"));
    System.out.println(hashString(1).equals("##"));
    System.out.println(hashString(2).equals("####"));
    System.out.println(hashString(3).equals("########"));
    System.out.println(hashString(4).equals("################"));
  }
  
  public static String hashString(int k) {
    if (k < 0) {
      throw new IllegalArgumentException();
    } else if (k == 0) {
      return "#";
    } else {
      String prev = hashString(k - 1);
      return prev + prev;
    }
  }
}
