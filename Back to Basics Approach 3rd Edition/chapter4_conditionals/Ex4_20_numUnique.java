package chapter4_conditionals;

/**
 * 20. Write a method called numUnique that takes three integers as
 * parameters and returns the number of unique integers
 * among the three. For example, the call numUnique(18, 3, 4)
 * should return 3 because the parameters have three
 * different values. By contrast, the call numUnique(6, 7, 6)
 * should return 2 because there are only two unique
 * numbers among the three parameters: 6 and 7.
 *
 * @author Mr.Dr.Professor
 * @since 10-Dec-20 9:50 PM
 */
class Ex4_20_numUnique {
  public static int numUnique(int a, int b, int c) {
    int res = 3;
    if (a == b || a == c)
      res--;
    if (b == c)
      res--;
    return res;
  }
}
