package chapter_12_exception_handling_and_text_io;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * *12.19 (Count words) Write a program that counts the number of words in President
 * Abraham Lincoln’s Gettysburg address from https://liveexample.pearsoncmg.com/data/Lincoln.txt.
 *
 * @author Alex Golub
 * @since 10/06/2023 4:45 PM
 */
class Ex19 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://liveexample.pearsoncmg.com/data/Lincoln.txt");
        try (Scanner urlReader = new Scanner(url.openStream())) {
            urlReader.useDelimiter("[\\p{javaWhitespace}\\p{Punct}]+");
            int words = 0;
            while (urlReader.hasNext()) {
                urlReader.next();
                words++;
            }

            System.out.println(url + " contains %d words".formatted(words));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
