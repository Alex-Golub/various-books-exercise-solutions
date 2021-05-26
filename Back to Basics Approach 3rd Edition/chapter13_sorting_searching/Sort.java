package chapter13_sorting_searching;

import java.util.Random;

class Sort {
  public static void main(String[] args) {
    int[] numbers = {14, 32, 67, 76, 23, 41, 58, 85};
/*
        int n = 1000000;
        String[] list1 = new String[n];
        String[] list2 = new String[n];
        String[] list3 = new String[n];
        String[] list4 = new String[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            String text = "some text with #" + r.nextInt(2 * n);
            list1[i] = text;
            list2[i] = text;
            list3[i] = text;
            list4[i] = text;
        }
        
        long start = System.currentTimeMillis();
        mergeSort(list1);
        double elapsed1 = (System.currentTimeMillis() - start) /
                1000.0;
        System.out.println("regular mergesort took " + elapsed1
                           + " seconds");
        System.out.println();
        
        start = System.currentTimeMillis();
        Arrays.sort(list2);
        double elapsed2 = (System.currentTimeMillis() - start) /
                1000.0;
        System.out.println("Arrays.sort took " + elapsed2 +
                           " seconds");
        System.out.println();
        
        System.out.println("Ratio = " + elapsed1 / elapsed2);
        
        start = System.currentTimeMillis();
        mergeSort2(list3);
        double elapsed3 = (System.currentTimeMillis() - start) /
                1000.0;
        System.out.println("Marty's merge sort took " + elapsed3
                           + " seconds");
        System.out.println();
        
        System.out.println("Ratio = " + elapsed3 / elapsed2);
*/
  }
    
    /*
     public static void main2(String[] args) {
     System.out.printf("%10s %10s (ms)\n", "n", "Runtime");
     for (int n = 1000; n <= 999999999; n *= 2) {
     int[] numbers = createRandomIntArray(n);
     
     long startTime = System.currentTimeMillis();
     mergeSort(numbers);
     long endTime = System.currentTimeMillis();
     
     if (!isSorted(numbers)) {
     throw new RuntimeException("sort failed");
     }
     
     System.out.printf("%10d %10d\n", n, (endTime - startTime));
     }
     }
     */
  
  public static int[] createRandomIntArray(int size) {
    int[] numbers = new int[size];
    Random rand = new Random();
    int min = rand.nextInt(size);
    int max = rand.nextInt(size - min) + min;
    for (int i = 0; i < size; i++) {
      // numbers[i] = rand.nextInt(max - min + 1) + min;
      numbers[i] = rand.nextInt(size * 2);
    }
    return numbers;
  }
  
  // Returns true if array a's elements are in sorted order.
  public static boolean isSorted(int[] a) {
    for (int i = 0; i < a.length - 1; i++) {
      if (a[i] > a[i + 1]) {
        return false;
      }
    }
    
    return true;
  }
  
  // Swaps a[i] with a[j].
  public static void swap(int[] a, int i, int j) {
    if (i != j) {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
    }
  }
  
  // Swaps a[i] with a[j].
  public static void swap(String[] a, int i, int j) {
    if (i != j) {
      String temp = a[i];
      a[i] = a[j];
      a[j] = temp;
    }
  }
  
  // Swaps a[i] with a[j].
  public static void swap(double[] a, int i, int j) {
    if (i != j) {
      double temp = a[i];
      a[i] = a[j];
      a[j] = temp;
    }
  }
  
  // Places the elements of the given array into sorted order
  // using the selection sort algorithm.
  // post: array is in sorted (nondecreasing) order
  public static void selectionSort(int[] a) {
    for (int i = 0; i < a.length - 1; i++) {
      // find index of smallest element
      int smallest = i;
      for (int j = i + 1; j < a.length; j++) {
        if (a[j] < a[smallest]) {
          smallest = j;
        }
      }
      
      swap(a, i, smallest);  // swap smallest to front
    }
  }
  
  public static void selectionSort(double[] a) {
    for (int i = 0; i < a.length - 1; i++) {
      // find index of smallest element
      int smallest = i;
      for (int j = i + 1; j < a.length; j++) {
        if (a[j] < a[smallest]) {
          smallest = j;
        }
      }
      
      swap(a, i, smallest);  // swap smallest to front
    }
  }
  
  // post: list is in sorted (nondecreasing) order
  public static void mergeSort(String[] array) {
    if (array.length > 1) {
      // split array into two smaller arrays
      int size1 = array.length / 2;
      int size2 = array.length - size1;
      String[] half1 = new String[size1];
      String[] half2 = new String[size2];
      for (int i = 0; i < size1; i++) {
        half1[i] = array[i];
      }
      for (int i = 0; i < size2; i++) {
        half2[i] = array[i + size1];
      }
      
      // recursively sort the two smaller arrays
      mergeSort(half1);
      mergeSort(half2);
      
      // merge the sorted halves into a sorted whole
      merge(array, half1, half2);
    }
  }
  
  // pre : result is empty; list1 is sorted; list2 is sorted
  // post: result contains result of merging sorted lists;
  public static void merge(String[] result,
                           String[] list1, String[] list2) {
    int i1 = 0;
    int i2 = 0;
    for (int i = 0; i < result.length; i++) {
      if (i2 >= list2.length || (i1 < list1.length &&
                                 list1[i1].compareTo(list2[i2]) <= 0)) {
        result[i] = list1[i1];
        i1++;
      } else {
        result[i] = list2[i2];
        i2++;
      }
    }
  }
  
  
  public static void mergeSort2(String[] a) {
    String[] temp = new String[a.length];
    mergeSort2(a, temp, 0, a.length - 1);
  }
  
  private static void mergeSort2(String[] a, String[] temp,
                                 int left, int right) {
    if (left >= right) {  // base case
      return;
    }
    
    // sort the two halves
    int mid = (left + right) / 2;
    mergeSort2(a, temp, left, mid);
    mergeSort2(a, temp, mid + 1, right);
    
    // merge the sorted halves into a sorted whole
    merge2(a, temp, left, right);
  }
  
  private static void merge2(String[] a, String[] temp,
                             int left, int right) {
    int mid = (left + right) / 2;
    int count = right - left + 1;
    
    int l = left;                  // counter indexes for L, R
    int r = mid + 1;
    
    // main loop to copy the halves into the temp array
    for (int i = 0; i < count; i++)
      if (r > right) {           // finished right; use left
        temp[i] = a[l++];
      } else if (l > mid) {      // finished left; use right
        temp[i] = a[r++];
      } else if (a[l].compareTo(a[r]) < 0) {  // left is smaller
        temp[i] = a[l++];
      } else {                   // right is smaller (better)
        temp[i] = a[r++];
      }
    
    // copy sorted temp array back into main array
    for (int i = 0; i < count; i++) {
      a[left + i] = temp[i];
    }
  }
}
