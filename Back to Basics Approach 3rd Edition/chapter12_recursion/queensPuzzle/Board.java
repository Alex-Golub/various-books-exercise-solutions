package chapter12_recursion.queensPuzzle;

/**
 * Stores information relevant to solving the n queens problem of placing n
 * queens on an n-by-n board.
 *
 * @author Stuart Reges
 */
class Board {
  private int[] board;  // stores board info
  private static final int UNASSIGNED = 100; // unassigned column
  
  /**
   * Constructs an empty size-by-size board.
   *
   * @param size the size of the board.
   * @throws IllegalArgumentException if size is less than 1.
   */
  public Board(int size) {
    if (size < 0)
      throw new IllegalArgumentException();
    board = new int[size];
    for (int i = 0; i < size; i++)
      board[i] = UNASSIGNED;
  }
  
  /**
   * Returns <tt>true</tt> if it is safe to place a queen at position (row,
   * col).
   *
   * @param row row of position to check.
   * @param col column of position to check.
   * @return <tt>true</tt> if it is safe to place a queen at position (row,
   * col).
   * @throws IllegalArgumentException if row and col do not represent a legal board position.
   */
  public boolean safe(int row, int col) {
    // first reset row and col to array range (0..size-1)
    row--;
    col--;
    
    // next check that row, col are in bounds
    if (!legal(row, col))
      throw new IllegalArgumentException();
    
    // next check that the current column is empty
    if (board[col] != UNASSIGNED)
      return false;
    
    // now check for conflicts with other columns
    for (int currCol = 0; currCol < board.length; currCol++) {
      int distance = col - currCol;
      // check for diagonal conflict
      if (board[currCol] == row - distance)
        return false;
      // check for conflict in this row
      if (board[currCol] == row)
        return false;
      // check for other diagonal conflict
      if (board[currCol] == row + distance)
        return false;
    }
    return true;
  }
  
  /**
   * Places a queen at position (row, col).
   *
   * @param row row of position to check.
   * @param col column of position to check.
   * @throws IllegalArgumentException if it is not safe to place a queen at the given position.
   */
  public void place(int row, int col) {
    if (!safe(row, col))
      throw new IllegalArgumentException();
    board[col - 1] = row - 1;
  }
  
  /**
   * Removes the queen at position (row, col).
   *
   * @param row row of position to check.
   * @param col column of position to check.
   * @throws IllegalArgumentException if there is no queen at the given position.
   */
  public void remove(int row, int col) {
    if (!legal(row - 1, col - 1) || board[col - 1] != row - 1)
      throw new IllegalArgumentException();
    board[col - 1] = UNASSIGNED;
  }
  
  /**
   * Returns the size of the board.
   *
   * @return the size of the board.
   */
  public int size() {
    return board.length;
  }
  
  /**
   * Displays the current board to System.out.
   */
  public void print() {
    for (int row = 0; row < board.length; row++) {
      for (int col = 0; col < board.length; col++)
        if (board[col] == row)
          System.out.print(" Q ");
        else
          System.out.print(" - ");
      System.out.println();
    }
  }
  
  // post: returns true iff row and col are legal for this board
  private boolean legal(int row, int col) {
    return row >= 0 && row < board.length && col >= 0 && col < board.length;
  }
}
