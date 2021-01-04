package chapter6_file_processing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 1. Students are often asked to write term papers containing
 * a certain number of words.
 * Counting words in a long paper is a tedious task,
 * but the computer can help.
 * Write a program that counts the number of:
 * 1. words,
 * 2. lines,
 * 3. and total characters (not including whitespace)
 * in a paper, assuming that consecutive words are separated
 * either by spaces or end-of-line characters.
 *
 * @author Mr.Dr.Professor
 * @since 04-Jan-21 2:10 PM
 */
class PP6_1_analyzeText {
  public static void main(String[] args) throws FileNotFoundException {
    analyzeText(new File("medicine.txt"));
  }

  public static void analyzeText(File input) throws FileNotFoundException {
    if (!input.canRead()) {
      System.err.println("Error: can't read file " + input.getName());
      return;
    }

    int     words      = 0;
    int     lines      = 0;
    int     characters = 0;
    Scanner lineReader = new Scanner(input);

    while (lineReader.hasNextLine()) {
      String line = lineReader.nextLine();
      lines++;

      Scanner wordReader = new Scanner(line);
      while (wordReader.hasNext()) {
        words++;
        characters += wordReader.next().length();
      }
    }

    System.out.printf("File %s summary:\nlines: %d\nwords: %d\ncharacters: %d\n",
            input.getName(), lines, words, characters);
  }
}
