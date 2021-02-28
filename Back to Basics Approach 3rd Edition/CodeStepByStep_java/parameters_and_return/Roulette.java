package CodeStepByStep_java.parameters_and_return;

import java.util.Random;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/Roulette
 *
 * Write a console program in a class named Roulette that simulates the
 * gambling game of Roulette, with the following characteristics.
 * The player begins with $10 and bets (up to) $3 per spin of the wheel.
 * If the wheel comes up 1-18, the player wins $3. Otherwise, player loses $3.
 * Play until the player gets $1000 or drops to $0. At the end, print the
 * max money the player ever earned.
 *
 * bet $3, spin 13, money = $13
 * bet $3, spin 33, money = $10
 * bet $3, spin 23, money = $7
 * bet $3, spin 28, money = $4
 * bet $3, spin 24, money = $1
 * bet $1, spin 6, money = $2
 * bet $2, spin 7, money = $4
 * bet $3, spin 34, money = $1
 * bet $1, spin 29, money = $0
 * max = $13
 *
 * @author Mr.Dr.Professor
 * @since 28-Feb-21 9:58 PM
 */
/*public*/ class Roulette {
  static final int LOW = 1, HIGH = 18;
  static final int SPIN_MAX = 36 + 1;

  public static void main(String[] args) {
    playRoulette(10, 3);
  }

  private static void playRoulette(int money, int bet) {
    int spinBet = bet;
    int maxMoneyEarned = money;
    Random random = new Random();

    while (money > 0) {
      int spin = random.nextInt(SPIN_MAX);

      if (spin >= LOW && spin <= HIGH) {
        money += spinBet;
        maxMoneyEarned = Math.max(maxMoneyEarned, money);
      } else {
        money -= spinBet;
      }

      System.out.printf("bet $%d, spin %d, money = $%d\n", spinBet, spin, money);
      spinBet = Math.min(money, bet);
    }

    System.out.println("max = $" + maxMoneyEarned);
  }
}
