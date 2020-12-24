package chapter5_logic_and_loops;

/**
 * 1. Write an interactive program that reads lines of input from
 * the user and converts each line into “Pig Latin.”
 * <p>
 * Pig Latin is English with the initial consonant sound moved to
 * the end of each word, followed by “ay.”
 * Words that begin with vowels simply have an “ay” appended.
 * For example, the phrase
 * "The deepest shade of mushroom blue"
 * would have the following appearance in Pig Latin:
 * e-Thay eepest-day ade-shay of-ay ushroom-may ue-blay
 * Terminate the program when the user types a blank line.
 *
 * @author Mr.Dr.Professor
 * @since 24-Dec-20 12:18 AM
 */
class PP5_1_pigLatin {
  static final String VOWELS = "aeiouAEIOU";

  public static void main(String[] args) {
    // ow-Hay o-day ou-yay ay-say -...ay in-ay ig-Pay atin?-Lay
    toPigLatin("How do you say ... in Pig Latin?");

    // e-Thay eepest-day ade-shay of-ay ushroom-may ue-blay
    toPigLatin("The deepest shade of mushroom blue");
  }

  public static void toPigLatin(String sentence) {
    String[] parts = sentence.split(" ");
    int      n     = parts.length;
    for (int i = 0; i < n - 1; i++) {
      System.out.print(wordToPigLatin(parts[i]));
      if (i + 1 < n)
        System.out.print(" ");
    }
    System.out.println(wordToPigLatin(parts[n - 1]));
  }

  private static String wordToPigLatin(String word) {
    StringBuilder res = new StringBuilder("-");

    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      if (VOWELS.indexOf(c) != -1) {
        // c is a vowel.
        // extract substring from this i to end of word
        // and append "ay" to res and return
        res.insert(0, word.substring(i));
        res.append("ay");
        return res.toString();
      }

      // character at i is not a vowel
      // insert it to end of res
      res.insert(res.length(), c);
    }

    // no vowel were encountered, append "ay"
    return res.append("ay").toString();
  }
}
