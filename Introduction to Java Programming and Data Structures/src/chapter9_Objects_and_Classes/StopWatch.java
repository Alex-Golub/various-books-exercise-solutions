package chapter9_Objects_and_Classes;

/**
 * *9.6 (Stopwatch)
 *
 * @author Mr.Dr.Professor
 * @since 19/03/2021 12:40
 */
/*public*/ class StopWatch {
  private long startTime;
  private long endTime;

  public StopWatch() {
    start();
  }

  public void start() {
    startTime = System.currentTimeMillis();
  }

  public void stop() {
    endTime = System.currentTimeMillis();
  }

  public long getElapsedTime() {
    return endTime - startTime;
  }

  public static void main(String[] args) {
    int[] arr = initArray(100_000);
//    System.out.println("Before sorting: ");
//    printArray(arr);

    StopWatch watch = new StopWatch();
    watch.start();
    selectionSort(arr);
    watch.stop();

    System.out.println("Selection sort took " +
                       watch.getElapsedTime() / 1000 + " seconds");

//    System.out.println("\nAfter sorting: ");
//    printArray(arr);
  }

  private static void selectionSort(int[] arr) {
    boolean sorted = true;

    for (int i = 0; i < arr.length - 1; i++) {
      int minValue = arr[i];
      int minValueIndex = i;

      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < minValue) {
          minValue = arr[j];
          minValueIndex = j;
          sorted = false;
        }
      }

      if (sorted) {
        break;
      }

      swap(arr, minValueIndex, i);
    }
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  private static void printArray(int[] arr) {
    final int PER_LINE = 10;
    for (int i = 0; i < arr.length; i++) {
      System.out.printf("%3d", arr[i]);
      if ((i + 1) % PER_LINE == 0) {
        System.out.println();
      } else {
        System.out.print(" ");
      }
    }
  }

  private static int[] initArray(int size) {
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = (int) (Math.random() * (2 * size + 1)) - size; // [-(size/2)..(size)/2]
    }
    return arr;
  }


}
