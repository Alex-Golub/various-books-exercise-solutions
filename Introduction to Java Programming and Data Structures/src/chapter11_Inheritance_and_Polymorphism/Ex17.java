package chapter11_Inheritance_and_Polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * **11.17 (Algebra: perfect square)
 * NOTE: If it is not empty, calculate n by multiplying all the factors that appear an odd number of times.
 *
 * @author Alex Golub
 * @since 02/06/2023 6:20 PM
 */
class Ex17 {

    private static final Scanner CONSOLE = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter an integer m: ");
        int m = Integer.parseInt(CONSOLE.nextLine());
        int tmp = m;
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= tmp; ) {
            if (tmp % i == 0) {
                factors.add(i);
                tmp /= i;
            } else {
                i++;
            }
        }

        if (!factors.isEmpty()) {
            Integer lastFactor = factors.get(factors.size() - 1);
            boolean[] factorsFrequency = new boolean[lastFactor + 1];
            for (int factor : factors) {
                // if factorsFrequency in index i is true then the factor appeared odd number of times
                factorsFrequency[factor] = !factorsFrequency[factor];
            }

            int n = 1;
            for (int i = 2; i < factorsFrequency.length; i++) {
                if (factorsFrequency[i]) {
                    n *= i;
                }
            }

            System.out.println("The smallest number n for m * n to be a perfect square is " + n);
            System.out.println("m * n is " + (m * n));
        }
    }
}
// 90 / 2 = 45
// 45 / 3 = 15
// 15 / 3 = 5
// 5 / 5 = 1
// 2 3 3 5
