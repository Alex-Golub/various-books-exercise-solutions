package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/addCommas
 *
 * @author Mr.Dr.Professor
 * @since 13-Mar-21 12:39 AM
 */
/*public*/ class addCommas {
  public static void main(String[] args) {
    System.out.println(addCommas("4098"));
    System.out.println(addCommas("12345678"));
    System.out.println(addCommas("3121678842"));
    System.out.println(addCommas("888888888888888888888"));
    System.out.println(addCommas("147"));
    System.out.println(addCommas("42"));
    System.out.println(addCommas("7"));
    System.out.println(addCommas(""));
  }

  public static String addCommas(String s) {
    StringBuilder sb = new StringBuilder(s);

    for (int i = sb.length() - 1; i - 2 > 0; i -= 3) {
      sb.insert(i - 2, ",");
    }

    return sb.toString();
  }
}
