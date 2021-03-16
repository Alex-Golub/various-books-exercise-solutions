package CodeStepByStep_java.arrays.multi_dimensional_arrays;

/**
 * row 0: 4, 5, 6, 6
 * row 1: 5, 6, 7, 7
 * row 2: 6, 7, 8, 8
 *
 * Method is shifting elements one place to the left
 *
 * @author Mr.Dr.Professor
 * @since 20-Feb-21 3:43 PM
 */
class arrayMystery2D {
  public static void main(String[] args) {
    int[][] numbers = {
            {3, 4, 5, 6},
            {4, 5, 6, 7},
            {5, 6, 7, 8}
    };
    arrayMystery2D(numbers);
  }

  public static void arrayMystery2D(int[][] numbers) {
    for (int r = 0; r < numbers.length; r++) {
      for (int c = 0; c < numbers[0].length - 1; c++) {
        if (numbers[r][c + 1] > numbers[r][c]) {
          numbers[r][c] = numbers[r][c + 1];
        }
      }
    }
  }
}
