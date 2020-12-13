<h1 align="center"><u>Self-Check Answers</u></h1>

<h3 align="center"><mark><u>Section 4.1: if/else Statements</u></mark></h3>

> 1. Translate each of the following English statements into logical tests that could be  
>     used in an if/else statement.  
>     Write the appropriate if statement with your logical test.  
>     Assume that three int variables, x, y, and z, have been declared.
>    > ```java
>    > z % 2 == 1                        // z is odd.
>    > z <= Math.sqrt(y)                 // z is not greater than y’s square root.
>    > y > 0                             // y is positive.
>    > (x + y) % 2 == 1                  // Either x or y is even, and the other is odd.
>    > y % z == 0                        // y is a multiple of z.
>    > z != 0                            // z is not zero.
>    > Math.abs(y) > Math.abs(z)         // y is greater in magnitude than z.
>    > x * z < 0                         // x and z are of opposite signs.
>    > y >= 0 && y < 10                  // y is a nonnegative one-digit number.
>    > z >= 0                            // z is nonnegative.
>    > x % 2 == 0                        // x is even.
>    > Math.abs(x - y) < Math.abs(z - y) // x is closer in value to y than z is.
>    > ```

> 2. Given the variable declarations
>    `int x = 4, y = –3, z = 4;`
>    what are the results of the following relational expressions?
>    > ```java
>    > x == 4                         //=> true
>    > x == y                         //=> false
>    > x == z                         //=> true
>    > y == z                         //=> false
>    > x + y > 0                      //=> true
>    > x – z != 0                     //=> false
>    > y * y <= z                     //=> false
>    > y / y == 1                     //=> true
>    > x * (y + 2) > y - (y + z) * 2  //=> 4 * (-1) > (-3) - 1 * 2 => true
>    > ```

> 3. Which of the following if statement headers uses the correct syntax?
>    > ```java
>    > if x = 10 then {   //=> ✖ no parentheses and then is not java syntax
>    > if [x == 10] {     //=> ✖ square bracket instead round
>    > if (x => y) {      //=> ✖ wrong order of grater then or equals should be >=
>    > if (x equals 42) { //=> ✖ equals is an Object instance method not an relational operator
>    > if (x == y) {      //=> ✔
>    > ```

> 4. The following program contains 7 mistakes! What are they?
>    `"a is the smallest!"` should be produces
>    > ```java
>    > public class Oops4 {
>    >  public static void main(String[] args) {
>    >    int a = 7, b = 42;
>    >    minimum(a, b);
>    >    if {smaller = a} { // #6: there is no such variable as smaller in this scope
>    >                       // #7: smaller = a is not evaluated to boolean type
>    >                       // #8: {} instead of ()
>    >      System.out.println("a is the smallest!");
>    >    }
>    >  }
>    >
>    >  public static void minimum(int a, int b) {
>    >    if (a < b) {
>    >      int smaller = a;
>    >    } else (a => b) {  // #1-2: no if keyword and wrong order of >=
>    >      int smaller = b;
>    >    }
>    >    return int smaller; // #4-5: minimum is void thus we can't return int
>    >                        //       smaller is declared but not initialized we ger CE
>    >  }
>    > }
>    > ```

> 5. Consider the following method
>    What output is produced for each of the following calls?
>    > ```java
>    > ifElseMystery1(3, 20); //=> 13 21
>    > ifElseMystery1(4, 5);  //=> 5 6
>    > ifElseMystery1(5, 5);  //=> 6 5
>    > ifElseMystery1(6, 10); //=> 7 11
>    > ```

> 6. Consider the following method
>    What output is produced for each of the following calls?
>    > ```java
>    > ifElseMystery2(10, 2);  //=> 10 3
>    > ifElseMystery2(3, 8);   //=> 9 9
>    > ifElseMystery2(4, 4);   //=> 3 4
>    > ifElseMystery2(10, 30); //=> 29 30
>    > ```

> 7. Write Java code to read an integer from the user, then print even if that number  
>     is an even number or odd otherwise.
>    > ```java
>    > Scanner sc = new Scanner(System.in);
>    > System.out.print("Type a number: ");
>    > System.out.println(sc.nextInt() % 2 == 0 ? "even" : "odd");
>    > ```

> 8. The following code contains a logic error:
>    Examine the code and describe a case in which the code would print something that  
>     is untrue about the number that was entered.  
>     Explain why. Then correct the logic error in the code.
>    > ```java
>    > Scanner console = new Scanner(System.in);
>    > System.out.print("Type a number: ");
>    > int number = console.nextInt();
>    > if (number % 2 == 0) {
>    >   if (number % 3 == 0) {
>    >     System.out.println("Divisible by 6.");
>    >   }
>    > } else { // move this else to pair with outer if
>    >     System.out.println("Odd.");
>    > }
>    > ```

> 9. Describe a problem with the following code:
>    > ```java
>    > Scanner console = new Scanner(System.in);
>    > System.out.print("What is your favorite color? ");
>    > String name = console.next();
>    > if (name == "blue") { // using == with string object will check objects reference and not content
>    >                       // we should use String equals(String other) method to compare content
>    >   System.out.println("Mine, too!");
>    > }
>    > ```

> 10. Factor out redundant code from the following example by moving it out of the  
>      `if/else` statement, preserving the same output.
>     > ```java
>     > a = 2;
>     > if (x < 30) { x++; }
>     > System.out.println("Java is awesome! " + x);
>     > ```

> 11. The following code is poorly structured:
>     Rewrite it so that it has a better structure and avoids redundancy.  
>      To simplify things, you may assume that the user always types 1 or 2.  
>      (How would the code need to be modified to handle any number that the user might type?)
>     > ```java
>     > System.out.print("Is your money multiplied 1 or 2 times? ");
>     > int times = console.nextInt();
>     > System.out.print("And how much are you contributing? ");
>     > int donation = console.nextInt();
>     > sum = sum + times * donation;
>     > int[] count = new int[times + 1]; // use an array to store count
>     > count[times]++;
>     > total = total + donation;
>     > ```

> 12. The following code is poorly structured:  
>      Rewrite it so that it has a better structure and avoids redundancy.
>     > ```java
>     > public static void spending (Scanner sc, String name) {
>     >   System.out.print("How much will " + name + " be spending? ");
>     >   double amount = sc.nextDouble();
>     >   System.out.println();
>     >   int numBills = (int) (amount / 20.0);
>     >   if (numBills * 20.0 < amount) {
>     >     numBills++;
>     >   }
>     >
>     >   System.out.println(name + " needs " + numBills + " bills");
>     > }
>     > ```

> 13. Write a piece of code that reads a shorthand text description of a color and  
>      prints the longer equivalent.
>     Acceptable color names are B for Blue, G for Green, and R for Red.
>     If the user types something other than `B, G, or R`, the program should print an error message.  
>      Make your program case-insensitive so that the user can type an uppercase or lowercase letter.
>     > ```java
>     > System.out.print("What color do you want? ");
>     > Scanner sc = new Scanner(System.in);
>     > String color = sc.next();
>     > if (color.equalsIgnoreCase("r"))
>     >   System.out.println("You have chosen Red.");
>     > else if (color.equalsIgnoreCase("g"))
>     >   System.out.println("You have chosen Green.");
>     > else if (color.equalsIgnoreCase("b"))
>     >   System.out.println("You have chosen Blue.");
>     > else
>     >   System.out.println("Unknown color: " + color);
>     > ```

> 14. Write a piece of code that reads a shorthand text description of a playing card  
>      and prints the longhand equivalent.
>     The shorthand description is the card’s rank `(2 through 10, J, Q, K, or A)`  
>      followed by its suit `(C, D, H, or S)`.
>     You should expand the shorthand into the form “<Rank> of <Suit>”.  
>      You may assume that the user types valid input.
>     > ```java
>     > System.out.print("Enter a card: ");
>     > Scanner sc   = new Scanner(System.in);
>     > String  rank = sc.next();
>     > String  suit = sc.next();
>     >
>     > if (rank.equals("2")) rank = "Two";
>     > else if (rank.equals("3")) rank = "Three";
>     > else if (rank.equals("4")) rank = "Four";
>     > else if (rank.equals("5")) rank = "Five";
>     > else if (rank.equals("6")) rank = "Six";
>     > else if (rank.equals("7")) rank = "Seven";
>     > else if (rank.equals("8")) rank = "Eight";
>     > else if (rank.equals("9")) rank = "Nine";
>     > else if (rank.equals("10")) rank = "Ten";
>     > else if (rank.equals("J")) rank = "Jack";
>     > else if (rank.equals("Q")) rank = "Queen";
>     > else if (rank.equals("K")) rank = "King";
>     > else rank = "Ace";
>     >
>     > if (suit.equals("C")) suit = "Clubs";
>     > else if (suit.equals("D")) suit = "Diamonds";
>     > else if (suit.equals("H")) suit = "Hearts";
>     > else if (suit.equals("S")) suit = "Spades";
>     >
>     > System.out.println(rank + " of " + suit);
>     > ```

---

<h3 align="center"><mark><u>Section 4.2: Cumulative Algorithms</u></mark></h3>

> 15. What is wrong with the following code, which attempts to add all numbers from  
>      1 to a given maximum? Describe how to fix the code.
>     > ```java
>     > public static int sumTo(int n) { // remove loop and make calculation instant
>     >   return n * (n + 1) / 2;
>     > }
>     > ```

> 16. What is wrong with the following code, which attempts to return the number of  
>      factors of a given integer n? Describe how to fix the code
>     > ```java
>     > public static int countFactors(int n) {
>     >   int cnt = 0;
>     >   for (int i = 1; i <= Math.sqrt(n); i++) { // more effective approach to count factors
>     >     if (n % i == 0) {
>     >       cnt++;
>     >       if (n / i != i) // e.g. 100 has 8 factors and 10 should be count only once
>     >         cnt++;
>     >     }
>     >   }
>     >   return cnt;
>     > }
>     > ```

> 17. Write code to produce a cumulative product by multiplying together many numbers
>     that are read from the console.
>     > ```java
>     > System.out.print("How many numbers? ");
>     > Scanner sc = new Scanner(System.in);
>     > int n = sc.nextInt();
>     > int product = 1;
>     > for (int i = 1; i <= n; i++) {
>     >   System.out.print("Next number --> ");
>     >   product *= sc.nextInt();
>     > }
>     > System.out.println("Product = " + product);
>     > ```

> 18. The expression `(0.2 + 1.2 + 2.2 + 3.2)` should equal `6.8`, but in Java it does not.
>     Why not?
>     > Real numbers are represented as imprecise floating-point numbers in the computer,
>     > and the limited precision led to a round-off error.

> 19. The following code was intended to print a message, but it actually produces no output.  
>      Describe how to fix the code to print the expected message.
>     > ```java
>     > double credits = gpa * 3;
>     > if (Math.abs(credits - 9.6) < 1e-4) { // if |val| < 0.0001 consider credits is 9.6
>     >     System.out.println("You earned enough credits.");
>     > }
>     > ```

---

<h3 align="center"><mark><u>Section 4.3: Text Processing</u></mark></h3>

> 20. What output is produced by the following program?
>     > ```java
>     > printRange('e', 'g'); //=> "efg"
>     > printRange('n', 's'); //=> "nopqrs"
>     > printRange('z', 'a'); //=> nothing is printed
>     > printRange('q', 'r'); //=> "qr"
>     > ```

> 21. Write an if statement that tests to see whether a `String` begins with a capital letter.
>     > ```java
>     > char first = phrase.charAt(0);
>     > if (Character.isLetter(first) && Character.isUpperCase(first))
>     >   System.out.println("capital");
>     > else
>     >   System.out.println("not capital");
>     > ```

> 22. What is wrong with the following code, which attempts to count the number  
>      occurrences of the letter `'e'` in a String, case-insensitively?
>     > `char` is primitive type and doesn't have any methods associated with it.  
>     > There is a `Character` class that provide char related methods.  
>     > Thus `s.charAt(i).toLowerCase()` will cause compilation error
>     >
>     > ```java
>     > int count = 0;
>     > for (int i = 0; i < s.length(); i++)
>     >   if (Character.toLowerCase(s.charAt(i)) == 'e')
>     >     count++;
>     > ```

> 23. Consider a String stored in a variable called `name` that stores a person’s
>     first and last name (e.g., “Marla Singer”).
>     Write the expression that would produce the last name followed by the first initial
>     (e.g., “Singer, M.”).
>     > ```java
>     > public static String lastFirst(String firstLast) {
>     >   int split = firstLast.indexOf(" ");
>     >   return firstLast.substring(split + 1) + ", " +
>     >          firstLast.charAt(0) + ".";
>     > }
>     > ```

> 24. Write code to examine a `String` and determine how many of its letters come from  
>      the second half of the alphabet (that is, have values of 'n' or subsequent letters).  
>      Compare case-insensitively, such that values of 'N' through 'Z' also count.
>     Assume that every character in the String is a letter.
>     > ```java
>     > public static int secondHalfLetters(String s) {
>     >   int count = 0;
>     >   for (int i = 0; i < s.length(); i++) {
>     >     char c = Character.toLowerCase(s.charAt(i));
>     >     if (c >= 'n' && c <= 'z')
>     >       count++;
>     >   }
>     >   return count;
>     > }
>     > ```

---

<h3 align="center"><mark><u>Section 4.4: Methods with Conditional Execution</u></mark></h3>

> 25. Consider a method printTriangleType that accepts three integer arguments representing  
>      the lengths of the sides of a triangle and prints the type of triangle that these sides form.
>     An `equilateral` triangle has three sides of the same length.
>     `isosceles` triangle has two sides that are the same length.
>     `scalene` triangle has three sides of different lengths
>     > The three side lengths must be positive integers.
>     > No side's length may exceed the sum of any two other side lengths.

> 26. Consider a method `getGrade` that accepts an integer representing a student’s grade  
>      percentage in a course and returns that student’s numerical course grade.  
>      The grade can be between 0.0 (failing) and 4.0 (perfect).  
>      What are the preconditions of such a method?
>     > The parameter's value must be greater than or equal to 0.
>     > The parameter's value must be less than or equal to 100.

> 27. The following method attempts to return the median (middle) of three integer values,  
>      but it contains logic errors.
>     > ```java
>     > public static int medianOf3(int n1, int n2, int n3) {
>     >   int x = n1 - n2;
>     >   int y = n2 - n3;
>     >   int z = n1 - n3;
>     >   return x * y > 0 ? n2 : (x * z > 0 ? n3 : n1);
>     > }
>     > ```

> 28. One of the exercises in Chapter 3 asked you to write a method that would find the  
>      roots of a quadratic equation of the form ax^2 + bx + c = 0.
>     Under what conditions would this formula fail?
>     Modify the quadratic method so that it will reject invalid values
>     of a, b, or c by throwing an exception.
>     > Equation will fail if the product `b*b - 4*a*c` is a negative number.
>     > Or if `a == 0`
>     >
>     > ```java
>     > public static void quadratic(int a, int b, int c) {
>     >   double d = b * b - 4 * a * c;
>     >   if (a == 0 || d < 0)
>     >     throw new IllegalArgumentException();
>     >
>     >   d = Math.sqrt(d);
>     >   double r1 = (-b + d) / (2 * a);
>     >   double r2 = (-b - d) / (2 * a);
>     >   System.out.println("First root = " + r1);
>     >   System.out.println("Second root = " + r2);
>     > }
>     > ```

> 29. Consider the following Java method, which is written incorrectly:
>     > ```java
>     > public static void printNumOdd(int n1, int n2, int n3) {
>     >   int count = Math.abs(n1) % 2 + Math.abs(n2) % 2 + Math.abs(n3) % 2;
>     >   System.out.println(count + " of the 3 numbers are odd.");
>     > }
>     > ```

---

> The methods of a program are like workers in a company. The author of a program
> acts like the director of a company, deciding what employee positions to create, how
> to group employees together into working units, which work to task to which group,
> and how groups will interact.
> A good structure gives each group clear tasks to complete, avoids giving any
> particular person or group too much work, and provides a balance between workers
> and management.
>
> 1. Each method should have a **_coherent_** set of responsibilities.
>    > **_Cohesion_**
>    > A desirable quality in which the responsibilities of a method or process
>    > are closely related to each other.
> 2. No one method should do too large a share of the overall task.
> 3. Coupling and dependencies between methods should be minimized.
>    > **_Coupling_**
>    > An undesirable state in which two methods or processes rigidly depend
>    > on each other.
> 4. The `main` method should be a concise summary of the overall program.
>    > A main method should read as a summary of the overall program’s behavior.
>    > let main manage the overall execution of tasks in the program.
>    > **_Chaining_**
>    > An undesirable design in which a “chain” of several methods call each
>    > other without returning the overall flow of control to main.
> 5. Data should be “owned” at the lowest level possible.
>    > Decisions should be made at the lowest possible level in the hierarchy.
>    > `main` method should avoid performing low-level tasks as much as possible.
>    > variables should be declared and initialized in the narrowest possible scope.
