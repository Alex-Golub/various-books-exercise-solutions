<h1 align="center" id="home"><u>CheckPoint Answers</u></h1>

[Section 12.1: Thinking Recursively](#1)  
[Section 12.2: A Better Example of Recursion](#2)  
[Section 12.3: Recursive Functions and Data](#3)  
[Section 12.4: Recursive Graphics](#4)  
[Section 12.5: Recursive Backtracking](#5)

<h3 align="center" id="1"><u>Section 12.1: Thinking Recursively</u><a href="#home">
👆</a></h3>

> 1. What is **_recursion_**?  
>    How does a recursive method differ from a standard iterative method?
>    > Recursion is a programing technique to solve problems calling the method itself with same  
>    > task but smaller till we get to a trivial case.  
>    > A recursive method differs from a regular method in that it contains one or more calls to  
>    > itself within its body.

> 2. What are `base cases` and `recursive cases`?  
>    Why does a recursive method need to have both?
>    > Base cases: are the cases when the answer to current problem is trivial.  
>    > Recursive cases: are cases when the same problem should be reduced by one or more steps.
>    > If recursive method don't contain base case one will run into infintie recursive calls,  
>    > without recursive cases one can't reduce the problem into a trivial one and solve it.
>    >
>    > A base case is a situation where a recursive method does not need to make a recursive call to  
>    > solve the problem.  
>    > A recursive case is a situation where the recursive method does call itself.  
>    > Recursive methods need both cases because the recursive case is called repeatedly until the  
>    > base case is reached, stopping the chain of recursive calls.

> 3.  > ```java
>     > public void mystery1(int n) {
>     >     if (n <= 1) {
>     >         System.out.print(n);
>     >     } else {
>     >         mystery1(n / 2);
>     >         System.out.print(", " + n);
>     >     }
>     > }
>     >
>     > mystery1(1);   // => 1
>     > mystery1(4);   // => 1, 2, 4
>     > mystery1(16);  // => 1, 2, 4, 8, 16
>     > mystery1(30);  // => 1, 3, 7, 15, 30
>     > mystery1(100); // => 1, 3, 6, 12, 25, 50, 100
>     > ```

> 4.  > ```java
>     > public void mystery2(int n) {
>     >     if (n > 100) {
>     >         System.out.print(n);
>     >     } else {
>     >         mystery2(2 * n);
>     >         System.out.print(", " + n);
>     >     }
>     > }
>     >
>     > mystery2(113); // => 113
>     > mystery2(70);  // => 140, 70
>     > mystery2(42);  // => 168, 84, 42
>     > mystery2(30);  // => 120, 60, 30
>     > mystery2(10);  // => 160, 80, 40, 20, 10
>     > ```

> 5.  > ```java
>     > public void mystery3(int n) {
>     >     if (n <= 0) {
>     >         System.out.print("*");
>     >     } else if (n % 2 == 0) {
>     >         System.out.print("(");
>     >         mystery3(n - 1);
>     >         System.out.print(")");
>     >     } else {
>     >         System.out.print("[");
>     >         mystery3(n - 1);
>     >         System.out.print("]");
>     >     }
>     > }
>     >
>     > mystery3(0); // => *
>     > mystery3(1); // => [*]
>     > mystery3(2); // => ([*])
>     > mystery3(4); // => ([([*])])
>     > mystery3(5); // => [([([*])])]
>     > ```

> 6.  > ```java
>     > public void mysteryXY(int x, int y) {
>     >     if (y == 1) {
>     >         System.out.print(x);
>     >     } else {
>     >         System.out.print(x * y + ", ");
>     >         mysteryXY(x, y - 1);
>     >         System.out.print(", " + x * y);
>     >     }
>     > }
>     >
>     > mysteryXY(4, 1); // => 4
>     > mysteryXY(4, 2); // => 8, 4, 8
>     > mysteryXY(8, 2); // => 16, 8, 16
>     > mysteryXY(4, 3); // => 12, 8, 4, 8, 12
>     > mysteryXY(3, 4); // => 12, 9, 6, 3, 6, 9, 12
>     > ```

> 7. Convert the following iterative method into a recursive method:
>    > ```java
>    > // Prints each character of the string reversed twice.
>    > // doubleReverse("hello") prints oolllleehh
>    > public static void doubleReverse(String s) {
>    >   for (int i = s.length() – 1; i >= 0; i--) {
>    >     System.out.print(s.charAt(i));
>    >     System.out.print(s.charAt(i));
>    >   }
>    > }
>    >
>    > public static void doubleReverse(String s) {
>    >   if (s.length() == 0) { // base
>    >     return;
>    >   }
>    >
>    >   int lastIdx = s.length() - 1;
>    >   System.out.print(s.charAt(lastIdx));
>    >   System.out.print(s.charAt(lastIdx));
>    >   doubleReverse(s.substring(0, lastIdx)); // step
>    > }
>    > ```

---

<h3 align="center" id="2"><u>Section 12.2: A Better Example of
Recursion</u><a href="#home"> 👆</a></h3>

> 8. What is a **_call stack_**, and how does it relate to recursion?
>    > Call stack is a kind of data-structure that allow tracing method calls in our program.  
>    > For each method call a new entry is pushed into the stack.  
>    > When recursive technique is utilized each new method call is pushed into the stack and once  
>    > method has completely executed call stack is "popping" this method call from the stack  
>    > and return control to the calling method.

> 9. What would be the effect if the code for the `reverse` method were changed to the following?
>
> ```java
> public static void reverse(Scanner input) {
>   if (input.hasNextLine()) {
>     // recursive case (nonempty file)
>     String line = input.nextLine();
>     System.out.println(line); // swapped order
>     reverse(input); // swapped order
>   }
> }
> ```
>
> > Words will be printed in the order they appeared in the input file.

> 10. What would be the effect if the code for the `reverse` method were changed to the following?
>
> ```java
> public static void reverse(Scanner input) {
>   if (input.hasNextLine()) {
>     // recursive case (nonempty file)
>     reverse(input); // moved this line
>     String line = input.nextLine();
>     System.out.println(line);
>   }
> }
> ```
>
> > Recursive step is absent thus no progress toward a base case.  
> > This is an e.g. for **_infinite recursive_** calls which will cause the call stack to  
> > overflow and eventually throw an error.

---

<h3 align="center" id="3"><u>Section 12.3: Recursive Functions and
Data</u><a href="#home"> 👆</a></h3>

> 11. The following method is an attempt to write a recursive `pow` method to compute exponents.  
>     What is wrong with the code? How can it be fixed?
>
> ```java
> public static int pow(int x, int y) {
>   return x * pow(x, y - 1);
> }
> ```
>
> > There is **no base case** to stop the calls to `pow` method causing infinite recursive calls  
> > and then a `StackOverFlow` error.  
> > This can be fixed by adding a base case `if (y == 0) return 1;` before the `return`.

> 12. What are the differences between the two versions of the `pow` method shown in Section 12.3?  
>     What advantage does the second version have over the first version?  
>     Are both versions recursive? > 1st version is less efficient. It will take `y` recursive calls till we hit the base case.
>     > 2nd version cut the time in half because of the division be two.
>     > Both versions are recursive.

> 13. > ```java
>     > public int mystery4(int x, int y) {
>     >     if (x < y) {
>     >         return x;
>     >     } else {
>     >         return mystery4(x - y, y);
>     >     }
>     > }
>     >
>     > // m(6, 13) -> 6
>     >
>     > // m(14, 10) -> m(4, 10)
>     > //   m(4, 10) -> 4
>     > // m(14, 10) -> 4
>     >
>     > // m(37, 10) -> m(27, 10)
>     > //   m(27, 10) -> m(17, 10)
>     > //     m(17, 10) -> m(7, 10)
>     > //       m(7, 10) -> 7
>     > //     m(17, 10) -> 7
>     > //   m(27, 10) -> 7
>     > // m(37, 10) -> 7
>     >
>     > // m(8, 2) -> m(6, 2)
>     > //   m(6, 2) -> m(4, 2)
>     > //     m(4, 2) -> m(2, 2)
>     > //       m(2, 2) -> m(0, 2)
>     > //         m(0, 2) -> 0
>     > //       m(2, 2) -> 0
>     > //     m(4, 2) -> 0
>     > //   m(6, 2) -> 0
>     > // m(8, 2) -> 0
>     >
>     > // m(50, 7) -> m(43, 7)
>     > //   m(43, 7) -> m(36, 7)
>     > //     m(36, 7) -> m(28, 7)
>     > //       m(29, 7) -> m(22, 7)
>     > //         m(22, 7) -> m(15, 7)
>     > //           m(15, 7) -> m(8, 7)
>     > //             m(8, 7) -> m(1, 7)
>     > //               m(1, 7) -> 1
>     > //           m(8, 7) -> 1
>     > //         m(22, 7) -> 1
>     > //       m(29, 7) -> 1
>     > //     m(36, 7) -> 1
>     > //   m(43, 7) -> 1
>     > // m(50, 7) -> 1
>     > ```

> 14. > ```java
>     > public int mystery5(int x, int y) {
>     >     if (x < 0) {
>     >         return -mystery5(-x, y);
>     >     } else if (y < 0) {
>     >         return -mystery5(x, -y);
>     >     } else if (x == 0 && y == 0) {
>     >         return 0;
>     >     } else {
>     >         return 100 * mystery5(x / 10, y / 10) + 10 * (x % 10) + y % 10;
>     >     }
>     > }
>     >
>     > // m(5, 7) -> 100 * m(0, 0) + 10 * 5 + 7
>     > //   m(0, 0) -> 0
>     > // m(5, 7) -> 100 * 0 + 10 * 5 + 7 = 57
>     >
>     > // m(12, 9) -> 100 * m(1, 0) + 10 * 2 + 9
>     > //   m(1, 0) -> 100 * m(0, 0) + 10 * 1 + 0
>     > //     m(0, 0) -> 0
>     > //   m(1, 0) -> 100 * 0 + 10 * 1 + 0 = 10
>     > // m(12, 9) -> 100 * 10 + 10 * 2 + 9 = 1029
>     >
>     > // m(-7, 4) -> -m(7, 4)
>     > //   m(7, 4) -> 100 * m(0, 0) + 10 * 7 + 4
>     > //     m(0, 0) -> 0
>     > //   m(7, 4) -> 100 * 0 + 10 * 7 + 4 = 74
>     > // m(-7, 4) -> -74
>     >
>     > // m(-23, -48) -> -m(23, -48)
>     > //   m(23, -48) -> -m(23, 48)
>     > //     m(23, 48) -> 100 * m(2, 4) + 10 * 3 + 8
>     > //       m(2, 4) -> 100 * m(0, 0) + 10 * 2 + 4
>     > //         m(0, 0) -> 0
>     > //       m(2, 4) -> 100 * 0 + 10 * 2 + 4 = 24
>     > //     m(23, 48) -> 100 * 24 + 10 * 3 + 8 = 2438
>     > //   m(23, -48) -> -2438
>     > // m(-23, -48) -> -(-2438) = 2438
>     >
>     > // m(128, 343) -> 100 * m(12, 34) + 10 * 8 + 3
>     > //   m(12, 34) -> 100 * m(1, 3) + 10 * 2 + 4
>     > //     m(1, 3) -> 100 * m(0, 0) + 10 * 1 + 3
>     > //       m(0, 0) -> 0
>     > //     m(1, 3) -> 100 * 0 + 10 * 1 + 3 = 13
>     > //   m(12, 34) -> 100 * 13 + 10 * 2 + 4 = 1324
>     > // m(128, 343) -> 100 * 1324 + 10 * 8 + 3 = 132483
>     > ```

> 15. > ```java
>     > public static int mystery6(int n, int k) {
>     >     if (k == 0 || k == n) {
>     >         return 1;
>     >     } else if (k > n) {
>     >         return 0;
>     >     } else {
>     >         return mystery6(n - 1, k - 1) + mystery6(n - 1, k);
>     >     }
>     > }
>     >
>     > // m(7, 1) -> m(6, 0) + m(6, 1)
>     > //   m(6, 0) -> 1
>     > //   m(6, 1) -> m(5, 0) + m(5, 1)
>     > //     m(5, 0) -> 1
>     > //     m(5, 1) -> m(4, 0) + m(4, 1)
>     > //       m(4, 0) -> 1
>     > //       m(4, 1) -> m(3, 0) + m(3, 1)
>     > //         m(3, 0) -> 1
>     > //         m(3, 1) -> m(2, 0) + m(2, 1)
>     > //           m(2, 0) -> 1
>     > //           m(2, 1) -> m(1, 0) + m(1, 1)
>     > //             m(1, 0) -> 1
>     > //             m(1, 1) -> 1
>     > //           m(2, 1) -> 1 + 1 = 2
>     > //         m(3, 1) -> 1 + 2 = 3
>     > //       m(4, 1) -> 1 + 3 = 4
>     > //     m(5, 1) -> 1 + 4 = 5
>     > //   m(6, 1) -> 1 + 5 = 6
>     > // m(7, 1) -> 1 + 6 = 7
>     >
>     > // m(4, 2) -> m(3, 1) + m(3, 2)
>     > //   m(3, 1) -> m(2, 0) + m(2, 1)
>     > //     m(2, 0) -> 1
>     > //     m(2, 1) -> m(1, 0) + m(1, 1)
>     > //       m(1, 0) -> 1
>     > //       m(1, 1) -> 1
>     > //     m(2, 1) -> 1 + 1 = 2
>     > //   m(3, 1) -> 1 + 2 = 3
>     > //   m(3, 2) -> m(2, 1) + m(2, 2)
>     > //     m(2, 1) -> m(1, 0) + m(1, 1)
>     > //       m(1, 0) -> 1
>     > //       m(1, 1) -> 1
>     > //     m(2, 1) -> 1 + 1 = 2
>     > //     m(2, 2) -> 1
>     > //   m(3, 2) -> 2 + 1 = 3
>     > // m(4, 2) -> 3 + 3 = 6
>     >
>     > // m(4, 3) -> m(3, 2) + m(3, 3)
>     > //   m(3, 2) -> m(2, 1) + m(2, 2)
>     > //     m(2, 1) -> m(1, 0) + m(1, 1)
>     > //       m(1, 0) -> 1
>     > //       m(1, 1) -> 1
>     > //     m(2, 1) -> 1 + 1 = 2
>     > //     m(2, 2) -> 1
>     > //   m(3, 2) -> 2 + 1 = 3
>     > //   m(3, 3) -> 1
>     > // m(4, 3) -> 3 + 1 = 4
>     >
>     > // m(5, 3) -> m(4, 2) + m(4, 3)
>     > //   m(4, 2) -> m(3, 1) + m(3, 2)
>     > //     m(3, 1) -> m(2, 0) + m(2, 1)
>     > //       m(2, 0) -> 1
>     > //       m(2, 1) -> m(1, 0) + m(1, 1)
>     > //         m(1, 0) -> 1
>     > //         m(1, 1) -> 1
>     > //       m(2, 1) -> 1 + 1 = 2
>     > //     m(3, 1) -> 1 + 2 = 3
>     > //     m(3, 2) -> m(2, 1) + m(2, 2)
>     > //       m(2, 1) -> m(1, 0) + m(1, 1)
>     > //         m(1, 0) -> 1
>     > //         m(1, 1) -> 1
>     > //       m(2, 1) -> 1 + 1 = 2
>     > //       m(2, 2) -> 1
>     > //     m(3, 2) -> 2 + 1 = 3
>     > //   m(4, 2) -> 3 + 3 = 6
>     > //   m(4, 3) -> m(3, 2) + m(3, 3)
>     > //     m(3, 2) -> m(2, 1) + m(2, 2)
>     > //       m(2, 1) -> m(1, 0) + m(1, 1)
>     > //         m(1, 0) -> 1
>     > //         m(1, 1) -> 1
>     > //       m(2, 1) -> 1 + 1 = 2
>     > //       m(2, 2) -> 1
>     > //     m(3, 2) -> 2 + 1 = 3
>     > //     m(3, 3) -> 1
>     > //   m(4, 3) -> 3 + 1 = 4
>     > // m(5, 3) -> 6 + 4 = 10
>     >
>     > // m(5, 4) -> m(4, 3) + m(4, 4)
>     > //   m(4, 3) -> m(3, 2) + m(3, 3)
>     > //     m(3, 2) -> m(2, 1) + m(2, 2)
>     > //       m(2, 1) -> m(1, 0) + m(1, 1)
>     > //         m(1, 0) -> 1
>     > //         m(1, 1) -> 1
>     > //       m(2, 1) -> 1 + 1 = 2
>     > //       m(2, 2) -> 1
>     > //     m(3, 2) -> 2 + 1 = 3
>     > //     m(3, 3) -> 1
>     > //   m(4, 3) -> 3 + 1 = 4
>     > //   m(4, 4) -> 1
>     > // m(5, 4) 4 + 1 = 5
>     > ```

> 16. Convert the following iterative method into a recursive method:
>     > ```java
>     > // Returns n!, such as 5! = 1*2*3*4*5
>     > public static int factorial(int n) {
>     >   int product = 1;
>     >   for (int i = 1; i <= n; i++) {
>     >     product *= i;
>     >   }
>     >   return product;
>     > }
>     >
>     > public static int factorialRecursive(int n) {
>     >   if (n <= 1) { // 0! = 1! = 1
>     >     return 1;
>     >   }
>     >   return n * factorialRecursive(n - 1);
>     > }
>     > ```

> 17. The following method has a bug that leads to infinite recursion.  
>     What correction fixes the code?
>     > ```java
>     > // Adds the digits of the given number.
>     > // Example: digitSum(3456) returns 3+4+5+6 = 18
>     > public static int digitSum(int n) {
>     >   if (n < 10) { // base case (small number)
>     >     return n;
>     >   } else { // recursive case (large number)
>     >     return n % 10 + digitSum(n / 10);
>     >   }
>     > }
>     > ```

> 18. Sometimes the parameters that a client would like to pass to a method don’t match the
>     parameters that are best for writing a recursive solution to the problem.  
>     What should a programmer do to resolve this issue?
>     > Provide a method that the client want and then write a private helper method that fit  
>     > for the recursive solution.

> 19. Write a new version of this method that is still recursive and has the same header but  
>     is more efficient.  
>     Do this by creating a helper method that accepts additional parameters, such as  
>     previous Fibonacci numbers, that you can carry through and modify during each recursive call.
>     > ```java
>     > public static void main(String[] args) {
>     >   System.out.println(fibonacci(10L));
>     > }
>     >
>     > public static long fibonacci(long n) {
>     >   if (n <= 2) return 1;
>     >   return fibonacci(n, 3, 1, 1);
>     > }
>     >
>     > private static long fibonacci(long n, long i, long f0, long f1) {
>     >   if (n == i) {
>     >     return f1 + f0;
>     >   }
>     >
>     >   return fibonacci(n, i + 1, f1, f0 + f1);
>     > }
>     >
>     > /*
>     > f(10) -> f(10, 3, 1, 1)
>     >   f(10, 3, 1, 1) -> f(10, 4, 1, 2)
>     >     f(10, 4, 1, 2) -> f(10, 5, 2, 3)
>     >       f(10, 5, 2, 3) -> f(10, 6, 3, 5)
>     >         f(10, 6, 3, 5) -> f(10, 7, 5, 8)
>     >           f(10, 7, 5, 8) -> f(10, 8, 8, 13)
>     >             f(10, 8, 8, 13) -> f(10, 9, 13, 21)
>     >               f(10, 9, 13, 21) -> f(10, 10, 21, 34)
>     >                 f(10, 10, 21, 34) -> 55
>     > */
>     > ```

---

<h3 align="center" id="4"><u>Section 12.4: Recursive Graphics</u><a href="#home"> 👆</a></h3>

> 20. What is a fractal image?  
>     How does recursive programming help to draw fractals? > Fractal image is an image contains a fractal object which is an object that is built n times
>     > using itself.  
>     > Recursive methods are useful when drawing fractal images because they can elegantly express  
>     > the recursive nature of the images.

> 21. Write Java code to create and draw a regular hexagon (a type of polygon).
>     > ```java
>     > public static void drawHexagon(Graphics g, Point position, int size) {
>     >   Polygon poly = new Polygon();
>     >   poly.addPoint(position.x, position.y + size / 2);
>     >   poly.addPoint(position.x + size / 3, position.y);
>     >   poly.addPoint(position.x + 2 * size / 3, position.y);
>     >   poly.addPoint(position.x + size, position.y + size / 2);
>     >   poly.addPoint(position.x + 2 * size / 3, position.y + size);
>     >   poly.addPoint(position.x + size / 3, position.y + size);
>     >   g.drawPolygon(poly);
>     > }
>     > ```

---

<h3 align="center" id="5"><u>Section 12.5: Recursive Backtracking</u><a href="#home"> 👆</a></h3>

> 22. Why is recursion an effective way to implement a backtracking algorithm?
>     > Because the memory of decisions and points to go back to are represented by the  
>     > recursive call stack.  
>     > The pattern of `"choose, explore, un-choose"` is elegantly represented by recursive  
>     > calls for each individual choice.

> 23. What is a **_decision tree_**?  
>      How are decision trees important for backtracking?
>     > Description of the **set of choices** that can be made by a recursive backtracking method  
>     > at any point in the algorithm.

> 24. Draw the decision tree that would have resulted for Figure 12.9 if the backtracking  
>      solution had explored NE first instead of last in the recursive explore method.
>     > ```java
>     > start (0, 0)
>     > |
>     > ⊢--- NE (1, 1)
>     > |    |
>     > |    ⊢--- NE NE (2, 2)
>     > |    |
>     > |    ⊢--- NE N (1, 2) - output
>     > |    |
>     > |    ⊢--- NE E (2, 1)
>     > |
>     > ⊢--- N (0, 1)
>     > |    |
>     > |    ⊢--- N NE (1, 2) - output
>     > |    |
>     > |    ⊢--- N N (0, 2)
>     > |    |    |
>     > |    |    ⊢--- N N NE (1, 3)
>     > |    |    |
>     > |    |    ⊢--- N N N (0, 3)
>     > |    |    |
>     > |    |    ⊢--- N N E (1, 2) - output
>     > |    |
>     > |    ⊢--- N E (1, 1)
>     > |         |
>     > |         ⊢--- N E NE (2, 2)
>     > |         |
>     > |         ⊢--- N E N (1, 2) - output
>     > |         |
>     > |         ⊢--- N E E (2, 1)
>     > |
>     > ⊢--- E (1, 0)
>     >      |
>     >      ⊢--- E NE (2, 1)
>     >      |
>     >      ⊢--- E N (1, 1)
>     >      |    |
>     >      |    ⊢--- E N NE (2, 2)
>     >      |    |
>     >      |    ⊢--- E N N (1, 2) - output
>     >      |    |
>     >      |    ⊢--- E N E (2, 1)
>     >      |
>     >      ⊢--- E E (2, 0)
>     > ```

> 25. The original North/East backtracking solution printed the following ways of traveling to  
>      (1, 2) in this order.  
>      In what order would they be printed if the solution had **explored NE first** instead of last?
>     > ```java
>     > moves: NE N (1, 2)
>     > moves: N NE (1, 2)
>     > moves: N N E (1, 2)
>     > moves: N E N (1, 2)
>     > moves: E N N (1, 2)
>     > ```
