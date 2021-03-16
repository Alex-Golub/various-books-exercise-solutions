package CodeStepByStep_java.arrays.multi_dimensional_arrays;

/**
 * Write a method named kthSmallest that returns the kth smallest
 * element value in a row/column-SORTED 2D square array of integers.
 * Your method accepts two parameters: a 2D array where each row and
 * each column are arranged in sorted order, and an integer k.
 * You may assume that the arrays passed as parameters have the same dimensions.
 *
 * Assumptions:
 * 1. You may assume that the array's elements are properly row/column-sorted
 * as described.
 *
 * 2. You may assume that the matrix is square, meaning that it has the same
 * number of rows and columns, and that each row has the same number of elements.
 *
 * 3. You may assume that the matrix has at least 1 row and 1 column.
 *
 * 4. You may assume that the value passed for k is between 1 and the number
 * of elements in the matrix, inclusive.
 *
 * @author Mr.Dr.Professor
 * @since 21-Feb-21 5:24 PM
 */
class kthSmallest { // TODO
  public static void main(String[] args) {
    int[][] matrix = {
            {1, 2, 5, 14},
            {11, 15, 19, 22},
            {12, 16, 28, 35},
            {20, 22, 29, 35}
    };

    System.out.println(kthSmallest(matrix, 8)); // 16
  }

  public static int kthSmallest(int[][] m, int k) {
    int size = m.length;
    if (k < 0 || k > size * size) {
      return Integer.MAX_VALUE; // invalid value of k
    }

    // create min heap of elements from first row of m
    // heapArray stores [{value, rowNumber, colNumber}]
    HeapNode[] heapArray = new HeapNode[size];
    for (int i = 0; i < size; i++) {
      heapArray[i] = new HeapNode(m[0][i], 0, i);
    }

    HeapNode heapRoot = new HeapNode(0, 0, 0);
    for (int i = 1; i <= k; i++) {
      heapRoot = heapArray[0]; // get root

      int nextValue = heapRoot.row < size - 1 ?
                      m[heapRoot.row + 1][heapRoot.column] :
                      Integer.MAX_VALUE;

      heapArray[0] = new HeapNode(nextValue, heapRoot.row + 1, heapRoot.column);

      minHeapify(heapArray, 0, size);
    }

    return heapRoot.value;
  }

  private static void minHeapify(HeapNode[] heapArray, int i, int size) {
    int l = 2 * i + 1;
    int r = 2 * i + 2;
    int min = i;

    if (l < size && heapArray[l].value < heapArray[min].value) {
      min = l;
    }

    if (r < size && heapArray[r].value == 0) {
      minHeapify(heapArray, i, size);
      i--;
    }
  }

  static class HeapNode {
    int value;
    int row;
    int column;

    HeapNode(int value, int row, int column) {
      this.value = value;
      this.row = row;
      this.column = column;
    }
  }
}
