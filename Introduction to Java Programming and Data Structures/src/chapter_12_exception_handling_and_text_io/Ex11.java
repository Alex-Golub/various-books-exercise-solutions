package chapter_12_exception_handling_and_text_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * **12.11 (Remove text) Write a program that removes all the occurrences of a specified
 * string from a text file. For example, invoking
 * java Exercise12_11 John filename
 * removes the string John from the specified file. Your program should get the
 * arguments from the command line.
 * <p>
 * NOTE: change working directory to various-books-exercise-solutions\Introduction to Java Programming and Data Structures\src\chapter_12_exception_handling_and_text_io
 *
 * @author Alex Golub
 * @since 09/06/2023 1:21 PM
 */
class Ex11 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length < 2) {
            throw new RuntimeException("Error: not enough arguments passed via command line");
        }

        String strToRemove = args[0];
        String fileName = args[1];
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException("Error: file " + fileName + " doesn't exists");
        }

        removeStringFromFile(strToRemove, file);
    }

    private static void removeStringFromFile(String strToRemove, File file) {
        List<String> lineToWrite = new ArrayList<>();
        try (Scanner fileReader = new Scanner(file)) {
            while (fileReader.hasNextLine()) {
                lineToWrite.add(fileReader.nextLine().replaceAll(strToRemove, ""));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try (PrintWriter printWriter = new PrintWriter(file)) {
            lineToWrite.forEach(printWriter::println);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
