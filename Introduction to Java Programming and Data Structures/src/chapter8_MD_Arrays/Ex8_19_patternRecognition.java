package chapter8_MD_Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * **8.19 (Pattern recognition: four consecutive equal numbers)
 * Write the following method that tests whether a
 * two-dimensional array has four consecutive numbers
 * of the same value, either horizontally, vertically, or diagonally:
 *
 * files: pattern1.txt (row)
 *        pattern2.txt (column)
 *        pattern3.txt (sub-diagonal)
 *        pattern4.txt (major-diagonal)
 *
 * @author Mr.Dr.Professor
 * @since 15-Feb-21 10:00 PM
 */
class Ex8_19_patternRecognition {
  static final Scanner console = new Scanner(System.in);
  static final int CONSECUTIVE = 4; // change to match on different consecutive values

  public static void main(String[] args) {
    while (true) {
      try {
        System.out.print("Enter file name: ");
        int[][] m = readMatrix(console.next());
        printMatrix(m);

        System.out.println(isConsecutiveFour(m));
      } catch (FileNotFoundException fnf) {
        System.out.println(fnf.getMessage());
      }

      System.out.println();
    }
  }

  private static void printMatrix(int[][] m) {
    for (int[] row : m) {
      for (int ele : row) {
        System.out.printf("%-3d", ele);
      }
      System.out.println();
    }
  }

  public static int[][] readMatrix(String fileName) throws FileNotFoundException {
    Scanner reader = new Scanner(new File(fileName));
    int[][] m = new int[reader.nextInt()][reader.nextInt()];

    for (int i = 0; i < m.length; i++)
      for (int j = 0; j < m[i].length; j++)
        m[i][j] = reader.nextInt();

    return m;
  }

  public static boolean isConsecutiveFour(int[][] m) {
    return checkRows(m) || checkColumns(m) || checkDiagonals(m);
//    return checkRows(m);
//    return checkColumns(m);
//    return checkDiagonals(m);
  }

  private static boolean checkDiagonals(int[][] m) {
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {

        if (i < m.length - (CONSECUTIVE - 1)) {

          boolean hasMatch;
          // down-right diagonals
          if (j < m[i].length - (CONSECUTIVE - 1)) {
            hasMatch = true;

            for (int k = 1; k < CONSECUTIVE; k++) {
              if (m[i][j] != m[i + k][j + k]) {
                hasMatch = false;
                break;
              }
            }

            if (hasMatch) {
              System.out.println("Matched on down-right diagonal at: " + i + " : " + j);
              return true;
            }
          }

          // down-left diagonals
          if (j - (CONSECUTIVE - 1) >= 0) {
            hasMatch = true;

            for (int k = 1; k < CONSECUTIVE; k++) {
              if (m[i][j] != m[i + k][j - k]) {
                hasMatch = false;
                break;
              }
            }

            if (hasMatch) {
              System.out.println("Matched on down-left diagonal at: " + i + " : " + j);
              return true;
            }
          }
        }
      }
    }

    return false;
  }

  private static boolean checkColumns(int[][] m) {
    for (int j = 0; j < m.length; j++) {
      for (int i = 0; i < m.length - (CONSECUTIVE - 1); i++) {

        boolean hasMatch = true;
        for (int k = 1; k < CONSECUTIVE; k++) {
          if (m[i][j] != m[i + k][j]) {
            hasMatch = false;
            break;
          }
        }

        if (hasMatch) {
          System.out.println("Matched on column at: " + i + " : " + j);
          return true;
        }
      }
    }

    return false;
  }

  private static boolean checkRows(int[][] m) {
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length - (CONSECUTIVE - 1); j++) {

        boolean hasMatch = true;
        for (int k = 1; k < CONSECUTIVE; k++) {
          if (m[i][j] != m[i][j + k]) {
            hasMatch = false;
            break;
          }
        }

        if (hasMatch) {
          System.out.println("Matched on row at: " + i + " : " + j);
          return true;
        }
      }
    }

    return false;
  }
}
