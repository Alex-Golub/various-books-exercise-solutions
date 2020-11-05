package chapter2_data_loops;

import java.util.Scanner;

/**
 * 1. In physics, a common useful equation for finding the position s of
 * a body in linear motion at a given time t, based on
 * its initial position s0, initial velocity v0, and rate of acceleration a.
 * Write code to declare variables for s0, v0, a, and t, and then
 * write the code to compute s on the basis of these values.
 * <p>
 * Created by ag on 30-Oct-20 1:07 PM
 */
class Ex2_1_Displacement {
  public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    System.out.print("Enter s0, v0, a and t: ");
//    double s0 = scanner.nextDouble();
//    double v0 = scanner.nextDouble();
//    double a  = scanner.nextDouble();
//    double t  = scanner.nextDouble();
//
//    double s = s0 + v0 * t + 0.5 * a * t * t;
//    System.out.println("Displacement = " + s);

    double s0 = 12.0;
    double v0 = 3.5;
    double a  = 9.8;
    double t  = 10;

    double s = s0 + v0 * t + 0.5 * a * t * t;
    System.out.println(s);
  }
}
