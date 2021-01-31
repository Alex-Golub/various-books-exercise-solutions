package chapter6_Methods;

/**
 * @author Mr.Dr.Professor
 * @since 27-Jan-21 10:46 PM
 */
public class RandomCharacter {
  public static char getRandomCharacter(char ch1, char ch2) {
    return (char) (ch1 + (Math.random() * (ch2 - ch1 + 1)));
  }

  /**
   * Generate random lower case letter from english
   * alphabet i.e. letter from the range [a, z]
   *
   * @return random lower case letter
   */
  public static char getRandomLowerCaseLetter() {
    return getRandomCharacter('a', 'z');
  }

  public static char getRandomUpperCaseLetter() {
    return getRandomCharacter('A', 'Z');
  }

  public static char getRandomDigitCharacter() {
    return getRandomCharacter('0', '9');
  }

  public static char getRandomCharacter() {
    return getRandomCharacter('\u0000', '\uFFFF');
  }

  // Testing
  public static void main(String[] args) {
    final int NUMBER_OF_CHARACTERS = 175;
    final int CHARS_PER_LINE       = 25;

    for (int i = 0; i < NUMBER_OF_CHARACTERS; i++) {
      System.out.print(RandomCharacter.getRandomLowerCaseLetter());
      if ((i + 1) % CHARS_PER_LINE == 0)
        System.out.println();
    }
  }
}
