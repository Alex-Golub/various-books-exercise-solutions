package chapter11_Inheritance_and_Polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Ex19 {

    public static final Scanner CONSOLE = new Scanner(System.in);
    public static final int CONTAINER_MAX_WEIGHT = 10;

    public static void main(String[] args) {
        System.out.print("Enter the number of objects: ");
        int numberOfObjects = CONSOLE.nextInt();

        // Create an array to store the weights of the objects
        int[] weights = new int[numberOfObjects];

        // Get the weights of the objects
        System.out.print("Enter the weights of the objects: ");
        for (int i = 0; i < numberOfObjects; i++) {
            weights[i] = CONSOLE.nextInt();
        }

        // Sort the objects by weight
        Arrays.sort(weights);

        // Create an array to store the contents of the bins
        List<List<Integer>> bins = new ArrayList<>();

        for (int i = 0; i < numberOfObjects; i++) {
            // Find the best fit bin for the object
            int binIndex = -1;
            int minCapacity = Integer.MAX_VALUE;

            for (int j = 0; j < bins.size(); j++) {
                if (bins.get(j).size() < CONTAINER_MAX_WEIGHT &&
                    bins.get(j).get(bins.get(j).size() - 1) + weights[i] <= CONTAINER_MAX_WEIGHT) {
                    if (bins.get(j).get(bins.get(j).size() - 1) + weights[i] < minCapacity) {
                        minCapacity = bins.get(j).get(bins.get(j).size() - 1) + weights[i];
                        binIndex = j;
                    }
                }
            }

            // If no bin can fit the object, create a new bin
            if (binIndex == -1) {
                bins.add(new ArrayList<>());
                binIndex = bins.size() - 1;
            }

            // Add the object to the bin
            bins.get(binIndex).add(weights[i]);
        }

        // Print the number of bins
        System.out.println("Number of bins: " + bins.size());

        // Print the contents of each bin
        for (int i = 0; i < bins.size(); i++) {
            System.out.println("Container " + i + " contains objects with weight: " + bins.get(i));
        }
    }
}
