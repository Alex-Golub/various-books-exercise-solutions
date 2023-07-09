package org.mrdrprof.solutions.chapter_12_exception_handling_and_text_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * *12.15 (Write/read data) Write a program to create a file named Exercise12_15.txt if
 * it does not exist. Write 100 integers created randomly into the file using text
 * I/O. Integers are separated by spaces in the file. Read the data back from the
 * file and display the data in increasing order.
 *
 * @author Alex Golub
 * @since 10/06/2023 1:40 PM
 */
class Ex15 {

    private static final int NUMBER_OF_RANDOM_INTEGERS = 100;

    public static void main(String[] args) throws IOException {
        File file = createFileIfNotExists("Exercise12_15.txt");
        int[] array = generateRandomIntegerArray();
        String collect = Arrays.stream(array)
                               .mapToObj(Integer::toString)
                               .collect(Collectors.joining(" "));

        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.write(collect);
        }

        int[] integersFromFile = readIntegersFromFile(file);
        Arrays.sort(integersFromFile);
        System.out.println("Data in increasing order: ");
        System.out.println(Arrays.toString(integersFromFile));
    }

    private static int[] readIntegersFromFile(File file) {
        int[] readFromFile = new int[NUMBER_OF_RANDOM_INTEGERS];
        try (Scanner reader = new Scanner(file)) {
            for (int i = 0; i < NUMBER_OF_RANDOM_INTEGERS; i++) {
                readFromFile[i] = reader.nextInt();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return readFromFile;
    }

    private static int[] generateRandomIntegerArray() {
        return IntStream.generate(() -> ThreadLocalRandom.current().nextInt())
                        .limit(NUMBER_OF_RANDOM_INTEGERS)
                        .toArray();
    }

    private static File createFileIfNotExists(String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.exists() && file.createNewFile()) {
            System.out.println(fileName + " created successful at " + file.getAbsolutePath());
        }

        return file;
    }
}
