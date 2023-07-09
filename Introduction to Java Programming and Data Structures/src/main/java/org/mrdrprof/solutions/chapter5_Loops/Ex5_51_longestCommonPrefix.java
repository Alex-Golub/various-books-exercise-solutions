package org.mrdrprof.solutions.chapter5_Loops;

import java.util.Scanner;

/**
 * *5.51 (Longest common prefix)
 *
 * @author Mr.Dr.Professor
 * @since 26-Jan-21 10:38 PM
 */
class Ex5_51_longestCommonPrefix {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);

    System.out.print("Enter the first string: ");
    String s1 = console.nextLine();
    System.out.print("Enter the second string: ");
    String s2 = console.nextLine();

    int j         = 0; // j will be the index where common prefix stops
    int minLength = Math.min(s1.length(), s2.length());
    while (j < minLength && s1.charAt(j) == s2.charAt(j)) {
      j++;
    }

    if (j == 0) {
      System.out.printf("%s and %s have no common prefix\n", s1, s2);
    } else {
      System.out.printf("The common prefix is %s\n", s1.substring(0, j));
    }
  }
}
