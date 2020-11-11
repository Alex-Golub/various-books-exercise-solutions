package chapter1_intro;

/**
 * •• E1.4
 * Write a program that prints the balance of an account after the first, second, and
 * third year.
 * The account has an initial balance of $1,000 and earns 5 percent interest per year.
 *
 * Created by ag on 17-Oct-20 8:00 PM
 */
class Ex1_4 {
  public static void main(String[] args) {
    int balance = 1000;
    int year = 0;
    double annualInterest = 0.05;
    System.out.println("Year: " + year + " => Balance: $" + balance);

    balance += balance * annualInterest;
    year += 1;
    System.out.println("Year: " + year + " => Balance: $" + balance);

    balance += balance * annualInterest;
    year += 1;
    System.out.println("Year: " + year + " => Balance: $" + balance);
  }
}
