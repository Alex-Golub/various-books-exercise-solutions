package CodeStepByStep.java.map;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/map/wordChain
 *
 * (1) For this problem let's define a "word chain" as a sequence of words where
 * the last two letters of the current word will be the first two letters of the next word.
 * (2) The words you use in your word chain come from the given input file.
 * sequence of words, one per line, in lowercase, and that each word in the
 * dictionary is at least 2 letters long.
 * (3) you should randomly choose a next word whose first two letters are
 * the same as the last two letters of the current word.
 * (4) A word chain might have a duplicate in it; this is okay.
 * (5) A word chain ends when you reach a two-letter word suffix that
 * is not the start of any word in the dictionary.
 * (6) print the word chain to the console, one word per line.
 *
 * @author Alex Golub
 * @since 02-May-21, 10:33 AM
 */
class wordChain {
  public static void main(String[] args) throws FileNotFoundException {
    wordChain("dic.txt", "computer");
  }
  
  public static void wordChain(String fn, String startingWord)
    throws FileNotFoundException {
    File file = new File(fn);
    if (!file.exists() || !file.canRead() || startingWord == null || startingWord.length() < 2) {
      throw new IllegalArgumentException();
    }
    
    Map<String, List<String>> dictionary = buildDictionary(file);
    
    System.out.println(startingWord);
    String lastTwoChars = startingWord.substring(startingWord.length() - 2);
    List<String> wordsLeft = dictionary.getOrDefault(lastTwoChars, Collections.emptyList());
    
    while (wordsLeft.size() > 0) { // words left that start with that suffix
      String lastWord = wordsLeft.remove(wordsLeft.size() - 1); // pop last element
      System.out.println(lastWord);
      lastTwoChars = lastWord.substring(lastWord.length() - 2);
      wordsLeft = dictionary.getOrDefault(lastTwoChars, Collections.emptyList());
    }

//    for(var e : dictionary.entrySet()) {
//      System.out.println(e.getKey() + " : " + e.getValue());
//    }
  }
  
  private static Map<String, List<String>> buildDictionary(File file)
    throws FileNotFoundException {
    Map<String, List<String>> dictionary = new HashMap<>(); // (3)
    
    Scanner scanner = new Scanner(file);
    while (scanner.hasNext()) {
      String word = scanner.next();
      String pair = word.substring(0, 2);
      
      dictionary.compute(pair, (k, v) -> {
        if (v == null) {
          v = new ArrayList<>(); // this pair is first time seen
        }
        
        v.add(word);
        return v;
      });
    }
    
    // shuffle every list of words
    for (List<String> list : dictionary.values()) {
      Collections.shuffle(list);
    }
    
    return dictionary;
  }
}
