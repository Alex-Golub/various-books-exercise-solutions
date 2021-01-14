package chapter7_arrays;

import java.util.Arrays;

/**
 * 17. Write a method called vowelCount that accepts a String as a
 * parameter and returns an array of integers representing the
 * counts of each vowel in the string.
 * The array returned by your method should hold five elements:
 * the first is the count of As,
 * the second is the count of Es,
 * the third Is,
 * the fourth Os,
 * and the fifth Us.
 * Assume that the string contains no uppercase letters.
 *
 * @author Mr.Dr.Professor
 * @since 11-Jan-21 8:21 PM
 */
class Ex7_17_vowelCount {
  public static void main(String[] args) {
    String s   = "i think, therefore i am";
    int[]  res = {1, 3, 3, 1, 0};
    System.out.println(Arrays.equals(vowelCount(s), res));
  }

  public static int[] vowelCount(String str) {
    int[] vowelCount = new int[5];

    if (str == null || str.length() == 0)
      return vowelCount;

    for (char c : str.toLowerCase().toCharArray()) {
      switch (c) {
        case 'a': vowelCount[0]++; break;
        case 'e': vowelCount[1]++; break;
        case 'i': vowelCount[2]++; break;
        case 'o': vowelCount[3]++; break;
        case 'u': vowelCount[4]++; break;
      }
    }

    return vowelCount;
  }
}
