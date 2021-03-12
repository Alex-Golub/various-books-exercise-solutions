package CodeStepByStep_java.file_IO;

import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/fileio/pigLatin2
 *
 * if the word starts with constants, move all constants up to the first vowel
 * (not just the first consonant) to the end, and append "ay".
 * For example, the word "scram" would become "amscray".
 *
 * @author Mr.Dr.Professor
 * @since 06-Mar-21 5:26 PM
 */
/*public*/ class pigLatin2 {
  public static void main(String[] args) {
    String data = "She sells streaming screaming sea shells\n" +
                  "by the SEA SHORE\n" +
                  "with rhythm in a thriving city\n" +
                  "in Mississippi\n" +
                  "that I can't wait to visit!";
    pigLatin2(new Scanner(data));

    System.out.println();

    data = "Now this is the story\n" +
           "all about how\n" +
           "\n" +
           "my life got flipped\n" +
           "turned upside down";
    pigLatin2(new Scanner(data));
  }

  public static void pigLatin2(Scanner file) {
    StringBuilder pigLatin = new StringBuilder();
    final String VOWELS = "aeiouAEIOU";

    while (file.hasNextLine()) {
      Scanner tokenReader = new Scanner(file.nextLine());

      while (tokenReader.hasNext()) { // \n are skipped
        String word = tokenReader.next();

        String firstCharacter = word.substring(0, 1);
        if (VOWELS.contains(firstCharacter)) {
          pigLatin.append(word)
                  .append("y");
        } else {
          int indexOfFirstVowel = indexOfFirstVowel(word);

          if (indexOfFirstVowel != -1) {
            pigLatin.append(word.substring(indexOfFirstVowel))
                    .append(word, 0, indexOfFirstVowel);
          } else {
            pigLatin.append(word);
          }
        }

        pigLatin.append("ay ");
      }

      if (file.hasNextLine()) {
        pigLatin.append("\n");
      }
    }

    System.out.println(pigLatin);
  }

  private static int indexOfFirstVowel(String word) {
    final String VOWELS = "aeiouAEIOU";
    for (int i = 0; i < word.length(); i++) {
      if (VOWELS.contains(word.charAt(i) + "")) {
        return i;
      }
    }

    return -1; // word doesn't contains any vowels
  }
}
