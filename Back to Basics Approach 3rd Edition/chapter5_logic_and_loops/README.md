<h1 align="center" id="home"><u>Self-Check Answers</u></h1>

[Section 5.1: The while Loop](#5.1)
[Section 5.2: Fencepost Algorithms](#5.2)
[Section 5.3: The booleanType](#5.3)
[Section 5.4: User Errors](#5.4)
[Section 5.5: Assertions and Program Logic](#5.5)

<h3 align="center" id="5.1"><mark><u>Section 5.1: The while Loop</u></mark> <a href="#home">👆</a></h3>

> 1. For each of the following while loops, state how many times the loop will execute
>    its body.  
>     Remember that “zero,”, “infinity,” and “unknown” are legal answers.  
>     Also, what is the output of the code in each case?
>    > `a. 10, b. zero, c. infinity, d. 3, e. 5, f. 7`
>    >
>    > ```java
>    > int x = 1;
>    > while (x < 100) {
>    >   System.out.print(x + " ");
>    >   x += 10;
>    > } //=> 1 11 21 31 41 51 61 71 81 91
>    >
>    > int max = 10;
>    > while (max < 10) {
>    >   System.out.println("count down: " + max);
>    >   max––;
>    > } //=> zero times
>    >
>    > int x = 250;
>    > while (x % 3 != 0) {
>    >   System.out.println(x);
>    > } //=> infinity, x is not multiple of 3 and x is no updated within the loop
>    >
>    > int x = 2;
>    > while (x < 200) {
>    >   System.out.print(x + " ");
>    >   x *= x;
>    > } //=> 2 4 16
>    >
>    > String word = "a";
>    > while (word.length() < 10) {
>    >   word = "b" + word + "b";
>    > } // word (length) = "a" (1), "bab" (3), "bbabb" (5), "bbbabbb" (7),
>    >   //                 "bbbbabbbb" (9), "bbbbbabbbbb" (10)
>    > System.out.println(word); //=> "bbbbbabbbbb"
>    >
>    > int x = 100;
>    > while (x > 0) {
>    >   System.out.println(x / 10);
>    >   x = x / 2;
>    > } // => 10 5 2 1 0 0 0 0
>    >   // x =  100 50 25 12 6 3 1 0
>    > ```

> 2. Convert each of the following for loops into an equivalent while loop:
>    > ```java
>    > // a
>    > for (int n = 1; n <= max; n++) { System.out.println(n); }
>    >
>    > int n = 1;
>    > while (n <= max) { System.out.println(n); }
>    >
>    > // b
>    > int total = 25;
>    > for (int number = 1; number <= (total / 2); number++) {
>    >   total = total – number;
>    >   System.out.println(total + " " + number);
>    > }
>    >
>    > int number = 1;
>    > while (number <= (total / 2)) {
>    >   total -= number;
>    >   System.out.println(total + " " + number);
>    >   number++;
>    > }
>    >
>    > // c
>    > for (int i = 1; i <= 2; i++) {
>    >   for (int j = 1; j <= 3; j++) {
>    >     for (int k = 1; k <= 4; k++) {
>    >       System.out.print("*");
>    >     }
>    >   System.out.print("!");
>    >   }
>    > System.out.println();
>    > }
>    >
>    > int i = 1, j = 1, k = 1;
>    > while (i <= 2) {
>    >   j = 1;
>    >   while (j <= 3) {
>    >     k = 1;
>    >     while (k <= 4) {
>    >       System.out.print("*");
>    >       k++;
>    >     }
>    >     System.out.print("!");
>    >     j++;
>    >   }
>    >   System.out.println();
>    >   i++;
>    > }
>    >
>    > // d
>    > int number = 4;
>    > for (int count = 1; count <= number; count++) {
>    >   System.out.println(number);
>    >   number = number / 2;
>    > }
>    >
>    > int count = 1;
>    > while (count <= number) {
>    >   System.out.println(number);
>    >   number /= 2;
>    >   count++;
>    > }
>    > ```

> 3. Consider the following method:
>    For each of the following calls, indicate the output that the preceding method produces:
>    > This method will print the power of two which is smaller or equals to x
>    > followed by the exponent.
>    >
>    > ```java
>    > public static void mystery(int x) {
>    >   int y = 1;
>    >   int z = 0;
>    >   while (2 * y <= x) {
>    >     y = y * 2;
>    >     z++;
>    >   }
>    >   System.out.println(y + " " + z);
>    > }
>    >
>    > mystery(1);  // 1 0
>    > mystery(6);  // 4 2
>    > mystery(19); // 16 4
>    > mystery(39); // 32 5
>    > mystery(74); // 64 6
>    > ```

> 4. Consider the following method:
>    For each of the following calls, indicate the output that the preceding method produces:
>    > This method printing how many times the parameter `x` can be divided by 2 until we
>    > we get an odd number.
>    >
>    > ```java
>    > public static void mystery(int x) {
>    >   int y = 0;
>    >   while (x % 2 == 0) {
>    >     y++;
>    >     x = x / 2;
>    >   }
>    >   System.out.println(x + " " + y);
>    > }
>    > mystery(19); // 1 0
>    > mystery(42); // 21 1
>    > mystery(48); // 3 4
>    > mystery(40); // 5 3
>    > mystery(64); // 1 6
>    > ```

> 5. Consider the following code:
>    What range of values can each variable (a, b, c, d, and e) have?
>    > ```java
>    > Random rand = new Random();
>    > int a = rand.nextInt(100);      // 0 - 99
>    > int b = rand.nextInt(20) + 50;  // 0-19 + 50 = 50 - 69
>    > int c = rand.nextInt(20 + 50);  // 0 - 69
>    > int d = rand.nextInt(100) – 20; // 0-99 - 20 = -20 - 79
>    > int e = rand.nextInt(10) * 4;   // 0-9 * 4 = 0,4,8,12,16,20,24,28,32,36
>    > ```

> 6. Write code that generates a random integer between 0 and 10 inclusive.
>    > ```java
>    > Random rand = new Random();
>    > int n = rand.nextInt(11);
>    > ```

> 7. Write code that generates a random odd integer (not divisible by 2) between 50 and 99 inclusive.
>    > ```java
>    > Random rand = new Random();
>    > int n = rand.nextInt(25) * 2 + 51; // [0, 24] * 2 + 51
>    >                                    // = [0, 2, 4, ... , 48] + 51
>    >                                    // = [51, 53, 55, ... , 99]
>    > ```

> 8. For each of the `do/while` loops that follow, state the number of times that the loop  
>     will execute its body.
>    Remember that `“zero,” “infinity,”` and `“unknown”` are legal answers.  
>     Also, what is the output of the code in each case?
>    > ```java
>    > // 1 => 10 times
>    > int x = 1;
>    > do {
>    >   System.out.print(x + " "); // 1 11 21 31 41 51 61 71 81 91
>    >   x += 10;
>    > } while (x < 100);
>    >
>    > // 2 => infinity
>    > int max = 10;
>    > do {
>    >   System.out.println("count down: " + max);
>    >   max--;
>    > } while (max < 10);
>    >
>    > // 3 => infinity
>    > int x = 250;
>    > do {
>    >   System.out.println(x); // 250, 250, 250, ...
>    > } while (x % 3 != 0);
>    >
>    > // 4 => 2 times
>    > int x = 100;
>    > do {
>    >   System.out.println(x); // 100 50
>    >   x = x / 2;
>    > } while (x % 2 == 0);
>    >
>    > // 5 => 3 times
>    > int x = 2;
>    > do {
>    >   System.out.print(x + " "); // 2 4 16
>    >   x *= x;
>    > } while (x < 200);
>    >
>    > // 6 => 5 times
>    > String word= "a";
>    > do {
>    >   word = "b" + word + "b"; // "bab" "bbabb" "bbbabbb" "bbbbabbbb" "bbbbbabbbbb"
>    > } while (word.length() < 10);
>    > System.out.println(word); // "bbbbbabbbbb"
>    >
>    > // 7 => 7 times
>    > int x = 100;
>    > do {
>    >   System.out.println(x / 10); // 10 5 2 1 0 0 0
>    >   x /= 2; // 50 25 12 6 3 1 0
>    > } while (x > 0);
>    >
>    > // 8 => 3 times
>    > String str = "/\\"; // \ must be escaped but not counted as character
>    > do {
>    >   str += str; // "/\/\" "/\/\/\/\" "/\/\/\/\/\/\/\/\"
>    > } while (str.length() < 10);
>    > System.out.println(str); // "/\/\/\/\/\/\/\/\"
>    > ```

> 9. Write a `do/while` loop that repeatedly prints a certain message until the user  
>     tells the program to stop.
>    > ```java
>    > Scanner sc = new Scanner(System.in);
>    > do {
>    >   System.out.println("She sells seashells by the seashore.");
>    >   System.out.print("Do you want to hear it again? ");
>    > } while (sc.next().equalsIgnoreCase("y"));
>    > ```

> 10. Write a method called `zeroDigits` that accepts an integer parameter and returns
>     the number of digits in the number that have the value 0.
>     For example, the call `zeroDigits(5024036)` should return 2, and `zeroDigits(743)`
>     should return 0. The call `zeroDigits(0)` should return 1.
>     > ```java
>     > public static int zeroDigits(int n) {
>     >   n = Math.abs(n); // allow negative numbers also
>     >   int zeros = 0;
>     >   do {
>     >     zeros += n % 10 == 0 ? 1 : 0;
>     >     n /= 10;
>     >   } while (n > 0);
>     >   return zeros;
>     > }
>     > ```

> 11. Write a `do/while` loop that repeatedly prints random numbers between 0 and 1000  
>      until a number above 900 is printed.  
>      At least one line of output should always be printed, even if the first random number  
>      is above 900.
>     > ```java
>     > Random rnd = new Random();
>     > int number;
>     > do {
>     >   number = rnd.nextInt(1000);
>     >   System.out.println("Random number: " + number);
>     > } while (number < 900);
>     > ```

---

<h3 align="center" id="5.2"><mark><u>Section 5.2: Fencepost Algorithms</u></mark> <a href="#home">👆</a></h3>

> 12. Consider the flawed method `printLetters` that follows, which accepts a `String` as  
>      its parameter and attempts to print the letters of the `String`, separated by dashes.  
>      For example, the call of `printLetters("Rabbit")` should print `R-a-b-b-i-t`.
>     > We are required to print `"Rabbit".length() - 1` dashes, in this solution we print
>     > `"Rabbit".length()` of them. Correct solution:
>     >
>     > ```java
>     > public static void printLetters(String text) {
>     >   if (!text.isEmpty()) {
>     >     System.out.print(text.charAt(0));
>     >     for (int i = 1; i < text.length(); i++) {
>     >       System.out.print("-" + text.charAt(i));
>     >     }
>     >   }
>     >   System.out.println();   // to end the line of output
>     > }
>     > ```

> 13. Write a sentinel loop that repeatedly prompts the user to enter a number and,  
>      once the number –1 is typed, displays the maximum and minimum numbers that the user entered.
>     > ```java
>     > final int SENTINEL = -1;
>     > Scanner   sc       = new Scanner(System.in);
>     > System.out.printf("Type a number (or %d to stop): ", SENTINEL);
>     > int in  = sc.nextInt();
>     > int max = in;
>     > int min = in;
>     >
>     > while (in != SENTINEL) {
>     >   if (in > max)
>     >     max = in;
>     >   else if (in < min)
>     >     min = in;
>     >
>     >   System.out.printf("Type a number (or %d to stop): ", SENTINEL);
>     >   in = sc.nextInt();
>     > }
>     >
>     > if (max != SENTINEL) {
>     >   System.out.println("Maximum was " + max);
>     >   System.out.println("Minimum was " + min);
>     > }
>     > ```

---

<h3 align="center" id="5.3"><mark><u>Section 5.3: The booleanType</u></mark> <a href="#home">👆</a></h3>

> 14. What is the value of each of the following Boolean expressions?
>     > ```java
>     > int x = 27, y = -1, z = 32;
>     > boolean b = false;
>     >
>     > !b                                    //=> true
>     > b || true                             //=> true
>     > (x > y) && (y > z)                    //=> true && false => false
>     > (x == y) || (x <= z)                  //=> false || true => true
>     > !(x % 2 == 0)                         //=> !false => true
>     > (x % 2 != 0) && b                     //=> true && false => false
>     > b && !b                               //=> false
>     > b || !b                               //=> false || true => true
>     > (x < y) == b                          //=> false == false => true
>     > !(x / 2 == 13) || b || (z * 3 == 96)  //=> !true || false || true => true
>     > (z < x) == false                      //=> false == false => true
>     > !((x > 0) && (y < 0))                 //=> !(true && true) => false
>     > ```

> 15. Write a method called `isVowel` that accepts a character as input and returns `true`  
>      if that character is a vowel (a, e, i, o, or u).
>     For an extra challenge, make your method case-insensitive.
>     > ```java
>     > public static boolean isVowel(String s) {
>     >   return s.length() == 1 && "aeiouAEIOU".contains(s);
>     > }
>     > ```

> 16. In what cases does the method report an incorrect answer?
>     How can the code be changed so that it will always return a correct result?
>     > If `n <= 1` we get a result of `true` which is wrong, 1 and smaller numbers are not
>     > prime number. Further more if `n % i != 0` prime is reseated to `true` which is wrong.
>     >
>     > ```java
>     > public static boolean isPrime(int n) {
>     >   if (n <= 1 || (n != 2 && n % 2 == 0))
>     >     return false;
>     >   if (n == 2)
>     >     return true;
>     >
>     >   for (int i = 3; i <= Math.sqrt(n); i += 2)
>     >     if (n % i == 0)
>     >       return false;
>     >
>     >     return true;
>     > }
>     > ```

> 17. In what cases does the method report an incorrect answer?  
>      How can the code be changed so that it will always return a correct result?
>     > Once the character is found we should assign `found = true` and exit the loop.  
>     > the else is redundant and cause the method return wrong value because if  
>     > `str.charAt(i) == ch` is false found is resets to false.
>     >
>     > ```java
>     > public static boolean contains(String str, char ch) {
>     >   for (int i = 0; i < str.length(); i++) {
>     >     if (str.charAt(i) == ch)
>     >       return true;
>     >   }
>     >   return false;
>     > }
>     > ```

> 18. Using `“Boolean Zen,”` write an improved version of the following method,  
>      which returns whether the given `String` starts and ends with the same character:
>     > ```java
>     > public static boolean startEndSame(String str) {
>     >   return str.charAt(0) == str.charAt(str.length() - 1);
>     > }
>     > ```

> 19. Using `“Boolean Zen,”` write an improved version of the following method,  
>      which returns whether the given number of cents would require any pennies  
>      (as opposed to being an amount that could be made exactly using coins other than pennies):
>     > ```java
>     > public static boolean hasPennies(int cents) {
>     >   return cents % 5 != 0;
>     > }
>     > ```

> 20. Consider the following method:
>     For each of the following calls, indicate the value that is returned:
>     > ```java
>     > public static int mystery(int x, int y) {
>     >   while (x != 0 && y != 0) {
>     >     if (x < y) y –= x;
>     >     else       x –= y;
>     >   }
>     >
>     >   return x + y;
>     > }
>     >
>     > mystery(3, 3);   //=> 3
>     > mystery(5, 3);   //=> 1
>     > mystery(2, 6);   //=> 2
>     > mystery(12, 18); //=> 6
>     > mystery(30, 75); //=> 15
>     > ```

> 21. **Zune problem**: What is the problem with the preceding code,
>     and in what cases will it exhibit incorrect behavior? How can it be fixed?
>     > ```java
>     > int days = getTotalDaysSince1980();
>     > int year = 1980;
>     > while (days > 365) {  // subtract out years
>     >   if (isLeapYear(year)) {
>     >     if (days > 366) {
>     >       days -= 366;
>     >       year += 1;
>     >     } else { // if no else clause there will be infinite loop is isLeapYear and days <= 366
>     >       break;
>     >     }
>     >   } else {
>     >     days -= 365;
>     >     year += 1;
>     >   }
>     > }
>     > ```

> 22. Write a new Boolean expression that is the negation of each of the following Boolean expressions.
>     > ```java
>     > int x = 27, y = -1, z = 32;
>     > boolean false;
>     > b                                    // <=> !b
>     > (x > y) && (y > z)                   // <=> (x <= y) || (y <= z)
>     > (x == y) || (x <= z)                 // <=> (x != y) && (x > z)
>     > (x % 2 != 0) && b                    // <=> (x % 2 == 0) || !b
>     > (x / 2 == 13) || b || (z * 3 == 96)  // <=> (x / 2 != 13) && !b && (z * 3 != 96)
>     > (z < x) && (z > y || x >= y)         // <=> (z >= x) || (z <= y && x < y)
>     > ```

> 22. Which of the following is a properly reversed version of the following  
>      Boolean expression, according to De Morgan's Laws?
>     `(2 == 3) && (-1 < 5) && isPrime(n)`
>     > ```java
>     > !(2 == 3) && !(-1 < 5) && !isPrime(n)    //=> ✖
>     > !(2 != 3) || !(-1 < 5) || isNotPrime(n)  //=> ✖ expressions is not negated according to DeMorgans laws
>     > (2 == 3) || (-1 < 5) || isPrime(n)       //=> ✖ inner expressions are not negated
>     > (2 != 3) || (-1 >= 5) || !isPrime(n)     //=> ✔
>     > (2 != 3) && (-1 > 5) && isPrime(n)       //=> ✖
>     > ```

---

<h3 align="center" id="5.4"><mark><u>Section 5.4: User Errors</u></mark> <a href="#home">👆</a></h3>

> 23. The following code is not robust against invalid user input.  
>      Describe how to change the code so that it will not proceed until the user has  
>      entered a valid age and grade point average (GPA).
>     Assume that any int is a legal age and that any double is a legal GPA.
>     For an added challenge, modify the code so that it rejects invalid ages  
>      (for example, numbers less than 0) and GPAs (say, numbers less than 0.0 or greater than 4.0).
>     > ```java
>     > int age = -1;
>     > do {
>     >   System.out.print("Type your age: ");
>     >   if (sc.hasNextInt()) {
>     >     age = sc.nextInt();
>     >     if (age < 0)
>     >       age = -1;
>     >   } else {
>     >     sc.next(); // discard current input
>     >   }
>     > } while (age == -1);
>     >
>     > double gpa = -1.0;
>     > do {
>     >   System.out.print("Type your GPA: ");
>     >   if (sc.hasNextDouble()) {
>     >     gpa = sc.nextDouble();
>     >     if (gpa < 0.0 || gpa > 4.0)
>     >       gpa = -1.0;
>     >   } else {
>     >     sc.next();
>     >   }
>     > } while (gpa == -1.0);
>     >
>     > System.out.println("age = " + age + ", GPA = " + gpa);
>     > ```

> 24. Consider the following code: What is the output when the user types the following values?
>     a. `Jane` => "Your name is Jane"
>     b. `56` => "Your IQ is 56"
>     c. `56.2` => "Your name is 56.2"

> 25. Write a piece of code that prompts the user for a number and then prints a  
>      different message depending on whether the number was an integer or a real number.
>     > ```java
>     > Scanner sc = new Scanner(System.in);
>     > System.out.print("Type a number: ");
>     > if (sc.hasNextInt()) {
>     >   System.out.println("You typed the integer " + sc.nextInt());
>     > } else if (sc.hasNextDouble()) {
>     >   System.out.println("You typed the real number " + sc.nextDouble());
>     > } // else not an integer nor real number
>     > ```

> 26. Write code that prompts for three integers, averages them, and prints the average.
>     > ```java
>     > Scanner sc = new Scanner(System.in);
>     > int count = 0, sum = 0;
>     > while (count < 3) {
>     >   System.out.print("Type an integer: ");
>     >   while (!sc.hasNextInt()) {
>     >     sc.next();
>     >     System.out.print("Type an integer: ");
>     >   }
>     >   sum += sc.nextInt();
>     >   count++;
>     > }
>     >
>     > System.out.println("Average: " + (sum / 3.0));
>     > ```

---

<h3 align="center" id="5.5"><mark><u>Section 5.5: Assertions and Program Logic</u></mark> <a href="#home">👆</a></h3>

> 27. Identify the various assertions in the following code as being always true,  
>      never true, or sometimes true and sometimes false at various points in program execution.
>     The comments indicate the points of interest:
>     > ```java
>     >   public static int mystery(Scanner console, int x) {
>     >     int y     = console.nextInt();
>     >     int count = 0;
>     >     // Point A
>     >     while (y < x) {
>     >       // Point B
>     >       if (y == 0) {
>     >         count++;
>     >         // Point C
>     >       }
>     >       y = console.nextInt();
>     >       // Point D
>     >     }
>     >     // Point E
>     >     return count;
>     >   }
>     > ```
>     >
>     > |             |   y < x   |  y == 0   | count > 0 |
>     > | :---------: | :-------: | :-------: | :-------: |
>     > | **Point A** | sometimes | sometimes |   never   |
>     > | **Point B** |  always   | sometimes | sometimes |
>     > | **Point C** |  always   |  always   |  always   |
>     > | **Point D** | sometimes | sometimes | sometimes |
>     > | **Point E** |   never   | sometimes | sometimes |

> 28. Identify the various assertions in the following code as being always true,  
>      never true, or sometimes true and sometimes false at various points in program execution.
>     The comments indicate the points of interest:
>     > ```java
>     >   public static int mystery(int n) {
>     >     Random r = new Random();
>     >     int    a = r.nextInt(3) + 1; // [1, 3]
>     >     int    b = 2;
>     >     // Point A
>     >     while (n > b) {
>     >       // Point B
>     >       b = b + a;
>     >       if (a > 1) {
>     >         n--;
>     >         // Point C
>     >         a = r.nextInt(b) + 1;
>     >       } else { // a <= 1
>     >         a = b + 1;
>     >         // Point D
>     >       }
>     >     }
>     >     // Point E
>     >     return n;
>     >   }
>     > ```
>     >
>     > |             |   n > b   |   a > 1   |   b > a   |
>     > | :---------: | :-------: | :-------: | :-------: |
>     > | **Point A** | sometimes | sometimes | sometimes |
>     > | **Point B** |  always   | sometimes | sometimes |
>     > | **Point C** | sometimes |  always   |  always   |
>     > | **Point D** | sometimes |  always   |   never   |
>     > | **Point E** |   never   | sometimes | sometimes |

> 29. Identify the various assertions in the following code as being always true,  
>      never true, or sometimes true and sometimes false at various points in program execution.
>     The comments indicate the points of interest:
>     > ```java
>     >   public static int mystery(Scanner console) {
>     >     int prev  = 0;
>     >     int count = 0;
>     >     int next  = console.nextInt();
>     >     // Point A
>     >     while (next != 0) {
>     >       // Point B
>     >       if (next == prev) {
>     >         // Point C
>     >         count++;
>     >       }
>     >       prev = next;
>     >       next = console.nextInt();
>     >       // Point D
>     >     }
>     >     // Point E
>     >     return count;
>     >   }
>     > ```
>     >
>     > |             | next == 0 | prev == 0 | next == prev |
>     > | :---------: | :-------: | :-------: | :----------: |
>     > | **Point A** | sometimes |  always   |  sometimes   |
>     > | **Point B** |   never   | sometimes |  sometimes   |
>     > | **Point C** |   never   |   never   |    always    |
>     > | **Point D** | sometimes |   never   |  sometimes   |
>     > | **Point E** |  always   | sometimes |  sometimes   |
