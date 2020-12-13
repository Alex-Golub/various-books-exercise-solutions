package chapter4_conditionals;

/**
 * 17. Write a method called swapPairs that accepts a String as a parameter
 * and returns that String with each pair of
 * adjacent letters reversed. If the String has an odd number of letters,
 * the last letter is unchanged.
 *
 * @author Mr.Dr.Professor
 * @since 10-Dec-20 8:34 PM
 */
class Ex4_17_swapPairs {
  public static void main(String[] args) {
    System.out.println(swapPairs("example"));
    System.out.println(swapPairs("hello there"));
  }

  public static String swapPairs(String s) {
    String res = "";
    int n = s.length();
    for (int i = 0; i < n - 1; i += 2)
      res += s.charAt(i + 1) + "" + s.charAt(i);
    return n % 2 == 0 ? res : res + s.charAt(n - 1);
  }
}
