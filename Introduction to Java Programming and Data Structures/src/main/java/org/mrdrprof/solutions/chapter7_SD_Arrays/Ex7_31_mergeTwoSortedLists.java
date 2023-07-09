package org.mrdrprof.solutions.chapter7_SD_Arrays;

/**
 * **7.31 (Merge two sorted lists)
 * <p>
 * Enter list1 size and contents: 5 1 5 16 61 111
 * Enter list2 size and contents: 4 2 4 5 6
 * list1 is 1 5 16 61 111
 * list2 is 2 4 5 6
 * The merged list is 1 2 4 5 5 6 16 61 111
 *
 * @author Mr.Dr.Professor
 * @since 07-Feb-21 7:36 PM
 */
class Ex7_31_mergeTwoSortedLists {
  public static void main(String[] args) {
    int[] list1 = Ex7_26_strictlyIdenticalArrays.getList(1);
    int[] list2 = Ex7_26_strictlyIdenticalArrays.getList(2);

    printList(list1, "1");
    printList(list2, "2");

    System.out.println();
    System.out.print("The merged ");
    printList(merge(list1, list2), "");
  }

  public static void printList(int[] list, String id) {
    System.out.print("list" + id + " is:");
    for (int val : list)
      System.out.print(" " + val);
    System.out.println();
  }

  public static int[] merge(int[] list1, int[] list2) {
    int[] merged = new int[list1.length + list2.length];

    int i = 0;
    int j = 0;
    int k = 0;
    while (i < list1.length && j < list2.length) {
      merged[k++] = list1[i] > list2[j] ? list2[j++] : list1[i++];
//      System.out.println(Arrays.toString(merged));
    }

    while (i < list1.length) {
      merged[k++] = list1[i++];
//      System.out.println(Arrays.toString(merged));
    }

    while (j < list2.length) {
      merged[k++] = list1[j++];
//      System.out.println(Arrays.toString(merged));
    }

    return merged;
  }

}
