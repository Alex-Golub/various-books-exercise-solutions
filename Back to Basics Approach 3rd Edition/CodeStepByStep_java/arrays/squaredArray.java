package CodeStepByStep_java.arrays;

/**
 * Write a variable declaration and for loop necessary
 * to create and initialize an integer array named squares
 * that contains the following values:
 *
 * @author Mr.Dr.Professor
 * @since 14-Feb-21 11:26 PM
 */
class squaredArray {
  public static void main(String[] args) {
    int[] squares = new int[11];
    for (int i = 0; i <= squares.length; i++)
      squares[i] = i * i;
  }
}
