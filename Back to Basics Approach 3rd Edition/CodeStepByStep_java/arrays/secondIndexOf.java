package CodeStepByStep_java.arrays;

/**
 * Write a method named secondIndexOf that returns the index
 * of the second occurrence of a particular value in an array
 * of integers.
 *
 * 1. If the value does not appear in the array at least twice,
 * you should return -1.
 *
 * @author Mr.Dr.Professor
 * @since 14-Feb-21 11:20 PM
 */
class secondIndexOf {
  public static int secondIndexOf(int[] list, int value) {
    int occurrences = 0;

    for (int i = 0; i < list.length; i++) {
      if (list[i] == value) {
        occurrences++;

        if (occurrences == 2)
          return i;
      }

    }

    return -1;
  }
}
