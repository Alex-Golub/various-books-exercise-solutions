package chapter2_data_loops;

/**
 * 3. The Fibonacci numbers are a sequence of integers in which the first two
 * elements are 1, and each following element is the sum of the two
 * preceding elements.
 * F(k):
 *      k > 2  : F(k-1) + F(k-2)
 *      k <= 2 : 1
 * Write a for loop that computes and prints the first 12 Fibonacci numbers.
 *
 * Created by ag on 30-Oct-20 1:45 PM
 */
class Ex2_3_Fibonacci {
  public static void main(String[] args) {
    int f1 = 1, f2 = 1;
    System.out.print(f1 + " " + f2 + " ");
    for (int i = 1; i <= 10; i++) {
      System.out.print(f2 + f1 + " ");
      f2 = f2 + f1;
      f1 = f2 - f1;
    }
  }
}
