package chapter2_Intro_Java_Input_Ouput._2_14;

/**
 * 2.14 Write an application that displays the numbers 1 to 4 on the same line, with each pair of
 * adjacent numbers separated by one space. Use the following techniques:
 *      a) Use one System.out.println statement.
 *      b) Use four System.out.print statements.
 *      c) Use one System.out.printf statement.
 *
 * Created by ag on 15-Jun-20 12:06 PM
 */
class Main {
  public static void main(String[] args) {
    System.out.println("1 2 3 4");
    System.out.println("---");

    System.out.print("1 2 3 4\n");
    System.out.println("---");

    System.out.printf("1 2 3 4%n");
  }
}
