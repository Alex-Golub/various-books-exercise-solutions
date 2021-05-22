package chapter12_recursion;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp5/chapter12/e14-dedup
 *
 * @author Alex Golub
 * @since 22-May-21, 4:18 PM
 */
class dedup {
  public static void main(String[] args) {
    System.out.println(dedup("bookkkkkeeper"));
  }
  
  public static String dedup(String s) {
    if (s.length() == 0) return s;
    return dedup("", s);
  }
  
  private static String dedup(String prefix, String suffix) {
    if (suffix.length() <= 1) return prefix + suffix;
    char c1 = suffix.charAt(0);
    char c2 = suffix.charAt(1);
    if (c1 != c2) {
      prefix += c1;
    }
    return dedup(prefix, suffix.substring(1));
  }
}
