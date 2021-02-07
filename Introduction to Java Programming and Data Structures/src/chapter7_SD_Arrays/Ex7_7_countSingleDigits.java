package chapter7_SD_Arrays;

/**
 * *7.7 (Count single digits)
 * Generate 200 random integers between
 * 0 and 9 and displays the count for each number.
 *
 * @author Mr.Dr.Professor
 * @since 01-Feb-21 3:53 PM
 */
class Ex7_7_countSingleDigits {
  public static void main(String[] args) {
    final int N    = 200;
    final int FROM = 0; // can't be -ve number
    final int TO   = 9;

    int[] counter = new int[TO + 1]; // [0, 9]
    for (int i = 0; i < N; i++) {
      counter[FROM + (int) (Math.random() * (TO - FROM + 1))]++;
    }

    int total = 0;
    System.out.printf("%-10s%s\n", "Digit", "Occurrences");
    System.out.println("-".repeat(21));

    for (int i = 0; i < counter.length; i++) {
      System.out.printf("%-10d%s\n", i, counter[i]);
      total += counter[i];
    }

    System.out.println("-".repeat(21));
    System.out.printf("%-10sTotal = %d\n", "", total);
  }
}
