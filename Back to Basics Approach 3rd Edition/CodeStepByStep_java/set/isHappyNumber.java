package CodeStepByStep.java.set;

import java.util.HashSet;
import java.util.Set;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/set/isHappyNumber
 * <p>
 * An integer is "happy" if repeatedly summing the squares of its digits
 * eventually leads to the number 1.
 *
 * @author Alex Golub
 * @since 01-May-21, 11:43 AM
 */
class isHappyNumber {
  public static void main(String[] args) {
    System.out.println(isHappyNumber(139));
    System.out.println(isHappyNumber(4));
  }
  
  public static boolean isHappyNumber(int n) {
    Set<Integer> memory = new HashSet<>();
    int nextNumber = n;

    while (true) {
      int newSum = squareDigitSum(nextNumber);
      if (memory.contains(newSum)) {
        return false;
      } else if (newSum == 1) {
        return true;
      }

      memory.add(newSum);
      nextNumber = newSum;
    }
  }
  
//  public static boolean isHappyNumber(int n) {
//    int slow = n, fast = n;
//    do {
//      slow = squareDigitSum(slow);
//      fast = squareDigitSum(squareDigitSum(fast));
//    } while (slow != fast);
//
//    return slow == 1;
//  }
  
  private static int squareDigitSum(int n) {
    int squareSum = 0;
    while (n != 0) {
      squareSum += (n % 10) * (n % 10);
      n /= 10;
    }
    
    return squareSum;
  }
}
