package CodeStepByStep_java.arrays.multi_dimensional_arrays;

/**
 * Write a method named flatten that accepts a 2-D array of
 * integers as a parameter and that returns a 1-D array with
 * the contents of the original 2-D array "flattened" into a
 * one-dimensional array.
 *
 * 1. Your code should work for an array of any size,
 * even one with 0 rows or columns.
 *
 * 2. You may assume that the 2-D array is rectangular, that is,
 * that each row of the 2-D array contains the same number of columns.
 *
 * 3. Your method should not modify the array that is passed in.
 *
 * @author Mr.Dr.Professor
 * @since 20-Feb-21 5:46 PM
 */
class flatten {
  public static int[] flatten(int[][] mat) {
    if (mat == null || mat.length == 0)
      return new int[0];

    int[] flattened = new int[mat.length * mat[0].length];
    for (int r = 0; r < mat.length; r++) {
      for (int c = 0; c < mat[r].length; c++) {
        flattened[mat[r].length * r + c] = mat[r][c];
      }
    }

    // Or using build in array copy method
//    for (int i = 0; i < mat.length; i++) {
//      System.arraycopy(mat[i], 0, flattened, i * mat[0].length, mat[i].length);
//    }

    return flattened;
  }
}
