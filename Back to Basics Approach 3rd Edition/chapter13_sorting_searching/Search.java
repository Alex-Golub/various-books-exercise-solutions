package chapter13_sorting_searching;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Search {
  public static void main(String[] args) {
    useBinarySearch3();
    
    String[] a = {"a", "b", "c", "d"};
    // System.out.println(indexOf(a, "c"));
    
    int[] numbers = {11, 18, 29, 37, 42, 49, 51, 63,
                     69, 72, 77, 82, 88, 91, 98};
    System.out.println(binarySearch(numbers, 45));
    
    // timeSequentialSearch();
    // timeBinarySearch();
    
    numbers = createRandomIntArray(1_000_000);
    Arrays.sort(numbers);
    int target = 1_525_001; // new Random().nextInt(1000000);
    binarySearch(numbers, target);
  }
  
  public static void useBinarySearch1() {
    // binary search on an array
    int[] numbers = {-3, 2, 8, 12, 17, 29, 44, 58, 79};
    int index = Arrays.binarySearch(numbers, 29);
    System.out.println("29 is found at index " + index);
  }
  
  public static void useBinarySearch2() {
    int[] numbers = {-3, 2, 8, 12, 17, 29, 44, 58, 79};
    ArrayList<Integer> list = new ArrayList<>();
    for (int i : numbers) {
      list.add(i);
    }
    int index = Collections.binarySearch(list, 29);
    System.out.println("29 is found at index " + index);
  }
  
  public static void useBinarySearch3() {
    Random rand = new Random();
    int[] numbers = new int[1_000_000];
    for (int i = 1; i < numbers.length; i++) {
      numbers[i] = numbers[i - 1] + rand.nextInt(10);
    }
    
    int target = 123_456;
    int index = Arrays.binarySearch(numbers, target);
    if (index >= 0) {
      System.out.println(target + " is at index " + index);
    } else {
      System.out.println(target + " not found.");
    }
  }
  
  // 123456 is at index 27394
  
  // reads the text of the given file into an ArrayList
  public static ArrayList<String> readBook(String filename)
    throws FileNotFoundException {
    ArrayList<String> words = new ArrayList<>();
    Scanner in = new Scanner(new File(filename));
    while (in.hasNext()) {
      words.add(in.next());
    }
    return words;
  }
  
  // intentionally allowed to line-wrap (header not inserted)
  public static void useIndexOf() throws FileNotFoundException {
    System.out.print("Your word? ");
    Scanner console = new Scanner(System.in);
    String word = console.nextLine();
    
    // search list for a word using indexOf
    ArrayList<String> words = readBook("mobydick.txt");
    int index = words.indexOf(word);
    if (index >= 0) {
      System.out.println(word + " is word #" + index);
    } else {
      System.out.println(word + " is not found.");
    }
  }
  
  public static void timeSequentialSearch() {
    System.out.printf("%10s %10s %10s %10s %10s (ms)\n",
                      "n", "Target", "Index", "Runtime", "Runtime2");
    for (int n = 50_000; n <= 999_999_999; n *= 2) {
      int[] numbers = createRandomIntArray(n);
      Arrays.sort(numbers);
      for (int i = 1; i <= 5; i++) {
        int target = new Random().nextInt(n);
        
        long startTime = System.currentTimeMillis();
        int index = indexOf(numbers, target);
        long endTime = System.currentTimeMillis();
        
        long startTime2 = System.currentTimeMillis();
        index = indexOf2(numbers, target);
        long endTime2 = System.currentTimeMillis();
        
        System.out.printf("%10d %10d %10d %10d %10d\n",
                          n, target, index, (endTime - startTime),
                          (endTime2 - startTime2));
      }
    }
  }
  
  public static void timeBinarySearch() {
    System.out.printf("%10s %10s %10s %10s (ms)\n", "n",
                      "Target", "Index", "Runtime");
    for (int n = 50_000; n <= 999_999_999; n *= 2) {
      int[] numbers = createRandomIntArray(n);
      Arrays.sort(numbers);
      
      for (int i = 1; i <= 5; i++) {
        int target = new Random().nextInt(n);
        
        long startTime = System.currentTimeMillis();
        int index = binarySearchR(numbers, target);
        long endTime = System.currentTimeMillis();
        
        System.out.printf("%10d %10d %10d %10d\n", n,
                          target, index, (endTime - startTime));
      }
    }
  }
  
  public static int[] createRandomIntArray(int size) {
    int[] numbers = new int[size];
    Random rand = new Random(42);
    int min = rand.nextInt(size);
    int max = rand.nextInt(size - min) + min;
    for (int i = 0; i < size; i++) {
      // numbers[i] = rand.nextInt(max - min + 1) + min;
      numbers[i] = rand.nextInt(size * 2);
    }
    return numbers;
  }
  
  public static Point[] createRandomPointArray(int size) {
    Point[] points = new Point[size];
    Random rand = new Random();
    for (int i = 0; i < size; i++) {
      int x = rand.nextInt(size * 10);
      int y = rand.nextInt(size * 10);
      points[i] = new Point(x, y);
    }
    return points;
  }
  
  // Sequential search algorithm.
  // Returns the index at which the given target number first
  // appears in the given input array, or -1 if it is not found.
  public static int indexOf(int[] numbers, int target) {
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == target) {
        return i;   // found it!
      }
    }
    
    return -1;   // not found
  }
  
  // Sequential search algorithm, modified.
  // Returns the index at which the given target number first
  // appears in the given input array, or -1 if it is not found.
  // pre: array is sorted.
  public static int indexOf2(int[] numbers, int target) {
    int i = 0;
    while (i < numbers.length && numbers[i] <= target) {
      if (numbers[i] == target) {
        return i;   // found it!
      } else {
        i++;
      }
    }
    
    return -1;   // not found
  }
  
  // Sequential search algorithm.
  // Returns the index at which the target first
  // appears in the given input array, or -1 if not found.
  public static int indexOf(Object[] objects, Object target) {
    for (int i = 0; i < objects.length; i++) {
      if (objects[i].equals(target)) {
        return i;   // found it!
      }
    }
    
    return -1;   // not found
  }
  
  // Binary search algorithm that works with Strings.
  // Returns the index at which the given target String
  // appears in the given input array, or -1 if not found.
  // pre: array is sorted.
  public static int binarySearch(String[] strings,
                                 String target) {
    int min = 0;
    int max = strings.length - 1;
    
    while (min <= max) {
      int mid = (max + min) / 2;
      int compare = strings[mid].compareTo(target);
      if (compare == 0) {
        return mid;     // found it!
      } else if (compare < 0) {
        min = mid + 1;  // too small
      } else {   // compare > 0
        max = mid - 1;  // too large
      }
    }
    
    return -1;   // not found
  }
  
  // Binary search algorithm.
  // Returns the index at which the target first
  // appears in the given input array, or -1 if not found.
  // pre: array is sorted.
  public static int binarySearch(int[] numbers, int target) {
    int min = 0;
    int max = numbers.length - 1;
    
    while (min <= max) {
      int mid = (max + min) / 2;
      if (numbers[mid] == target) {
        return mid;     // found it!
      } else if (numbers[mid] < target) {
        min = mid + 1;  // too small
      } else {   // numbers[mid] > target
        max = mid - 1;  // too large
      }
    }
    
    return -1;   // not found
  }
  
  // modified version that returns -insertionpoint - 1
  public static int binarySearch2(int[] numbers, int target) {
    int min = 0;
    int max = numbers.length - 1;
    
    int mid = -1;
    while (min <= max) {
      mid = (max + min) / 2;
      if (numbers[mid] == target) {
        return mid;     // found it!
      } else if (numbers[mid] < target) {
        min = mid + 1;  // too small
      } else {   // numbers[mid] > target
        max = mid - 1;  // too large
      }
      mid = (max + min) / 2;
    }
    
    return -min - 1;   // not found
  }
  
  // Recursive binary search algorithm.
  // This "helper" method requires fewer parameters.
  public static int binarySearchR(int[] numbers, int target) {
    return binarySearchR(numbers, target, 0,
                         numbers.length - 1);
  }
  
  // Recursive binary search algorithm.
  // Returns the index at which the target first
  // appears in the given input array, or -1 if not found.
  // pre: array is sorted.
  public static int binarySearchR(int[] numbers, int target,
                                  int min, int max) {
    // base case
    if (min > max) {
      return -1;   // not found
    } else {
      // recursive case
      int mid = (max + min) / 2;
      if (numbers[mid] == target) {
        return mid;
      } else if (numbers[mid] < target) {
        return binarySearchR(numbers, target,
                             mid + 1, max);
      } else {
        return binarySearchR(numbers, target,
                             min, mid - 1);
      }
    }
  }
  
  // Returns the closest distance between any pair of points
  // in the given array.
  public static double closestDistance2(Point[] points) {
    double closest = points[0].distance(points[1]);
    for (int i = 0; i < points.length; i++) {
      for (int j = i + 1; j < points.length; j++) {
        double dist = points[i].distance(points[j]);
        closest = Math.min(closest, dist);
      }
    }
    return closest;
  }
}
