package chapter3_Selections;

import java.util.Scanner;

/**
 * *3.1 (Algebra: solve quadratic equations)
 * Write a program that prompts the user to enter values for a, b, and c and
 * displays the result based on the discriminant.
 *
 * Created by ag on 22-Oct-20 8:42 AM
 */
class Ex3_1_Quadratic_Equations {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a, b, c: ");
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();

    double dis = b * b - 4 * a * c;
    switch (Double.compare(dis, 0.0)) {
      case 1:
        double r1 = (-b + Math.pow(dis, 0.5)) / (2 * a);
        double r2 = (-b - Math.pow(dis, 0.5)) / (2 * a);
        System.out.printf("The equation has two roots %.6f and %.6f\n", r1, r2);
        break;
      case 0:
        double r = -b / (2.0 * a);
        System.out.printf("The equation has one root %.6f\n", r);
        break;
      case -1:
        System.out.println("The equation has no real roots");
        break;
    }
  }
}
