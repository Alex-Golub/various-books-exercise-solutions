package chapter8_MD_Arrays;

import java.util.Scanner;

/**
 * **8.11 (Game: nine heads and tails)
 * 0 - Heads (H)
 * 1 - Tails (T)
 *
 * Enter a number between 0 and 511: 7
 * 000000111
 * H H H
 * H H H
 * T T T
 *
 * Enter a number between 0 and 511: 512
 * Entered number is out of range, Try again.
 *
 * Enter a number between 0 and 511: 345
 * 101011001
 * T H T
 * H T T
 * H H T
 *
 * @author Mr.Dr.Professor
 * @since 12-Feb-21 9:19 PM
 */
class Ex8_11_nineHeadsAndTailsGame {
  static final int SIZE = 3; // play with this parameter
  static final int BOUND = (int) (Math.pow(2, SIZE * SIZE)) - 1;
  static final Scanner CONSOLE = new Scanner(System.in);

  public static void main(String[] args) {
    while (true) {
      int num = prompt();
      String binary = decimalToBinary(num);
      System.out.printf("(%,d)_10 = (%s)_2\n", num, binary);

      char[][] matrix = createMatrix(binary);
      printMatrix(matrix);
      System.out.println();
    }
  }

  private static String decimalToBinary(int num) {
    StringBuilder binary = new StringBuilder(SIZE * SIZE);

    // extract reminders from num
    while (num > 0) {
      binary.insert(0, num % 2);
      num /= 2;
    }

    // if binary is less then SIZE * SIZE prefix with zeros
    while (binary.length() < SIZE * SIZE) {
      binary.insert(0, "0");
    }

    return binary.toString();
  }

  private static void printMatrix(char[][] m) {
    for (char[] row : m) {
      System.out.print(row[0]);

      for (int i = 1; i < SIZE; i++) {
        System.out.print(" " + row[i]);
      }

      System.out.println();
    }

  }

  private static char[][] createMatrix(String binary) {
    char[][] m = new char[SIZE][SIZE];
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        m[i][j] = binary.charAt(SIZE * i + j) == '0' ? 'H' : 'T';
      }
    }

    return m;
  }

  private static int prompt() {
    int num;

    while (true) {
      System.out.printf("Enter a number between 0 and %,d: ", BOUND);
      num = CONSOLE.nextInt();

      if (num >= 0 && num <= BOUND)
        break;

      System.out.println("Entered number is out of range, Try again.\n");
    }

    return num;
  }
}
