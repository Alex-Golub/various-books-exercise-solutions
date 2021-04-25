package CodeStepByStep_java.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/arraylist/isKeithNumber
 *
 * A "Keith number" is defined as any n-digit integer that appears in the
 * sequence that starts off with the number's n digits and then continues
 * such that each subsequent number is the sum of the preceding n.
 *
 * All one-digit numbers are trivially Keith numbers.
 *
 * You may use a single ArrayList or LinkedList as auxiliary storage.
 *
 * @author Alex Golub
 * @since 23-Apr-21, 8:43 PM
 */
class isKeithNumber {
  public static void main(String[] args) {
    System.out.println(isKeithNumber(0));
    System.out.println(isKeithNumber(5));
    System.out.println(isKeithNumber(7385));
  }
  
  public static boolean isKeithNumber(int n) {
    int possibleKeithNumber = n;
    List<Integer> list = decompose(n);
  
    n = list.size(); // n consists of this number of digits
    
    for (int j = 0; list.get(list.size() - 1) < possibleKeithNumber; j++) {
      int sum = 0;
      for (int i = j; i < n + j ; i++) {
        sum += list.get(i);
      }
      
      list.add(sum);
    }
  
    return list.get(list.size() - 1) == possibleKeithNumber;
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
