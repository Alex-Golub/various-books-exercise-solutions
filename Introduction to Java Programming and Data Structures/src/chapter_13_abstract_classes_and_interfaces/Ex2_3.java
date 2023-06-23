package chapter_13_abstract_classes_and_interfaces;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * *13.2 (Shuffle ArrayList) Write the following method that shuffles an ArrayList of
 * numbers:
 * public static void shuffle(ArrayList<Number> list)
 * <p>
 * *13.3 (Sort ArrayList) Write the following method that sorts an ArrayList of numbers:
 * public static void sort(ArrayList<Number> list)
 *
 * @author Alex Golub
 * @since 23/06/2023 7:30 PM
 */
class Ex2_3 {
    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>(Arrays.asList((byte) 1, (short) 2, 3, 4L, 5.0f, 6.0));
        System.out.println("numberList before shuffle: " + numberList);
        shuffle(numberList);
        System.out.println("numberList after shuffle(List<Number< list): " + numberList);

        sort(numberList);
        System.out.println("numberList after sort(List<Number> list): " + numberList);
    }

    public static void shuffle(List<Number> list) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i = 0; i < list.size(); i++) {
            Collections.swap(list, i, random.nextInt(list.size()));
        }
    }

    public static void sort(List<Number> list) {
        list.sort(Comparator.comparingDouble(Number::doubleValue));
    }
}
