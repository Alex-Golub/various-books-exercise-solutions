package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/countWords
 *
 * @author Mr.Dr.Professor
 * @since 13-Mar-21 8:56 PM
 */
/*public*/ class countWords {
  public static void main(String[] args) {
    System.out.println(countWords("What is your name?"));
  }

  public static int countWords(String s) {
    int words = 0;
    boolean inWord = false;

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (c == ' ' && inWord) {
        inWord = false;
        words++;
      } else if (c != ' '){
        inWord = true;
      }
    }

    // count last word if we exited the loop while in a word
    return words + (inWord ? 1 : 0);
  }
}
