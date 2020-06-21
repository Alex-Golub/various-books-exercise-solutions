package chapter9_Objects_Classes._9_10_Quadratic_Equations;

/**
 * *9.10 (Algebra: quadratic equations) Design a class named QuadraticEquation for
 * a quadratic equation ax^2 + bx + c = 0. The class contains:
 * ■■ Private data fields a, b, and c that represent three coefficients.
 * ■■ A constructor with the arguments for a, b, and c.
 * ■■ Three getter methods for a, b, and c.
 * ■■ A method named getDiscriminant() that returns the discriminant, which
 * is b2 - 4ac.
 * ■■ The methods named getRoot1() and getRoot2() for returning two roots
 * of the equation
 * <p>
 * These methods are useful only if the discriminant is nonnegative. Let these methods
 * return 0 if the discriminant is negative.
 * Draw the UML diagram for the class then implement the class.
 * Write a test program that prompts the user to enter values for a, b, and c and displays the result
 * based on the discriminant. If the discriminant is positive, display the two roots. If
 * the discriminant is 0, display the one root. Otherwise, display “The equation has
 * no roots.” See Programming Exercise 3.1 for sample runs.
 * <p>
 * Created by ag on 24-May-20 5:02 PM
 */
public class QuadraticEquationDemo {
    public static void main(String[] args) {

        noRoots();

        System.out.println();

        oneRoot();

        System.out.println();

        invalidEquation();

    }

    private static void noRoots() {
        QuadraticEquation noRoots = new QuadraticEquation(-1, 2, -3);
        System.out.println("No roots equation: " + noRoots);
        System.out.println("Discriminant = " + noRoots.getDiscriminant());

        // noRoots.getDiscriminant() < 0 no roots expected 0.0
        System.out.println("Roots r1 = " + noRoots.getRoot1() + ", r2 = " + noRoots.getRoot2());
    }

    private static void oneRoot() {
        // One root equation
        QuadraticEquation oneRoot = new QuadraticEquation(1, 2, 1);
        System.out.println("One root equation: " + oneRoot);
        System.out.println("Roots: r1 = " + oneRoot.getRoot1() + ", r2 = " + oneRoot.getRoot2());
    }

    private static void invalidEquation() {
        // Invalid quadratic noRoots
        try {
            QuadraticEquation linear = new QuadraticEquation(0, 2, -3);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
