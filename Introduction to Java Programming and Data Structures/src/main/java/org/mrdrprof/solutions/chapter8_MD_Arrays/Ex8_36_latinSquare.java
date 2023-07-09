package org.mrdrprof.solutions.chapter8_MD_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * **8.36 (Latin square)
 * n-by-n array filled with n different Latin letters,
 * each occurring exactly once in each row and once in each column.
 * The characters are the first n characters starting from A.
 *
 * @author Mr.Dr.Professor
 * @since 20-Feb-21 12:48 AM
 */
class Ex8_36_latinSquare {
  static final Scanner CONSOLE = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Enter number n: ");
    int n = CONSOLE.nextInt() % 26; // wrap to start if n > 26 (number of letters in English

    char[] validLetters = getValidLetters(n);

    char[][] square = getSquare(n, validLetters);
    if (square == null) {
      System.out.printf("Wrong input: the letters must be from %c to %s\n",
                        validLetters[0], validLetters[validLetters.length - 1]);
      System.exit(1);
    }

    System.out.printf("The input array is %sa Latin square\n\n",
                      isValidLatinSquare(square) ? "" : "NOT ");
  }

  // create English alphabet uppercase characters array up to excluding n
  private static char[] getValidLetters(int n) {
    char[] validLetters = new char[n];
    for (int i = 0; i < n; i++) {
      validLetters[i] = (char) ('A' + i);
    }

    return validLetters;
  }

  // get square from console.
  // if input is not valid return null
  private static char[][] getSquare(int n, char[] validLetters) {
    char[][] square = new char[n][n];

    System.out.printf("Enter %d rows of letters in the range %c - %c, separated by spaces:\n",
                      n, validLetters[0], validLetters[validLetters.length - 1]);

    // get input from user while checking inputted letters are in valid range
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        square[i][j] = CONSOLE.next().toUpperCase().charAt(0);
      }

      char[] clonedRow = square[i].clone();
      Arrays.sort(clonedRow);

      if (!Arrays.equals(clonedRow, validLetters)) {
        return null;
      }
    }
    return square;
  }

  private static boolean isValidLatinSquare(char[][] square) {
    // transpose square 2d array and compare it to the original
    char[][] transposed = transpose(square);

    for (int i = 0; i < square.length; i++) {
      if (!Arrays.equals(square[i], transposed[i])) {
        return false;
      }
    }

    return true;
  }

  // convert square row to columns
  private static char[][] transpose(char[][] square) {
    char[][] transposed = new char[square.length][square.length];
    for (int i = 0; i < square.length; i++) {
      for (int j = 0; j < square.length; j++) {
        transposed[j][i] = square[i][j];
      }
    }
    return transposed;
  }
}
