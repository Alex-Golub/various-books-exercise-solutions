package chapter11_collections_framework;

import java.util.HashSet;
import java.util.Map;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp4/chapter11/e13-isUnique
 *
 * @author Alex Golub
 * @since 30-Apr-21, 11:23 PM
 */
class isUnique {
  public static boolean isUnique(Map<String, String> map) {
    return map.values().size() == new HashSet<>(map.values()).size();
  }
}
