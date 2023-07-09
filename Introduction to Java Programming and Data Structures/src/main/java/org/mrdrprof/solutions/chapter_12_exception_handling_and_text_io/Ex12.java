package org.mrdrprof.solutions.chapter_12_exception_handling_and_text_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * **12.12 (Reformat Java source code) Write a program that converts the Java source
 * code from the next-line brace style to the end-of-line brace style. For example,
 * the following Java source in (a) uses the next-line brace style. Your program
 * converts it to the end-of-line brace style in (b).
 * <p>
 * (a) Next-line brace style
 * <pre>
 * class Test
 * {
 *     public static void main(String[] args)
 *     {
 *         // Some statements
 *     }
 * }
 * </pre>
 * (b) End-of-line brace style
 * <pre>
 * class Test {
 *     public static void main(String[] args) {
 *         // Some statements
 *     }
 * }
 * </pre>
 * <p>
 * Your program can be invoked from the command line with the Java source-code
 * file as the argument. It converts the Java source code to a new format.
 * For example, the following command converts the Java source-code file Test.java to
 * the end-of-line brace style.
 * <p>
 * java Exercise12_12 Test.java
 *
 * @author Alex Golub
 * @since 09/06/2023 1:46 PM
 */
class Ex12 {
    public static void main(String[] args) throws FileNotFoundException {
        File sourceFile = new File(args[0]);
        List<String> lines;
        try (Scanner fileReader = new Scanner(sourceFile)) {
            lines = new ArrayList<>();
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine().stripTrailing();
                if (line.stripLeading().equals("{")) {
                    lines.set(lines.size() - 1, lines.get(lines.size() - 1) + " {");
                } else {
                    lines.add(line);
                }
            }
        }

        try (PrintWriter printWriter = new PrintWriter("test_target.txt")) {
            lines.forEach(printWriter::println);
        }
    }
}
