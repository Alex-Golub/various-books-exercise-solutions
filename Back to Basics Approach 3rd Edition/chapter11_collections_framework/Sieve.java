package chapter11_collections_framework;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Uses a linked list to implement the Sieve of
 * Eratosthenes algorithm for finding prime numbers.
 */
class Sieve {
  public static void main(String[] args) {
    System.out.println("This program will tell you all prime");
    System.out.println("numbers up to a given maximum.");
    System.out.println();
    
    Scanner console = new Scanner(System.in);
    System.out.print("Maximum number? ");
    int max = console.nextInt();
    
    LinkedList<Integer> primes = sieve(max);
    System.out.println("Prime numbers up to " + max + ": ");
    System.out.println(primes);
  }
  
  // Returns a list of all prime numbers up to the given maximum
  // using the Sieve of Eratosthenes algorithm.
  public static LinkedList<Integer> sieve(int max) {
    LinkedList<Integer> primes = new LinkedList<>();
    
    // add all numbers from 2 to max to a list
    LinkedList<Integer> numbers = new LinkedList<>();
    for (int i = 2; i <= max; i++) {
      numbers.add(i);
    }
    
    while (!numbers.isEmpty()) {
      // remove a prime number from the front of the list
      int front = numbers.remove(0);
      primes.add(front);
      
      // remove all multiples of this prime number
        numbers.removeIf(current -> current % front == 0);
    }
    
    return primes;
  }
}
