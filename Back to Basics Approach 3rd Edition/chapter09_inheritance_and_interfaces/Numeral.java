package chapter09_inheritance_and_interfaces;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Programming Projects: Project #1
 *
 * @author Alex Golub
 * @since 30-Mar-21 5:51 PM
 */
abstract class Numeral {
  private final int[] numbers;

  Numeral(int[] numbers) {
    this.numbers = numbers;
  }

  int[] getNumbers() {
    return Arrays.copyOf(numbers, numbers.length);
  }

  abstract void menu();
  abstract int sum();
  abstract double average();
  abstract int getMax();
  abstract int getMin();
}

class NumeralMenu extends Numeral {
  NumeralMenu(int[] numbers) {
    super(numbers);
  }

  void menu() {
    System.out.print(
            "\n[a] Display the numbers entered\n" +
            "[b] Sum of the numbers\n" +
            "[c] Average of the numbers\n" +
            "[d] Maximum among the numbers\n" +
            "[e] Minimum among the numbers\n" +
            "Enter you choice: "
    );
  }

  @Override
  int sum() {
    return Arrays.stream(super.getNumbers()).sum();
  }

  @Override
  double average() {
    return 1.0 * sum() / super.getNumbers().length;
  }

  @Override
  int getMax() {
    return Math.max(Arrays.stream(getNumbers()).max().getAsInt(),
                    Integer.MIN_VALUE);
  }

  @Override
  int getMin() {
    return Math.min(Arrays.stream(getNumbers()).min().getAsInt(),
                    Integer.MAX_VALUE);
  }
}

class NumeralTest {
  static Scanner console = new Scanner(System.in);

  public static void main(String[] args) {
    int[] numbers = getNumbers();
    Numeral numeral = new NumeralMenu(numbers);

    while (true) {
      numeral.menu();
      char choice = console.next().toLowerCase().charAt(0);

      switch (choice) {
        case 'a':
          System.out.println(">> Numbers entered: " + Arrays.toString(numeral.getNumbers()));
          break;
        case 'b':
          System.out.println(">> Sum of numbers: " + numeral.sum());
          break;
        case 'c':
          System.out.println(">> Average: " + numeral.average());
          break;
        case 'd':
          System.out.println(">> Maximum value among numbers is " + numeral.getMax());
          break;
        case 'e':
          System.out.println(">> Minimum value among numbers is " + numeral.getMin());
          break;
        default:
          System.out.println(">> There's no such option available, try again");
      }
    }
  }

  private static int[] getNumbers() {
    System.out.print("How many numbers? ");
    int n = Integer.parseInt(console.nextLine());
    int[] numbers = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.print("Enter #" + (i + 1) + ": ");
      numbers[i] = Integer.parseInt(console.nextLine());
    }

    return numbers;
  }
}
