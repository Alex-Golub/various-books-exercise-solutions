package chapter11_collections_framework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * 20. Write a modified version of the Vocabulary program developed in
 * Chapter 10 that uses sets rather than ArrayLists to store its words.
 * (The program will be noticeably shorter and will run faster!)
 *
 * @author Alex Golub
 * @since 17-Apr-21 12:44 PM
 */
class Vocabulary {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner console = new Scanner(System.in);
    giveIntro();
    
    System.out.print("file #1 name? ");
    Scanner input1 = new Scanner(new File(console.nextLine()));
    System.out.print("file #2 name? ");
    Scanner input2 = new Scanner(new File(console.nextLine()));
    System.out.println();
    
    Set<String> list1 = getWords(input1);
    Set<String> list2 = getWords(input2);
    Set<String> overlap = getOverlap(list1, list2);
    
    reportResults(list1, list2, overlap);
  }
  
  /**
   * post: explains program to user
   */
  public static void giveIntro() {
    System.out.println("This program compares the vocabulary of two");
    System.out.println("text files, reporting the number of words");
    System.out.println("in common and the percent of overlap.");
    System.out.println();
  }
  
  /**
   * pre : overlap contains the words in common between list1 and list2
   * post: reports statistics about two word lists and their overlap
   */
  public static void reportResults(Set<String> set1, Set<String> set2, Set<String> overlap) {
    System.out.println("file #1 words = " + set1.size());
    System.out.println("file #2 words = " + set2.size());
    System.out.println("common words  = " + overlap.size());
    
    double perc = 100.0 * overlap.size();
    System.out.println("% of file 1 in overlap = " + perc / set1.size());
    System.out.println("% of file 2 in overlap = " + perc / set2.size());
  }
  
  /**
   * pre: list1 and list2 are sorted and contain no duplicates
   * post: constructs and returns an ArrayList containing the words
   * in common betweeen list1 and list2
   */
  private static Set<String> getOverlap(Set<String> set1, Set<String> set2) {
    Set<String> union = new HashSet<>(set1);
    union.addAll(set2);
    return union;
  }
  
  /**
   * post: reads all words from the given Scanner, turning them to lowercase
   * and returning a sorted list of the vocabulary of the file
   */
  private static Set<String> getWords(Scanner input) {
    input.useDelimiter("[^a-zA-Z']+"); // consider only letters and apostrophe
  
    Set<String> set = new HashSet<>();
    while (input.hasNext()) {
      set.add(input.next().toLowerCase()); // don’t care about capitalization
    }
    
    return set;
  }
}
