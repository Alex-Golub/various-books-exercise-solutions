package chapter_12_exception_handling_and_text_io;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

/**
 * *12.3 (ArrayIndexOutOfBoundsException)
 *
 * @author Alex Golub
 * @since 08/06/2023 11:08 PM
 */
class Ex3 {

    private static final int NUMBER_OF_RANDOM_ELEMENTS = 100;
    private static final Scanner CONSOLE = new Scanner(System.in);

    public static void main(String[] args) {
        int[] randomArray = generateRandomArray(NUMBER_OF_RANDOM_ELEMENTS);
        boolean validInput = false;
        while (!validInput) {
            System.out.printf("Enter array index [%d, %d] to get value at that index: ", 0, randomArray.length - 1);
            try {
                int index = Integer.parseInt(CONSOLE.nextLine());
                int valueAtIndex = randomArray[index];
                System.out.println("Value at randomArray[" + index + "] is " + valueAtIndex);
                validInput = true;
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static int[] generateRandomArray(int numberOfRandomElements) {
        return IntStream.generate(() -> ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE))
                        .limit(numberOfRandomElements)
                        .toArray();
    }
}
