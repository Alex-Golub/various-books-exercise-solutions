package chapter11_collections_framework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Uses maps to implement a word count, so that the user
 * can see which words occur the most in the book Moby Dick.
 */
class WordCount {
  // minimum number of occurrences needed to be printed
  public static final int OCCURRENCES = 2000;
  
  public static void main(String[] args) throws FileNotFoundException {
    System.out.println("This program displays the most");
    System.out.println("frequently occurring words from");
    System.out.println("the book Moby Dick.");
    System.out.println();
    
    // read the book into a map
    Scanner in = new Scanner(new File("moby.txt"));
    Map<String, Integer> wordCountMap = getCountMap(in);
    
    for (String word : wordCountMap.keySet()) {
      int count = wordCountMap.get(word);
      if (count > OCCURRENCES) {
        System.out.println("\"" + word + "\" occurs " + count + " times.");
      }
    }
    
    System.out.println();
    
    Map<Integer, String> occurrenceWord = new TreeMap<>(Comparator.reverseOrder());
    for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
      occurrenceWord.put(entry.getValue(), entry.getKey());
    }
    
    for (Map.Entry<Integer, String> entry : occurrenceWord.entrySet()) {
      if (entry.getKey() > OCCURRENCES) {
        System.out.println("\"" + entry.getValue() + "\" occurs " + entry.getKey() + " times");
      }
    }
  }
  
  // Reads book text and returns a map from words to counts
  public static Map<String, Integer> getCountMap(Scanner in) {
    Map<String, Integer> wordCountMap = new TreeMap<>();
    
    while (in.hasNext()) {
      String word = in.next().toLowerCase();
      if (!wordCountMap.containsKey(word)) {
        // never seen this word before
        wordCountMap.put(word, 1);
      } else {
        // seen this word before; increment count
        int count = wordCountMap.get(word);
        wordCountMap.put(word, count + 1);
      }
    }
    
    return wordCountMap;
  }
}
