package chapter4_conditionals;

/**
 * 18. Write a method called wordCount that accepts a String as its parameter
 * and returns the number of words in the String.
 *
 * @author Mr.Dr.Professor
 * @since 10-Dec-20 8:51 PM
 */
class Ex4_18_wordCount {
  public static void main(String[] args) {
    System.out.println(wordCount("hello")); // 1
    System.out.println(wordCount("how are you?")); // 3
    System.out.println(wordCount("  this  string    has  wide   spaces ")); // 5
    System.out.println(wordCount(" ")); // 0
  }

  public static int wordCount(String s) {
    int     count  = 0;
    boolean inWord = false;

    for (int i = 0; i < s.length(); i++) {
      inWord = s.charAt(i) != ' ';
      count += inWord && (i + 1 == s.length() || s.charAt(i + 1) == ' ') ? 1 : 0;
    }

    return count;
  }

//  public static int wordCount(String s) {
//    String tmp = s.trim();
//    return tmp.isEmpty() ? 0 : tmp.split("\\s+").length;
//  }
}
