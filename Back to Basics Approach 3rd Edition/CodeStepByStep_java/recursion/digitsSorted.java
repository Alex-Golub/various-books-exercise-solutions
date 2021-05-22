package CodeStepByStep.java.recursion;

/**
 * https://www.codestepbystep.com/problem/view/java/recursion/digitsSorted
 *
 * Digits must be sorted in non-decreasing order
 * (i.e. increasing order with duplicate digits allowed)
 *
 * @author Alex Golub
 * @since 09-May-21, 2:07 PM
 */
class digitsSorted {
  public static void main(String[] args) {
    System.out.println(digitsSorted(0) == true);
    System.out.println(digitsSorted(2345) == true);
    System.out.println(digitsSorted(-2345) == true);
    System.out.println(digitsSorted(22334455) == true);
    System.out.println(digitsSorted(-5) == true);
    System.out.println(digitsSorted(4321) == false);
    System.out.println(digitsSorted(24378) == false);
    System.out.println(digitsSorted(21) == false);
    System.out.println(digitsSorted(-33331) == false);
  }
  
  public static boolean digitsSorted(int n) {
    if (n < 0) {
      return digitsSorted(-n);
    }
    
    if (n < 10) { // single digit number is sorted by definition
      return true;
    }
    
    int last = n % 10;
    int secLast = n / 10 % 10;
    return last >= secLast && digitsSorted(n / 10);
  }
}

/*
f(2345) -> 5 >= 4 && f(234)
  f(234) -> 4 >= 3 && f(23)
    f(23) -> 3 >= 2 && f(2)
      f(2) -> true
    f(23) -> true && true = true
  f(234) -> true && true = true
f(2345) -> true &7 true = true
*/
