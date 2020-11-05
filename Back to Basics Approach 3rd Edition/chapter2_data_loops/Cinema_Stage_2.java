package chapter2_data_loops;

import java.util.Scanner;

/**
 * Created by ag on 24-Oct-20 1:41 PM
 */
public class Cinema_Stage_2 {

  public static void main(String[] args) {
    final int FIRST_HALF_PRICE = 10;
    final int SECOND_HALF_PRICE = 8;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of rows: ");
    int rows = Integer.parseInt(scanner.nextLine());
    System.out.print("Enter the number of seats in each row: ");
    int seatsPerRow = Integer.parseInt(scanner.nextLine());

    int totalNumberOfSeats = seatsPerRow * rows;
    int income;

    if (totalNumberOfSeats <= 60) {
      income = totalNumberOfSeats * FIRST_HALF_PRICE;
    } else {
      int firstHalf = rows / 2;
      int secondHalf = firstHalf + rows % 2;
      income = seatsPerRow * (firstHalf * FIRST_HALF_PRICE + secondHalf * SECOND_HALF_PRICE);
    }

    System.out.println("Total income:\n$" + income);

  }
}
