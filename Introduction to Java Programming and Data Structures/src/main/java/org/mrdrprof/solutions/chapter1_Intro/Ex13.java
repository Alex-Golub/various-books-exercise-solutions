package org.mrdrprof.solutions.chapter1_Intro;

/**
 * *1.13 (Algebra: solve 2 * 2 linear equations)
 * You can use Cramer’s rule to solve the following 2 * 2 system of linear
 * equation provided that ad – bc is not 0:
 *
 * Write a program that solves the following equation and displays the value
 * for x and y:
 * 3.4x + 50.2y = 44.5
 * 2.1x + .55y = 5.9
 *
 * (Hint: replace the symbols in the formula with numbers to compute x and y.
 *
 * Created by ag on 30-Sep-20 11:20 PM 
 */
class Ex13 {
  public static void main(String[] args) {
    double a = 3.4, b = 50.2, e = 44.5;
    double c = 2.1, d = 0.55, f = 5.9;

    double x = (e * d - b * f) / (a * d - b * c);
    double y = (a * f - e * c) / (a * d - b * c);

    System.out.println("x = " + x + ", y = " + y);
  }
}
