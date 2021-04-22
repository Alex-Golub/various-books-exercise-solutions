package chapter10_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author Alex Golub
 * @since 17-Apr-21 2:12 PM
 */
class ArrayListDemo {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.print("Enter number to add to list (press 's' to stop): ");
      String input = scanner.next();
      if (input.equalsIgnoreCase("s")) {
        break;
      }

      numbers.add(Integer.parseInt(input));
    }

    System.out.println("Total numbers entered: " + numbers.size());
    System.out.println("Remove element at 1st position: " + numbers.remove(0));
    System.out.println("numbers = " + numbers);

    List<Integer> cloned = new ArrayList<>(numbers);
    System.out.println("numbers == cloned => " + (cloned == numbers));
    System.out.println("numbers.equals(cloned) => " + Objects.equals(numbers, cloned));
  }
}
