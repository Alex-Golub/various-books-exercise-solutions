<h1 align="center" id="home"><u>CheckPoint Answers</u></h1>

[5.2 The while Loop](#1)  
[5.3 Case Study: Guessing Numbers](#2)  
[5.4 Loop Design Strategies](#3)  
[5.5 Controlling a Loop with User Confirmation or a Sentinel Value](#4)  
[5.6 The do-while Loop](#5)  
[5.7 The for Loop](#7)  
[5.8 Which Loop to Use?](#8)  
[5.9 Nested Loops](#9)  
[5.11 Case Studies](#11)  
[5.12 Keywords break and continue](#12)  
[5.13 Case Study: Checking Palindromes](#13)

<h3 align="center" id="1"><u>5.2 The while Loop</u><a href="#home"> 👆</a></h3>

> 5.2.1 Analyze the following code.  
> Is `count < 100` always `true`, always `false`, or sometimes `true` or  
> sometimes `false` at `Point A`, `Point B`, and `Point C`?
>
> > |             | **count < 100** |
> > | ----------- | :-------------: |
> > | **Point A** |   always true   |
> > | **Point B** |    sometimes    |
> > | **Point C** |  always false   |
> >
> > ```java
> > int count = 0;
> > while (count < 100) {
> >   // Point A
> >   System.out.println("Welcome to Java!");
> >   count++;
> >   // Point B
> > }
> > // Point C
> > ```

> 5.2.2 How many times are the following loop bodies repeated?  
> What is the output of each loop?
>
> > ```java
> > // (a)
> > int i = 1;
> > while (i < 10) { // infinite loop, i is not advancing toward 10
> >   if (i % 2 == 0) System.out.println(i); // nothing is printed
> > }
> >
> > // (b)
> > i = 1;
> > while (i < 10) { // infinite loop, if statement will never be true
> >   if (i % 2 == 0) System.out.println(i++);
> > }
> >
> > // (c)
> > int i = 1;
> > while (i < 10) { // 10 - 1 = 9 times repeated
> >   if ((i++) % 2 == 0) System.out.println(i); // => 3 5 7 9 on separate lines
> > }
> > ```

> 5.2.3 What is the output of the following code?
> Explain the reason.
>
> > ```java
> > int x = 80_000_000;
> > while (x > 0)
> >   x++; // 80_000_001, .... ,Integer.MAX_VALUE, Integer.MIN_VALUE
> >
> > System.out.println("x is " + x); // x is -2147483648 (== Integer.MIN_VALUE)
> >
> > // it looks like infinite loop but its not.
> > // int value has max value of 2^31 - 1 after that incrementing it by
> > // one will wrap around and start from lowest value of int type can get which is -2^31
> > // which is negative thus x > 0 is false an the output is Integer.MIN_VALUE
> > ```

---

<h3 align="center" id="2"><u>5.3 Case Study: Guessing Numbers</u><a href="#home"> 👆</a></h3>

> 5.3.1 What is wrong if `guess` is initialized to `0` in line 11 in Listing 5.3?
>
> > Generated random `number` can be 0.

---

<h3 align="center" id="3"><u>5.4 Loop Design Strategies</u><a href="#home"> 👆</a></h3>

> 5.4.1 Revise the code using the `System.nanoTime()` to measure the time in nano seconds.
>
> > ```java
> > // change all occurrences of System.currentTimeMillis(); to System.nanoTime();
> > // and lastly
> > long testTime = (System.nanoTime() - start) / 1_000_000_000;
> > ```

---

<h3 align="center" id="4"><u>5.5 Sentinel Value</u><a href="#home"> 👆</a></h3>

> 5.5.1 Suppose the input is `2 3 4 5 0`.
> What is the output of the following code?
>
> > Program finds and print the max value from values entered
> >
> > ```java
> > import java.util.Scanner;
> >
> > public class Test {
> >   public static void main(String[] args) {
> >     Scanner input = new Scanner(System.in);
> >     int number, max;
> >     number = input.nextInt();   // 2
> >     max = number;               // 2
> >     while (number != 0) {
> >       number = input.nextInt(); // 3 4 5
> >       if (number > max)
> >         max = number;           // 3 4 5
> >     }
> >
> >     System.out.println("max is " + max);    // 5
> >     System.out.println("number " + number); // 0
> >   }
> > }
> > ```

---

<h3 align="center" id="5"><u>5.6 The do-while Loop</u><a href="#home"> 👆</a></h3>

> 5.6.1 Suppose the input is `2 3 4 5 0`.  
> What is the output of the following code?
>
> > ```java
> > import java.util.Scanner;
> >
> > public class Test {
> >   public static void main(String[] args) {
> >     Scanner input = new Scanner(System.in);
> >     int number, max;
> >     number = input.nextInt();               // 2
> >     max = number;                           // 2
> >     do {
> >       number = input.nextInt();             // 3 4 5 0
> >       if (number > max)
> >         max = number;                       // 3 4 5
> >     } while (number != 0);
> >     System.out.println("max is " + max);    // -> max is 5
> >     System.out.println("number " + number); // -> number 0
> >   }
> > }
> > ```

> 5.6.2 What are the differences between a `while` loop and a `do-while` loop?  
> Convert the following `while` loop into a `do-while` loop:
>
> > In `while` loop boolean condition is checked and only if true statements in
> > the while loop will be executed.
> > In `do-while` statements will be executed at **_least one time_** before boolean condition
> > will be evaluated.
> >
> > ```java
> > Scanner input = new Scanner(System.in);
> > int number, sum = 0;
> > do {
> >   System.out.print("Enter an integer (the input ends if it is 0): ");
> >   number = input.nextInt();
> >   sum += number;
> > } while (number != 0);
> > System.out.println(sum);
> > ```

---

<h3 align="center" id="7"><u>5.7 The for Loop</u><a href="#home"> 👆</a></h3>

> 5.7.1 Do the following two loops result in the same value in `sum`?
>
> > `sum` is the same in both cases.
> > `++i` and `i++` used in isolation produce the same result.
> >
> > ```java
> > // (a)
> > for (int i = 0; i < 10; ++i)
> >   sum += i; // 9 * 10 / 2 = 45
> >
> > // (b)
> > for (int i = 0; i < 10; i++)
> >   sum += i; // 9 * 10 / 2 = 45
> > ```

> 5.7.2 What are the three parts of a `for` loop control?  
> Write a `for` loop that prints the numbers from `1` to `100`.
>
> > 1. **_initializing control variable_**
> > 2. **_continuation-condition_**
> > 3. **_action-after-iteration_**
> >    NOTE: How many time loop will iterate?
> >    **_i <= x <= j : j - i + 1 times_**  
> >    **_i <= x < j : j - i times_**  
> >    **_i < x <= j : j - i times_**  
> >    **_i < x < j : j - i - 1 times_**
> >
> > ```java
> > for (int i = 1; i <= 100; i++)
> >   System.out.println(i);
> > ```

> 5.7.3 Suppose the input is `2 3 4 5 0`.  
> What is the output of the following code?
>
> > | number | sum | count |
> > | :----: | :-: | :---: |
> > |   2    |  0  |   0   |
> > |   3    |  2  |   1   |
> > |   4    |  5  |   2   |
> > |   5    |  9  |   3   |
> > |   0    | 14  |   4   |
> > |   -    | 14  |   5   |
> >
> > ```java
> > import java.util.Scanner;
> >
> > public class Test {
> >   public static void main(String[] args) {
> >     Scanner input = new Scanner(System.in);
> >     int number, sum = 0, count;
> >     for (count = 0; count < 5; count++) {
> >       number = input.nextInt();
> >       sum += number;
> >     }
> >     System.out.println("sum is " + sum);     // => sum is 14
> >     System.out.println("count is " + count); // => count is 5
> >   }
> > }
> > ```

> 5.7.4 What does the following statement do?
>
> > It is an infinite loop that does something.
> > Empty boolean condition in `for` is equivalent to `while (true)`
> >
> > ```java
> > for ( ; ; ) { /* Do something */ }
> > ```

> > 5.7.5 If a variable is declared in a `for` loop control, can it be used  
> > after the loop exits?
> > **_No_**. Variables that are declared in for first part are **local** to that for loop scope.
> > When for condition will evaluate to `false` this variable is no longer can be accessed.

> 5.7.6 Convert the following `for` loop statement to a `while` loop and to a `do-while` loop:
>
> > ```java
> > long sum = 0;
> > for (int i = 0; i <= 1000; i++) { sum = sum + i; }
> >
> > sum = 0;
> > int i = 0;
> > while (i <= 1000) { sum += i++; }
> >
> > sum = 0;
> > int i = 0;
> > do { sum += i++; } while (i <= 1000);
> > ```

> 5.7.7 Count the number of iterations in the following loops.
>
> > ```java
> > // (a)
> > int count = 0;
> > while (count < n) { count++; } // n - 0 = n times
> >
> > // (b)
> > for (int count = 0; count <= n; count++) {} // n - 0 + 1 = n + 1 times
> >
> > // (c)
> > int count = 5;
> > while (count < n) { count++; } // n - 5 times
> >
> > // (d)
> > int count = 5;
> > while (count < n) { count += 3; } // ⌈(n - 5) / 3)⌉ times
> > ```

---

<h3 align="center" id="8"><u>5.8 Which Loop to Use?</u><a href="#home"> 👆</a></h3>

> 5.8.1 Can you convert a `for` loop to a `while` loop?  
> List the advantages of using `for` loops.
>
> > `for`, `while` and `do-while` can be interchangeably replace on another.
> > Use `for` loop is number of iterations is known before hand.
> > Also advancing the loop variable can be forgot in `while` or `do-while` loop.

> 5.8.2 Can you always convert a `while` loop into a `for` loop?
> Convert the following `while` loop into a `for` loop:
>
> > ```java
> > int i = 1;
> > int sum = 0;
> > while (sum < 10000) {
> >   sum = sum + i;
> >   i++;
> > }
> >
> > int sum = 0;
> > for (int i = 1; sum < 10_000; i++) { sum += i; }
> > ```

> 5.8.3 Identify and fix the errors in the following code:
>
> > ```java
> > public class Test {
> >   public void main(String[] args) { // 1. static is missing
> >     for (int i = 0; i < 10; i++) ;  // 2. at the end of for should be removed
> >       sum += i;                     // 3. variable sum is not defined
> >
> >     if (i < j) ;                    // 4. i is not defined here
> >       System.out.println(i)         // 5. i is not defined
> >     else
> >       System.out.println(j);        // 5. j is not defined
> >
> >     while (j < 10) ;                // 6. ; should be removed
> >     {
> >       j++;
> >     }
> >
> >     do {
> >       j++;
> >     } while (j < 10)                // 7. ; is missing
> >   }
> > }
> > ```

> 5.8.4 What is wrong with the following programs?
>
> > ```java
> > // (a)
> > public class ShowErrors {
> >   public static void main(String[] args) {
> >     int i = 0;
> >     do {
> >       System.out.println(i + 4);
> >       i++;
> >     }
> >     while (i < 10) // ; is missing
> >   }
> > }
> >
> > // (b)
> > public class ShowErrors {
> >   public static void main(String[] args) {
> >     for (int i = 0; i < 10; i++); // ; at the end of for
> >       System.out.println(i + 1);
> >   }
> > }
> > ```

---

<h3 align="center" id="9"><u>5.9 Nested Loops</u><a href="#home"> 👆</a></h3>

> 5.9.1 How many times is the `println` statement executed?
>
> > ```java
> > for (int i = 0; i < 10; i++) // 10 - 0 = 10 times
> >   for (int j = 0; j < i; j++) // for each i run j times i.e. 0, 1, 2, 3, ..., 9
> >     System.out.println(i * j)
> > // println will be executed 1 + 2 + 3 + ... + 9 = 9 * 10 / 2 = 45 times
> > ```

> 5.9.2 Show the output of the following programs.
>
> > ```java
> > // (a)
> > // 0 0 1 0 1 2 0 1 2 3 0 1 2 3 4
> >
> > // (b)
> > // ****
> > // ****
> > // 2 ****
> > // 3 2 ****
> > // 4 3 2 ****
> >
> > // (c)
> > // 1xxx2xxx4xxx8xxx16xxx
> > // 1xxx2xxx4xxx8xxx
> > // 1xxx2xxx4xxx
> > // 1xxx2xxx
> > // 1xxx
> >
> > // (d)
> > // 1G
> > // 1G3G
> > // 1G3G5G
> > // 1G3G5G7G
> > // 1G3G5G7G9G
> > ```

---

<h3 align="center" id="11"><u>5.11 Case Studies</u><a href="#home"> 👆</a></h3>

> 5.11.1 Will the program work if `n1` and `n2` are replaced by `n1 / 2` and `n2 / 2`  
> in line 17 in Listing 5.9?
>
> > **_No._** e.g. take `n1 = 3` and `n2 = 3` we will get `gcd(3, 3) = 1` which is wrong
> > should be `gcd(3, 3) = 3`.

> 5.11.2 In Listing 5.11, why is it wrong if you change the code  
> `(char)(hexValue + '0')` to `hexValue + '0'` in line 21?
>
> > `hexValue + '0'` will do integer addition and return integer value where `hexDigit`
> > is expecting `char` type.

> 5.11.3 In Listing 5.11, how many times the loop body is executed for a decimal number
> `245`, and how many times the loop body is executed for a decimal number `3245`?
>
> > `245 / 16 = 15 / 16 = 0` => 2 times
> > `3245 / 16 = 202 / 16 = 12 / 16 = 0` => 3 times

> 5.11.4 What is the hex number after `E`?  
> What is the hex number after `F`?
>
> > E(=14) => F(=15)
> > F(=15) => 10
> > 1F => 20

> 5.11.5 Revise line 27 in Listing 5.11 so the program displays hex number `0` if the input
> decimal is 0.
>
> > `System.out.println("The hex number is " + ((hex.length() == 0) ? "0" : hex));`

---

<h3 align="center" id="12"><u>5.12 Keywords break and continue</u><a href="#home"> 👆</a></h3>

> 5.12.1 What is the keyword `break` for?  
> What is the keyword `continue` for?  
> Will the following programs terminate?  
> If so, give the output.
>
> > `break` will immediately exit from the closest loop that it is part of
> > and transform control to the next statement right after the current loop.
> > `continue` will skip all following statements and go to evaluating the boolean
> > condition of the current loop that it is part of.
> > (a) will terminate on its second iteration when `balance` is 1 and less then 9
> > (b) infinite loop, `balance` will be 1 after first iteration and then `balance < 9`
> > is always `true` and executing `continue`

> 5.12.2 The `for` loop on the left is converted into the `while` loop on the right.  
> What is wrong? Correct it.
>
> > ```java
> > int i = 0, sum = 0;
> > while (i < 4) {
> >   if (i % 3 == 0) {
> >     i++; // increment i if divisible by 3 otherwise we get infinite loop
> >     continue;
> >   }
> >   sum += i;
> >   i++;
> > }
> > ```

> 5.12.3 Rewrite the programs `TestBreak` and `TestContinue` in Listings 5.12 and 5.13
> without using `break` and `continue`.
>
> > ```java
> > public class TestBreak {
> >   public static void main(String[] args) {
> >     int sum = 0;
> >     int number = 0;
> >     while (number < 20 && sum < 100) {
> >       number++;
> >       sum += number;
> >     }
> >
> >     System.out.println("The number is " + number);
> >     System.out.println("The sum is " + sum);
> >   }
> > }
> >
> > public class TestContinue {
> >   public static void main(String[] args) {
> >     int sum = 0;
> >     int number = 0;
> >
> >     while (number < 20) {
> >       number++;
> >       if (number != 10 && number != 11)
> >         sum += number;
> >     }
> >
> >     System.out.println("The sum is " + sum);
> >   }
> > }
> > ```

> 5.12.4 After the `break` statement in (a) is executed in the following loop,  
> which statement is executed? Show the output.
> After the `continue` statement in (b) is executed in the following loop,  
> which statement is executed? Show the output.
>
> > ```java
> > // (a)
> > for (int i = 1; i < 4; i++) {
> >   for (int j = 1; j < 4; j++) {
> >     if (i * j > 2)
> >       break;
> >     System.out.println(i * j);
> >   }
> >   System.out.println(i); // this statement will be executed when break
> > } // output(on separate lines): 1 2 1 2 2 3
> >
> > // (b)
> > for (int i = 1; i < 4; i++) {
> >   for (int j = 1; j < 4; j++) { // j++ will be executed when continue
> >     if (i * j > 2)
> >       continue;
> >     System.out.println(i * j);
> >   }
> >   System.out.println(i);
> > } // output(on separate lines): 1 2 1 2 2 3
> > ```

---

<h3 align="center" id="13"><u>5.13 Case Study: Checking Palindromes</u><a href="#home"> 👆</a></h3>

> 5.13.1 What happens to the program if `(low < high)` in line 20 is changed to  
> `(low <= high)`?
>
> > Nothing will happen. Checking for equality is redundant.
> > e.g. `"aba"` `l == r` but `b == b` which is redundant check.
> > For even length it will also work fine.
