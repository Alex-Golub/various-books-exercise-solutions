package chapter_12_exception_handling_and_text_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * **12.30 (Occurrences of each letter) Write a program that prompts the user to enter a
 * file name and displays the occurrences of each letter in the file. Letters are case
 * insensitive. Here is a sample run:
 * <p>
 * Enter a filename: moby-dick.txt
 * Number of As: 56
 * Number of Bs: 134
 * ...
 * Number of Zs: 9
 *
 * @author Alex Golub
 * @since 11/06/2023 6:47 PM
 */
class Ex30 {
    public static void main(String[] args) {
        System.out.print("Enter a filename: ");
        try (Scanner console = new Scanner(System.in)) {
            String filePath = console.next();
            int[] letterOccurrences = processFile(filePath);
            printResult(letterOccurrences);
        }
    }

    private static void printResult(int[] letterOccurrences) {
        for (int i = 0; i < letterOccurrences.length; i++) {
            System.out.printf("Number of %ss: %d%n", (char) ('A' + i), letterOccurrences[i]);
        }
    }

    private static int[] processFile(String filePath) {
        int[] letterOccurrences = new int[26];
        try (Scanner fileReader = new Scanner(new File(filePath))) {
            fileReader.useDelimiter("");
            while (fileReader.hasNext()) {
                char letter = fileReader.next().toUpperCase().charAt(0);
                if (Character.isLetter(letter)) {
                    letterOccurrences[letter - 'A']++;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return letterOccurrences;
    }
}
