package CodeStepByStep_java.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/arraylist/intersect
 *
 * @author Alex Golub
 * @since 24-Apr-21, 9:16 PM
 */
class intersect {
  public ArrayList<Integer> intersect(List<Integer> list1,List<Integer> list2) {
    ArrayList<Integer> intersect = new ArrayList<>();
    int i = 0, j = 0;
    while (i < list1.size() && j < list2.size()) {
      Integer a = list1.get(i);
      Integer b = list2.get(j);
      
      if (a > b) {
        j++;
      } else if (a < b) {
        i++;
      } else {
        intersect.add(a);
        i++;
        j++;
      }
    }
    
    return intersect;
  }
}
