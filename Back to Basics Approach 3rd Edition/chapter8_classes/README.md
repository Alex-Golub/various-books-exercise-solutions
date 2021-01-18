<h3 align="center" id="home"><u>Self-Check Answers</u></h3>

[Section 8.1: Object-Oriented Programming](#1)  
[Section 8.2: Object State and Behavior](#2)  
[Section 8.3: Object Initialization: Constructors](#3)  
[Section 8.4: Encapsulation](#4)  
[Section 8.5: Case Study: Designing a Stock Class](#5)

<h3 align="center" id="1"><u>Section 8.1: Object-Oriented Programming</u><a href="#home"> 👆</a></h3>

> 1. Describe the difference between **_`object-oriented`_** programming and **_`procedural`_** programming.
>    > Procedural programming treats a program as a sequence of actions or commands,  
>    > while object-oriented programming looks at a program as a group of interacting  
>    > entities named objects with related data and behavior.

> 2. What is an **_`object`_**?  
>     How is an object different from a `class`?
>    > An `object` is an entity that encapsulates related data and behavior,  
>    > while a `class` is the blueprint for a type of objects.

> 3. What is the state of a `String` object?  
>     What is its behavior?
>    > The state is its sequence of characters, and the behavior is its methods, such as  
>    > `length` and `indexOf`.

> 4. What is the output of the following program?
>    > `line 1 => 14 14`  
>    > `line 2 => 7 9 14 2`  
>    > `line 3 => 18 18`  
>    > `line 4 => 7 9 14 18`

> 5. Imagine that you are creating a class called `Calculator`.  
>     What state might a `Calculator` object have?  
>     What might its behavior be?
>    > The `state` might include the number that has just been computed and a memory feature.  
>    > The `behavior` might include methods to add, subtract, multiply, divide, and perhaps  
>    > advanced math operations such as exponentiation, logarithms, and trigonometric functions.

---

<h3 align="center" id="2"><u>Section 8.2: Object State and Behavior</u><a href="#home"> 👆</a></h3>

> 6. Explain the differences between a **_`field`_** and a **_`parameter`_**.  
>     What is the difference in their syntax?  
>     What is the difference in their scope and the ways in which they may be used?
>    > - Field syntax differs because they can be declared with the 'private' keyword.
>    > - A field's scope is throughout the class, while a parameter's scope is limited to the method.
>    > - A field is a variable that exists inside of an object, while a parameter is a variable inside a method whose value is passed in from outside.

> 7. Create a class called `Name` that represents a person’s name.  
>     The class should have fields representing the person’s `first name`, `last name`, and  
>     `middle initial`.
>    > ```java
>    > public class Name {
>    >   String firstName;
>    >   String lastName;
>    >   char middleInitial;
>    > }
>    > ```

> 8. What is the difference between an **_`accessor`_** and a **_`mutator`_**?  
>     What naming conventions are used with accessors and mutators?
>    > An `accessor` provides the client access to data in the object,  
>    > while a `mutator` lets the client change the object's state.

> 9. Suppose we have written a class called `BankAccount` with a method inside it, defined as:
>    `public double computeInterest(int rate)`
>    If the client code has declared a `BankAccount` variable named `acct`,  
>     which of the following would be a valid call to the above method?
>    > ```java
>    > double result = computeInterest(acct, 42);    // ✖, computeInterest is instance method
>    > acct.computeInterest(42.0, 15);               // ✖ expected 1 argument of type int here 2
>    > int result = BankAccount.computeInterest(42); // ✖ computeInterest is an instance method not static
>    > double result = acct.computeInterest(42);     // ✔ invoking computeInterest of BankAccount object
>    > new BankAccount(42).computeInterest();        // ✖ BankCount object may not have a constructor that receives value,
>    >                                               // more over passed 0 args expected 1
>    > ```

> 10. Add a new method to the `Point` class we developed in this chapter:
>     `public double distance(Point other)`
>     Returns the distance between the current `Point` object and the given other Point object.
>     > ```java
>     > public class Point {
>     >   int x;
>     >   int y;
>     >
>     >   public double distance(Point other) {
>     >     if (other == null || other.getClass() != this.getClass())
>     >       throw new IllegalArgumentException("argument is not a Ex8_1_quadrantPoint instance");
>     >
>     >     return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
>     >   }
>     > }
>     > ```

> 11. (You must complete Self-Check Problem 7 before answering this question.)
>     Add two new methods to the `Name` class:  
>     `public String getNormalOrder()`  
>     `public String getReverseOrder()`
>     > ```java
>     > public class Name {
>     >   String firstName;
>     >   String lastName;
>     >   char middleInitial;
>     >
>     >   public String getNormalOrder() {
>     >     return String.format("%s %c. %s", firstName, middleInitial, lastName);
>     >   }
>     >
>     >   public String getReverseOrder() {
>     >     return String.format("%s, %s %c.", lastName, firstName, middleInitial);
>     >   }
>     > }
>     > ```

> 12. How do you write a class whose objects can easily be printed on the console?
>     > Define a **_`toString`_** method in the class.

> 13. The following println statement (the entire line) is equivalent to what?
>     > ```java
>     > Point p1 = new Point();
>     > // ...
>     > System.out.println(p1);
>     >
>     > System.out.println(toString(p1));     // ✖ toString is not static method of this class
>     > p1.toString();                        // ✖ toString returning a String object which is ignored
>     > System.out.println(p1.toString());    // ✔ println expects String which is what passed here
>     > System.out.println(p1.string());      // ✖ no such method as string in Ex8_1_quadrantPoint class
>     > System.out.println(Point.toString()); // ✖ toString is not static method of Ex8_1_quadrantPoint class
>     > ```

> 14. The `Point` class in the `java.awt` package has a `toString` method that returns a  
>      `String` in the following format: `java.awt.Point[x=7,y=2]`  
>      Write a modified version of the `toString` method on our `Point` class that returns  
>      a result in this format.
>     > ```java
>     > public class Point {
>     >   int x;
>     >   int y;
>     >
>     >   public double distance(Point other) {
>     >     if (other == null || other.getClass() != this.getClass())
>     >       throw new IllegalArgumentException("argument is not a Ex8_1_quadrantPoint instance");
>     >
>     >     return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
>     >   }
>     >
>     >   public String toString() {
>     >     return String.format("java.awt.%s[x=%d,y=%d]", getClass().getSimpleName(), x, y);
>     >   }
>     > }
>     > ```

> 15. Write a `toString` method for the `Name` class that returns a `String` such as `"John Q. Public"`.
>     > ```java
>     > public class Name {
>     >   String firstName;
>     >   String lastName;
>     >   char middleInitial;
>     >
>     >   public String getNormalOrder() {
>     >     return String.format("%s %c. %s", firstName, middleInitial, lastName);
>     >   }
>     >
>     >   public String getReverseOrder() {
>     >     return String.format("%s, %s %c.", lastName, firstName, middleInitial);
>     >   }
>     >
>     >   public String toString() {
>     >     return firstName + " " + middleInitial + ". " + lastName;
>     >   }
>     > }
>     > ```

> 16. Finish the following client code so that it constructs two `Point` objects,  
>      translates each, and then prints their coordinates.
>     > ```java
>     > public class PointClient {
>     >   public static void main(String[] args) {
>     >
>     >     // construct two Ex8_1_quadrantPoint objects, one at (8, 2) and one at (4, 3)
>     >     Point p1 = new Point(8, 2);
>     >     Point p2 = new Point(4, 3);
>     >
>     >     // display the two Ex8_1_quadrantPoint objects' state
>     >     System.out.println("p1 is " + p1);
>     >     System.out.println("p2 is " + p2);
>     >
>     >     // display p1 distance from origin
>     >     System.out.println("p1's distance from origin is " + p1.distanceFromOrigin());
>     >
>     >     // translate p1 to (9, 4)
>     >     p1.translate(1, 2);
>     >
>     >     // translate p2 to (3, 13)
>     >     p2.translate(-1, 10);
>     >
>     >     // display the two Ex8_1_quadrantPoint objects' state again
>     >     System.out.println("p1 is now " + p1);
>     >     System.out.println("p2 is now " + p2);
>     >   }
>     > }
>     >
>     > // A Ex8_1_quadrantPoint object represents a pair of (x, y) coordinates.
>     > // (Ex8_1_quadrantPoint class must be submitted with your solution; do not modify!)
>     > public class Point {
>     >   public int x;
>     >   public int y;
>     >
>     >   public Point() { setLocation(0, 0); }
>     >   public Point(int x, int y) { setLocation(x, y); }
>     >   public double distanceFromOrigin() { return distance(new Point()); }
>     >   public double distance(Point p) {
>     >     int dx = x - p.x;
>     >     int dy = y - p.y;
>     >     return Math.sqrt(dx * dx + dy * dy);
>     >   }
>     >   public final int getX() { return x; }
>     >   public final int getY() { return y; }
>     >   public void setLocation(int x, int y) {
>     >     this.x = x;
>     >     this.y = y;
>     >   }
>     >   public void setX(int x) { this.x = x; }
>     >   public void setY(int y) { this.y = y; }
>     >   public String toString() { return "(" + x + ", " + y + ")"; }
>     >   public void translate(int dx, int dy) { setLocation(x + dx, y + dy); }
>     > }
>     > ```

---

<h3 align="center" id="3"><u>Section 8.3: Object Initialization: Constructors</u><a href="#home"> 👆</a></h3>

> 17. What is a **_`constructor`_**?  
>      How is a constructor different from other methods?
>     > - A constructor is the code that is called when you use the `new` keyword.
>     > - A constructor is declared without a return type.
>     > - A constructor is a special method that creates an object and initializes its state.

> 18. What are two major problems with the following constructor?
>     > ```java
>     > public /* void */ Point(int initialX, int initialY) {
>     >   /* int */ x = initialX;
>     >   /* int */ y = initialY;
>     > }
>     > ```

> 19. (You must complete Self-Check Problem 7 before answering this question.)
>     Add a constructor to the `Name` class that accepts a first name, middle initial,  
>      and last name as parameters and initializes the `Name` object’s state with those values.
>     > ```java
>     > public class Name {
>     >   String firstName;
>     >   char middleInitial;
>     >   String lastName;
>     >
>     >   public Name(String firstName, char middleInitial, String lastName) {
>     >     this.firstName = firstName;
>     >     this.middleInitial = middleInitial;
>     >     this.lastName = lastName;
>     >   }
>     >
>     >   public String getNormalOrder() {
>     >     return String.format("%s %c. %s", firstName, middleInitial, lastName);
>     >   }
>     >
>     >   public String getReverseOrder() {
>     >     return String.format("%s, %s %c.", lastName, firstName, middleInitial);
>     >   }
>     >
>     >   public String toString() {
>     >     return firstName + " " + middleInitial + ". " + lastName;
>     >   }
>     > }
>     > ```

> 20. What is the meaning of the keyword **_`this`_**?  
>      Describe three ways that the keyword can be used.
>     > - It refers to the object on which a method or constructor has been called  
>     >   (sometimes called the `implicit parameter`).
>     > - It can be used to call the object's methods.
>     > - It can be used to access or set an object's field values
>     > - It is used to call one constructor from another.

> 21. Add a constructor to the `Point` class that accepts another `Point` as a parameter  
>      and initializes this new `Point` to have the same (`x, y)` values.  
>      Use the keyword `this` in your solution.
>     > ```java
>     > public class Point {
>     >   public int x;
>     >   public int y;
>     >
>     >   public Point(int x, int y) {
>     >     this.x = x;
>     >     this.y = y;
>     >   }
>     >
>     >   public Point(Point other) {
>     >     this(other.x, other.y);
>     >   }
>     >
>     >   // more code...
>     > }
>     > ```

---

<h3 align="center" id="4"><u>Section 8.4: Encapsulation</u><a href="#home"> 👆</a></h3>

> 22. What is **_`abstraction`_**?  
>      How do objects provide **_`abstraction`_**?
>     > - The ability to focus on a problem at a high level without worrying about the minor details.
>     > - By giving us more powerful pieces of data that have sophisticated behavior  
>     >   without having to manage and manipulate the data directly.

> 23. What is the difference between the **_`public`_** and **_`private`_** keywords?  
>      What items should be declared `private`?
>     > - Items declared public may be seen and used from any class,  
>     >   while items declared private may be seen and used only from within their own class.
>     > - Objects' fields should be declared private to provide encapsulation,  
>     >   so that external code can't make unwanted direct modifications to the fields' values.

> 24. When fields are made `private`, client programs cannot see them directly.  
>      How do you allow classes access to read these fields’ values,  
>      without letting the client break the object’s encapsulation?
>     > Create an `accessor` method that returns the field's value.

> 25. Add methods named `setX` and `setY` to the `Point` class that allow clients to  
>      change a Point object’s x- and y-coordinates, respectively.
>     > ```java
>     > public class Point {
>     >   /* public */ private int x;
>     >   /* public */ private int y;
>     >
>     >   // constructors
>     >   // instance methods
>     >
>     >   public void setX(int newX) { this.x = newX; }
>     >   public void setY(int newY) { this.y = newY; }
>     > }
>     > ```

> 26. (You must complete Self-Check Problem 7 before answering this question.)
>     Encapsulate the `Name` class.
>     > ```java
>     > public class Name {
>     >   private String firstName;
>     >   private char middleInitial;
>     >   private String lastName;
>     >
>     >   public Name(String firstName, char middleInitial, String lastName) {
>     >     this.firstName = firstName;
>     >     this.middleInitial = middleInitial;
>     >     this.lastName = lastName;
>     >   }
>     >
>     >   public String getNormalOrder() {
>     >     return String.format("%s %c. %s", firstName, middleInitial, lastName);
>     >   }
>     >
>     >   public String getReverseOrder() {
>     >     return String.format("%s, %s %c.", lastName, firstName, middleInitial);
>     >   }
>     >
>     >   public String getFirstName()   { return firstName; }
>     >   public char getMiddleInitial() { return middleInitial; }
>     >   public String getLastName()    { return lastName; }
>     >
>     >   public void setFirstName(String firstName) { this.firstName = firstName; }
>     >   public void setMiddleInitial(char initial) { this.middleInitial = initial; }
>     >   public void setLastName (String lastName)  { this.lastName = lastName; }
>     >
>     >   public String toString() {
>     >     return firstName + " " + middleInitial + ". " + lastName;
>     >   }
>     > }
>     > ```

> 28. How does encapsulation allow you to change the internal implementation of a class?
>     > When a class is encapsulated clients cannot directly access its fields,  
>     > so changing those fields will not disturb client behavior as long as the external  
>     > view (method behavior) is consistent.

---

<h3 align="center" id="5"><u>Section 8.5: Case Study: Designing a Stock Class</u><a href="#home"> 👆</a></h3>

> 29. What is **_`cohesion`_**?  
>      How can you tell whether a class is cohesive?
>     > **_`Cohesion`_** is the concept of **how well a class's contents go together**.  
>     > You can tell that a class is cohesive when each of its fields stores important  
>     > state related to the object and each method interacts with that state in some  
>     > way to produce useful behavior.

> 30. Why didn’t we choose to put the console I/O code into the `Stock` class?
>     > Because doing so would force clients to use those exact I/O messages.  
>     > By keeping I/O code out of `Stock`, we kept it independent from its clients.

> 31. Add `accessor` methods to the `Stock` class to return the stock’s `symbol`, `totalShares`,  
>      and `totalCost`.
>     > ```java
>     > public class Stock {
>     >   private String symbol;      // stock symbol, e.g. "YHOO"
>     >   private int    totalShares; // total shares purchased
>     >   private double totalCost;
>     >
>     >   public Stock(String theSymbol) {
>     >     if (theSymbol == null)
>     >       throw new NullPointerException();
>     >
>     >     symbol = theSymbol;
>     >     totalShares = 0;
>     >     totalCost = 0.0;
>     >   }
>     >
>     >   public double getProfit(double currentPrice) {
>     >     if (currentPrice < 0.0)
>     >       throw new IllegalArgumentException();
>     >
>     >     return totalShares * currentPrice - totalCost;
>     >   }
>     >
>     >   public void purchase(int shares, double pricePerShare) {
>     >     if (shares < 0 || pricePerShare < 0.0)
>     >       throw new IllegalArgumentException();
>     >
>     >     totalShares += shares;
>     >     totalCost += shares * pricePerShare;
>     >   }
>     >
>     >   public String getSymbol()    { return symbol; }
>     >   public int getTotalShares()  { return totalShares; }
>     >   public double getTotalCost() { return totalCost; }
>     > }
>     > ```
