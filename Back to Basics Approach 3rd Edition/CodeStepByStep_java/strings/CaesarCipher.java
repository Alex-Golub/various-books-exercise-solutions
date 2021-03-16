package CodeStepByStep_java.strings;

import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/CaesarCipher
 *
 * shifting every letter forward by a given number.
 * Letters near the end of the alphabet wrap around;
 * for a shift of 3, X becomes A, and Y becomes B, and Z becomes C.
 *
 * @author Mr.Dr.Professor
 * @since 13-Mar-21 1:04 AM
 */
/*public*/ class CaesarCipher {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);

    System.out.print("Your message? ");
    String msg = console.nextLine();
    System.out.print("Encoding key? ");
    int key = Integer.parseInt(console.nextLine());

    System.out.println(encode(msg, key));
  }

  // CaesarCipher key can be +ve | -ve
  private static String encode(String msg, int key) {
    key %= 26;
    int len = msg.length();
    StringBuilder sb = new StringBuilder(len);

    for (int i = 0; i < len; i++) {
      char c = msg.charAt(i);

      if (!Character.isLetter(c)) {
        sb.append(c);
      } else {
        char newChar = (char) (Character.toUpperCase(c) + key);

        newChar += newChar < 'A' ? 26 : (newChar > 'Z' ? -26 : 0);
        sb.append(newChar);
      }
    }

    return sb.toString();
  }
}
