<h1 align="center"><u>Self-Check Answers</u></h1>
<h2 align="center"><mark><u>Section 3.1: Parameters</u></mark></h2>

> 1. Which of the following is the correct syntax for a method header with parameters?
>    > ```java
>    > public static void example(x, y) {             // CE: parameters types are missing
>    > public static (int x, int y) example() {       // CE: return type missing (even if it is void)
>    > public static void example(int x,y) {          // CE: parameter y data type is missing
>    > public static void example(x: int, y: int) {   // CE: ':' unrecognized, also type is after the parameter
>    > public static void example(int x, int y) (     // ✔
>    > ```

> 2. What output is produced by the following program?
>    > `15 42`  
>    > `10 25`

> 3. The following program has 9 mistakes. What are they?
>    > ```java
>    > public class Oops3 {
>    >  public static void main() {       // #1: main signature is main(String[]), add String[] args
>    >    double bubble = 867.5309;
>    >    double x      = 10.01;
>    >    printer( double x, double y);   // #2: when calling a method parameter types should not be written
>    >                                    // #3: there is no such local variable as y
>    >    printer(x);                     // #7: printer accepting 2 argument, only one passed here
>    >    printer("barack", "obama");     // #8: printer accepting (double, double) here (String, String) incompatible types
>    >    System.out.println("z = " + z); // #9: there is no such local variable in main as z
>    >  }
>    >
>    >  public static void printer(x, y double) {                  // #4: parameter x type is missing and y
>    >                                                             // and double are reversed (double x, double y)
>    >    int z = 5;
>    >    System.out.println("x = " + double x +" and y = " + y);  // #5: double is a keyword, delete double
>    >    System.out.println("The value from main is: " + bubble); // #6: no such local variable as 'bubble',
>    >                                                             // should by y
>    >  }
>    > }
>    > ```

> 4. What output is produced by the following program?
>    > `1 3 5`  
>    > `1 3 5 7 9 11 13 15`  
>    > `1 3 5 7 9 11 13 15 17 19 21 23 25`

> 5. What is the output of the following program?
>    > `1 2 3 4 5`  
>    > `1 2 3 4 5 6 7`  
>    > `1 2 3 4`  
>    > `number = 8`

> 6. What is the output of the following program?
>    > ```java
>    > sentence(one, two, 3);                // => three times two = 6
>    > sentence(two, three, 14);             // => 1 times three = 28
>    > sentence(three, three, number + 1);   // => 1 times 1 = 42
>    > sentence(three, two, 1);              // => three times 1 = 2
>    > sentence("eight", three, number / 2); // => 1 times eight = 20
>    > ```

> 7. What output is produced by the following program?
>    > ```java
>    > sentence(he, she, it);       // => whom and who like it
>    > sentence(she, he, who);      // => it and him like whom
>    > sentence(who, she, who);     // => whom and him like him
>    > sentence(it, "stu", "boo");  // => stu and boo like who
>    > sentence(it, whom, who);     // => her and him like who
>    > ```

> 8. What output is produced by the following program?
>    > ```java
>    > touch(ear, elbow);             // => touch your eye to your head
>    > touch(elbow, ear);             // => touch your head to your eye
>    > touch(head, "elbow");          // => touch your shoulders to your elbow
>    > touch(eye, eye);               // => touch your eyes and ears to your eyes and ears
>    > touch(knees, "Toes");          // => touch your toes to your Toes
>    > touch(head, "knees " + knees); // => touch your shoulders to your knees toes
>    > ```

> 9. What output is produced by the following program?
>    > ```java
>    > carbonated(coke, soda, pop);        // => say coke not pepsi or pop
>    > carbonated(pop, pepsi, pepsi);      // => say soda not soda or pepsi
>    > carbonated("pop", pop, "koolaid");  // => say pepsi not koolaid or pop
>    > carbonated(say, "say", pop);        // => say say not pepsi or pepsi
>    > ```

> 10. Write a method called `printStrings` that accepts a `String` and a number of  
>      repetitions as parameters and prints that `String` the given number of times  
>      with a space after each time.
>     > ```java
>     > public static void printStrings(String s, int t) {
>     >  for (int i = 1; i <= t; i++) System.out.print(s);
>     > }
>     > ```

> 11. The `System.out.println` command works on many different types of values,  
>      such as integers or doubles. What is the term for such a method?
>     > `method overloading (=static polymorphism)`

---

<h2 align="center"><mark><u>Section 3.2: Methods That Return Values</u></mark></h2>

> 12. What is wrong with the following program?
>     > ```java
>     > public class Temperature {
>     >   public static void main(String[] args) {
>     >     double tempf = 98.6;
>     >     double tempc = 0.0;
>     >     ftoc(tempf, tempc);                                 // #3: return value is ignored
>     >     System.out.println("Body temp in C is: " + tempc);  // #4: tempc should be ftoc
>     >   }
>     >
>     >   // converts Fahrenheit temperatures to Celsius
>     >   public static void ftoc(double tempf, double tempc) { // #2: add double as return type
>     >     tempc = (tempf - 32) * 5 / 9;                       // #1: return the calculated value
>     >   }
>     > } // Expected output => Body temp in C is: 37.0
>     > ```

> 13. Evaluate the following expressions:
>     > ```java
>     > Math.abs(–1.6)                                            // => 1.6
>     > Math.abs(2 + –4)                                          // => 2
>     > Math.pow(6, 2)                                            // => 36.0
>     > Math.pow(5 / 2, 6)                                        // => 64.0
>     > Math.ceil(9.1)                                            // => 10.0
>     > Math.ceil(115.8)                                          // => 116.0
>     > Math.max(7, 4)                                            // => 7
>     > Math.min(8, 3 + 2)                                        // => 5
>     > Math.min(–2, –5)                                          // => -5
>     > Math.sqrt(64)                                             // => 8.0
>     > Math.sqrt(76 + 45)                                        // => 11.0
>     > 100 + Math.log10(100)                                     // => 100 + 2*log10(10) = 100 + 2.0 = 102.0
>     > 13 + Math.abs(–7) – Math.pow(2, 3) + 5                    // => 13 + |-7| - 2^3 + 5 = 13 + 7 - 8.0 + 5 = 17.0
>     > Math.sqrt(16) * Math.max(Math.abs(–5), Math.abs(–3))      // => 4.0 * max(5, 3) = 4.0 * 5 = 20.0
>     > 7 – 2 + Math.log10(1000) + Math.log(Math.pow(Math.E, 5))  // => 5 + 3.0*log10(10) + ln(e^5) = 5 + 3.0*1.0 + 5ln(e)
>     >                                                           // => 5 + 3.0 + 5 = 13.0
>     > Math.max(18 – 5, Math.ceil(4.6 * 3))                      // => max(13, 14.0) = 14.0
>     > ```

> 14. What output is produced by the following program?
>     > ```java
>     > z = mystery(x, z, y);                       // => 3 0
>     > System.out.println(x + " " + y + " " + z);  // => 1 2 4
>     > x = mystery(z, z, x);                       // => 4 3
>     > System.out.println(x + " " + y + " " + z);  // => 5 2 4
>     > y = mystery(y, y, z);                       // => 8 1
>     > System.out.println(x + " " + y + " " + z);  // => 5 9 4
>     > ```

> 15. Write the result of each expression.
>     > ```java
>     > double grade = 2.7;
>     > Math.round(grade);                              // grade = 2.7
>     > grade = Math.round(grade);                      // grade = 3.0
>     >
>     > double min = Math.min(grade, Math.floor(2.9));  // min = min(3.0, 2.0) = 2.0
>     >
>     > double x = Math.pow(2, 4);                      // x = 16.0
>     > x = Math.sqrt(64);                              // x = 8.0
>     >
>     > int count = 25;
>     > Math.sqrt(count);                               // count = 25
>     > count = (int) Math.sqrt(count);                 // count = 5
>     >
>     > int a = Math.abs(Math.min(-1, -3));             // a = 3
>     > ```

> 16. Write a method called `min` that takes three integers as parameters and returns  
>      the smallest of the three values; `min(3, –2, 7) => -2; min(19, 27, 6) => 6`
>     > ```java
>     > public static int min(int a, int b, int c) {
>     >   return Math.min(Math.min(a, b), c);
>     > }
>     > ```

> 17. Write a method called `countQuarters` that takes an `int` representing a number  
>      of cents as a parameter and returns the number of quarter coins represented by that  
>      many cents.
>     Don’t count any whole dollars, because those would be dispensed as dollar bills.  
>      For example, `countQuarters(64)` would return 2, because 64 cents is equivalent to 2
>     quarters with 14 cents left over.
>     A call of `countQuarters(1278)` would return 3, because after the 12 dollars are  
>      taken out, 3 quarters remain in the 78 cents that are left.
>     > ```java
>     > public static int countQuarters(int cents) {
>     >   return (cents % 100) / 25;  // remove dollars (100 cents) and get quarters (25 cents)
>     > }
>     > ```

---

<h2 align="center"><mark><u>3.3: Using Objects</u></mark></h2>

> 18. What output is produced by the following code?
>     > ```java
>     > String first = "James";
>     > String last = "Kirk";
>     > String middle = "T."
>     > System.out.println(last);                                // => Kirk
>     > System.out.println("My name is " + first);               // => My name is James
>     > System.out.println(first + " " + last);                  // => James Kirk
>     > System.out.println(last + ", " + first + " " + middle);  // => Kirk, James T.
>     > System.out.println(middle + " is for Tiberius");         // => T. is for Tiberius
>     > ```

> 19. Assuming that the following variables have been declared.  
>      evaluate the following expressions:
>     > ```java
>     > String str1 = "Frodo Baggins";
>     > String str2 = "Gandalf the GRAY";
>     >
>     > str1.length()                    // => 13
>     > str1.charAt(7)                   // => 'a'
>     > str2.charAt(0)                   // => 'G'
>     > str1.indexOf("o")                // => 2 (first 'o' found starting from left)
>     > str2.toUpperCase()               // => "GANDALF THE GRAY"
>     > str1.toLowerCase().indexOf("B")  // => "frodo baggins".indexOf("B") => -1 (no such String as "B")
>     > str1.substring(4)                // => "o Baggins"
>     > str2.substring(3, 14)            // => "dalf the GR" (Start from index 3 take 14 - 3 characters)
>     > str2.replace("a", "oo")          // => "Goondoolf the GRAY"
>     > str2.replace("gray", "white")    // => "Gandalf the GRAY"
>     > "str1".replace("r", "range")     // => "strange1"
>     > ```

> 20. Assuming that the following variables have been declared,  
>      evaluate the following expressions:
>     > ```java
>     > String str1 = "Q.E.D.";
>     > String str2 = "Arcturan Megadonkey";
>     > String str3 = "Sirius Cybernetics Corporation";
>     >
>     > str1.length()                          // => 6
>     > str2.length()                          // => 19
>     > str1.toLowerCase()                     // => "q.e.d."
>     > str2.toUpperCase()                     // => "ARCTURAN MEGADONKEY"
>     > str1.substring(2, 4)                   // => "E."
>     > str2.substring(10, 14)                 // => "egad"
>     > str1.indexOf("D")                      // => 4
>     > str1.indexOf(".")                      // => 1
>     > str2.indexOf("donkey")                 // => 13
>     > str3.indexOf("X")                      // => -1
>     > str2 + str3.charAt(17)                 // => "Arcturan Megadonkeys"
>     > str3.substring(9, str3.indexOf("e"))   // => "b"
>     > str3.substring(7, 12)                  // => "Cyber"
>     > str2.toLowerCase().substring(9, 13) +
>     > str3.substring(18, str3.length() – 7)  // => "mega" + " Corp" => "mega Corp"
>     > ```

> 21. Consider the following String:
>     `String quote = "Four score and seven years ago";`
>     What expression produces the new String `"SCORE"`?
>     What expression produces `"four years"`?
>     > ```java
>     > String score = quote.substring(5, 10).toUpperCase();
>     > String four_years = quote.substring(0, 4).toLowerCase() + quote.substring(20, 26);
>     > ```

> 22. In a program reading user input by means of a Scanner, the user types the following line of input:
>     `Hello there. 1+2 is 3 and 1.5 squared is 2.25!`
>     Into how many tokens will this line be split?  
>      What is each token?
>     > Each token ends with whitespace (e.g. `\s, \t, \r\n`) and returned from Scanner as  
>     > a String object. Thus the givin string will be split into 10 tokens:
>     > `Hello`  
>     > `there.`  
>     > `1+2`  
>     > `is`  
>     > `3`  
>     > `1.5`  
>     > `squared`  
>     > `is`  
>     > `2.25!`

> 23. Given the following code fragment, describe what will happen when the user
>     types each of the following values.  
>     If the code will read the value successfully, describe the value that will be stored  
>     in the variable money. If it will not, write `exception`
>
> ```java
> // a. 34.50    => 34.5
> // b. 6        => 6.0
> // c. \$25.00  => exception
> // d. million  => exception
> // e. 100\*5   => exception
> // f. 600x000  => exception
> // g. none     => exception
> // h. 645      => 645.0
> Scanner console = new Scanner(System.in);
> System.out.print("How much money do you have? ");
> double money = console.nextDouble();
> ```

> 24. Write Java code to read an integer from the user, then print that number multiplied by 2.  
>      You may assume that the user types a valid integer.
>     > ```java
>     > Scanner input = new Scanner(System.in);
>     > System.out.print("Type an integer: ");
>     > int number = input.nextInt();
>     > System.out.println(number + " times 2 = " + number * 2);
>     > ```

> 25. Consider the following program.  
>      Modify the code to use a `Scanner` to prompt the user for the values of `low` and `high`.
>     > ```java
>     > import java.util.Scanner;  // not needed for Practice-It!
>     > public class SumNumbers {
>     >   public static void main(String[] args) {
>     >     Scanner sc = new Scanner(System.in);
>     >     System.out.print("low? ");
>     >     int low = sc.nextInt();
>     >     System.out.print("high? ");
>     >     int high = sc.nextInt();
>     >     int sum = 0;
>     >     for (int i = low; i <= high; i++) {
>     >       sum += i;
>     >     }
>     >     System.out.println("sum = " + sum);
>     >   }
>     > }
>     > ```

> 26. Write Java code that prompts the user for a phrase and a number of times to repeat it,  
>      then prints the phrase the requested number of times.
>     > ```java
>     > Scanner sc = new Scanner(System.in);
>     > System.out.print("What is your phrase? ");
>     > String phrase = sc.nextLine();
>     > System.out.print("How many times should I repeat it? ");
>     > int n = sc.nextInt();
>     > for (int i = 0; i < n; i++) {
>     >   System.out.println(phrase);
>     > }
>     > ```

> 27. Write a complete program called "`TheNameGame`," where the user inputs a `first`
>     and `last` name and a song in the following format is printed about their first,
>     then last, name.
>     > ```java
>     > public class TheNameGame {
>     >
>     >   public static void main(String[] args) {
>     >     Scanner sc = new Scanner(System.in);
>     >     System.out.print("What is your name? ");
>     >     String name = sc.nextLine();
>     >
>     >     int split = name.indexOf(" ");
>     >     sing(name.substring(0, split));
>     >     sing(name.substring(split + 1));
>     >   }
>     >
>     >   public static void sing(String s) {
>     >     System.out.printf("%s %s, bo-B%s\n", s, s, s.substring(1));
>     >     System.out.printf("Banana-fana fo-F%s\n", s.substring(1));
>     >     System.out.printf("Fee-fi-mo-M%s\n", s.substring(1));
>     >     System.out.printf("%s!\n", s.toUpperCase());
>     >   }
>     > }
>     > ```
