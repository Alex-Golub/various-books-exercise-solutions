package chapter7_SD_Arrays;

/**
 * 7.27 (Identical arrays)
 * list1 and list2 are identical if they have the same contents.
 *
 * @author Mr.Dr.Professor
 * @since 06-Feb-21 10:22 PM
 */
class Ex7_27_identicalArrays {
  public static void main(String[] args) {
    while (true) {
      int[] list1 = Ex7_26_strictlyIdenticalArrays.getList(1);
      int[] list2 = Ex7_26_strictlyIdenticalArrays.getList(2);

      System.out.printf("Two lists are %sidentical\n\n",
                        equals(list1, list2) ? "" : "not ");
    }
  }

  public static boolean equals(int[] list1, int[] list2) {
    if (list1.length != list2.length)
      return false;

    int x1 = list1[0];
    int x2 = list2[0];

    for (int i = 1; i < list1.length; i++)
      x1 ^= list1[i];
    for (int i = 1; i < list1.length; i++)
      x2 ^= list2[i];

    return (x1 ^ x2) == 0;

//    int[] list1Copy = Arrays.copyOf(list1, list1.length);
//    int[] list2Copy = Arrays.copyOf(list2, list2.length);
//    Arrays.sort(list1Copy);
//    Arrays.sort(list2Copy);
//
//    return Ex7_26_strictlyIdenticalArrays.equals(list1Copy, list2Copy);
  }

}
