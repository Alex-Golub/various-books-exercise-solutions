package chapter_12_exception_handling_and_text_io;

import java.io.File;
import java.util.Objects;

/**
 * **12.27 (Replace words) Suppose you have a lot of files in a directory that contain
 * words Exercisei_j, where i and j are digits. Write a program that pads a 0
 * before i if i is a single digit and 0 before j if j is a single digit. For example, the
 * word Exercise2_1 in a file will be replaced by Exercise02_01. In Java, when
 * you pass the symbol * from the command line, it refers to all files in the directory (see Supplement III.V). Use the following command to run your program:
 * java Exercise12_27 *
 *
 * @author Alex Golub
 * @since 11/06/2023 2:48 PM
 */
class Ex27 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Or: java Ex27 *");
            System.exit(1);
        }

        String rootDirectory = System.getProperty("user.dir");
        String targetDirectory = "src/chapter_12_exception_handling_and_text_io/ex27_files";

        if ("*".equals(args[0])) {
            File directory = new File("%s/%s".formatted(rootDirectory, targetDirectory));
            for (File file : Objects.requireNonNull(directory.listFiles())) {
                String regex = "Exe\\d_\\d.*";
                String fileName = file.getName();
                if (fileName.matches(regex)) {
                    StringBuilder stringBuilder = new StringBuilder(fileName);
                    stringBuilder.insert(stringBuilder.indexOf("_") - 1, "0");
                    stringBuilder.insert(stringBuilder.indexOf("_") + 1, "0");
                    if (file.renameTo(new File(directory + System.getProperty("file.separator") + stringBuilder))) {
                    }
                }
            }
        }
    }
}
