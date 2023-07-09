package org.mrdrprof.solutions.chapter1_Intro;

/**
 * 1.4 (Print a table) Write a program that displays the following table:
 *
 * Created by ag on 30-Sep-20 10:35 PM 
 */
class Ex4 {
  public static void main(String[] args) {
    System.out.println("a   a^2   a^3   a^4");
    System.out.println("1   1     1     1");
    System.out.println("2   " + 2*2 + "     " + 2*2*2 + "     " + 2*2*2*2);
    System.out.println("3   " + 3*3 + "     " + 3*3*3 + "    " + 3*3*3*3);
    System.out.println("4   " + 4*4 + "    " +  4*4*4 + "    " + 4*4*4*4);
  }
}
