package chapter7_arrays;

/**
 * @author Mr.Dr.Professor
 * @since 08-Jan-21 1:39 PM
 */
class PascalTriangle {
  public static void main(String[] args) {
    int[][] triangle = new int[11][];
    fillIn(triangle);
    print(triangle);
  }

  private static void fillIn(int[][] tri) {
    for (int i = 0; i < tri.length; i++) {
      tri[i] = new int[i + 1]; // every row is one more then the previous
      tri[i][0] = 1;
      tri[i][i] = 1;
      for (int j = 1; j < i; j++)
        tri[i][j] = tri[i - 1][j - 1] + tri[i - 1][j];
    }
  }

  private static void print(int[][] triangle) {
    for (int[] row : triangle) {
      for (int val : row) {
        System.out.print(val + " ");
      }
      System.out.println();
    }
  }
}
