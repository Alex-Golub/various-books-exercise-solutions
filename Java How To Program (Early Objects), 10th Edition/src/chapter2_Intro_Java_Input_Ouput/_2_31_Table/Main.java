package chapter2_Intro_Java_Input_Ouput._2_31_Table;

/**
 * 2.31 (Table of Squares and Cubes) Using only the programming techniques you learned in this
 * chapter, write an application that calculates the squares and cubes of the numbers from 0 to 10 and
 * prints the resulting values in table format
 *
 * Created by ag on 15-Jun-20 1:30 PM
 */
public class Main {
  public static void main(String[] args) {
    System.out.printf("%-8s%-8s%-8s%n", "number", "square", "cube");
    System.out.printf("%-8d%-8d%-8d%n", 0, 0, 0);
    System.out.printf("%-8d%-8d%-8d%n", 1, 1, 1);
    System.out.printf("%-8d%-8d%-8d%n", 2, 2 * 2, 2 * 2 * 2);
    System.out.printf("%-8d%-8d%-8d%n", 3, 3 * 3, 3 * 3 * 3);
    System.out.printf("%-8d%-8d%-8d%n", 4, 4 * 4, 4 * 4 * 4);
    System.out.printf("%-8d%-8d%-8d%n", 5, 5 * 5, 5 * 5 * 5);
    System.out.printf("%-8d%-8d%-8d%n", 6, 6 * 6, 6 * 6 * 6);
    System.out.printf("%-8d%-8d%-8d%n", 7, 7 * 7, 7 * 7 * 7);
    System.out.printf("%-8d%-8d%-8d%n", 8, 8 * 8, 8 * 8 * 8);
    System.out.printf("%-8d%-8d%-8d%n", 9, 9 * 9, 9 * 9 * 9);
    System.out.printf("%-8d%-8d%-8d%n", 10, 10 * 10, 10 * 10 * 10);

  }
}
