package chapter4_conditionals;

import java.util.Scanner;

/**
 * 1. Write a program that prompts for a number and
 * displays it in Roman numerals.
 *
 * Symbol	I	V	X	L	C	D	M
 * Value	1	5	10	50	100	500	1000
 *
 * @author Mr.Dr.Professor
 * @since 13-Dec-20 8:13 PM
 */
class PP4_1_toRoman {

  // Using pairs to easily calculate cut points
  // such as 4 -> IV, 7 -> VII etc..
  enum Numeral {
    I(1),
    IV(4), V(5),
    IX(9), X(10),
    XL(40), L(50),
    XC(90), C(100),
    CD(400), D(500),
    CM(900), M(1000);

    int weight;

    Numeral(int weight) {
      this.weight = weight;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter positive number: ");
    int n = sc.nextInt();

    if (n <= 0)
      throw new IllegalArgumentException(n + " is not a positive number");

    System.out.print(n + " -> ");

    final Numeral[] values = Numeral.values();    // get the actual values of Numeral enums
    StringBuilder   roman  = new StringBuilder(); // StringBuilder is more efficient here

    for (int i = values.length - 1; i >= 0; i--) {
      while (n >= values[i].weight) {             // casting out weight from n
        roman.append(values[i]);
        n -= values[i].weight;
      }
    }

    System.out.println(roman);
  }

}
