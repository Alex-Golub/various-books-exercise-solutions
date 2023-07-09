package org.mrdrprof.solutions.chapter_12_exception_handling_and_text_io;

import java.io.File;
import java.util.Scanner;

class ReadData {
    public static void main(String[] args) throws Exception {
        File file = new java.io.File("scores.txt");
        Scanner fileScanner = new Scanner(file);

        // Read data from a file
        while (fileScanner.hasNext()) {
            String firstName = fileScanner.next();
            String mi = fileScanner.next();
            String lastName = fileScanner.next();
            int score = fileScanner.nextInt();
            System.out.printf("%s %s %s %d%n", firstName, mi, lastName, score);
        }

        // Close the file
        fileScanner.close();
    }
}
