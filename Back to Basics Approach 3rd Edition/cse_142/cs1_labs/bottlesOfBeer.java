package cse_142.cs1_labs;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab2/bottlesOfBeer
 *
 * @author Alex Golub
 * @since 05-Apr-21 1:19 PM
 */
class bottlesOfBeer {
  public static void main(String[] args) {
    for (int i = 10; i > 0; i--) {
      System.out.printf("%d bottles of beer on the wall, %d bottles of beer\n", i, i);
      System.out.printf("Take one down, pass it around, %d bottles of beer on the wall\n\n", i - 1);
    }
  }
}
