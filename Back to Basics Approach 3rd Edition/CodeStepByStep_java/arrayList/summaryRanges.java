package CodeStepByStep_java.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/arraylist/summaryRanges
 *
 * @author Alex Golub
 * @since 25-Apr-21, 12:28 AM
 */
class summaryRanges {
  public static void main(String[] args) {
//    List<Integer> list = List.of(0, 1, 2, 4, 5, 7);
    List<Integer> list = List.of();
    ArrayList<String> ranges = summaryRanges(list);
    System.out.println(ranges);
  }
  
  public static ArrayList<String> summaryRanges(List<Integer> list) {
    ArrayList<String> ranges = new ArrayList<>();
    
    for (int i = 0; i < list.size(); ) {
      int j = i + 1;
      while (j < list.size() && list.get(j) - list.get(j - 1) == 1) {
        j++;
      }
      
      if (list.get(i).equals(list.get(j - 1))) {
        ranges.add(list.get(i).toString());
      } else {
        ranges.add(list.get(i) + "->" + list.get(j - 1));
      }
      
      i = j;
    }
    
    return ranges;
  }
}
