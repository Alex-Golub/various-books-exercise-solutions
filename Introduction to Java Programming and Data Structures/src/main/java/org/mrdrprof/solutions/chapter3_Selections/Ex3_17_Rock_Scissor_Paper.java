package org.mrdrprof.solutions.chapter3_Selections;

import java.util.Scanner;

/**
 * *3.17 (Game: scissor, rock, paper)
 * Write a program that plays the popular scissor–rock–paper game.
 * <p>
 * Created by ag on 26-Oct-20 7:55 PM
 */
class Ex3_17_Rock_Scissor_Paper {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("scissor (0), rock (1), paper (2): ");
      int    user     = scanner.nextInt();
      String userHand = user == 0 ? "scissor" :
                        user == 1 ? "rock" : "paper";

      int    computer     = (int) (Math.random() * 3);
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

      switch (result) {
        case "lose":
          System.out.printf("The computer is %s. You are %s. You lose",
                  computerHand, userHand);
          break;
        case "draw":
          System.out.printf("The computer is %s. You are %s too. Its a draw",
                  computerHand, userHand);
          break;
        case "won":
          System.out.printf("The computer is %s. You are %s. You won",
                  computerHand, userHand);
          break;
      }
      System.out.println();
    }
  }
}
