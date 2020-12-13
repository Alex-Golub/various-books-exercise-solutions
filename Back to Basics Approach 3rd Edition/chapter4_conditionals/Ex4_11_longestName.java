package chapter4_conditionals;

import java.util.Scanner;

/**
 * 11. Write a static method named longestName that reads names typed by
 * the user and prints the longest name.
 * The longest name should be printed with its first letter capitalized and all
 * subsequent letters in lowercase, regardless of the capitalization the user
 * used when typing in the name.
 * You may assume that n is at least 1, that each name is at least 1 character
 * long, and that the user will type single-word names consisting of only letters.
 *
 * @author Mr.Dr.Professor
 * @since 10-Dec-20 6:30 PM
 */
class Ex4_11_longestName {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    longestName(sc, 7);
  }

  public static void longestName(Scanner sc, int n) {
    String  longest = "";
    int     maxLen  = 0;
    boolean wasTie  = false;

    for (int i = 0; i < n; i++) {
      System.out.print("name #" + (i + 1) + "? ");
      String name    = sc.next();
      int    nameLen = name.length();

      if (nameLen == maxLen)
        wasTie = true;

      if (nameLen > maxLen) {
        maxLen = nameLen;
        longest = name;
        wasTie = false;
      }
    }

    System.out.println(Character.toUpperCase(longest.charAt(0)) +
            longest.substring(1).toLowerCase() + "'s name is longest");
    if (wasTie)
      System.out.println("(There was a tie!)");
  }
}
