package CodeStepByStep_java.if_else;

import java.util.Scanner;

/**
 *https://www.codestepbystep.com/problem/view/java/ifelse/percentageGrade
 *
 * Do not use && or || in your solution
 *
 * @author Mr.Dr.Professor
 * @since 01-Mar-21 1:47 AM
 */
/*public*/ class percentageGrade {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("What percentage did you earn? ");
    int percent = console.nextInt();
    if (percent >= 90) {
      System.out.println("You got an A!");
    } else if (percent >= 80) {
      System.out.println("You got a B!");
    } else if (percent >= 70) {
      System.out.println("You got a C!");
    } else if (percent >= 60) {
      System.out.println("You got a D!");
    } else {
      System.out.println("You got an F!");
    }
  }
}
