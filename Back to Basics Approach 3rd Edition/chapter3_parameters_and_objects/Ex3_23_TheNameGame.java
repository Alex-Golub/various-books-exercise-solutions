package chapter3_parameters_and_objects;

import java.util.Scanner;

/**
 * 23. Write a complete program called "TheNameGame",
 * where the user inputs a first and last name and a
 * song in the following format is printed about their first,
 * then last, name.
 * E.g.
 * sing("Fifty Cent") ->
 *
 * What is your name? Fifty Cent
 * Fifty Fifty, bo-Bifty
 * Banana-fana fo-Fifty
 * Fee-fi-mo-Mifty
 * FIFTY!
 *
 * Cent Cent, bo-Bent
 * Banana-fana fo-Fent
 * Fee-fi-mo-Ment
 * CENT!
 *
 * @author Mr.Dr.Professor
 * @since 21-Nov-20 8:27 PM
 */
class Ex3_23_TheNameGame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("What is your name? ");
    String name = sc.nextLine();

    int split = name.indexOf(" ");
    sing(name.substring(0, split));
    System.out.println();
    sing(name.substring(split + 1));
  }

  public static void sing(String s) {
    System.out.printf("%s %s, bo-B%s\n", s, s, s.substring(1));
    System.out.printf("Banana-fana fo-F%s\n", s.substring(1));
    System.out.printf("Fee-fi-mo-M%s\n", s.substring(1));
    System.out.printf("%s!\n", s.toUpperCase());
  }
}
