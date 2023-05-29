package chapter11_Inheritance_and_Polymorphism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 11.11 (Sort ArrayList)
 * 11.12 (Sum ArrayList)
 * *11.13 (Remove duplicates)
 * 11.14 (Combine two lists)
 *
 * @author Alex Golub
 * @since 02/06/2023 5:18 PM
 */
class Ex11_14 {

    private static final Scanner CONSOLE = new Scanner(System.in);
    private static final Integer NUMBER_OF_ELEMENTS = 5;

    public static void main(String[] args) {
        List<Double> list1 = getInput(1);
        System.out.println(list1);
        sort(list1);
        System.out.println("sort(list1) = " + list1);
        System.out.println("sum(list1) = " + sum(list1));
        removeDuplicate(list1);
        System.out.println("removeDuplicate(list1) = " + list1);

        List<Double> list2 = getInput(2);
        System.out.println("The combined list is " + union(list1, list2));
    }

    private static List<Double> getInput(int listNumber) {
        System.out.printf("Enter %d integers for list%d: ", NUMBER_OF_ELEMENTS, listNumber);
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            list.add(CONSOLE.nextDouble());
        }

        return list;
    }

    public static void sort(List<Double> list) {
        Collections.sort(list);
    }

    public static double sum(List<Double> list) {
        return list.stream()
                   .mapToDouble(Double::doubleValue)
                   .sum();
    }

    public static void removeDuplicate(List<Double> list) {
        List<Double> distinct = new ArrayList<>();
        for (Double aDouble : list) {
            if (!distinct.contains(aDouble)) {
                distinct.add(aDouble);
            }
        }

        list.clear();
        list.addAll(distinct);
    }

    public static <T> List<T> union(List<T> list1, List<T> list2) {
        List<T> combined = new ArrayList<>();
        combined.addAll(list1);
        combined.addAll(list2);
        return combined;
    }
}
