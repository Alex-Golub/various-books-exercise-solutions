package CodeStepByStep_java.arrays.multi_dimensional_arrays;

import java.util.Arrays;

/**
 * Write a method named gameOfLife that performs one update
 * on a Game of Life board represented as a 2D array.
 * Conway's Game of Life is a simple representation of cellular
 * automata behavior using a board of characters representing cells.
 *
 * A given cell can be either alive (1) or dead (0).
 * To update the board, each cell's status should change based on the
 * number of living direct neighbors it has in each of the eight directions.
 * The rules are as follows:
 * - A living cell with 0 or 1 living neighbors dies from underpopulation.
 * - A living cell with 2 or 3 living neighbors stays alive.
 * - A living cell with more than 3 living neighbors dies from overpopulation.
 * - A dead cell with exactly 3 living neighbors comes to life.
 *
 * 1. Your code should work for a board of any size, even one with
 * 0 rows or columns.
 *
 * 2. You may assume that the 2-D array is rectangular, that is,
 * that each row of the 2-D array contains the same number of columns.
 *
 * 3. You may assume that no values appear in the board other than 0 and 1.
 *
 * @author Mr.Dr.Professor
 * @since 20-Feb-21 5:58 PM
 */
class gameOfLife {
  public static void main(String[] args) {
    int[][] board = {
            {0, 0, 1, 0, 1},
            {0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 1, 1, 0},
            {0, 0, 0, 0, 0}
    };

    gameOfLife(board);

    for (int[] row : board)
      System.out.println(Arrays.toString(row));
  }

  public static void gameOfLife(int[][] grid) {
    final int ALIVE = 1, DEAD = 0;
    final int UNDERPOPULATION = 1;
    final int OVERPOPULATION = 4;

    if (grid == null || grid.length == 0) {
      return;
    }

    int rows = grid.length;
    int columns = grid[0].length;
    int[][] nextState = new int[rows][columns];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        int aliveNeighbors = aliveNeighbors(grid, i, j);

        if (grid[i][j] == ALIVE) {
          if (aliveNeighbors <= UNDERPOPULATION) {
            nextState[i][j] = DEAD;
          } else if (aliveNeighbors >= OVERPOPULATION) {
            nextState[i][j] = DEAD;
          } else {
            nextState[i][j] = ALIVE;
          }
        } else if (aliveNeighbors == (OVERPOPULATION - UNDERPOPULATION)) {
          nextState[i][j] = ALIVE;
        } else {
          nextState[i][j] = DEAD;
        }
      }
    }

    // copy nextState to current grid
    System.arraycopy(nextState, 0, grid, 0, rows);
  }

  public static int aliveNeighbors(int[][] grid, int i, int j) {
    final int UP = i - 1;
    final int RIGHT = j + 1;
    final int DOWN = i + 1;
    final int LEFT = j - 1;

    final int COLUMNS = grid[i].length;
    final int ROWS = grid.length;

    int alive = 0;

    // NORTH
    if (UP >= 0 && grid[UP][j] == 1)
      alive++;

    // NORTH-WEST
    if (UP >= 0 && RIGHT < COLUMNS && grid[UP][RIGHT] == 1)
      alive++;

    // WEST
    if (RIGHT < COLUMNS && grid[i][RIGHT] == 1)
      alive++;

    // SOUTH-WEST
    if (DOWN < ROWS && RIGHT < COLUMNS && grid[DOWN][RIGHT] == 1)
      alive++;

    // SOUTH
    if (DOWN < ROWS && grid[DOWN][j] == 1)
      alive++;

    // SOUTH-EAST
    if (DOWN < ROWS && LEFT >= 0 && grid[DOWN][LEFT] == 1)
      alive++;

    // EAST
    if (LEFT >= 0 && grid[i][LEFT] == 1)
      alive++;

    // NORTH-EAST
    if (UP >= 0 && LEFT >= 0 && grid[UP][LEFT] == 1)
      alive++;

    return alive;
  }
}
