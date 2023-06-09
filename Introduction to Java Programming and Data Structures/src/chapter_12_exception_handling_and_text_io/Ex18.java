package chapter_12_exception_handling_and_text_io;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.List;
import java.util.Objects;

/**
 * **12.18 (Add package statement) Suppose you have Java source files under the directories chapter1, chapter2, . . . , chapter34. Write a program to insert the
 * statement package chapteri; as the first line for each Java source file under
 * the directory chapteri. Suppose chapter1, chapter2, . . . , chapter34
 * are under the root directory srcRootDirectory. The root directory and
 * chapteri directory may contain other folders and files. Use the following
 * command to run the program:
 * java Exercise12_18 srcRootDirectory
 *
 * @author Alex Golub
 * @since 10/06/2023 3:30 PM
 */
class Ex18 {

    private static final String PACKAGE_DECLARATION = "package %s.%s.%s;\r\n";
    private static final String FILE_TYPE = ".txt";

    public static void main(String[] args) throws IOException {
        // Check command line parameter usage
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_18 srcRootDirectory");
            System.exit(1);
        }

        // Check if source file exists
        File currentDir = new File(args[0]);

        if (!currentDir.exists()) {
            System.out.printf("Current directory %s does not exist%n", args[0]);
            System.exit(2);
        }

        if (!currentDir.isDirectory()) {
            System.out.printf("%s is not a directory%n", args[0]);
            System.exit(3);
        }

        File[] files = currentDir.listFiles();
        for (File file : files) {
            if (file.isDirectory() && file.getName().startsWith("chapter")) {
                String packageName = file.getName();
                addPackageDeclaration(file, packageName, currentDir);
            }
        }
    }

    private static void addPackageDeclaration(File directory, String packageName, File currentDir) throws IOException {
        String outerPackageName = new File(System.getProperty("user.dir")).getName();
        for (File file : Objects.requireNonNull(directory.listFiles())) {
            if (file.isFile() && file.getName().endsWith(FILE_TYPE)) {
                List<String> fileContents = Files.readAllLines(file.toPath());
                if (fileContents.get(0).startsWith("package")) {
                    System.out.println(file.getName() + " already contains a package declaration");
                    return;
                }
                
                fileContents.add(0, PACKAGE_DECLARATION.formatted(outerPackageName, currentDir, packageName));
                
                try (PrintWriter printWriter = new PrintWriter(file)) {
                    printWriter.write(String.join("\r\n", fileContents));
                }
            }
        }
    }
}

// package chapter_12_exception_handling_and_text_io.src_root_directory.chapter{{i}};
