package cinema;

import java.util.Scanner;

public class Cinema {
    public static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        // Cinema will be represented by a boolean array
        // true  => booked ("B")
        // false => free   ("S")
        boolean[][] hall = buildCinema();

        boolean exit = false;
        while (!exit) {
            System.out.println("\n1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");
            String choice = console.nextLine();

            switch (choice) {
                case "1":
                    showHall(hall);
                    break;
                case "2":
                    reserveSeat(hall);
                    break;
                case "3":
                    statistics();
                    break;
                case "0":
                    exit = true;
            }
        }
    }

    private static void statistics() {
//        Number of purchased tickets: 0
//        Percentage: 0.00%
//        Current income: $0
//        Total income: $360
    }

    /**
     * Read two positive integer numbers that represent the number of
     * rows and seats in each row and print the seating arrangement.
     */
    public static boolean[][] buildCinema() {
        System.out.print("Enter the number of rows: ");
        int rows = Integer.parseInt(console.nextLine());
        System.out.print("Enter the number of seats in each row: ");
        int seatsPerRow = Integer.parseInt(console.nextLine());

        return new boolean[rows][seatsPerRow];
    }

    public static void showHall(boolean[][] hall) {
        int rows = hall.length;
        int cols = hall[0].length;

        // Headers
        System.out.print("\nCinema:\n ");
        for (int i = 1; i <= cols; i++)
            System.out.print(" " + i);
        System.out.println();

        for (int i = 0; i < rows; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < cols; j++)
                System.out.print(hall[i][j] ? " B" : " S");
            System.out.println();
        }
    }

    /**
     * Read two integer numbers from the input:
     * a row number and a seat number in that row.
     * These numbers represent the coordinates of the seat according
     * to which the program should print the ticket price.
     */
    public static void reserveSeat(boolean[][] hall) {
        System.out.print("\nEnter a row number: ");
        int rowNumber = Integer.parseInt(console.nextLine());
        System.out.print("Enter a seat number in that row: ");
        int seatNumber = Integer.parseInt(console.nextLine());

        calculatePrice(rowNumber, hall);

        // Update this seat (zero based so subtract 1)
        hall[rowNumber - 1][seatNumber - 1] = true;
    }

    /**
     * If the total number of seats in the screen room is not more
     * than 60, then the price of each ticket is 10 dollars.
     * In a larger room, the tickets are 10 dollars for the front
     * half of the rows and 8 dollars for the back half.
     * Please note that the number of rows can be odd, for example,
     * 9 rows.
     * In this case, the first half is the first 4 rows, and the
     * second half is the rest 5 rows.
     */
    public static void calculatePrice(int rowNumber, boolean[][] hall) {
        final int FIRST_HALF_PRICE = 10;
        final int SECOND_HALF_PRICE = 8;

        int rows = hall.length;
        int cols = hall[0].length;
        int totalSeats = rows * cols;

        int ticketPrice;
        if (totalSeats <= 60)
            ticketPrice = FIRST_HALF_PRICE;
        else
            ticketPrice = rowNumber <= rows / 2 ?
                    FIRST_HALF_PRICE : SECOND_HALF_PRICE;

        System.out.println("Ticket price: $" + ticketPrice);
    }

}
