package chapter7_arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Mr.Dr.Professor
 * @since 08-Jan-21 1:24 PM
 */
class JaggedArray {
  public static void main(String[] args) {
    int[][] jagged = new int[4][];
    Random  rnd    = new Random();

    for (int i = 0; i < jagged.length; i++) {
      int cols = rnd.nextInt(5) + 1;
      jagged[i] = new int[cols];
      for (int j = 0; j < jagged[i].length; j++)
        jagged[i][j] = rnd.nextInt(10);
    }

    System.out.println(Arrays.deepToString(jagged));
  }
}
