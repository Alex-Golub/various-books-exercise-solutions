package chapter5_logic_and_loops;

/**
 * 25 Write a method called charsSorted that accepts a String as
 * its parameter and returns true if the characters in the string
 * appear in sorted alphabetical order.
 *
 * @author Mr.Dr.Professor
 * @since 24-Dec-20 12:10 AM
 */
class Ex5_25_charsSorted {
  public static boolean charsSorted(String str) {
    for (int i = 0; i < str.length() - 1; i++)
      if (str.charAt(i) > str.charAt(i + 1))
        return false;

    return true;
  }
}
