package org.mrdrprof.solutions.chapter_12_exception_handling_and_text_io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

class TestFileClass {
    public static void main(String[] args) {
        String currentWorkingDirectory = System.getProperty("user.dir");
        File file = new File(currentWorkingDirectory,
                             "src/chapter_12_exception_handling_and_text_io/image/us.gif");
        System.out.printf("Does it exist? %s%n", file.exists());
        System.out.printf("The file has %d bytes%n", file.length());
        System.out.printf("Can it be read? %s%n", file.canRead());
        System.out.printf("Can it be written? %s%n", file.canWrite());
        System.out.printf("Is it a directory? %s%n", file.isDirectory());
        System.out.printf("Is it a file? %s%n", file.isFile());
        System.out.printf("Is it absolute? %s%n", file.isAbsolute());
        System.out.printf("Is it hidden? %s%n", file.isHidden());
        System.out.printf("Absolute path is %s%n", file.getAbsolutePath());
        System.out.printf("Last modified on %s%n", new Date(file.lastModified()));

        File writeInto = new File(currentWorkingDirectory,
                                  "src/chapter_12_exception_handling_and_text_io/test.txt");

        try (FileOutputStream fileOutputStream = new FileOutputStream(writeInto)) {
            fileOutputStream.write("Hello, world! From %s".formatted(TestFileClass.class.getName()).getBytes());
            System.out.println("File created and written successfully");
        } catch (IOException e) {
            System.out.println("Failed to create or write to the file");
            e.printStackTrace();
        }
    }
}
