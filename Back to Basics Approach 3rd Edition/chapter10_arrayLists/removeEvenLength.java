package chapter10_arrayLists;

import java.util.ArrayList;
import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp5/chapter10/e3-removeEvenLength
 *
 * Removes all of the strings of even length from the list
 *
 * @author Alex Golub
 * @since 17-Apr-21 2:32 PM
 */
class removeEvenLength {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    for (int i = 0; i < 10_000_000; i++) {
      list.add(getRandomString());
    }

    long s = System.currentTimeMillis();
    removeEvenLength(list);
    long e = System.currentTimeMillis() - s;
    System.out.println(e / 1000.0 + " sec");
  }

  private static String getRandomString() {
    StringBuilder random = new StringBuilder();
    int rand = (int) (Math.random() * 100);
    for (int i = 0; i < rand; i++) {
      random.append((char) (Math.random() * ('z' - 'a' + 1)  + 'a'));
    }
    return random.toString();
  }

  public static void removeEvenLength(List<String> list) {
    List<String> oddLength = new ArrayList<>();
    for (String s : list) {
      if (s.length() % 2 != 0) {
        oddLength.add(s);
      }
    }

    list.clear();
    list.addAll(oddLength);
  }
}
