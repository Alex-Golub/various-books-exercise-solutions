package chapter5_Loops;

import java.util.Scanner;

/**
 * 5.8 (Find the highest score)
 * Write a program that prompts the user to enter the number
 * of students and each student’s name and score, and finally
 * displays the name of the student with the highest score.
 * Use the next() method in the Scanner class
 * to read a name, rather than using the nextLine() method.
 *
 * @author Mr.Dr.Professor
 * @since 21-Jan-21 6:10 PM
 */
class Ex5_8_highestScore {

  // get number of total students
  // while there is still students to process
  //  get name
  //  get score
  //  if this student score is grater then max score so far
  //   update name of the student that got max score till now
  //   update new max score
  //  else get next student
  // print name and score of student that got max score

  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("How many students -> ");
    int    numberOfStudents = console.nextInt();
    String name             = "";
    int    maxScoreSoFar    = Integer.MIN_VALUE;

    for (int i = 1; i <= numberOfStudents; i++) {
      System.out.printf("Student #%d name -> ", i);
      String studentName = console.next();
      System.out.print("Score -> ");
      int score = console.nextInt();

      if (score > maxScoreSoFar) {
        name = studentName;
        maxScoreSoFar = score;
      }

      System.out.println();
    }

    if (numberOfStudents <= 0) {
      System.out.println("No students to process");
    } else {
      System.out.println(name + " scores the highest " + maxScoreSoFar);
    }
  }
}
