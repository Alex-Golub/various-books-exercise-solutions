package chapter9_Objects_Classes._9_4_Random_Class;

import java.util.Random;

/**
 * *9.4 (Use the Random class) Write a program that creates a Random object with seed
 * 1000 and displays the first 50 random integers between 0 and 100 using the
 * nextInt(100) method.
 *
 * Created by ag on 19-May-20 2:51 PM
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random rnd = new Random(1000);
        for (int i = 1; i <= 50; i++) {
            for (int j = 1; j <= 5; j++, i++) {
                System.out.print(rnd.nextInt(101) + ", ");
            }
            System.out.println();
        }
    }
}
