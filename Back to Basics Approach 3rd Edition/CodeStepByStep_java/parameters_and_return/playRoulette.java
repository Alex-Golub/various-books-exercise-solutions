package CodeStepByStep_java.parameters_and_return;

import java.util.Random;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/playRoulette
 *
 * @author Mr.Dr.Professor
 * @since 27-Feb-21 12:15 AM
 */
/*public*/ class playRoulette {
  public static void main(String[] args) {
    playRoulette(10, 3);
  }

  public static void playRoulette(int money, int bet) {
    System.out.printf("start with $%d, betting up to $%d\n", money, bet);
    System.out.println("bet\tspin\tmoney");

    Random rnd = new Random();
    int maxMoneyWon = 0;
    int currentBet;

    while (money > 0) {
      int spin = rnd.nextInt(37); // 0-36

      currentBet = Math.min(bet, money);

      if (spin == 0 || spin % 2 != 0) {
        money -= currentBet;
      } else {
        money += currentBet;
      }

      maxMoneyWon = Math.max(money, maxMoneyWon);
      System.out.println("$" + currentBet + "\t" + spin + "\t$" + money);
    }

    System.out.println("max money: $" + maxMoneyWon);
  }
}
