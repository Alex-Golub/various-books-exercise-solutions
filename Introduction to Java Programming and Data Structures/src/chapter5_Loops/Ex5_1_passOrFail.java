package chapter5_Loops;

import java.util.Scanner;

/**
 * *5.1 (Pass or fail)
 * Write a program that prompts a student to enter a Java score.
 * If the score is greater or equal to 60, display “you pass the exam”;
 * otherwise, display “you don’t pass the exam”.
 * Your program ends with input -1.
 *
 * @author Mr.Dr.Professor
 * @since 21-Jan-21 1:27 PM
 */
class Ex5_1_passOrFail {
  public static void main(String[] args) {
    var console = new Scanner(System.in);

    while (true) {
      System.out.print("Enter your score: ");
      int score = Integer.parseInt(console.nextLine());
      if (score == -1) {
        System.out.println("No number are entered except 0");
        break;
      }

      System.out.printf("You %spass the exam.\n\n", score >= 60 ? "" : "don't ");
    }
  }
}
