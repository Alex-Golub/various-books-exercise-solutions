package chapter13_sorting_searching;

// Searches for words in a dictionary text file
// and reports each word's position in the file.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class WordChallenge {
  public static void main(String[] args) {
    System.out.println("Welcome to Scrabble word challenge!");
    
    // read a sorted dictionary file into a List
    List<String> words = new ArrayList<>();
    try (Scanner in = new Scanner(new File("words.txt"))) {
      while (in.hasNext()) {
        words.add(in.next());
      }
    } catch (FileNotFoundException fnf) {
      System.out.println(fnf.getMessage());
      return;
    }
    
    // binary search the list for words
    Scanner console = new Scanner(System.in);
    System.out.print("Word to challenge (Enter to quit)? ");
    String target = console.nextLine();
    while (target.length() > 0) {
      int index = Collections.binarySearch(words, target);
      if (index >= 0) {
        System.out.println("\"" + target + "\" is word #"
                           + index + " of " + words.size());
      } else {
        System.out.println("\"" + target + "\" is not found");
      }
      
      System.out.print("Word to challenge (Enter to quit)? ");
      target = console.nextLine();
    }
    
  }
}
