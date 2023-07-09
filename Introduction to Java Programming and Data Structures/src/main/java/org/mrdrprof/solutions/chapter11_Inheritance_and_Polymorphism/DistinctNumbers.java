package org.mrdrprof.solutions.chapter11_Inheritance_and_Polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class DistinctNumbers {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    Scanner console = new Scanner(System.in);
    System.out.println("Enter integers (console ends with 0): ");
    int value;

    do {
      value = console.nextInt(); // Read a value from the console

      if (!list.contains(value) && value != 0)
        list.add(value); // Add the value if it is not in the list
    } while (value != 0);

    // Display the distinct numbers
    System.out.print("The distinct integers are: ");
    for (Integer integer : list) {
      System.out.print(integer + " ");
    }
  }
}
