package chapter9_Objects_Classes._9_13_Location;

import java.util.Scanner;

/**
 * **9.13 (The Location class) Design a class named Location for locating a maximal
 * value and its location in a two-dimensional array. The class contains public data
 * fields row, column, and maxValue that store the maximal value and its indices in
 * a two-dimensional array with row and column as int types and maxValue as a
 * double type.
 * Write the following method that returns the location of the largest element in a
 * two-dimensional array:
 * public static Location locateLargest(double[][] a)
 * The return value is an instance of Location. Write a test program that prompts
 * the user to enter a two-dimensional array and displays the location of the largest
 * element in the array.
 *
 * Created by ag on 28-May-20 1:57 PM
 */
public class LocationTest {

    private Scanner scanner = new Scanner(System.in);

    public Scanner getScanner() {
        return scanner;
    }

    public static void main(String[] args) {
        // check with null array
        try {
            Location.locateLargest(null);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        System.out.println();

        var test = new LocationTest();
        double[][] arr = getArray(test);
        printArray(arr);

        System.out.println(Location.locateLargest(arr));

    }

    private static void printArray(double[][] arr) {
        System.out.println("\nArray is: ");
        for (double[] row : arr) {
            for (double v : row) {
                System.out.print(v + " ");
            }
        }
    }

    private static double[][] getArray(LocationTest test) {
        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = test.getScanner().nextInt();
        int col = test.getScanner().nextInt();
        double[][] arr = new double[rows][col];

        System.out.println("Enter the array: ");
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < col; c++) {
                arr[r][c] = test.getScanner().nextDouble();
            }
        }
        return arr;
    }
}
