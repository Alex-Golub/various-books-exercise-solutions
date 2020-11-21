package chapter3_parameters_and_objects;

/**
 * 5. Write a method called printGrid that accepts two integers representing a
 * number of rows and columns and prints a
 * grid of integers from 1 to (rows * columns) in column major order.
 * <p>
 * NOTES:
 * - The output is a comma-separated grid.
 * - The numbers count up from 1 to (rows x cols).
 * - Assume that rows and cols are greater than 0.
 *
 * @author Mr.Dr.Professor
 * @since 21-Nov-20 4:07 PM
 */
class Ex3_5_printGrid {
  public static void main(String[] args) {
    printGrid(3, 6);
    System.out.println("-------------");
    printGrid(5, 3);
    System.out.println("-------------");
    printGrid(4, 1);
    System.out.println("-------------");
    printGrid(1, 3);
    System.out.println("-------------");
  }

  public static void printGrid(int rows, int cols) {
    for (int i = 0; i < rows; i++) {
      int n = i + 1;
      for (int j = 0; j < cols - 1; j++) {
        System.out.print(n + ", ");
        n += rows;
      }
      System.out.println(n);
    }
  }

}
