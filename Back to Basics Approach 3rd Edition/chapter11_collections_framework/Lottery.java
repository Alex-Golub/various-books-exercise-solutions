package chapter11_collections_framework;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Plays a lottery game with the user, reading
 * the user's lottery numbers and printing how many
 * matched a winning lottery ticket.
 */
class Lottery {
  public static final int NUMBERS = 6;
  public static final int MAX_NUMBER = 40;
  
  public static void main(String[] args) {
    // get winning number and ticket sets
    Set<Integer> winningNumbers = createWinningNumbers();
    Set<Integer> ticket = getTicket();
    System.out.println();
    
    // keep only the winning numbers from the user's ticket
    Set<Integer> intersection = new TreeSet<>(ticket);
    intersection.retainAll(winningNumbers);
    
    // print results
    System.out.println("Your ticket numbers are " + ticket);
    System.out.println("The winning numbers are " + winningNumbers);
    System.out.println();
    System.out.println("You had " + intersection.size() + " matching numbers.");
    if (intersection.size() > 0) {
      double prize = 100 * Math.pow(2, intersection.size());
      System.out.println("The matched numbers are " + intersection);
      System.out.println("Your prize is $" + prize);
    }
  }
  
  // generates a set of the winning lotto numbers
  public static Set<Integer> createWinningNumbers() {
    Set<Integer> winningNumbers = new TreeSet<>();
    Random r = new Random();
    while (winningNumbers.size() < NUMBERS) {
      int number = r.nextInt(MAX_NUMBER) + 1;
      winningNumbers.add(number);
    }
    return winningNumbers;
  }
  
  // reads the player's lottery ticket from the console
  public static Set<Integer> getTicket() {
    Set<Integer> ticket = new TreeSet<>();
    Scanner console = new Scanner(System.in);
    System.out.print("Type your " + NUMBERS +
                     " unique lotto numbers: ");
    while (ticket.size() < NUMBERS) {
      int number = console.nextInt();
      ticket.add(number);
    }
    return ticket;
  }
}
