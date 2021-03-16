package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/crazyCaps
 *
 * @author Mr.Dr.Professor
 * @since 13-Mar-21 9:30 PM
 */
/*public*/ class crazyCaps {
  public static void main(String[] args) {
    System.out.println(crazyCaps("Hey!! THERE!").equals("hEy!! tHeRe!"));
    System.out.println(crazyCaps("").equals(""));
    System.out.println(crazyCaps("a").equals("a"));
  }

  public static String crazyCaps(String s) {
    StringBuilder sb = new StringBuilder(s.length());

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      sb.append(i % 2 == 0 ? Character.toLowerCase(c) : Character.toUpperCase(c));
    }

    return sb.toString();
  }
}
