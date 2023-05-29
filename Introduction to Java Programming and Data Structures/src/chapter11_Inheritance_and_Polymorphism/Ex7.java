package chapter11_Inheritance_and_Polymorphism;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author Alex Golub
 * @since 02/06/2023 2:16 PM
 */
class Ex7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println("list = " + list);
        for (int i = 0; i < 5; i++) {
            shuffle(list);
            System.out.println("list = " + list);
        }
    }

    public static void shuffle(List<Integer> list) {
        // Using Collections api
        Collections.shuffle(list);

        // Manual shuffle
        Random random = new Random();
        for (int i = 0; i < list.size(); i++) {
            int j = random.nextInt(list.size());
            Collections.swap(list, i, j);
        }
    }
}
