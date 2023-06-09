package chapter_12_exception_handling_and_text_io;

import java.io.File;
import java.util.Scanner;

/**
 * **12.26 (Create a directory) Write a program that prompts the user to enter a directory
 * name and creates a directory using the File’s mkdirs method. The program
 * displays the message “Directory created successfully” if a directory is created
 * or “Directory already exists” if the directory already exists.
 *
 * @author Alex Golub
 * @since 11/06/2023 2:31 PM
 */
class Ex26 {

    private static final String TARGET_PATH = "%s/%s/%s";

    public static void main(String[] args) {
        try (Scanner console = new Scanner(System.in)) {
            System.out.print("Enter directory name to be created: ");
            String rootDirectory = System.getProperty("user.dir");
            String currentChapterDirectory = "src/chapter_12_exception_handling_and_text_io";
            String userInputTargetDirectory = console.nextLine();

            File file = new File(TARGET_PATH.formatted(rootDirectory, currentChapterDirectory, userInputTargetDirectory));
            if (file.mkdirs()) {
                System.out.println("Directory created successfully at " + file.getAbsolutePath());
            } else {
                System.out.println("Directory already exists at " + file.getAbsolutePath());
            }
        }
    }
}
