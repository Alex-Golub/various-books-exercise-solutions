package org.mrdrprof.solutions.chapter6_Methods;

import java.util.Scanner;

/**
 * @author Mr.Dr.Professor
 * @since 27-Jan-21 7:14 PM
 */
class Hex2Dec {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.print("Enter a hex number: ");
      String hex = sc.next();
      System.out.printf("(%s)16 = (%d)10\n\n",
                        hex, hex2Dec(hex.toUpperCase()));
    }
  }

  private static int hex2Dec(String hex) {
    int decimalValue = 0;

    for (int i = 0; i < hex.length(); i++) {
      char hexChar = hex.charAt(i);
      decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
    }

    return decimalValue;
  }

  private static int hexCharToDecimal(char hexChar) {
    return 'A' <= hexChar && hexChar <= 'F' ?
           10 + hexChar - 'A' : hexChar - '0';
  }
}
