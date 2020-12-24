package chapter5_logic_and_loops;

import java.util.Scanner;

/**
 * 7. Write a program that plays the dice game “Pig.”
 *
 * Pig is a two-player game where the players take turns repeatedly
 * rolling a single 6-sided die;
 * a player repeatedly rolls the die until one of two events occurs.
 * 1. Either the player chooses to stop rolling,
 * in which case the sum of that player’s rolls are added to his/her total points;
 * 2. or if the player rolls a 1 at any time, all points for that turn are
 * lost and the turn ends immediately.
 *
 * The first player to reach a score of at least 100 points wins.
 *
 * @author Mr.Dr.Professor
 * @since 24-Dec-20 7:47 PM
 */
class PP5_7_pig_game {
  static final int     MAX_SCORE = 100;
  static final Scanner sc        = new Scanner(System.in);

  public static void main(String[] args) {
    intro();
    play();
  }

  private static void play() {
    int     p1_total = 0;
    int     p2_total = 0;
    boolean p1_turn  = true;
    char    option;

    // TODO
  }

  private static char choose() {
    char res = '-';

    while (true) {
      System.out.print("(s)top rolling or (r)oll? => ");
      res = sc.next().charAt(0);
      if (res == 's' || res == 'r')
        break;

      System.out.println(res + " is invalid options, try again");
    }

    return res;
  }

  private static void intro() {
    System.out.println(
            "Pig is a two-player game where the players take turns repeatedly\n" +
            "rolling a single 6-sided die."
    );
    System.out.println("-".repeat(64));
  }
}
