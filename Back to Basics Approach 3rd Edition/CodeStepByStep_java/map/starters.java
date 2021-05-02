package CodeStepByStep.java.map;

import java.util.*;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/map/starters
 *
 * (1) Your method should examine the strings in the list passed and return a
 *     set of all first characters that occur at least k times.
 * (2) All elements of your set should be in lowercase.
 * (3) If no start character occurs k or more times, return an empty set.
 * (4) The characters should appear in your set in alphabetical order.
 *
 * @author Alex Golub
 * @since 02-May-21, 10:09 AM
 */
class starters {
  public static void main(String[] args) {
    List<String> list = List.of("hi", "how", "are", "He", "", "Marty!", "this",
                                "morning?", "fine.", "?foo!", "", "HOW", "A");
    System.out.println(starters(list, 3));
  }
  
  public static TreeSet<Character> starters(List<String> list, int k) {
    Map<Character, Integer> chars = new HashMap<>();
    for (String word : list) {
      if (!word.equals("")) { // ignore empty strings
        char c = Character.toLowerCase(word.charAt(0)); // (2)
        chars.compute(c, (character, v) -> v == null ? 1 : v + 1);
      }
    }
    
    TreeSet<Character> set = new TreeSet<>(); // (4)
    for (Map.Entry<Character, Integer> e : chars.entrySet()) {
      if (e.getValue() >= k) {
        set.add(e.getKey());
      }
    }
    
    return set;
  }
}
