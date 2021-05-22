package CodeStepByStep.java.recursion;

/**
 * https://www.codestepbystep.com/problem/view/java/recursion/editDistance
 * <p>
 * Edit distance (also called Levenshtein distance) is defined as the
 * minimum number of "changes" required to get from s1 to s2 or vice versa.
 * A "change" can be defined as
 * a) inserting a character,
 * b) deleting a character, or
 * c) changing a character to a different character.
 * <p>
 * limit yourself to using only the following string members:
 * charAt, length, substring, trim
 *
 * @author Alex Golub
 * @since 12-May-21, 4:05 PM
 */
class editDistance {
  public static void main(String[] args) {
    System.out.println(editDistance("driving", "diving"));
    System.out.println(editDistance("debate", "irate"));
    System.out.println(editDistance("football", "cookies"));
  
    System.out.println("-".repeat(10));
    System.out.println(editDistance("", "yo"));
    System.out.println(editDistance("X", ""));
    System.out.println(editDistance("", ""));
  }
  
  public static int editDistance(String s1, String s2) {
    if (s1.length() == 0 || s2.length() == 0) {
      return Math.abs(s1.length() - s2.length());
    }
    
    if (s1.charAt(0) == s2.charAt(0)) { // no change required
      return editDistance(s1.substring(1), s2.substring(1));
    }
    
    // some changes are required
    int changes = 1 + editDistance(s1.substring(1), s2.substring(1));
    int delete = 1 + editDistance(s1.substring(1), s2);
    int insert = 1 + editDistance(s1, s2.substring(1));
    
    return Math.min(changes, Math.min(delete,insert));
  }
}
