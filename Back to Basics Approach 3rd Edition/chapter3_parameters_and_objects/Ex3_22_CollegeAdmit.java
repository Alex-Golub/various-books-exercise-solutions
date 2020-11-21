package chapter3_parameters_and_objects;

import java.util.Scanner;

/**
 * 22. Write a complete program called CollegeAdmit
 * with the behavior shown below.
 * Read user input for a student’s grade point average and SAT exam score.
 * A GPA below 1.8 will cause the student to be rejected;
 * an SAT score below 900 will also cause a rejection.
 * Otherwise the student is accepted.
 *
 * @author Mr.Dr.Professor
 * @since 21-Nov-20 8:23 PM
 */
class Ex3_22_CollegeAdmit {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("University admission program");
    System.out.print("What is your GPA? ");
    double gpa = scanner.nextDouble();
    System.out.print("What is your SAT score? ");
    int sat = scanner.nextInt();

    if (gpa < 1.8)      System.out.println("Your GPA is too low.");
    else if (sat < 900) System.out.println("Your SAT score is too low.");
    else                System.out.println("You were accepted!");
  }
}
