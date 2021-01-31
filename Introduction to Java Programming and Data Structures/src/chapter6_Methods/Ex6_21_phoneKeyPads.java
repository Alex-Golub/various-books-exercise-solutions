package chapter6_Methods;

import java.util.Scanner;

/**
 * @author Mr.Dr.Professor
 * @since 28-Jan-21 8:26 PM
 */
class Ex6_21_phoneKeyPads {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter a string: ");
      String s = scanner.next();

      for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);

        if (Character.isLetter(c)) {
          System.out.print(getNumber(c));
        } else {
          System.out.print(c);
        }
      }

      System.out.println();
    }
  }

  public static int getNumber(char letter) {
    // convert to lowercase can also use Character.toLowerCase(letter)
    letter = 'A' <= letter && letter <= 'Z' ?
             (char) (letter + 'a' - 'A') : letter;

    if ('p' <= letter && letter <= 's')
      return 7;
    if ('t' <= letter && letter <= 'v')
      return 8;
    if ('w' <= letter && letter <= 'z')
      return 9;

    // up to sixth pad its group of 3 letters of numbers take floor
    // a starts at pad 2 so adding 2
    return (letter - 'a') / 3 + 2;
  }

}
