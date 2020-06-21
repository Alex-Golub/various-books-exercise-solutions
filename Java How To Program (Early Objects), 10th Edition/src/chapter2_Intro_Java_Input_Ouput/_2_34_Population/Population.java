package chapter2_Intro_Java_Input_Ouput._2_34_Population;

/**
 * 2.34 (World Population Growth Calculator) Use the web to determine the current world population
 * and the annual world population growth rate.
 * Write an application that inputs these values,
 * then displays the estimated world population after one, two, three, four and five years.
 *
 * Created by ag on 15-Jun-20 2:01 PM
 */
class Population {
  public static void main(String[] args) {
    // The current world population is 7.8 billion as of June 2020
    // 1.05% growth of 2020 i.e. 81 million people per year

    // Using bigger variable to hold number that integer can't accommodate
    long population = 7_800_000_000L;
    long growth = 81_000_000;
    int year = 2020;

    System.out.printf("%-20s%-7s%n", "Current Population", "Year");
    System.out.printf("%-20s%-7s%n", population, year++);

    population = population + growth;
    System.out.printf("%-20s%-7s%n", population, year++);

    population = population + growth;
    System.out.printf("%-20s%-7s%n", population, year++);

    population = population + growth;
    System.out.printf("%-20s%-7s%n", population, year++);

    population = population + growth;
    System.out.printf("%-20s%-7s%n", population, year++);

    population = population + growth;
    System.out.printf("%-20s%-7s%n", population, year++);
  }
}
