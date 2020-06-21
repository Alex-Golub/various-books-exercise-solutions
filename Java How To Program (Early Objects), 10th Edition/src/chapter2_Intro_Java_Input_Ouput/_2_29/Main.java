package chapter2_Intro_Java_Input_Ouput._2_29;

/**
 * 2.29 (Integer Value of a Character)
 * Using statements similar to the one shown earlier in this exercise,
 * write an application that displays the integer equivalents of some
 * uppercase letters, lowercase letters, digits and special symbols.
 * Display the integer equivalents of the following: A B C a b c 0 1 2 $ * + / and the blank character.
 *
 * Created by ag on 15-Jun-20 12:59 PM
 */
class Main {
  public static void main(String[] args) {
    System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));
    System.out.printf("The character %c has the value %d%n", 'B', ((int) 'B'));
    System.out.printf("The character %c has the value %d%n", 'C', ((int) 'C'));
    System.out.printf("The character %c has the value %d%n", 'a', ((int) 'a'));
    System.out.printf("The character %c has the value %d%n", 'b', ((int) 'b'));
    System.out.printf("The character %c has the value %d%n", 'c', ((int) 'c'));
    System.out.printf("The character %c has the value %d%n", '0', ((int) '0'));
    System.out.printf("The character %c has the value %d%n", '1', ((int) '1'));
    System.out.printf("The character %c has the value %d%n", '2', ((int) '2'));
    System.out.printf("The character %c has the value %d%n", '$', ((int) '$'));
    System.out.printf("The character %c has the value %d%n", '*', ((int) '*'));
    System.out.printf("The character %c has the value %d%n", '+', ((int) '+'));
    System.out.printf("The character %c has the value %d%n", '/', ((int) '/'));
    System.out.printf("The character %c has the value %d%n", ' ', ((int) ' '));
  }
}
