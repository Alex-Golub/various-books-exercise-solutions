package chapter7_SD_Arrays;

import java.util.stream.IntStream;

/**
 * 7.16 (Execution time)
 * compare linear and binary search execution time
 *
 * @author Mr.Dr.Professor
 * @since 05-Feb-21 10:02 PM
 */
class Ex7_16_executionTime {
  public static void main(String[] args) {
    final int SIZE = 100_000_000;
    int[]     arr  = IntStream.rangeClosed(1, SIZE).toArray();

    int key = 1; // linear search wins
//    int key = 25_000_000; // binary search wins
//    int key = 50_000_000; // binary search wins
//    int key = 75_000_000; // binary search wins
//    int key = 100_000_000; // binary search wins

    long start = System.nanoTime();
    int  idx   = linearSearch(arr, key);
    long end   = System.nanoTime() - start;
    System.out.println("Linear search: " + key + " is found at index " + idx + ", Time = " + end + " nanoseconds");

    start = System.nanoTime();
    idx = binarySearch(arr, key);
    end = System.nanoTime() - start;
    System.out.println("Binary search: " + key + " is found at index " + idx + ", Time = " + end + " nanoseconds");

  }

  public static int linearSearch(int[] list, int key) {
    for (int i = 0; i < list.length; i++)
      if (list[i] == key)
        return i;

    return -1;
  }

  public static int binarySearch(int[] list, int key) {
    int low  = 0;
    int high = list.length - 1;

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (list[mid] == key)
        return mid;

      if (list[mid] > key)
        high = mid - 1;
      else
        low = mid + 1;
    }

    return -low - 1;
  }
}
