package chapter7_arrays;

/**
 * 14. Write a method called contains that accepts two arrays of
 * integers a1 and a2 as parameters and that returns a
 * boolean value indicating whether or not the sequence of
 * elements in a2 appears in a1 (true for yes, false for no).
 *
 * Any two lists with identical elements are considered to contain each other.
 * Every array contains the empty array, and
 * the empty array does not contain any arrays other than the empty array itself.
 *
 * Constrains:
 * You may assume that both arrays passed to your method will have lengths
 * of at least 1.
 * You may not use any Strings to help you solve this problem,
 * nor methods that produce Strings such as Arrays.toString.
 *
 * @author Mr.Dr.Professor
 * @since 11-Jan-21 5:57 PM
 */
class Ex7_14_contains {
  public static void main(String[] args) {
    int[] list1 = {1, 6, 2, 1, 4, 1, 2, 1, 8};
    int[] list2 = {1, 2, 1};
    System.out.println(contains(list1, list2)); // true
  }

  // Approach:
  // Traverse a1 with simple for-each loop.
  // once ele is equal first element of a2
  // start incrementing the index of a2
  // up until 2 of the possibilities happens:
  //   1. element of a1 is not equals to element at index j of a2
  //      in this case index j returns to position:
  //        1.1 if current element is the start of a2
  //            then return j to 1
  //        1.2 else return it to starting point of a2
  //   2. index j has reached end of a2 which means a2 was found in a1
  //      in this case return true.
  public static boolean contains(int[] a1, int[] a2) {
    int j = 0;

    for (int ele : a1) {
      if (ele != a2[j]) {
        j = 0;
        if (ele == a2[j])
          j += 1;
      } else {
        j++;
        if (j == a2.length)
          return true;
      }
    }

    return false;
  }
}
