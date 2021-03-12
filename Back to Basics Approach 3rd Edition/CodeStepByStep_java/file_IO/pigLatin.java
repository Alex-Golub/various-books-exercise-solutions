package CodeStepByStep_java.file_IO;

import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/fileio/pigLatin
 * <p>
 * The rules for translating a word to Pig Latin are as follows:
 * <p>
 * - If the word starts with a vowel (aeiou), simply append "yay".
 * For example, "elephant" becomes "elephantyay".
 * <p>
 * - If the word starts with a consonant, move the consonant to the end,
 * and append "ay". For example, "welcome" becomes "elcomeway".
 *
 * @author Mr.Dr.Professor
 * @since 06-Mar-21 5:06 PM
 */
/*public*/ class pigLatin {
  public static void main(String[] args) {
    String data = "four score and\n" +
                  "seven years ago our\n" +
                  "fathers brought forth on this continent a new nation";
    pigLatin(new Scanner(data));

    System.out.println();

    data = "Now this is the story\n" +
           "all about how\n" +
           "\n" +
           "my life got flipped\n" +
           "turned upside down";
    pigLatin(new Scanner(data));
  }

  public static void pigLatin(Scanner file) {
    StringBuilder pigLatin = new StringBuilder();
    final String VOWELS = "aeiouAEIOU";

    while (file.hasNextLine()) {
      Scanner tokenReader = new Scanner(file.nextLine());

      while (tokenReader.hasNext()) {
        String word = tokenReader.next();

        String firstCharacter = word.substring(0, 1);
        if (VOWELS.contains(firstCharacter)) {
          pigLatin.append(word)
                  .append("yay ");
        } else {
          pigLatin.append(word.substring(1))
                  .append(firstCharacter)
                  .append("ay ");
        }

      }

      if (file.hasNextLine()) {
        pigLatin.append("\n");
      }
    }

    System.out.println(pigLatin);
  }
}
