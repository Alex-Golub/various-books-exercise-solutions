package org.mrdrprof.solutions.chapter_12_exception_handling_and_text_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * ***12.17 (Game: hangman) Rewrite Programming Exercise 7.35. The program reads the
 * words stored in a text file named hangman.txt. Words are delimited by spaces.
 *
 * @author Alex Golub
 * @since 10/06/2023 2:43 PM
 */
class Ex17 {

    private static final Scanner CONSOLE = new Scanner(System.in);
    private static final String WORDS_BANK = "hangman.txt";

    public static void main(String[] args) {
        do {
            play();
        } while (playAgain());

        System.out.println("Bye!");
    }

    private static boolean playAgain() {
        System.out.print("Do you want to guess another word? Enter y or n >");
        boolean choice = "y".equalsIgnoreCase(CONSOLE.nextLine());
        System.out.println();

        return choice;
    }

    public static void play() {
        char[] word = pickRandomWord().toCharArray();
        char[] guess = new char[word.length];
        Arrays.fill(guess, '*');

        int missed = 0;
        while (!Arrays.equals(word, guess)) {
            System.out.printf("(Guess) Enter a letter in word %s > ", new String(guess));
            char userGuess = CONSOLE.next().toLowerCase().charAt(0);

            if (!checkGuess(userGuess, word, guess))
                missed++;
        }

        System.out.printf("The word is %s. You missed %d time%n", new String(word), missed);
    }

    private static boolean checkGuess(char userGuess, char[] word, char[] guess) {
        boolean correctGuess = false;

        for (int i = 0; i < word.length; i++) {
            if (word[i] == userGuess) {
                if (guess[i] != '*') {
                    System.out.println("    " + userGuess + " is already in the word");
                    correctGuess = true; // repeated correct answer is counted as correct
                    break;
                }

                // reveal correct letter
                guess[i] = userGuess;
                correctGuess = true;
            }
        }

        if (!correctGuess) {
            System.out.println("    " + userGuess + " is not in the word");
        }

        return correctGuess;
    }

    public static String pickRandomWord() {
        try (Scanner fileReader = new Scanner(new File(WORDS_BANK))) {
            String[] words = fileReader.nextLine().split("\\p{javaWhitespace}");
            return words[ThreadLocalRandom.current().nextInt(words.length - 1)];
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
