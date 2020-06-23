package chapter9_Objects_Classes._9_6_stopwatch;

import java.util.Random;

/**
 * *9.6 (Stopwatch) Design a class named StopWatch. The class contains:
 * ■■ Private data fields startTime and endTime with getter methods.
 * ■■ A no-arg constructor that initializes startTime with the current time.
 * ■■ A method named start() that resets the startTime to the current time.
 * ■■ A method named stop() that sets the endTime to the current time.
 * ■■ A method named getElapsedTime() that returns the elapsed time for the
 * stopwatch in milliseconds.
 * <p>
 * Draw the UML diagram for the class then implement the class.
 * Write a test program
 * that measures the execution time of sorting 100,000 numbers using selection sort.
 * <p>
 * Created by ag on 19-May-20 3:16 PM
 */
class StopwatchDemo {
  public static void main(String[] args) {

    final int size = 100_000;
    int[] testArray = new int[size];
    Random rnd = new Random();
    for (int i = 0; i < size; i++)
      testArray[i] = rnd.nextInt(Integer.MAX_VALUE);
//        System.out.println("Array before sorting: " + Arrays.toString(testArray));

    StopWatch stopWatch = new StopWatch();

    stopWatch.start();
    selectionSort(testArray);
    stopWatch.stop();

//        System.out.println("Array after sorting: " + Arrays.toString(testArray));

    System.out.printf("Sorting array of %d values took %01d(ms)%n",
            size, stopWatch.getElapsedTime());

  }

  private static void selectionSort(int[] arr) {
    boolean sorted = true;
    for (int i = arr.length - 1; i > 0; i--) {
      int maxIndex = 0;
      for (int j = 1; j <= i; j++) {
        if (arr[j] > arr[maxIndex]) {
          maxIndex = j;
          sorted = false;
        }
      }
      if (sorted)
        break;

      swap(arr, i, maxIndex);
    }
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
