package chapter4_conditionals;

import java.util.Scanner;

/**
 * 4. Write a program that prompts for two people’s birthdays (month and day),
 * along with today’s month and day. The
 * program should figure out how many days remain until each user’s birthday
 * and which birthday is sooner.
 *
 * @author Mr.Dr.Professor
 * @since 13-Dec-20 9:11 PM
 */
class PP4_4_birthday {
  static final int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Person#1 (month and day): ");
    int m1   = sc.nextInt();
    int d1   = sc.nextInt();
    int abs1 = absoluteDay(m1, d1);

    System.out.print("Person#2 (month and day): ");
    int m2   = sc.nextInt();
    int d2   = sc.nextInt();
    int abs2 = absoluteDay(m1, d1);

    System.out.print("Today's month and day: ");
    int m   = sc.nextInt();
    int d   = sc.nextInt();
    int abs = absoluteDay(m1, d1);

    // TODO
  }

  private static int absoluteDay(int m, int d) {
    if (m <= 0)
      throw new IllegalArgumentException("Invalid value of month " + m);

    int sum = 0;
    for (int i = 1; i < m; i++)
      sum += days[i];
    return sum + d;
  }
}
