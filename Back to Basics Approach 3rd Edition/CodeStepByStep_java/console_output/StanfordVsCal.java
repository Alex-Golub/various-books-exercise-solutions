package CodeStepByStep_java.console_output;

import java.util.Scanner;

/**
 * Write a complete Java program named StanfordVsCal with a main method
 * that computes who won the Stanford-Berkeley football game.
 * The program should ask the user for the two scores.
 * You may assume that the user enters valid non-negative integers.
 * Below is an example dialogue (user input is shown like this):
 *
 * Stanford: How many points did they score? 87
 * Cal: How many points did they score? 3
 * Stanford won!
 *
 * @author Mr.Dr.Professor
 * @since 21-Feb-21 9:42 PM
 */
/*public*/ class StanfordVsCal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Stanford: How many points did they score? ");
    int stanfordScore = Integer.parseInt(sc.nextLine());

    System.out.print("Cal: How many points did they score? ");
    int calScore = Integer.parseInt(sc.nextLine());

    System.out.printf("%s won!\n", stanfordScore > calScore ? "Stanford" : "Cal");
  }
}
