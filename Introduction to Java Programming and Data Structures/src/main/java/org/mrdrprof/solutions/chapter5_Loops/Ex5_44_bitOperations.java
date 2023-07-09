package org.mrdrprof.solutions.chapter5_Loops;

import java.util.Scanner;

/**
 * *5.44 (Computer architecture: bit-level operations)
 * 1Byte = 8Bits
 * NOTES:
 * 1. n >> i i.e. shift binary representation of n by i places to the right
 * i.e. divide n by 2^i
 * 2. n & 1 i.e. bitwise AND operation between n and 1 (0001)
 * we can get only 1 or 0 with this operation
 *
 * @author Mr.Dr.Professor
 * @since 25-Jan-21 7:31 PM
 */
class Ex5_44_bitOperations {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    while (true) {
      System.out.print("Enter an integer(-128 - +127): ");
      byte num = console.nextByte();

      System.out.print("The 8 bits are ");
      for (int i = 8; i >= 0; i--)
        System.out.print((num >> i) & 1);

      System.out.println("\n");
    }
  }
}
