package CodeStepByStep_java.parameters_and_return;

import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/Grades
 *
 * Write a console program in a class named Grades that helps a
 * student estimate their grades in a course.
 *
 * @author Mr.Dr.Professor
 * @since 26-Feb-21 7:47 PM
 */
/*public*/ class Grades {
  static final Scanner console = new Scanner(System.in);
  static final int POINTS_PER_SECTION = 3;
  static final int SECTIONS_MAX_SCORE = 20;
  static final int EXAM_MAX_SCORE = 100;

  public static void main(String[] args) {
    intro();

    double gradeSoFar = 0.0;
    System.out.print("Exam weights? ");
    int midtermExamWeight = console.nextInt();
    int finalExamWeight = console.nextInt();

    gradeSoFar += assignmentAndSectionsScore(EXAM_MAX_SCORE - (midtermExamWeight + finalExamWeight));
    System.out.println();
    gradeSoFar += examScore(midtermExamWeight);

    finalGrade(gradeSoFar, finalExamWeight);
  }

  private static void finalGrade(double gradeSoFar, int finalExamWeight) {
    System.out.print("\nHave you taken the final? (1=yes, 2=no) ");
    if (console.nextInt() == 1) {
      gradeSoFar += examScore(finalExamWeight);
      System.out.printf("\nCourse grade = %.1f", gradeSoFar);
      return;
    }

    System.out.print("Desired percentage? ");
    int percent = console.nextInt();
    double scoreNeeded = EXAM_MAX_SCORE * (1.0 * percent - gradeSoFar) / finalExamWeight;

    double highestPossible = gradeSoFar + finalExamWeight;
    if (scoreNeeded < 0.0) {
      scoreNeeded = 0.0;
    }
    System.out.printf("Score needed = %.1f", scoreNeeded);

    if (highestPossible < percent) {
      System.out.println("\nSorry, it is impossible to earn this score.");
      System.out.printf("The highest percentage you can get is %.1f.", highestPossible);
    }
  }

  private static double assignmentAndSectionsScore(int hwWeight) {
    System.out.println("\nHomework (weight " + hwWeight + "):");
    System.out.print("Number of assignments? ");
    int assignments = console.nextInt();
    int totalAssignmentsScore = 0;
    int maxScorePossible = 0;
    for (int i = 1; i <= assignments; i++) {
      System.out.printf("Assignment %d score and max? ", i);
      totalAssignmentsScore += console.nextInt();
      maxScorePossible += console.nextInt();
    }

    // Each section is worth 3 points, up to a maximum of 20.
    System.out.print("Sections attended? ");
    int sectionsAttended = console.nextInt();
    int sectionScore = Math.min(POINTS_PER_SECTION * sectionsAttended, SECTIONS_MAX_SCORE);
    System.out.printf("Section points = %d / %d\n", sectionScore, SECTIONS_MAX_SCORE);
    int maxPoints = maxScorePossible + SECTIONS_MAX_SCORE;
    int totalPoints = Math.min(totalAssignmentsScore + sectionScore, maxPoints);
    System.out.printf("Total points = %d / %d\n", totalPoints, maxPoints);
    double weightedScore = 1.0 * totalPoints / maxPoints * hwWeight;
    System.out.printf("Weighted score = %.1f\n", weightedScore);

    return weightedScore;
  }

  private static double examScore(int examWeight) {
    System.out.println("Exam (weight " + examWeight + "):");
    System.out.print("Score? ");
    int exam1Score = console.nextInt();

    System.out.print("Curve? ");
    int exam1Curve = console.nextInt();

    int totalExamPoints = Math.min(exam1Score + exam1Curve, EXAM_MAX_SCORE);
    System.out.printf("Total points = %d / %d\n", totalExamPoints, EXAM_MAX_SCORE);

    double weightedScore = 1.0 * examWeight * totalExamPoints / EXAM_MAX_SCORE;
    System.out.printf("Weighted score = %.1f\n", weightedScore);

    return weightedScore;
  }

  private static void intro() {
    System.out.println("This program reads your scores on homework");
    System.out.println("and exams and reports your course grade or");
    System.out.println("what score you need on the final exam.\n");
  }
}
