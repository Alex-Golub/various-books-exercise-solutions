package chapter6_Methods;

import java.util.Scanner;

/**
 * **6.18 (Check password)
 *
 * @author Mr.Dr.Professor
 * @since 28-Jan-21 7:40 PM
 */
class Ex6_18_passwordCheck {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.print("Enter password (at least 10 characters " +
                       "consists of letters and digits): ");

      if (checkPassword(sc.next())) {
        System.out.println("[✔] Password Valid");
      } else {
        System.out.println("[✖] Invalid Password");
      }

      System.out.println();
    }
  }

  public static boolean checkPassword(String password) {
    final int MIN_LENGTH = 10;
    final int MIN_DIGITS = 3;
    int       digits     = 0;
    int       length     = 0;

    String temp = password.toLowerCase();
    for (int i = 0; i < temp.length(); i++) {
      char c = temp.charAt(i);

      if (!Character.isLetter(c) && !Character.isDigit(c))
        return false;

      if (Character.isDigit(c))
        digits++;

      length++;
    }

    return digits >= MIN_DIGITS && length >= MIN_LENGTH;
  }
}
