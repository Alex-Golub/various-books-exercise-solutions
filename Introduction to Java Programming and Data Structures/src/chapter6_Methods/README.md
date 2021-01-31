<h1 align="center" id="home"><u>CheckPoint Answers</u></h1>

[6.4 void vs. Value-Returning Methods](#4)  
[6.5 Passing Parameters by Values](#5)  
[6.6 Modularizing Code](#6)  
[6.7 Case Study: Converting Hexadecimals to Decimals](#7)  
[6.8 Overloading Methods](#8)  
[6.9 The Scope of Variables](#9)

---

<h3 align="center" id="4"><u>6.4 void vs. Value-Returning Methods</u><a href="#home"> 👆</a></h3>

> 6.4.1 What are the benefits of using a method?
>
> > 1. **Reuse code** - e.g. calculating sum from i to j can be done in one single method
> >    rather then write it all over again every time.
> > 2. **Reduce complexity** - separating code into methods that do work
> >    can make the code more readable and easier to debug.
> > 3. **Easily maintained**

> 6.4.2 How do you define a method?  
> How do you invoke a method?
>
> > Method can be defined `<accessModifier> <modifier> <returnType> <methodName>(<listOfParameters>)`
> > To invoke a method write the `<methodName>` and pass the arguments this method requests.
> > e.g. `sum(10, 10_000);`

> 6.4.3 How do you simplify the `max` method in _Listing 6.1_ using the conditional operator?
>
> > ```java
> > public static int max(int num1, int num2) {
> >   return num1 > num2 ? num1 : num2;
> > }
> > ```

> 6.4.4 True or false? A call to a method with a `void` return type is always a statement
> itself, but a call to a value-returning method cannot be a statement by itself.
>
> > **True**. Calling to `void` return type method should **always** be a statement otherwise
> > we get compilation-error.  
> > **False**. Calling value-returning method can be **either** a statement or deceleration:
> > If statement then return value from method is **ignored**
> > If deceleration then return value is **saved** into a variable for further processing.

> 6.4.5 What is the return type of a `main` method?
>
> > main method deceleration is: `public static void main(String[] args) {//...}`  
> > `void` is the return type of `main` method

> 6.4.6 What would be wrong with not writing a `return` statement in a value-returning method?  
> Can you have a `return` statement in a `void` method?  
> Does the `return` statement in the following method cause syntax errors?
>
> ```java
> public static void xMethod(double x, double y) {
>   System.out.println(x + y);
>   return x + y; // compilation-error. xMethod is void thus returning value is not allowed
> }
> ```
>
> > Method that has return type that is not `void` should always have `return` statement
> > otherwise we get compilation-error.
> > `return` statement can be used within a method that has `void` `return` type e.g.
> > if we want to exit the method soon.

> 6.4.7 Define the terms **_parameter_**, **_argument_**, and **_method signature_**.
>
> > **Parameter** - value that the method caller is passing to the method
> > **Argument** - value that method is accepting from the caller
> > **Method Signature** - name of the method and the type of its parameters, e.g.
> > `sum(int, int)`, method name is `sum` and it accepts two `int` type values.

> 6.4.8 Write **method headers** (not the bodies) for the following methods:
>
> > ```java
> > public static double getCommission(double salesAmount, double commissionRate) { /*...*/ }
> > public static void displayCalendar(int month, int year) { /*...*/ }
> > public static double sqrt(int number) { /*...*/ }
> > public static boolean isEven(int num) { /*...*/ }
> > public static void displayMessage(int times) { /*...*/ }
> > public static double monthlyPayment(double loanAmount, int years, double annualInterestRate) { /*...*/ }
> > public static char getUpperCase(char lowerCaseLetter) { /*...*/ }
> > ```

> 6.4.9 Identify and correct the errors in the following program:
>
> > ```java
> > public static /* return type missing */ method1(int n, /* type missing */ m) {
> >   n += m;
> >   method2(/* 3.4 wrong type (expected int passed double*/);
> > }
> >
> > public static int method2(int n) {
> >   if (n > 0) return 1;
> >   else if (n == 0) return 0;
> >   else /* if (n < 0) otherwise method2 is not returning value causing compilation error */ return -1;
> > }
> > ```

> 6.4.10 Reformat the following program
>
> > ```java
> > public class Test {
> >   public static double method(double i, double j) {
> >     while (i < j) {
> >       j--;
> >     }
> >     return j;
> >   }
> > }
> > ```

---

<h3 align="center" id="5"><u>6.5 Passing Parameters by Values</u><a href="#home"> 👆</a></h3>

> 6.5.1 How is an argument passed to a method?  
> Can the argument have the same name as its parameter?
>
> > In _Java_ arguments passed to method **by value** i.e. new memory is allocated to
> > the parameters of the variables of the method and values from caller are copied into
> > that memory locations. So if changes are made within a method they are only local to
> > that method parameters and don't effect callers argument.
> > **Yes**. It doesn't matter what is the name of the local parameter in the method.
> > It will have its own memory.

> 6.5.2 Identify and correct the errors in the following program:
>
> > ```java
> > public class Test {
> >   public static void main(String[] args) {
> >     nPrintln(/* 5 */ "Welcome to Java!", /* "Welcome to Java!" */ 5); // wrong order of argument passed to bPrintln
> >   }
> >
> >   public static void nPrintln(String message, int n) {
> >     /* int n = 1; */ // compilation-error, n is already defined method scope
> >     for (int i = 0; i < n; i++)
> >       System.out.println(message);
> >   }
> > }
> > ```

> 6.5.3 What is **_pass-by-value_**?  
> Show the result of the following programs.
>
> > pass-by-value - Caller argument values are copied into the method parameters
> >
> > ```java
> > // (a)
> > // 0, max in caller is not changed when returning from method
> >
> > // (b) - program is printing all powers of two up to including 6
> > // 2
> > // 2 4
> > // 2 4 8
> > // 2 4 8 16
> > // 2 4 8 16 32
> > // 2 4 8 16 32 64
> >
> > // (c)
> > // Before the call variable times is 3
> > // n = 3\nWelcome to Java!
> > // n = 2\nWelcome to Java!
> > // n = 1\nWelcome to Java!
> > // After the call variable times is 3
> >
> > // (d)
> > // 1
> > // 2 1
> > // 2 1
> > // 4 2 1
> > // i is 5
> > ```

> 6.5.4 For (a) in the preceding question, show the contents of the activation records in the
> call stack just before the method `max` is invoked, just as `max` is entered, just before
> `max` is returned, and right after `max` is returned.
>
> > `main(): max = 0, max(1, 2, max) ↑`  
> > `max(): value1 = 1, value2 = 2, max = 0 => max = 2 ↓`  
> > `main(): max = 0, max(1, 2, max), print(max) == 0 ↓`  
> > `Stack empty`

---

<h3 align="center" id="6"><u>6.6 Modularizing Code</u><a href="#home"> 👆</a></h3>

> 6.6.1 Trace the `gcd` method to find the return value for `gcd(4, 6)`.
>
> > | n1  | n2  |  gcd  |   k   |
> > | :-: | :-: | :---: | :---: |
> > |  4  |  6  |   1   |   2   |
> > |     |     | **2** |   2   |
> > |     |     |   2   | **3** |

> 6.6.2 Trace the `isPrime` method to find the return value for `isPrime(25)`.
>
> > | number | divisor | number / 2 |
> > | :----: | :-----: | :--------: |
> > |   25   |    2    |     12     |
> > |        |  **3**  |            |
> > |        |  **4**  |            |
> > |        |  **5**  |            |
> >
> > `isPrime` returns `false`

---

<h3 align="center" id="7"><u>6.7 Case Study: Converting Hexadecimals to Decimals</u><a href="#home"> 👆</a></h3>

> 6.7.1 What is `hexCharToDecimal('B'))`?
> What is `hexCharToDecimal('7'))`?
> What is `hexToDecimal("A9"))`?
>
> > `hexCharToDecimal('B')) => 10 + 'B' - 'A' => 11`  
> > `hexCharToDecimal('7')) => '7' - '0' => 7`  
> > `hexToDecimal("A9")) => 10 * 16 + 9 * 1 => 169`

---

<h3 align="center" id="8"><u>6.8 Overloading Methods</u><a href="#home"> 👆</a></h3>

> 6.8.1 What is **_method overloading_**?
> Is it permissible to define two methods that have the same name but different parameter types?  
> Is it permissible to define two methods in a class that have identical method names and parameter lists,  
> but different return value types or different modifiers?
>
> > Method is called overloaded when there is one or more methods with the same name
> > but with different type of parameters or different order of parameters.
> > **Yes**. There can be two methods with same name but different parameters type.
> > **No**. Two methods with same signature (i.e. name and parameter types) will cause
> > compilation-error.
> > **Changing method modifiers or return type is not method overloading**.

> 6.8.2 What is wrong in the following program?
>
> > ```java
> > public class Test {
> >   public static void method(int x) {}
> >   public static int method(int y) {}
> >   // both methods have the same signature i.e. name and list of parameters
> >   // leading to method ambiguity which causes compilation-error
> > }
> > ```

> 6.8.3 Given two method definitions, tell which of the two methods is invoked for:
>
> > ```java
> > double z = m(4, 5);     // (b)
> > double z = m(4, 5.4);   // (b)
> > double z = m(4.5, 5.4); // (a)
> >
> > public static double m(double x, double y) // (a)
> > public static double m(int x, double y)    // (b)
> > ```

---

<h3 align="center" id="9"><u>6.9 The Scope of Variables</u><a href="#home"> 👆</a></h3>

> 6.9.1 What is a **_local variable_**?
>
> > Variable that is defined within a method (i.e. local to that method scope).

> 6.9.2 What is the scope of a local variable?
>
> > Scope of local variable starts from the places it was defined till the next closing
> > braces `}` i.e. the scope it was declared in.
