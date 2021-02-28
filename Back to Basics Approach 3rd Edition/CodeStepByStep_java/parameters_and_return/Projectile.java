package CodeStepByStep_java.parameters_and_return;

import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/Projectile
 *
 * @author Mr.Dr.Professor
 * @since 27-Feb-21 12:59 AM
 */
/*public*/ class Projectile {
  static final double G = -9.81;

  static final Scanner console = new Scanner(System.in);

  public static void main(String[] args) {
    intro();

    System.out.print("Velocity  (m/s)? ");
    int v = console.nextInt();

    System.out.print("Angle (degrees)? ");
    int theta = console.nextInt();

    System.out.print("Number of steps? ");
    int steps = console.nextInt();

    System.out.println();

    printProjectile(v, Math.toRadians(theta), steps);
  }

  private static void printProjectile(int v, double theta, int steps) {
    System.out.printf("%-8s%-8s%-8s%s\n", "step", "x", "y", "time");
    System.out.println("----------------------------");

    double xVelocity = v * Math.cos(theta);
    double yVelocity = v * Math.sin(theta);
    double totalTime = -2.0 * yVelocity / G; // up and down
    double timeIncrement = totalTime / steps;
    double xIncrement = xVelocity * timeIncrement;

    double x = 0.0;
    double y = 0.0;
    double t = 0.0;

    System.out.printf("%-8d%-8.2f%-8.2f%.2f\n", 0, 0.00, 0.00, 0.00);
    for (int i = 1; i <= steps; i++) {
      t += timeIncrement;
      x += xIncrement;
      y = displacement(yVelocity, t);

      System.out.printf("%-8d%-8.2f%-8.2f%.2f\n", i, x, y, t);
    }
  }

  private static double displacement(double v, double t) {
    return v * t + 0.5 * t * t * G;
  }

  private static void intro() {
    System.out.println("This program computes the trajectory of a projectile given");
    System.out.println("its initial velocity and angle relative to the horizontal.");
    System.out.println();
  }

}
