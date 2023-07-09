package org.mrdrprof.solutions.chapter_12_exception_handling_and_text_io;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class WebCrawler {

    public static final int URL_PROCESSED = 100;

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a URL: ");
            String url = input.nextLine();
            crawler(url); // Traverse the Web from the a starting url
        }
    }

    public static void crawler(String startingURL) {
        List<String> listOfPendingURLs = new ArrayList<>();
        List<String> listOfTraversedURLs = new ArrayList<>();

        listOfPendingURLs.add(startingURL);
        while (!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() <= URL_PROCESSED) {
            String urlString = listOfPendingURLs.remove(0);
            listOfTraversedURLs.add(urlString);
            System.out.println("Crawl " + urlString);

            for (String s : getSubURLs(urlString)) {
                if (!listOfTraversedURLs.contains(s) && !listOfPendingURLs.contains(s))
                    listOfPendingURLs.add(s);
            }
        }
    }

    public static List<String> getSubURLs(String urlString) {
        List<String> list = new ArrayList<>();

        try {
            URL url = new URL(urlString);
            try (Scanner input = new Scanner(url.openStream())) {
                int current = 0;
                while (input.hasNext()) {
                    String line = input.nextLine();
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
