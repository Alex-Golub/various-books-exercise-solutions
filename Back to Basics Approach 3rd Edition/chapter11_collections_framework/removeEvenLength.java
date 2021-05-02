package chapter11_collections_framework;

import java.util.Set;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp5/chapter11/e10-removeEvenLength
 *
 * @author Alex Golub
 * @since 30-Apr-21, 9:37 PM
 */
class removeEvenLength {
  // removes all of the strings of even length from the set.
  public static void removeEvenLength(Set<String> set) {
    set.removeIf(s -> s.length() % 2 == 0);
  }
}
