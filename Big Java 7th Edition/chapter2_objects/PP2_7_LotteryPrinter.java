package chapter2_objects;

import java.util.Random;

/**
 * ••• P2.7
 * Write a program LotteryPrinter that picks a combination
 * in a lottery.
 * In this lottery, players can choose 6 numbers (possibly repeated)
 * between 1 and 49.
 *
 * @author Mr.Dr.Professor
 * @since 11-Nov-20 12:02 PM
 */
class PP2_7_LotteryPrinter {
  public static void main(String[] args) {
    Random generator = new Random();

    int num1 = generator.nextInt(49) + 1;
    int num2 = generator.nextInt(49) + 1;
    int num3 = generator.nextInt(49) + 1;
    int num4 = generator.nextInt(49) + 1;
    int num5 = generator.nextInt(49) + 1;
    int num6 = generator.nextInt(49) + 1;

    System.out.println("Play this combination—it’ll make you rich!");
    System.out.printf("%d, %d, %d, %d, %d, %d\n",
            num1, num2, num3, num4, num5, num6);
  }
}
