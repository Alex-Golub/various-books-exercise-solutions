package chapter_12_exception_handling_and_text_io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * *12.21 (Data sorted?) Write a program that reads the strings from file SortedStrings.txt
 * and reports whether the strings in the files are stored in increasing order. If the
 * strings are not sorted in the file, it displays the first two strings that are out of
 * the order.
 *
 * @author Alex Golub
 * @since 10/06/2023 5:12 PM
 */
class Ex21 {
    public static void main(String[] args) throws IOException {
        File file = new File("SortedStrings.txt");
        if (!file.exists()) {
            System.out.println(file.getAbsolutePath() + " does not exists, exiting");
            return;
        }

        try (Scanner fileReader = new Scanner(file)) {
            boolean sorted = true;
            String previousToken = "";
            String currentToken;

            while (fileReader.hasNextLine()) {
                currentToken = fileReader.nextLine();
                if (previousToken.compareTo(currentToken) > 0) {
                    sorted = false;
                    System.out.println("Strings are not sorted in increasing order.");
                    System.out.println("First two out of order strings: " + previousToken + ", " + currentToken);
                    break;
                }

                previousToken = currentToken;
            }

            if (sorted) {
                System.out.println("Strings are sorted in increasing order.");
            }
        }
    }
}
