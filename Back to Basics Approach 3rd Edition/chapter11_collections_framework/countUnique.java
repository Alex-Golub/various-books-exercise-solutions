package chapter11_collections_framework;

import java.util.HashSet;
import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp5/chapter11/e6-countUnique
 *
 * @author Alex Golub
 * @since 30-Apr-21, 8:45 PM
 */
class countUnique {
  public static int countUnique(List<Integer> list) {
    return new HashSet<>(list).size();
  }
}
