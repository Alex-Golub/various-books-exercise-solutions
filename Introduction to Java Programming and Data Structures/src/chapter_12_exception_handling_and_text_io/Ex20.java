package chapter_12_exception_handling_and_text_io;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

class Ex20 {

    public static final String CRLF = System.getProperty("line.separator");

    public static void main(String[] args) throws Exception {
        // Check command line parameter usage
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_20 srcRootDirectory");
            System.exit(1);
        }

        // Check if source file exists
        File currentDir = new File(args[0]);

        if (!currentDir.exists()) {
            System.out.println("Current directory " + args[0] + " does not exist");
            System.exit(2);
        }

        if (!currentDir.isDirectory()) {
            System.out.println(args[0] + " is not a directory");
            System.exit(3);
        }

        File[] files = currentDir.listFiles();
        for (File file : files) {
            if (file.isDirectory() && file.getName().startsWith("chapter")) {
                removePackageStatementFromFilesInDirectory(file);
            }
        }
    }

    private static void removePackageStatementFromFilesInDirectory(File directory) throws Exception {
        File[] files = directory.listFiles();

        for (File file : files)
            if (file.isFile() && file.getName().endsWith(".java")) {
                removePackageStatement(file);
            }
    }

    private static void removePackageStatement(File file) throws Exception {
        StringBuilder sb = new StringBuilder();

        try (Scanner input = new Scanner(file)) {
            // Read the first line from the file
            String firstLine = input.nextLine();
            if (!firstLine.startsWith("package"))
                sb.append(firstLine + CRLF);

            while (input.hasNext()) {
                sb.append(input.nextLine() + CRLF);
            }
        }

        try ( // Write back to the file
              PrintWriter output = new PrintWriter(file);
        ) {
            output.printf("%s", sb);
        }
    }
}
