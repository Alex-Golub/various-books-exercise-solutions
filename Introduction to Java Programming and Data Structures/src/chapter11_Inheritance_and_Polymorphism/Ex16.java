package chapter11_Inheritance_and_Polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * **11.16 (Addition quiz)
 *
 * @author Alex Golub
 * @since 02/06/2023 6:13 PM
 */
class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> answers = new ArrayList<>();

        int number1 = ThreadLocalRandom.current().nextInt(100);
        int number2 = ThreadLocalRandom.current().nextInt(100);

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = Integer.parseInt(scanner.nextLine());

        while (number1 + number2 != answer) {
            if (answers.contains(answer)) {
                System.out.println("You already entered " + answer);
            } else {
                System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
                answers.add(answer);
            }

            answer = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("You got it!");
        scanner.close();
    }
}
