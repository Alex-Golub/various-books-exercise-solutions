package chapter10_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Alex Golub
 * @since 16-Apr-21 12:05 PM
 */
class StopWords {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Type a message to sort: ");
    String line = scanner.nextLine();
    String[] words = line.split("\\s+");
    Arrays.sort(words);
    System.out.print("Your message sorted: " + String.join(" ", words));
  }

  public static void mystery1(ArrayList<Integer> list) {
    for (int i = list.size() - 1; i > 0; i--) {
      if (list.get(i) < list.get(i - 1)) {
        int element = list.get(i);
        list.remove(i);
        list.add(0, element);
        System.out.println(list);
      }
    }
    System.out.println(list);
  }
}