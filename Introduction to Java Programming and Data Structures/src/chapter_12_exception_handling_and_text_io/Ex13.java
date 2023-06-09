package chapter_12_exception_handling_and_text_io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * *12.13 (Count characters, words, and lines in a file) Write a program that will count
 * the number of characters, words, and lines in a file. Words are separated by
 * whitespace characters. The file name should be passed as a command-line
 * argument, as shown in Figure 12.13.
 *
 * @author Alex Golub
 * @since 09/06/2023 3:02 PM
 */
class Ex13 {
    public static void main(String[] args) {
        File inputFile = new File(args[0]);
        try (Scanner reader = new Scanner(inputFile)) {
            int characters = 0;
            int words = 0;
            int lines = 0;
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                characters += line.length();
                words += line.split("\\p{javaWhitespace}").length;
                lines++;
            }
            
            System.out.println("File " + inputFile.getName());
            System.out.println(characters + " characters");
            System.out.println(words + " words");
            System.out.println(lines + " lines");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
