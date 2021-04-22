package cse_143.cs2_sections.section01_arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs2/sections/arraylist/minToFront
 *
 * @author Alex Golub
 * @since 19-Apr-21 8:27 PM
 */
class minToFront {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(List.of(3, 8, 92, 4, 2, 17, 9));
    minToFront(list);
    System.out.println(list);
  }
  
  // pre: list.size() > 0
  public static void minToFront(List<Integer> list) {
    int minIndex = 0;
    for (int i = 1; i < list.size(); i++) {
      if (list.get(i) < list.get(minIndex)) {
        minIndex = i;
      }
    }
    
    List<Integer> temp = new ArrayList<>(list.size());
    temp.add(list.get(minIndex));
    temp.addAll(1, list.subList(0, minIndex));
    temp.addAll(minIndex + 1, list.subList(minIndex + 1, list.size()));
    
    list.clear();
    list.addAll(temp);
  }
}
