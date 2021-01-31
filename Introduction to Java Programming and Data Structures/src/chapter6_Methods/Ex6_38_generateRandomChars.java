package chapter6_Methods;

/**
 * *6.38 (Generate random characters)
 *
 * @author Mr.Dr.Professor
 * @since 31-Jan-21 11:25 PM
 */
class Ex6_38_generateRandomChars {

  public static void main(String[] args) {
    final int PER_LINE = 10;
    final int HOW_MANY = 200;

    for (int i = 0; i < HOW_MANY; i++) {
      System.out.print(RandomCharacter.getRandomUpperCaseLetter());

      if ((i + 1) % PER_LINE == 0)
        System.out.println();
      else
        System.out.print(" ");
    }

    // NOTE: both loops look the same just the method we invoke is
    // different, it would be grate if we could pass functions to methods
    // stay tuned...
    System.out.println();

    for (int i = 0; i < HOW_MANY; i++) {
      System.out.print(RandomCharacter.getRandomDigitCharacter());

      if ((i + 1) % PER_LINE == 0)
        System.out.println();
      else
        System.out.print(" ");
    }
  }
}
