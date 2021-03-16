package CodeStepByStep_java.arrays.multi_dimensional_arrays;

/**
 * Write a method named unflatten that accepts three parameters:
 * a 1-D array of integers, and a number of rows and columns.
 * Your method should convert the 1-D array into a 2-D array with
 * the given number of rows and columns, where values are transferred
 * in row-major order into the two-dimensional array.
 *
 * 1. If the array's contents do not fit exactly into a 2-D array of the
 * given dimensions, your method should throw an IllegalArgumentException.
 *
 * 2. Your code should work for an array of any size.
 *
 * 3. Your method should not modify the array that is passed in.
 *
 * @author Mr.Dr.Professor
 * @since 21-Feb-21 8:16 PM
 */
class unflatten {
  public static int[][] unflatten(int[] list, int r, int c) {
    if (r * c != list.length) {
      throw new IllegalArgumentException();
    }

    int[][] res = new int[r][c];
    for (int i = 0; i < r; i++) {
      System.arraycopy(list, c * i, res[i], 0, c);
    }

    return res;
  }
}
