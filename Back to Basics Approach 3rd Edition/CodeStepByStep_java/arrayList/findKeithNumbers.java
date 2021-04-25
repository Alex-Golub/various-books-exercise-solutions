package CodeStepByStep_java.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/arraylist/findKeithNumbers
 *
 * @author Alex Golub
 * @since 23-Apr-21, 8:42 PM
 */
class findKeithNumbers {
  public static void main(String[] args) {
    findKeithNumbers(47, 9999999);
  }
  
  public static void findKeithNumbers(int min, int max) {
    for (int i = min; i <= max; i++) {
      List<Integer> list = isKeithNumber(i);
      if (list != null) {
        System.out.println(i + ": " + list);
      }
    }
  }
  
  public static List<Integer> isKeithNumber(int n) {
    int possibleKeithNumber = n;
    List<Integer> list = decompose(n);
    
    n = list.size(); // n consists of this number of digits
    
    for (int j = 0; list.get(list.size() - 1) < possibleKeithNumber; j++) {
      int sum = 0;
      for (int i = j; i < n + j; i++) {
        sum += list.get(i);
      }
      
      list.add(sum);
    }
    
    return list.get(list.size() - 1) == possibleKeithNumber ? list : null;
  }
  
  private static List<Integer> decompose(int n) {
    List<Integer> list = new ArrayList<>();
    if (n == 0) {
      list.add(0);
    }
    
    while (n != 0) {
      list.add(0, n % 10);
      n /= 10;
    }
    
    return list;
  }
}
