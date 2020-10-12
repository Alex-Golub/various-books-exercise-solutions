package chapter5_Control_Statements_Part_2;

/**
 * 5.21 (Pythagorean Triples)
 * A right triangle can have sides whose lengths are all integers.
 * The set of three integer values for the lengths of the sides of a right
 * triangle is called a Pythagorean triple.
 * The lengths of the three sides must satisfy the relationship that the sum
 * of the squares of two of the sides is equal to the square of the hypotenuse.
 *
 * Write an application that displays a table of the Pythagorean triples
 * for side1, side2 and the hypotenuse, all no larger than 500.
 * Use a triple-nested for loop that tries all possibilities.
 * This method is an example of “brute-force” computing.
 * You’ll learn in more advanced computer science courses that for many
 * interesting problems there’s no known algorithmic approach other than using sheer brute force.
 *
 * Created by ag on 25-Sep-20 4:48 PM 
 */
class Ex5_21_Pythagorean_Triple {
  public static void main(String[] args) {
    System.out.printf("%s%10s%15s%n", "side1", "side2", "hypotenuse");
    final int MAX = 500;

    // Avoid printing the same pairs i.e. 3^2 + 4^2 is the same as 4^2 + 3^2
    for (int a = 1; a <= MAX; ++a)
      for (int b = a; b <= MAX; ++b)
        for (int c = b; c <= MAX; ++c)
          if (a * a + b * b == c * c)
            System.out.printf("%5d%10d%15d%n", a, b, c);
  }
}
