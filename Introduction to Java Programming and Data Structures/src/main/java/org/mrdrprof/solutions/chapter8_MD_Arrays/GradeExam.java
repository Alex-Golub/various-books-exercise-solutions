package org.mrdrprof.solutions.chapter8_MD_Arrays;

/**
 * @author Mr.Dr.Professor
 * @since 09-Feb-21 1:58 PM
 */
class GradeExam {
  public static void main(String[] args) {
    // Students' answers to the questions
    char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

    // Key to the questions
    char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

    int highestCount            = 0;
    int studentWithHighestCount = 0;
    for (int i = 0; i < answers.length; i++) {

      // Grade one student
      int correctCount = 0;
      for (int j = 0; j < answers[i].length; j++) {
        if (answers[i][j] == keys[j])
          correctCount++;
      }

      System.out.println("Student " + (i + 1) + "'s correct count is " +
                         correctCount);

      if (highestCount < correctCount) {
        highestCount = correctCount;
        studentWithHighestCount = i;
      }
    }

    System.out.println("\nStudent " + (studentWithHighestCount + 1) +
                       " has the highest count of " + highestCount);
  }
}
