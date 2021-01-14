package chapter7_arrays;

/**
 * @author Mr.Dr.Professor
 * @since 08-Jan-21 12:04 AM
 */
class Inversion {
  public static void main(String[] args) {
    int[] arr = {4, 3, 2, 1};
    printInversions(arr);
  }

  public static void printInversions(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {

      // consider values after value at arr[i]
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j])
          System.out.printf("(%d, %d)\n", arr[i], arr[j]);
      }
    }
  }
}
