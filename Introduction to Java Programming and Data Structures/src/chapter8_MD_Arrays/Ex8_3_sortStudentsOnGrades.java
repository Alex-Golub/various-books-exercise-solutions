package chapter8_MD_Arrays;

import java.util.Arrays;

/**
 * *8.3 (Sort students on grades)
 *
 * @author Mr.Dr.Professor
 * @since 10-Feb-21 2:09 PM
 */
class Ex8_3_sortStudentsOnGrades {
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

    // { student1, student2, ... , studentN }
    // student_i = {index, grade}
    int[][] studentsGrade = new int[answers.length][2];

    // Grade all answers
    for (int i = 0; i < answers.length; i++) {
      // Grade one student
      int correctCount = 0;
      for (int j = 0; j < answers[i].length; j++) {
        if (answers[i][j] == keys[j])
          correctCount++;
      }

      studentsGrade[i][0] = i;
      studentsGrade[i][1] = correctCount;
    }

//    for (int[] row : studentsGrade)
//      System.out.println(Arrays.toString(row));

    sort(studentsGrade);

//    System.out.println();
//    for (int[] row : studentsGrade)
//      System.out.println(Arrays.toString(row));

    for (int[] student : studentsGrade) {
      System.out.println("Student " + student[0] +
                         "'s correct count is " + student[1]);
    }
  }

  // Selection sort variation on 2d array
  private static void sort(int[][] studentsGrade) {
    for (int i = 0; i < studentsGrade.length; i++) {
      int minimumGrade = studentsGrade[i][1];
      int minimumIndex = i; // index of the student with minimum grade

      for (int j = i + 1; j < studentsGrade.length; j++) {
        int thisStudentGrade = studentsGrade[j][1];

        if (minimumGrade > thisStudentGrade) {
          minimumGrade = thisStudentGrade;
          minimumIndex = j;
        }
      }

      int[] temp = studentsGrade[minimumIndex];
      studentsGrade[minimumIndex] = studentsGrade[i];
      studentsGrade[i] = temp;
    }
  }
}
