package org.mrdrprof.solutions.chapter_12_exception_handling_and_text_io;

import java.io.File;

/**
 * **12.29 (Rename files) Suppose you have several files in a directory named Exercisei_j, where i and j are digits. Write a program that pads a 0 before j if j is a single digit. For example, a file named Exercise2_1 in a directory will be renamed
 * to Exercise2_01. In Java, when you pass the symbol * from the command line,
 * it refers to all files in the directory (see Supplement III.V). Use the following
 * command to run your program:
 * java Exercise12_29 *
 *
 * @author Alex Golub
 * @since 11/06/2023 6:46 PM
 */
class Ex29 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Invalid Arguments.");
            System.out.println("Usage: java Chapter_12.Exercise_28");
            System.exit(1);
        }

        for (String s : args) {

            if (s.matches("Exercise[\\d]_[\\d].*")) {
                StringBuilder sb = new StringBuilder(s);
                sb.insert(s.indexOf('_') + 1, "0");
                new File(s).renameTo(new File(sb.toString()));
            }
        }
    }
}
