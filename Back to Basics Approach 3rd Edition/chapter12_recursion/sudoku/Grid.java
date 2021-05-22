package chapter12_recursion.sudoku;// The Grid class is used to store information for a Sudoku puzzle.  It has
// been written in a general way so that much of the code would work for other
// kinds of two-dimensional grids.

import java.util.Scanner;

class Grid {
  public static final int SIZE = 9;  // number of rows and cols
  private final int[][] grid;
  private int placeCount;  // how many times a number is placed
  
  // pre : input file contains SIZE * SIZE entries that are either numbers or
  //       some other token (e.g., a dash) in row-major order
  // post: Grid is initialized with initial values from file
  public Grid(Scanner input) {
    grid = new int[SIZE][SIZE];
    for (int i = 0; i < SIZE; i++)
      for (int j = 0; j < SIZE; j++)
        if (input.hasNextInt())
          grid[i][j] = input.nextInt();
        else
          input.next();
    placeCount = 0;
  }
  
  // post : returns value at given row/col (0 if unoccupied)
  public int get(int row, int col) {
    return grid[row][col];
  }
  
  // post: returns value of given cell (0 if unoccupied); cells are numbered
  //       in row/major order from 0 to SIZE*SIZE-1
  public int get(int cellNumber) {
    return grid[cellNumber / SIZE][cellNumber % SIZE];
  }
  
  // post: returns the number of times place has been called
  public int getPlaceCount() {
    return placeCount;
  }
  
  // post: places value at given position
  public void place(int cellNumber, int n) {
    grid[cellNumber / SIZE][cellNumber % SIZE] = n;
    placeCount++;
  }
  
  // post : removes the value at the given row/col position
  public void remove(int cellNumber) {
    grid[cellNumber / SIZE][cellNumber % SIZE] = 0;
  }
  
  // post: returns the cell number of the first unassigned location (between
  //       0 and SIZE*SIZE-1; returns -1 if all cells are full
  public int getUnassignedLocation() {
    for (int row = 0; row < SIZE; row++)
      for (int col = 0; col < SIZE; col++)
        if (grid[row][col] == 0)
          return row * SIZE + col;
    return -1;
  }
  
  // post : returns whether or not the given value can be placed in the given
  //        cell without violating the rules of Sudoku (row/col/block)
  public boolean noConflicts(int cellNumber, int n) {
    int row = cellNumber / SIZE;
    int col = cellNumber % SIZE;
    int blockRow = row - row % 3;
    int blockCol = col - col % 3;
    for (int i = 0; i < SIZE; i++) {
      if (grid[row][i] == n)
        return false;
      if (grid[i][col] == n)
        return false;
      if (grid[blockRow + i / 3][blockCol + i % 3] == n)
        return false;
    }
    return true;
  }
  
  // post: prints current grid to System.out
  public void print() {
    for (int[] ints : grid) {
      for (int anInt : ints) {
        if (anInt == 0)
          System.out.print("- ");
        else
          System.out.print(anInt + " ");
      }
      System.out.println();
    }
  }
}
