package org.mrdrprof.solutions.chapter7_SD_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ***7.37 (Game: bean machine)
 * The bean machine, also known as a quincunx or the Galton box,
 * is a device for statistics experiments.
 * It consists of an upright board with evenly spaced nails (or pegs)
 * in a triangular form.
 *
 * Balls are dropped from the opening of the board.
 * Every time a ball hits a nail, it has a 50% chance of falling to
 * the left or to the right.
 * The piles of balls are accumulated in the slots at the bottom of the board.
 *
 * Write a program that simulates the bean machine.
 * Simulate the falling of each ball by printing its path.
 * Display the final buildup of the balls in the slots in a histogram.
 *
 * @author Mr.Dr.Professor
 * @since 07-Feb-21 11:18 PM
 */
class Ex7_37_beanMachine {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int   balls = getBalls();
    int[] slots = getSlots();

    System.out.println();

    simulate(balls, slots);

    System.out.println("\nDistribution:");
    histogram(slots);
  }

  private static void histogram(int[] slots) {
    System.out.println(Arrays.toString(slots));
    int max = getMax(slots);

    while (max > 0) {
      System.out.print("|");

      for (int j = 0; j < slots.length; j++) {
        if (slots[j] == max) {
          System.out.print("O");
          slots[j]--;
        } else {
          System.out.print(" ");
        }
      }

      System.out.println("|");
      max--;
    }
  }

  private static int getMax(int[] slots) {
    int max = slots[0];
    for (int val : slots)
      max = Math.max(val, max);

    return max;
  }

  public static void simulate(int balls, int[] slots) {
    int           levels = slots.length - 1;
    StringBuilder path   = new StringBuilder(levels);

    System.out.printf("%-5s| %-20s| %s\n", "Ball", "Path", "Slot");
    System.out.println("-".repeat(34));

    for (int j = 0; j < balls; j++) {
      int intoSlot = 0;

      for (int i = 0; i < levels; i++) {
        if (Math.random() > 0.5) {
          intoSlot++; // The number of Rs in a path is the position of the slot where the ball falls.
          path.append('R');
        } else {
          path.append('L');
        }
      }

      slots[intoSlot]++;

      System.out.printf("%-5d| %-20s| %d\n",
                        j, path.substring(levels * j), intoSlot);
    }
  }

  private static int getBalls() {
    int balls;
    do {
      System.out.print("Enter the number of balls to drop: ");
      balls = sc.nextInt();

      if (balls <= 0)
        System.out.println("Number of balls must be >= 1, got: "
                           + balls + ", try again\n");
    } while (balls <= 0);

    return balls;
  }

  private static int[] getSlots() {
    int slots;
    do {
      System.out.print("Enter the number of slots in the bean machine: ");
      slots = sc.nextInt();

      if (slots < 2)
        System.err.println("Bean-Machine must have at least 2 slots, got: "
                           + slots + ", try again\n");
    } while (slots < 2);

    return new int[slots];
  }
}
