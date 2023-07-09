package org.mrdrprof.solutions.chapter5_Loops;

import java.util.Scanner;

/**
 * ***5.34 (Game: scissor, rock, paper)
 * Programming Exercise 3.17 gives a program that plays
 * the scissor-rock-paper game. Revise the program to let the user
 * continuously play until either the user or the computer wins three
 * times more than their opponent.
 *
 * @author Mr.Dr.Professor
 * @since 25-Jan-21 4:16 PM
 */
class Ex5_34_scissorRockPaper {
  public static void main(String[] args) {
    System.out.println("Rock Paper Scissor Game\n" + "-".repeat(23));

    Scanner scanner = new Scanner(System.in);

    int userWins = 0, computerWins = 0;
    while (Math.abs(userWins - computerWins) < 3) {
      System.out.print("scissor (0), rock (1), paper (2): ");
      int user = scanner.nextInt();
      String userHand = user == 0 ? "scissor" :
                        user == 1 ? "rock" : "paper";

      int computer = (int) (Math.random() * 3);
      String computerHand = computer == 0 ? "scissor" :
                            computer == 1 ? "rock" : "paper";

      // A scissor can cut a paper,
      // a rock can knock a scissor,
      // and a paper can wrap a rock.
      boolean computerWon = computer == 0 && user == 2 ||
                            computer == 1 && user == 0 ||
                            computer == 2 && user == 1;

      String result = computerWon ? "lose" :
                      user == computer ? "draw" : "won";

      System.out.printf("%s(Computer) VS. %s(User)\n",
                        computerHand, userHand);

      switch (result) {
        case "lose":
          System.out.println("Computer wins");
          computerWins++;
          break;
        case "won":
          System.out.println("You win");
          userWins++;
          break;
        case "draw":
          System.out.println("Its a draw");
          break;
      }

      System.out.println("Standings: Computer: " + computerWins + ", User: " + userWins);
      System.out.println();
    }

    System.out.println("GAME OVER");
    System.out.println((userWins > computerWins ? "You" : "Computer") + " won three times more");
  }
}
