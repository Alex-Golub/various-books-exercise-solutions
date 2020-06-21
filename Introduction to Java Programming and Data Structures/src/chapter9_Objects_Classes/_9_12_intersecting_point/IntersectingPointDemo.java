package chapter9_Objects_Classes._9_12_intersecting_point;

import java.util.Scanner;

/**
 * **9.12 (Geometry: intersecting point) Suppose two line segments intersect.
 * The two endpoints for the first line segment are (x1, y1) and (x2, y2) and for the second line
 * segment are (x3, y3) and (x4, y4). Write a program that prompts the user to enter
 * these four endpoints and displays the intersecting point.
 * As discussed in Programming Exercise 3.25, the intersecting point can be found by solving a
 * linear equation. Use the LinearEquation class in Programming Exercise 9.11 to solve this
 * equation. See Programming Exercise 3.25 for sample runs
 * <p>
 *
 * FIXME: convert all to double
 * Created by ag on 28-May-20 1:09 PM
 */
public class IntersectingPointDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            // 1st line coordinates
            int[] c = getLineCoordinates(sc);
            Line l1 = new Line(new Point(c[0], c[1]), new Point(c[2], c[3]));
            System.out.println("Line 1: " + l1);

            // 2nd line coordinates
            c = getLineCoordinates(sc);
            Line l2 = new Line(new Point(c[0], c[1]), new Point(c[2], c[3]));
            System.out.println("Line 2: " + l2);

            Point intersection = l1.intersectionPoint(l2);
            System.out.println(intersection == null ? "Line are parallel - no intersection" : "Intersection Point: " + intersection);

            System.out.print("Continue? (y - yes, any other no): ");
            String input = sc.nextLine();
            if (!"y".equalsIgnoreCase(input))
                exit = true;

            System.out.println();
        }

    }

    private static int[] getLineCoordinates(Scanner sc) {
        System.out.print("Enter line starting coordinates(space separated): ");
        String[] c = sc.nextLine().split("\\s+");

        int x1 = Integer.parseInt(c[0]);
        int y1 = Integer.parseInt(c[1]);

        System.out.print("Enter line ending coordinates(space separated): ");
        c = sc.nextLine().split("\\s+");
        int x2 = Integer.parseInt(c[0]);
        int y2 = Integer.parseInt(c[1]);

        return new int[]{x1, y1, x2, y2};
    }
}
