package CodeStepByStep.java.recursion;

/**
 * https://www.codestepbystep.com/problem/view/java/recursion/collapseSequences
 * <p>
 * Any sequences of consecutive occurrences of c compressed into a single occurrence of c.
 * Your method is case-sensitive;
 *
 * @author Alex Golub
 * @since 08-May-21, 4:53 PM
 */
class collapseSequences {
  public static void main(String[] args) {
    System.out.println(collapseSequences("aabaaccaaaaaada", 'a').equals("abaccada"));
    System.out.println(collapseSequences("mississssipppi", 's').equals("misisipppi"));
    System.out.println(collapseSequences("babbbbebbbxbbbbbb", 'b').equals("babebxb"));
    System.out.println(collapseSequences("palo alto", 'o').equals("palo alto"));
    System.out.println(collapseSequences("tennessee", 'x').equals("tennessee"));
    System.out.println(collapseSequences("", 'x').equals(""));
  }
  
  public static String collapseSequences(String s, char c) {
    if (s.length() == 0) return s;
    return collapseSequences("", s, c);
    
  }
  
  private static String collapseSequences(String prefix, String suffix, char c) {
    if (suffix.length() <= 1) return prefix + suffix;
    char first = suffix.charAt(0);
    char second = suffix.charAt(1);
    if (first != second || first != c) {
      prefix += first;
    }
    
    return collapseSequences(prefix, suffix.substring(1), c);
  }
  
  
  // iterative
//  public static String collapseSequences(String s, char c) {
//    StringBuilder sb = new StringBuilder();
//    for (int i = 0; i < s.length(); i++) {
//      char c1 = s.charAt(i);
//      if (c1 == c) {
//        int j = i + 1;
//        while (j < s.length() && s.charAt(j) == c) { // advance to the next character that is not c
//          j++;
//        }
//        i = j - 1;
//      }
//      sb.append(c1);
//    }
//    return sb.toString();
//  }
}
