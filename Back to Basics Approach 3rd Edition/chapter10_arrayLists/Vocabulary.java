package chapter10_arrayLists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
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

    List<String> list1 = getWords(input1);
    List<String> list2 = getWords(input2);
    List<String> overlap = getOverlap(list1, list2);

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
  public static void reportResults(List<String> list1, List<String> list2, List<String> overlap) {
    System.out.println("file #1 words = " + list1.size());
    System.out.println("file #2 words = " + list2.size());
    System.out.println("common words  = " + overlap.size());

    double perc = 100.0 * overlap.size();
    System.out.println("% of file 1 in overlap = " + perc / list1.size());
    System.out.println("% of file 2 in overlap = " + perc / list2.size());
  }

  /**
   * pre: list1 and list2 are sorted and contain no duplicates
   * post: constructs and returns an ArrayList containing the words
   * in common betweeen list1 and list2
   */
  private static List<String> getOverlap(List<String> list1, List<String> list2) {
    List<String> overlap = new ArrayList<>();
    int i = 0, j = 0;

    while (i < list1.size() && j < list2.size()) {
      int compare = list1.get(i).compareTo(list2.get(j));

      if (compare == 0) { // same word in both
        overlap.add(list1.get(i));
        i++;
        j++;
      } else if (compare < 0) { // skip word in list1
        i++;
      } else { // skip word in list2
        j++;
      }
    }

    return overlap;
  }

  /**
   * post: reads all words from the given Scanner, turning them to lowercase
   * and returning a sorted list of the vocabulary of the file
   */
  private static List<String> getWords(Scanner input) {
    input.useDelimiter("[^a-zA-Z']+"); // consider only letters and apostrophe

    List<String> list = new ArrayList<>();
    while (input.hasNext()) {
      list.add(input.next().toLowerCase()); // don’t care about capitalization
    }
    Collections.sort(list); // duplicates of any words will be grouped together

    // remove duplicate words
    List<String> noDup = new ArrayList<>();
    if (list.size() > 0) {
      noDup.add(list.get(0));

      for (String word : list) {
        if (!word.equals(noDup.get(noDup.size() - 1))) {
          noDup.add(word);
        }
      }
    }

    return noDup;
  }
}
