package CodeStepByStep_java.strings;

import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/NameGame
 *
 * What is your name? Fifty Cent
 * Fifty, Fifty, bo-Bifty
 * Banana-fana fo-Fifty
 * Fee-fi-mo-Mifty
 * FIFTY!
 *
 * Cent, Cent, bo-Bent
 * Banana-fana fo-Fent
 * Fee-fi-mo-Ment
 * CENT!
 *
 * @author Mr.Dr.Professor
 * @since 14/03/2021 00:24
 */
/*public*/ class NameGame {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("What is your name? ");
    String name = console.nextLine();

    for (String s : name.split("\\s+")) {
      rhyme(s);
    }
  }

  private static void rhyme(String s) {
    System.out.printf("%s, %s, bo-B%s\n", s, s, s.substring(1));
    System.out.printf("Banana-fana fo-F%s\n", s.substring(1));
    System.out.printf("Fee-fi-mo-M%s\n", s.substring(1));
    System.out.printf("%s!\n\n", s.toUpperCase());
  }
}
