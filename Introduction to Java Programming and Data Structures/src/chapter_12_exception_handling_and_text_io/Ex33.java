package chapter_12_exception_handling_and_text_io;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * **12.33 (Search Web) Modify Listing 12.18 WebCrawler.java to search for the word
 * (e.g., Computer Programming) starting from a URL (e.g., http://cs.armstrong.edu/liang).
 * Your program prompts the user to enter the word and the starting
 * URL and terminates once the word is found. Display the URL for the page that
 * contains the word
 *
 * @author Alex Golub
 * @since 11/06/2023 8:16 PM
 */
class Ex33 {

    public static void main(String[] args) {
        crawler("http://cs.armstrong.edu/liang"); // Traverse the Web from the a starting url
    }

    public static void crawler(String startingURL) {
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();

        listOfPendingURLs.add(startingURL);
        while (!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() <= 100) {
            String urlString = listOfPendingURLs.remove(0);
            if (!listOfTraversedURLs.contains(urlString)) {
                listOfTraversedURLs.add(urlString);
                System.out.println("Craw " + urlString);

                for (String s : getSubURLs(urlString)) {
                    if (!listOfTraversedURLs.contains(s))
                        listOfPendingURLs.add(s);
                }
            }
        }
    }

    public static List<String> getSubURLs(String urlString) {
        List<String> list = new ArrayList<>();

        try {
            java.net.URL url = new java.net.URL(urlString);
            try (Scanner input = new Scanner(url.openStream())) {
                int current = 0;
                while (input.hasNext()) {
                    String line = input.nextLine();
                    if (line.contains("Computer Programming")) {
                        System.out.println("Found the word \"Computer Programming\".");
                        System.out.println("URL: " + url);
                        System.exit(1);
                    }
                    current = line.indexOf("http:", current);
                    while (current > 0) {
                        int endIndex = line.indexOf("\"", current);
                        if (endIndex > 0) { // Ensure that a correct URL is found
                            list.add(line.substring(current, endIndex));
                            current = line.indexOf("http:", endIndex);
                        } else
                            current = -1;
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return list;
    }
}
