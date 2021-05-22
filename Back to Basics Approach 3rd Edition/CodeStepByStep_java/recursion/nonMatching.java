package CodeStepByStep.java.recursion;

/**
 * https://www.codestepbystep.com/problem/view/java/recursion/nonMatching
 *
 * @author Alex Golub
 * @since 12-May-21, 2:11 PM
 */
class nonMatching {
  public static void main(String[] args) {
    String s1 = "I love Mariana!";
    String s2 = "U Love Marty";
//    String s1 = "A";
//    String s2 = "A";
    System.out.println(nonMatching(s1, s2)); // 7
  }
  
  // method is case-sensitive
  public static int nonMatching(String s1, String s2) {
    if (s1.length() == 0 || s2.length() == 0) {
      return Math.abs(s1.length() - s2.length());
    }
    return (s1.charAt(0) != s2.charAt(0) ? 1 : 0) +
           nonMatching(s1.substring(1), s2.substring(1));
  }
}
