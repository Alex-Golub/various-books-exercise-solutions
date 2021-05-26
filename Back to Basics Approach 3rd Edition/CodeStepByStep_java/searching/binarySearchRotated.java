package CodeStepByStep.java.searching;

/**
 * https://www.codestepbystep.com/problem/view/java/searching/binarySearchRotated
 *
 * The array's elements are in sorted order except "rotated" right by a given amount.
 *
 * @author Alex Golub
 * @since 26-May-21, 1:56 PM
 */
class binarySearchRotated {
  public static void main(String[] args) {
    int[] a = {10, 19, 22, -8, 0, 3, 6};
    System.out.println(binarySearchRotated(a, 22));
  }
  
  public static int binarySearchRotated(int[] arr, int target) {
    return binarySearchR(arr, 0, arr.length - 1, target);
  }
  
  private static int binarySearchR(int[] arr, int l, int r, int tgt) {
    if (l > r) {
      return -1;
    }
    
    int mid = l + (r - l) / 2;
    if (arr[mid] == tgt) {
      return mid;
    }
  
    int leftRes = binarySearchR(arr, mid + 1, r, tgt);
    if (leftRes != -1) {
      return leftRes;
    }
    int rightRes = binarySearchR(arr, l, mid - 1, tgt);
    if (rightRes != -1) {
      return rightRes;
    }
    
    return Math.max(leftRes, rightRes);
  }
}
