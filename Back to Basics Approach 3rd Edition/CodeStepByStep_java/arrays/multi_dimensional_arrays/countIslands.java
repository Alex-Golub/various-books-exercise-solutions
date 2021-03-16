package CodeStepByStep_java.arrays.multi_dimensional_arrays;

/**
 * Write a method named countIslands that accepts a rectangular
 * 2-D array of integers as a parameter, where every integer in
 * the array is either 0 to represent water or 1 to represent land,
 * and returns an integer count of how many contiguous "islands" of
 * land are in the array.
 *
 * An "island" is a connected group of land areas (1) that neighbor
 * each other directly up, down, east, or west (NOT DIAGONAL).
 *
 * 1. Your code should work for a board of any size, even one
 * with 0 rows or columns.
 *
 * 2. You may assume that the 2-D array is rectangular, that is,
 * that each row of the 2-D array contains the same number of columns.
 *
 * 3. You may assume that no values appear in the array other than 0 and 1.
 *
 * @author Mr.Dr.Professor
 * @since 20-Feb-21 4:33 PM
 */
class countIslands {
  public static void main(String[] args) {
    int[][] map = {
            {0, 0, 0, 0, 0, 0, 1},
            {0, 1, 1, 1, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0},
            {0, 1, 0, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 1, 0},
            {0, 1, 1, 0, 0, 1, 0},
            {0, 1, 1, 0, 0, 0, 0}
    };

    System.out.println(countIslands(map));
  }

  public static int countIslands(int[][] map) {
    int islands = 0;
    for (int i = 0; i < map.length; i++) {
      for (int j = 0; j < map[i].length; j++) {
        if (map[i][j] == 1) {
          islands++;
          checkNeighbors(map, i, j);
        }
      }
    }

    return islands;
  }

  public static void checkNeighbors(int[][] map, int i, int j) {
    map[i][j] = 0;

    // NORTH
    if (i - 1 >= 0 && map[i - 1][j] == 1)
      checkNeighbors(map, i - 1, j);

    // WEST
    if (j + 1 < map[i].length && map[i][j + 1] == 1)
      checkNeighbors(map, i, j + 1);

    // SOUTH
    if (i + 1 < map.length && map[i + 1][j] == 1)
      checkNeighbors(map, i + 1, j);

    // EAST
    if (j - 1 >= 0 && map[i][j - 1] == 1)
      checkNeighbors(map, i, j - 1);
  }
}