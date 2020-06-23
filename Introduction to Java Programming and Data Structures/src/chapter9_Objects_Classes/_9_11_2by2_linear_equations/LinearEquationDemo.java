package chapter9_Objects_Classes._9_11_2by2_linear_equations;

/**
 * *9.11 (Algebra: 2 * 2 linear equations) Design a class named LinearEquation for a
 * 2 * 2 system of linear equations:
 * ax + by = e
 * cx + dy = f
 * <p>
 * The class contains:
 * ■■ Private data fields a, b, c, d, e, and f.
 * ■■ A constructor with the arguments for a, b, c, d, e, and f.
 * ■■ Six getter methods for a, b, c, d, e, and f.
 * ■■ A method named isSolvable() that returns true if ad - bc is not 0.
 * ■■ Methods getX() and getY() that return the solution for the equation.
 * Draw the UML diagram for the class then implement the class.
 * Write a test program that prompts the user to enter a, b, c, d, e, and f and displays the result. If
 * ad - bc is 0, report that “The equation has no solution.” See Programming Exercise 3.3 for sample runs.
 * <p>
 * Created by ag on 24-May-20 5:49 PM
 */
class LinearEquationDemo {
  public static void main(String[] args) {

    solvable();

    System.out.println();

    unSolvable();

  }

  private static void unSolvable() {
    LinearEquation unSolvable = new LinearEquation(1, 1, 1, 1, 1, 0);
    System.out.println(unSolvable);
    System.out.println("Is solvable? " + (unSolvable.isSolvable() ? "Yes" : "No"));

    try {
      System.out.println("Solution: x = " + unSolvable.getX() + ", y = " + unSolvable.getY());
    } catch (ArithmeticException e) {
      System.err.println(e.getMessage());
    }
  }

  private static void solvable() {
    LinearEquation solvable = new LinearEquation(1, 2, 3, 4, 5, 6);
    System.out.println(solvable);
    System.out.println("Is solvable? " + (solvable.isSolvable() ? "Yes" : "No"));

    try {
      System.out.println("Solution: x = " + solvable.getX() + ", y = " + solvable.getY());
    } catch (ArithmeticException e) {
      System.err.println(e.getMessage());
    }
  }
}
