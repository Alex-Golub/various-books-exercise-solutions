package chapter11_Inheritance_and_Polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * *11.9 (Largest rows and columns)
 *
 * @author Alex Golub
 * @since 02/06/2023 3:27 PM
 */
class Ex9 {

    private static final int TIMES_TO_EXECUTE = 5;
    private static final Scanner CONSOLE = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < TIMES_TO_EXECUTE; i++) {
            System.out.println("Execution " + (i + 1) + " out of " + TIMES_TO_EXECUTE);
            int matrixSize = getInput();
            List<List<Integer>> matrix = generateRandomMatrix(matrixSize);
            printMatrix(matrix);
            System.out.printf("The largest row index: %d%n", findLargestRowIndex(matrix));
            System.out.printf("The largest column index: %d%n", findLargestColumnIndex(matrix));
            System.out.println("-".repeat(50));
        }

        CONSOLE.close();
    }

    private static long findLargestColumnIndex(List<List<Integer>> matrix) {
        long largestColumnIndex = 0;
        long maxCountOfOneSoFar = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.size(); i++) {
            long columOneCount = 0;
            for (List<Integer> row : matrix) {
                if (row.get(i) == 1) {
                    columOneCount++;
                }
            }

            if (columOneCount > maxCountOfOneSoFar) {
                largestColumnIndex = i;
                maxCountOfOneSoFar = columOneCount;
            }
        }

        return largestColumnIndex;
    }

    private static long findLargestRowIndex(List<List<Integer>> matrix) {
        long largestRowIndex = 0;
        long maxCountOfOneSoFar = Integer.MIN_VALUE;

        for (int row = 0; row < matrix.size(); row++) {
            long rowOneCount = countOnesInRow(matrix.get(row));

            if (rowOneCount > maxCountOfOneSoFar) {
                largestRowIndex = row;
                maxCountOfOneSoFar = rowOneCount;
            }
        }

        return largestRowIndex;
    }

    private static long countOnesInRow(List<Integer> row) {
        return row.stream()
                  .filter(integer -> integer == 1)
                  .count();
    }

    private static void printMatrix(List<List<Integer>> matrix) {
        for (List<Integer> row : matrix) {
            System.out.println(row);
        }
    }

    private static List<List<Integer>> generateRandomMatrix(int matrixSize) {
        Random zeroOneGenerator = new Random();
        List<List<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < matrixSize; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < matrixSize; j++) {
                row.add(zeroOneGenerator.nextInt(2));
            }
            matrix.add(row);
        }

        return matrix;
    }

    private static int getInput() {
        System.out.print("Enter the array size n: ");
        int size = Integer.parseInt(CONSOLE.nextLine());
        if (size <= 0) {
            throw new RuntimeException("Matrix size should be positive number, got %d".formatted(size));
        }

        return size;
    }
}
