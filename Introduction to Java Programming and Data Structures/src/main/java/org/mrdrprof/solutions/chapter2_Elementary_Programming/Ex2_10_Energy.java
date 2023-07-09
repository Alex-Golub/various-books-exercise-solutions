package org.mrdrprof.solutions.chapter2_Elementary_Programming;

import java.util.Scanner;

/**
 * 2.10 (Science: calculating energy)
 * Write a program that calculates the energy needed
 * to heat water from an initial temperature to a final temperature.
 *
 * Created by ag on 13-Oct-20 5:40 PM 
 */
class Ex2_10_Energy {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the amount of water in kilograms: ");
    double water = scanner.nextDouble();

    System.out.print("Enter the initial temperature (in degrees): ");
    double initialTemperature = scanner.nextDouble();

    System.out.print("Enter the final temperature: ");
    double finalTemperature = scanner.nextDouble();

    double energy = water * (finalTemperature - initialTemperature) * 4184;
    System.out.printf("The energy needed is %,.2f", energy);
  }
}
