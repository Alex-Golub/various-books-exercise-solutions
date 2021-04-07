package cse_142.cs1_labs;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab4/DevryAdmit
 *
 * test #1:accepted
 * console output: Devry University admission program
 *                 What is your GPA? 3.2
 *                 What is your SAT score? 1280
 *                 You were accepted!
 *                 result: pass
 *
 * test #2:SAT too low
 * console output: Devry University admission program
 *                 What is your GPA? 3.95
 *                 What is your SAT score? 860
 *                 Your SAT score is too low.
 *                 result: pass
 *
 * test #3:GPA too low
 * console output: Devry University admission program
 *                 What is your GPA? 1.4
 *                 What is your SAT score? 1590
 *                 Your GPA is too low.
 *                 result: pass
 *
 * test #4:both too low
 * console output: Devry University admission program
 *                 What is your GPA? 1.7
 *                 What is your SAT score? 790
 *                 Your GPA is too low.
 *                 result: pass
 *
 * test #5:boundary case
 * console output: Devry University admission program
 *                 What is your GPA? 1.8
 *                 What is your SAT score? 900
 *                 You were accepted!
 *                 result: pass
 *
 * @author Alex Golub
 * @since 05-Apr-21 3:02 PM
 */
class DevryAdmit {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("Devry University admission program");
    System.out.print("What is your GPA? ");
    double gpa = console.nextDouble();
    System.out.print("What is your SAT score? ");
    int sat = console.nextInt();

    if (gpa < 1.8) {
      System.out.println("Your GPA is too low.");
    } else if (sat < 900) {
      System.out.println("Your SAT score is too low.");
    } else {
      System.out.println("You were accepted!");
    }
  }
}
