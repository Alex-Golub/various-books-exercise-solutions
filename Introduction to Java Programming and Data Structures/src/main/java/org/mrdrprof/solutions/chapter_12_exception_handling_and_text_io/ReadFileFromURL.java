package org.mrdrprof.solutions.chapter_12_exception_handling_and_text_io;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

class ReadFileFromURL {
    public static void main(String[] args) {
        System.out.print("Enter a URL: ");
        String URLString = new Scanner(System.in).next();

        try {
            URL url = new URL(URLString);
            int count = 0;
            try (Scanner input = new Scanner(url.openStream())) {
                while (input.hasNext()) {
                    String line = input.nextLine();
                    System.out.println(line);
                    count += line.length();
                }
            }
            System.out.println("The file size is " + count + " characters");
        } catch (MalformedURLException ex) {
            System.out.println("Invalid URL");
        } catch (IOException ex) {
            System.out.println("IO Errors");
        }
    }
}   
