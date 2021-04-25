package CodeStepByStep_java.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/arraylist/insertInterval
 *
 * TODO: https://leetcode.com/problems/insert-interval/
 *
 * @author Alex Golub
 * @since 24-Apr-21, 8:04 PM
 */
class insertInterval {
  public ArrayList<ArrayList<Integer>> insertInterval(ArrayList<ArrayList<Integer>> intervals,
                                                      ArrayList<Integer> newInterval) {
    ArrayList<ArrayList<Integer>> returnValue = new ArrayList<>();
    int i = 0;
    int left = newInterval.get(0);
    int right = newInterval.get(1);
    
    for (; i < intervals.size(); i++) {
      int min = intervals.get(i).get(0);
      int max = intervals.get(i).get(1);
      
      if (left >= min && left <= max) {
        for (int j = i + 1; j < intervals.size(); j++) {
          if (right >= intervals.get(j).get(0) && right <= intervals.get(j).get(1)) {
            returnValue.add(new ArrayList<>(Arrays.asList(min, intervals.get(j).get(1))));
            i = j;
            break;
          }
        }
      } else {
        returnValue.add(intervals.get(i));
      }
    }
    
    System.out.println(returnValue);
    return returnValue;
  }
}

// [[1, 2], [3, 5], [6, 7], [8, 10], [12, 16]]
// [4, 8]
// [[1, 2], [3, 10], [12, 16]]
