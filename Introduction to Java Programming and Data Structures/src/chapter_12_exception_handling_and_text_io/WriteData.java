package chapter_12_exception_handling_and_text_io;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

class WriteData {
    public static void main(String[] args) throws IOException {
        String workingDirectory = System.getProperty("user.dir");
        String currentDirectory = "src/chapter_12_exception_handling_and_text_io";

        File file = new File("%s/%s".formatted(workingDirectory, currentDirectory),
                             "scores.txt");
//        if (file.exists()) {
//            System.out.println("File already exists");
//            System.exit(0);
//        }

        // Create a file, write to in and close resource i.e. file
        try (PrintWriter printWriter = new PrintWriter(file)) {
            // Write formatted output to the file
            printWriter.print("John T Smith ");
            printWriter.println(ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE));
            printWriter.print("Eric K Jones ");
            printWriter.println(Arrays.toString(ThreadLocalRandom.current().doubles(5).toArray()));
            printWriter.write("My Name is Slim");
        }

//        file.deleteOnExit();
    }
}
