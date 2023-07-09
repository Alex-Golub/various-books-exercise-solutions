package org.mrdrprof.solutions.chapter8_MD_Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * **8.37 (Guess the capitals)
 *
 * @author Mr.Dr.Professor
 * @since 20-Feb-21 1:50 PM
 */
class Ex8_37_guessTheCapitals {
  static final int COUNTRY = 0, CAPITAL = 1;
  static final List<String[]> COUNTRY_CAPITALS = new ArrayList<>();
  static {
    try {
      Scanner reader = new Scanner(new File("country_capitals.txt"));
      for (int i = 0; reader.hasNextLine(); i++) {
        COUNTRY_CAPITALS.add(reader.nextLine().split("[|]"));
      }
    } catch (FileNotFoundException fnf) {
      System.out.println(fnf.getMessage());
    }
  }
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.printf("Number of question to ask (%d - %d): ",
                      1, COUNTRY_CAPITALS.size());
    int n = Integer.parseInt(console.nextLine()) % COUNTRY_CAPITALS.size();

    int correct = 0;
    Random rnd = new Random();
    for (int i = 0; i < n; i++) {
      String[] randomCountry = COUNTRY_CAPITALS.get(rnd.nextInt(COUNTRY_CAPITALS.size()));

      System.out.printf("What is the capital of %s? ", randomCountry[COUNTRY]);
      String answer = console.nextLine();

      if (answer.equalsIgnoreCase(randomCountry[CAPITAL])) {
        System.out.println("Your answer is correct!");
        correct++;
      } else {
        System.out.println("The correct answer should be " + randomCountry[CAPITAL]);
      }

      System.out.printf("Correct: %d | Incorrect: %d\n\n", correct, i - correct + 1);
    }

    System.out.printf("Summary: correct/total => %d/%d", correct, n);
  }
}
