package chapter5_logic_and_loops;

import java.util.Scanner;

/**
 * 5. Write a game that plays many rounds of Rock Paper Scissors.
 * The user and computer will each choose between three items:
 * rock (defeats scissors, but loses to paper),
 * paper (defeats rock, but loses to scissors),
 * and scissors (defeats paper, but loses to rock).
 * If the player and computer choose the same item, the game is a tie.
 * <p>
 * You could extend this program to include different algorithmic
 * strategies for choosing the best item.
 * -> 1. Should the computer pick randomly?
 * 2. Should it always pick a particular item or a repeating pattern of items?
 * 3. Should it count the number of times the opponent chooses various items
 * and base its strategy on this history?
 *
 * @author Mr.Dr.Professor
 * @since 24-Dec-20 6:28 PM
 */
class PP5_5_rockPaperScissors {
  static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    intro();
    play();
  }

  private static void intro() {
    System.out.println("Welcome to Rock-Paper-Scissors against the computer");
    System.out.println("3 Rounds play (Ctrl + D to exit).");
    System.out.println("-".repeat(51));
  }

  private static void play() {
    while (true) {
      String user = pick(true);
      String pc   = pick(false);

      System.out.printf("(User)%s Vs. (PC)%s\n", user, pc);
      System.out.println("Winner => " + check(user, pc));
    }
  }

  private static String check(String user, String pc) {
    String s = (user.charAt(0) + "" + pc.charAt(0)).toLowerCase();
    return "rr pp ss".contains(s) ? "Tie" :
            "rs pr sp".contains(s) ? "User" : "PC";
  }

  private static String pick(boolean humanPick) {
    char picked = '-';

    if (!humanPick) {
      picked = "rps".charAt((int) (Math.random() * 3));
    } else {
      while (true) {
        System.out.print("Choose (r)ock, (p)aper or (s)cissors => ");
        picked = Character.toLowerCase(sc.next().charAt(0));
        if (picked == 'r' || picked == 'p' || picked == 's')
          break;

        System.out.println("\"" + picked + "\" is not a valid pick, try again");
      }
    }

    return picked == 'r' ? "Rock" : picked == 'p' ? "Paper" : "Scissors";
  }
}
