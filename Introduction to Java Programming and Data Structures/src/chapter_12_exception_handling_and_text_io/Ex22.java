package chapter_12_exception_handling_and_text_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;

class Ex22 {

    private static final String CRLF = System.getProperty("line.separator");

    public static void main(String[] args) throws Exception {
        // Check command line parameter usage
        if (args.length != 3) {
            System.out.println("Usage: java Exercise12_22 dir oldStr newStr");
            System.exit(1);
        }

        // Check if source file exists
        File currentDir = new File(args[0]);
        System.out.println(currentDir.getName());

        if (!currentDir.exists()) {
            System.out.printf("Current directory %s does not exist%n", args[0]);
            System.exit(2);
        }

        if (currentDir.isFile()) {
            replaceInAFile(currentDir, args[1], args[2]);
        } else {
            File[] files = currentDir.listFiles();
            for (File file : Objects.requireNonNull(files)) {
                if (file.isFile()) {
                    replaceInAFile(file, args[1], args[2]);
                }
            }
        }
    }

    private static void replaceInAFile(File sourceFile, String oldStr, String newStr) {
        StringBuilder sb = new StringBuilder();

        try {
            try (Scanner input = new Scanner(sourceFile)) {
                while (input.hasNext()) {
                    String s1 = input.nextLine();
                    String s2 = s1.replaceAll(oldStr, newStr);
                    sb.append(CRLF)
                      .append(s2);
                }
            }

            try (PrintWriter output = new PrintWriter(sourceFile)) {
                output.printf("%s%s", sb, CRLF);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
