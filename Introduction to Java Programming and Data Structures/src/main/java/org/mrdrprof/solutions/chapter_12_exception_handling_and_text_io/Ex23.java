package org.mrdrprof.solutions.chapter_12_exception_handling_and_text_io;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * **12.23 (Process scores in a text file on the Web) Suppose the text file on the Web
 * http://liveexample.pearsoncmg.com/data/Scores.txt contains an unspecified
 * number of scores separated by spaces. Write a program that reads the scores
 * from the file and displays their total and average.
 *
 * @author Alex Golub
 * @since 10/06/2023 6:11 PM
 */
class Ex23 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://liveexample.pearsoncmg.com/data/Scores.txt");
        try (Scanner urlReader = new Scanner(url.openStream())) {
            int n = 0;
            double total = 0;
            while (urlReader.hasNextInt()) {
                total += urlReader.nextInt();
                n++;
            }
            System.out.println("Total: " + total);
            System.out.println("Average: " + total / n);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
