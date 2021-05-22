package chapter12_recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp3/chapter12/e21-maxSum
 *
 * @author Alex Golub
 * @since 08-May-21, 4:25 PM
 */
class maxSum {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(7, 30, 8, 22, 6, 1, 14));
    System.out.println(maxSum(list, 19));
  }
  
  public static int maxSum(List<Integer> list, int limit) {
    return maxSum(list, 0, limit, list.size());
  }
  
  private static int maxSum(List<Integer> list, int i, int limit, int size) {
    if (limit <= 0 || size == 0) {
      return 0;
    }
    
    int with = list.get(i) + maxSum(list, i + 1, limit - list.get(i), size - 1);
    int without = maxSum(list, i + 1, limit, size - 1);
    
    return with <= limit && limit - with < limit - without ? with : without;
  }
}
