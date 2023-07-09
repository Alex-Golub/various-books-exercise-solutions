package org.mrdrprof.solutions.chapter_12_exception_handling_and_text_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

/**
 * *12.14 (Process scores in a text file) Suppose a text file contains an unspecified
 * number of scores separated by spaces. Write a program that prompts the user to
 * enter the file, reads the scores from the file, and displays their total and average.
 *
 * @author Alex Golub
 * @since 09/06/2023 3:16 PM
 */
class Ex14 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter full path to file name: ");
            File scores = new File(scanner.nextLine());
            try (Scanner fileReader = new Scanner(scores)) {
                DoubleSummaryStatistics statistics = Arrays.stream(fileReader.nextLine()
                                                                             .split("\\p{javaWhitespace}"))
                                                           .mapToDouble(Double::parseDouble)
                                                           .summaryStatistics();
                System.out.println("Total: " + statistics.getSum());
                System.out.println("Average: " + statistics.getAverage());
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
