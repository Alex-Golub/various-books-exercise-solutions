package CodeStepByStep_java.arrays;

/**
 * Write a method named hasMirrorTwice that accepts two arrays
 * of integers a1 and a2 as parameters and returns true if a1
 * contains all the elements of a2 in reverse order at least
 * twice (and false otherwise).
 * <p>
 * Constrains:
 * 1. Assume that both arrays passed to your method will have a
 * length of at least 1.
 * This means that the shortest possible mirror will be of length 1,
 * representing a single element (which is its own mirror).
 * <p>
 * 2. A sequence that is a palindrome (the same forwards as backwards)
 * is considered its own mirror and should be included in your computations.
 * For example, if a1 is {6, 1, 2, 1, 4, 1, 2, 1, 5} and a2 is {1, 2, 1},
 * your method should return true.
 * <p>
 * 3. The two occurrences of the mirror might overlap
 * <p>
 * 4. Do not modify the contents of the arrays passed to your method
 * as parameters.
 *
 * @author Mr.Dr.Professor
 * @since 12-Feb-21 1:11 PM
 */
class hasMirrorTwice {
  public static void main(String[] args) {
    int[] a1 = {6, 1, 2, 1, 3, 1, 3, 2, 1, 5};
    int[] a2 = {1, 2};
    System.out.println("true => " + hasMirrorTwice(a1, a2));

    int[] a3 = {5, 8, 4, 18, 5, 42, 4, 8, 5, 5};
    int[] a4 = {4, 8, 5};
    System.out.println("false => " + hasMirrorTwice(a3, a4));

    int[] a5 = {6, 3, 42, 18, 12, 5, 3, 42, 3, 42};
    int[] a6 = {42, 3};
    System.out.println("true => " + hasMirrorTwice(a5, a6));

    int[] a7 = {6, 1, 2, 4, 2, 1, 2, 4, 2, 1, 5};
    int[] a8 = {1, 2, 4, 2, 1};
    System.out.println("true => " + hasMirrorTwice(a7, a8));

    int[] a9 = {0, 0};
    int[] aa = {0};
    System.out.println("true => " + hasMirrorTwice(a9, aa));

    int[] ab = {8, 9, 2, 1};
    int[] ac = {5, 7, 1, 2, 9, 8};
    System.out.println("false => " + hasMirrorTwice(ab, ac));
  }

  public static boolean hasMirrorTwice(int[] a1, int[] a2) {
    int mirrorCount = 0;
    for (int i = 0; i <= a1.length - a2.length; i++) {
      int count = 0;

      for (int j = 0; j < a2.length; j++) {
        if (a1[i + j] == a2[a2.length - 1 - j])
          count++;
      }

      if (count >= a2.length)
        mirrorCount++;
    }

    return mirrorCount >= 2;
  }
}
