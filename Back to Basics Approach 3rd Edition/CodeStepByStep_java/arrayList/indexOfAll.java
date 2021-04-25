package CodeStepByStep_java.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/arraylist/indexOfAll
 *
 * @author Alex Golub
 * @since 24-Apr-21, 12:33 AM
 */
class indexOfAll {
  public static void main(String[] args) {
    List<Integer> a1 = List.of(1, 6, 1, 2, 1, 4, 1, 2, 1, 2, 1, 8);
    List<Integer> a2 = List.of(1, 2, 1);
    System.out.println(indexOfAll(a1, a2));
    System.out.println(indexOfAll(a1, a1));
  }
  
  public static ArrayList<Integer> indexOfAll(List<Integer> a1, List<Integer> a2) {
    ArrayList<Integer> indexList = new ArrayList<>();
    for (int i = 0; i <= a1.size() - a2.size(); i++) {
      int count = 0;
      
      for (int j = 0; j < a2.size(); j++) {
        if (!a1.get(i + j).equals(a2.get(j))) {
          break;
        }
        
        count++;
      }
      
      if (count == a2.size()) {
        indexList.add(i);
      }
    }
    
    return indexList;
  }
}
