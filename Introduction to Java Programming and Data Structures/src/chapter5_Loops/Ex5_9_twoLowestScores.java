package chapter5_Loops;

import java.util.Scanner;

/**
 * *5.9 (Find the two lowest scores)
 * Write a program that prompts the user to enter the number
 * of students and each student’s name and score,
 * and finally displays the names of the
 * students with the lowest and second-lowest scores.
 *
 * @author Mr.Dr.Professor
 * @since 21-Jan-21 6:24 PM
 */
class Ex5_9_twoLowestScores {

  // worstStudent
  // secondWorstStudent
  // lowestScore
  // secondLowestScore
  //
  // get total # of students
  // while there is more students to process:
  //   get name
  //   get score
  //   if score < lowestScore:
  //     worstStudent = name
  //     lowestScore = score
  //   else if score < secondLowestScore:
  //     secondWorst = name
  //     secondLowestScore = score
  // print summary

  public static void main(String[] args) {
    Scanner console            = new Scanner(System.in);
    String  worstStudent       = "";
    int     lowestScore        = Integer.MAX_VALUE;
    String  secondWorstStudent = "";
    int     secondLowest       = lowestScore - 1;

    System.out.print("How many students -> ");
    int numberOfStudents = console.nextInt();

    for (int i = 1; i <= numberOfStudents; i++) {
      System.out.printf("Student #%d name -> ", i);
      String studentName = console.next();
      System.out.print("Score -> ");
      int score = console.nextInt();
      if (score < 0)
        throw new IllegalStateException("Illegal score: " + score);

      if (score < lowestScore) {
        lowestScore = score;
        worstStudent = studentName;
      } else if (score < secondLowest) {
        secondLowest = score;
        secondWorstStudent = studentName;
      }

      System.out.println();
    }

    if (numberOfStudents <= 0) {
      System.out.println("No students to process");
    } else if (numberOfStudents == 1) {
      System.out.println("Only one student Name: " + worstStudent + " Score: " + lowestScore);
    } else {
      System.out.println(worstStudent + " got lowest score of " + lowestScore);
      System.out.println(secondWorstStudent + " got second lowest score of " + secondLowest);
    }
  }
}
