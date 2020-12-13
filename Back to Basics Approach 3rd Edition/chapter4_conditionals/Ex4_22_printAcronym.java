package chapter4_conditionals;

/**
 * 22. Write a method called printAcronym that accepts a String as its parameter
 * and prints the first letter of each word of the string as an acronym.
 * For example, the call of printAcronym("Breath of the Wild")
 * should print "BotW".
 * You may assume that the string contains at least one word and does not have
 * any surrounding whitespace at its start or end.
 *
 * @author Mr.Dr.Professor
 * @since 10-Dec-20 10:16 PM
 */
class Ex4_22_printAcronym {
  public static void main(String[] args) {
    printAcronym("What is This");
    printAcronym("What");
    printAcronym("What    Now");
  }

  public static void printAcronym(String s) {
    String res = s.charAt(0) + "";
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) != ' ' && s.charAt(i - 1) == ' ')
        res += s.charAt(i);
    }
    System.out.println(res);
  }
}
