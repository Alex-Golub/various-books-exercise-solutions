package chapter13_sorting_searching;

import java.awt.*;
import java.util.Random;

class BigOh {
  public static void main(String[] args) {
    
    int[] a = {2, 7, -1, 15, -10};
    System.out.println(max(a));
    
    Point[] p = {
      new Point(0, 0),
      new Point(3, 4),
      new Point(5, 12),
      new Point(4, 4),
      new Point(7, 10),
      };
    System.out.println(closestDistance(p));
    
    time2n();
    timeMax();
    timeClosest();
    timeColinear();
  }
  
  // Returns the range of numbers in the given array.
  public static int range(int[] numbers) {
    int maxDiff = 0;
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers.length; j++) {
        int diff = Math.abs(numbers[j] - numbers[i]);
        maxDiff = Math.max(maxDiff, diff);
      }
    }
    return maxDiff;
  }
  
  // Returns the largest of all integers in the given array.
  public static int range2(int[] numbers) {
    int maxDiff = 0;
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        int diff = Math.abs(numbers[j] - numbers[i]);
        maxDiff = Math.max(maxDiff, diff);
      }
    }
    return maxDiff;
  }
  
  // Returns the largest of all integers in the given array.
  public static int range2t(int[] numbers) {
    int maxDiff = 0;
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        int diff = Math.abs(numbers[j] - numbers[i]);
        if (diff > maxDiff) {
          maxDiff = diff;
        }
      }
    }
    return maxDiff;
  }
  
  // Returns the largest of all integers in the given array.
  public static int range3(int[] numbers) {
    int max = numbers[0];
    int min = max;
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] > max) {
        max = numbers[i];
      } else if (numbers[i] < min) {
        min = numbers[i];
      }
    }
    
    return max - min;
  }
  
  public static void timeMax() {
    System.out.printf("%10s %10s %10s %10s %10s (ms)\n",
                      "n", "Max", "Runtime", "Range", "Runtime");
    for (int n = 50_000; n <= 999_999_999; n *= 2) {
      int[] numbers = createRandomIntArray(n);
      
      long startTime = System.currentTimeMillis();
      int max = max(numbers);
      long endTime = System.currentTimeMillis();
      
      long startTime2 = System.currentTimeMillis();
      int range = range(numbers);
      long endTime2 = System.currentTimeMillis();
      
      System.out.printf("%10d %10d %10d %10d %10d\n", n,
                        max, (endTime - startTime), range,
                        (endTime2 - startTime2));
    }
  }
  
  public static void twon(int n) {
    long max = (int) Math.pow(2, n);
    for (long i = 0; i < max; i++) {
      System.currentTimeMillis();
    }
  }
  
  public static void time2n() {
    System.out.printf("%10s %10s (ms)\n", "n", "Runtime");
    for (int n = 10; n <= 999_999_999; n *= 2) {
      int[] numbers = createRandomIntArray(n);
      
      long time = System.currentTimeMillis();
      twon(n);
      time = System.currentTimeMillis() - time;
      
      System.out.printf("%10d %10d\n", n, time);
    }
  }
  
  public static void timeRange() {
    System.out.printf("%10s %10s %10s (ms)\n", "n",
                      "Range", "Runtime");
    for (int n = 1_000; n <= 999_999_999; n *= 2) {
      int[] numbers = createRandomIntArray(n);
      
      long time = System.currentTimeMillis();
      int range = range2(numbers);
      time = System.currentTimeMillis() - time;
      
      System.out.printf("%10d %10d %10d\n", n, range, time);
    }
  }
  
  public static void timeClosest() {
    System.out.printf("%10s %10s %10s %10s (ms)\n", "n",
                      "Closest", "Runtime", "Runtime2");
    for (int n = 10; n <= 999_999_999; n *= 2) {
      Point[] points = createRandomPointArray(n);
      
      long startTime = System.currentTimeMillis();
      double dist = closestDistance(points);
      long endTime = System.currentTimeMillis();
      
      long startTime2 = System.currentTimeMillis();
      dist = closestDistance2(points);
      long endTime2 = System.currentTimeMillis();
      
      System.out.printf("%10d %10.2f %10d %10d\n", n,
                        dist, (endTime - startTime),
                        (endTime2 - startTime2));
    }
  }
  
  public static void timeColinear() {
    System.out.printf("%10s %10s %10s (ms)\n", "n",
                      "Colinear", "Runtime");
    for (int n = 10; n <= 999_999_999; n *= 2) {
      Point[] points = createRandomPointArray(n);
      
      long startTime = System.currentTimeMillis();
      int colinear = numColinear(points);
      long endTime = System.currentTimeMillis();
      
      System.out.printf("%10d %10d %10d\n", n, colinear,
                        (endTime - startTime));
    }
  }
  
  public static int[] createRandomIntArray(int size) {
    int[] numbers = new int[size];
    Random rand = new Random();
    int min = rand.nextInt(size);
    int max = rand.nextInt(size - min) + min;
    for (int i = 0; i < size; i++) {
      numbers[i] = rand.nextInt(max - min + 1) + min;
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
  
  // Returns the largest of all integers in the given array.
  public static int max(int[] numbers) {
    int max = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      max = Math.max(max, numbers[i]);
    }
    return max;
  }
  
  // Returns the closest distance between any pair of points
  // in the given array.
  public static double closestDistance(Point[] points) {
    double closest = points[0].distance(points[1]);
    for (int i = 0; i < points.length; i++) {
      for (int j = 0; j < points.length; j++) {
        if (i != j) {
          double dist = points[i].distance(points[j]);
          closest = Math.min(closest, dist);
        }
      }
    }
    return closest;
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
  
  // Returns the number of triples of points that can be
  // connected by a straight line.
  public static int numColinear(Point[] points) {
    int count = 0;
    for (int i = 0; i < points.length; i++) {
      for (int j = i + 1; j < points.length; j++) {
        for (int k = j + 1; k < points.length; k++) {
          double slope1 = Math.abs((points[j].y -
                                    points[i].y) / points[j].x - points[i].x);
          double slope2 = Math.abs((points[k].y -
                                    points[j].y) / points[k].x - points[j].x);
          if (Math.abs(slope1 - slope2) < 0.1) {
            count++;
          }
        }
      }
    }
    return count;
  }
}
