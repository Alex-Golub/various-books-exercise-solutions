package chapter7_arrays;

import java.util.Scanner;

/**
 * 1. Java’s type int has a limit on how large an integer it can store.
 * This limit can be circumvented by representing an
 * integer as an array of digits.
 * Write an interactive program that adds two integers of up to 50 digits each.
 *
 * NOTE: Works with positive integers only.
 *
 * @author Mr.Dr.Professor
 * @since 14-Jan-21 2:14 PM
 */
class PP7_1_hugeInteger {
  static final Scanner console = new Scanner(System.in);

  public static void main(String[] args) {
    prompt();

    while (true) {
      int[][] pair = getInput();
      int[]   n1   = pair[0];
      int[]   n2   = pair[1];
      int[]   res  = add(n1, n2);
      System.out.println(toString(n1) + " + " + toString(n2) + " = " + toString(res));
      System.out.println();
    }

//    System.out.println(Arrays.deepToString(pair));
  }

  private static int[] add(int[] n1, int[] n2) {
    int   n1Len = n1.length;
    int   n2Len = n2.length;
    int[] res   = new int[Math.max(n1Len, n2Len) + 1];
    int   carry = 0;

    int i = n1Len - 1;
    int j = n2Len - 1;
    int k = res.length - 1;

    while (i >= 0 && j >= 0) {
      res[k] = (n1[i] + n2[j] + carry) % 10;
      carry = (n1[i] + n2[j]) / 10;
      i--;
      j--;
      k--;
    }

    while (i >= 0) { // more digits left in n1
      res[k] = n1[i] + carry;
      carry = 0;
      i--;
      k--;
    }

    while (j >= 0) { // more digits left in n2
      res[k] = n2[j] + carry;
      carry = 0;
      j--;
      k--;
    }

    res[0] = carry; // append last carry from last operation
    return res;
  }

  private static String toString(int[] arr) {
    StringBuilder res = new StringBuilder();
    int           i   = 0;
    while (i < arr.length && arr[i] == 0) {
      i++;
    }

    while (i < arr.length) {
      res.append(arr[i]);
      i++;
    }
    return res.toString();
  }

  private static int[][] getInput() {
    System.out.print("Enter first number: ");
    String n1 = extractInteger(console.next());
    System.out.print("Enter second number: ");
    String n2 = extractInteger(console.next());

    int[] n1ToArr = toArray(n1);
    int[] n2ToArr = toArray(n2);

    return new int[][]{n1ToArr, n2ToArr};
  }

  private static int[] toArray(String n) {
    int[] arr = new int[n.length()];
    for (int i = 0; i < n.length(); i++)
      arr[i] = n.charAt(i) - '0';
    return arr;
  }

  // Extract whole number from string
  // stop parsing if character is not a digit
  private static String extractInteger(String s) {
    StringBuilder res = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c < '0' || c > '9')
        break;
      res.append(c);
    }

    // if s is not a legal number then return "0"
    return res.length() == 0 ? "0" : res.toString();
  }

  private static void prompt() {
    System.out.println(
            "This program calculates two integer numbers\n" +
            "with arbitrary number of digits.\n" +
            "=".repeat(43)
    );
  }
}
