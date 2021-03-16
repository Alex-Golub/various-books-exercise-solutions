package CodeStepByStep_java.arrays;

/**
 * Write a method named sorted that accepts an array of
 * doubles as a parameter and returns true if the list
 * is in sorted order and false if not.
 *
 * 1. You may assume the array has at least one element.
 * 2. A one-element array is considered to be sorted.
 * 3. Do not modify the array passed in.
 *
 * @author Mr.Dr.Professor
 * @since 14-Feb-21 11:24 PM
 */
class sorted {

  public static boolean sorted(double[] list) {
    for (int i = 1; i < list.length; i++) {
      if (list[i - 1] > list[i])
        return false;
    }

    return true;
  }
}
