package org.mrdrprof.solutions.chapter7_SD_Arrays;

import java.util.Scanner;

/**
 * **7.34 (Sort characters in a string)
 *
 * Enter string: bbBac123AAqweevvvG12'''asd??
 * After sort: '''11223??AABGaabbcdeeqsvvvw
 *
 * Enter string: zZZzjjJabCCaaAAb1234''''
 * After sort: ''''1234AACCJZZaaabbjjzz
 *
 * @author Mr.Dr.Professor
 * @since 07-Feb-21 8:59 PM
 */
class Ex7_34_sortCharactersInString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.print("Enter string: ");
      String s = sc.nextLine();
      System.out.println("After sort: " + sort(s));
    }
  }

  public static String sort(String s) {
    int[] ascii = new int[255];

    for (char c : s.toCharArray()) {
      ascii[c]++;
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < ascii.length; i++) {
      if (ascii[i] != 0) {
        sb.append(String.valueOf((char) i).repeat(ascii[i]));
      }
    }

    return sb.toString();
  }

}
