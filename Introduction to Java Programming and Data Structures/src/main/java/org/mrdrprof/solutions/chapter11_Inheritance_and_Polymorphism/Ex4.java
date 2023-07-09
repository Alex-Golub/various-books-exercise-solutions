package org.mrdrprof.solutions.chapter11_Inheritance_and_Polymorphism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * (Maximum element in ArrayList)
 *
 * @author Alex Golub
 * @since 02/06/2023 1:27 PM
 */
class Ex4 {
    public static void main(String[] args) {
        try (Scanner console = new Scanner(System.in)) {
            List<Integer> list = new ArrayList<>();
            System.out.print("Enter numbers (0 to end the sequence): ");
            while (true) {
                int input = console.nextInt();
                if (input == 0) {
                    break;
                }

                list.add(input);
            }

            Integer max = max(list);
            if (max == null) {
                System.out.println("The list is empty");
            } else {
                System.out.println("Largest number in the list: " + max);
            }
        }
    }

    public static Integer max(List<Integer> list) {
        return list == null || list.isEmpty() ?
                null :
                Collections.max(list);
    }
}
