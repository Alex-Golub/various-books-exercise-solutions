package CodeStepByStep.java.searching;

/**
 * https://www.codestepbystep.com/problem/view/java/searching/binarySearch
 *
 * @author Alex Golub
 * @since 26-May-21, 1:27 PM
 */
class binarySearch {
  public static void main(String[] args) {
    int[] a = {-4, 2, 7, 10, 15, 20, 22, 25, 30, 36, 42, 50, 56, 68, 85, 92, 103};
    System.out.println(binarySearch(a, 42));
    System.out.println(binarySearch(a, 66));
  }
  
  // pre: arr is sorted
  public static int binarySearch(int[] arr, int target) {
    return binarySearchR(arr, 0, arr.length - 1, target);
  }
  
  private static int binarySearchR(int[] arr, int i, int j, int target) {
    if (i > j) {
      return -1;
    }
    
    int mid = i + (j - i) / 2; // prevent overflow
    if (arr[mid] == target) {
      return mid;
    }
    
    return arr[mid] > target ?
           binarySearchR(arr, i, mid - 1, target) :
           binarySearchR(arr, mid + 1, j, target);
  }
}
