package chapter2_objects;

import java.math.BigInteger;

/**
 * •• P2.6
 * Write a program that prints the square, fourth power,
 * and eighth power of a, using one of the methods of the
 * BigInteger class.
 *
 * @author Mr.Dr.Professor
 * @since 11-Nov-20 11:58 AM
 */
class PP2_6_BigInteger {
  public static void main(String[] args) {
    BigInteger a = new BigInteger("12345678987654321");
    BigInteger square = a.pow(2);
    BigInteger forthPower = a.pow(4);
    BigInteger eightPower = a.pow(8);

    System.out.println("Square: " + square);
    System.out.println("Forth Power: " + forthPower);
    System.out.println("Eight Power: " + eightPower);
  }
}
