package cse_142.cs1_exams.finals;

import java.util.Scanner;

/**
 * @author Alex Golub
 * @since 13-Apr-21 10:18 PM
 */
class countWords {
  public static void main(String[] args) {
    String mockData = "You must show: your Student ID card \n" +
                      "\n" +
                      "to 1) a TA or 2) the instructor \n" +
                      "before\n" +
                      "\n" +
                      "leaving the room.";
    countWords(new Scanner(mockData));
  }

  public static void countWords(Scanner data) {
    int lines = 0, words = 0;
    while (data.hasNextLine()) {
      Scanner tokenReader = new Scanner(data.nextLine());
      lines++;

      while (tokenReader.hasNext()) {
        tokenReader.next();
        words++;
      }
    }

    System.out.printf("Total lines = %d\n", lines);
    System.out.printf("Total words = %d\n", words);
    System.out.printf("Average words per line = %.3f", 1.0 * words / lines);
  }
}
