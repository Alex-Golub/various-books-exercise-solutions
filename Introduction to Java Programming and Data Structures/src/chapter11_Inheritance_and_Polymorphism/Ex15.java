package chapter11_Inheritance_and_Polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * *11.15 (Area of a convex polygon)
 *
 * @author Alex Golub
 * @since 02/06/2023 6:10 PM
 */
class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of points: ");
        int numPoints = scanner.nextInt();

        List<Double> xCoordinates = new ArrayList<>();
        List<Double> yCoordinates = new ArrayList<>();

        System.out.println("Enter the coordinates of the points:");
        for (int i = 0; i < numPoints; i++) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            xCoordinates.add(x);
            yCoordinates.add(y);
        }

        double area = calculateConvexPolygonArea(xCoordinates, yCoordinates);
        System.out.printf("The total area is %.2f%n", area);

        scanner.close();
    }

    public static double calculateConvexPolygonArea(List<Double> xCoordinates, List<Double> yCoordinates) {
        int numPoints = xCoordinates.size();
        double area = 0;

        for (int i = 0; i < numPoints; i++) {
            double x1 = xCoordinates.get(i);
            double y1 = yCoordinates.get(i);
            double x2 = xCoordinates.get((i + 1) % numPoints);
            double y2 = yCoordinates.get((i + 1) % numPoints);
            area += x1 * y2 - x2 * y1;
        }

        return Math.abs(area / 2);
    }
}
