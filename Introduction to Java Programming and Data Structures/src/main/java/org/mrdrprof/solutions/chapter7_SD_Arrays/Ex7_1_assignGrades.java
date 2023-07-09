package org.mrdrprof.solutions.chapter7_SD_Arrays;

import java.util.Scanner;

/**
 * *7.1 (Assign grades)
 * Grade is A if score is >= best -5
 * Grade is B if score is >= best -10;
 * Grade is C if score is >= best -15;
 * Grade is D if score is >= best -20;
 * Grade is F otherwise
 *
 * @author Mr.Dr.Professor
 * @since 01-Feb-21 2:08 PM
 */
class Ex7_1_assignGrades {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of students: ");
    int   students = sc.nextInt();
    int[] grades   = new int[students];

    System.out.print("Enter " + students + " scores: ");
    int bestScore = 0;
    for (int i = 0; i < students; i++) {
      grades[i] = sc.nextInt();
      bestScore = Math.max(grades[i], bestScore);
    }

    for (int i = 0; i < grades.length; i++) {
      char grade;
      int  score = grades[i];

      if (score >= bestScore - 5) grade = 'A';
      else if (score >= bestScore - 10) grade = 'B';
      else if (score >= bestScore - 15) grade = 'C';
      else if (score >= bestScore - 20) grade = 'D';
      else grade = 'F';

      System.out.println("Student " + i + " score is " +
                         grades[i] + " and grade is " + grade);
    }
  }
}
