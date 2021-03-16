package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/wordCount
 *
 * Constraints:
 * Do not use a Scanner to help you solve this problem.
 * Do not use any data structures such as arrays to help you solve this problem.
 * Do not use the String method split on this problem.
 * But you can declare as many simple variables like int, char, etc.
 * as you like. Declaring String variables is also fine.
 *
 * wordCount("hello")                                  => 1
 * wordCount("how are you?")                           => 3
 * wordCount("  OK  ")                                 => 1
 * wordCount("  this  string   has    wide spacing  ") => 5
 * wordCount("  a b  c  d  e  fg  h i")                => 8
 * wordCount("")                                       => 0
 *
 * @author Mr.Dr.Professor
 * @since 16/03/2021 22:07
 */
/*public*/ class wordCount {
  public static void main(String[] args) {
    System.out.println(wordCount("hello, how are you?"));
  }

  public static int wordCount(String s) {
    int count = 0;
    boolean inWord = false;

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (c == ' ' && inWord) { // reach end of a word
        inWord = false;
        count++;
      } else if (c != ' ') { // in start or middle of word
        inWord = true;
      }
    }

    return count + (inWord ? 1 : 0);
  }
}
