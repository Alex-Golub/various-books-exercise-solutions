<h1 align="center" id="home"><u>CheckPoint Answers</u></h1>

[9.3 Example: Defining Classes and Creating Objects](#3)  
[9.4 Constructing Objects Using Constructors](#4)  
[9.5 Accessing Objects via Reference Variables](#5)  
[9.6 Using Classes from the Java Library](#6)  
[9.7 Static Variables, Constants, and Methods](#7)  
[9.9 Data Field Encapsulation](#9)  
[9.10 Passing Objects to Methods](#10)  
[9.12 Immutable Objects and Classes](#12)  
[9.14 The this Reference](#14)

<h3 align="center" id="3"><u>9.3 Constructing Objects Using Constructors</u><a href="#home"> 👆</a></h3>

> 9.3.1 Describe the relationship between an object and its defining class.
>
> > Class is a template/blueprint from which objects can be created.  
> > Class describes the objects using **_fields/attributes/properties_**  
> > which determine the **state** of an object.  
> > **_Methods_** describes what an object of that class can do (e.g. getArea(), getRadius())  
> > methods also can change object state i.e. when invoked, fields of the object can be changed.  
> > The be able to create an object from a Class, each class must have a **_Constructor_** which upon  
> > invocation initialized object fields and create an actual instance on the heap.

> 9.3.2 How do you define a class?
>
> > Using `class` keyword e.g.
> >
> > ```java
> > public class MyClassName {
> >   // field(s)
> >   // constructor(s)
> >   // method(s)
> > }
> > ```

> 9.3.3 How do you declare an object’s reference variable?
>
> > We use the class name to reference to an object of that class e.g.
> >
> > ```java
> > public class MyClass {
> >   // field(s)
> >   // constructor(s)
> >   // method(s)
> >
> >   public static void main(String... args) {
> >     // using myClassRefVar we can invoke methods from MyClass
> >     MyClass myClassRefVar = new MyClass();
> >   }
> > }
> > ```

> 9.3.4 How do you create an object?
>
> > Object are created using special method **_Constructor_** method(s).  
> > These methods role is to **create** the actual object in the memory (heap)
> > and **initialize** the newly created object fields (not mandatory).
> > e.g. `MyClass myClass = new MyClass();` using the `new` keyword constructor of `MyClass`  
> > is invoked.

---

<h3 align="center" id="4"><u>9.4 Constructing Objects Using Constructors</u><a href="#home"> 👆</a></h3>

> 9.4.1 What are the differences between constructors and methods?
>
> > Constructors should be **invoked first** to create and initialize an object.  
> > Only when the object is created and is "alive" we can invoke methods of that object.
> > Constructors signature is as followed `public ClassName(args...) {...}`  
> > Methods have regular signature e.g. `public double getArea() {...}`
> > Constructors are special kinds of methods that are called when creating an object using  
> > the **new** operator. Constructors **do not have a return type**-not even void.

> 9.4.2 When will a class have a default constructor?
>
> > default constructor (no-args constructor) is provided automatically **only** when  
> > class don't have any other constructors.  
> > In case we write any other constructor the no-args constructor is not provided!
> >
> > ```java
> > public class Pizza {
> >  // fields
> >  public Pizza(String topping) { // empty constructor is no longer provided!
> >    System.out.println("Pizza with " + topping + " is being created");
> >  }
> > }
> > ```

> 9.4.3 What is wrong with each of the following programs?
>
> > ```java
> > // (a)
> > public class ShowErrors {
> >   public static void main(String... args) {
> >     ShowErrors t = new ShowErrors(5); // compilation-error
> >     // ShowErrors class don't have a constructor of type ShowErrors(int)
> >     // only the automatically provided by Java no-args constructor is present
> >   }
> > }
> >
> > // (b)
> > public class ShowErrors {
> >   public static void main(String... args) {
> >     C c = new C(5.0); // compilation-error: missing C(double) constructor
> >     System.out.println(c.value);
> >   }
> > }
> >
> > class C { int value = 2; }
> > ```

> 9.4.4 What is wrong in the following code?
>
> > ```java
> > class Test {
> >   public static void main(String[] args) {
> >     A a = new A(); // compilation-error: class A doesn't have A() constructor
> >     a.print();
> >   }
> > }
> >
> > class A { // empty constructor will not be provided in this case!
> >   String s;
> >   A(String newS) { s = newS; }
> >   public void print() { System.out.print(s); }
> > }
> > ```

---

<h3 align="center" id="5"><u>9.5 Accessing Objects via Reference Variables</u><a href="#home"> 👆</a></h3>

> 9.5.1 Is an array an object or a primitive-type value?  
> Can an array contain elements of an object type?  
> Describe the default value for the elements of an array.
>
> > Array is an **object** in Java because when we create one we are using the `new` operator  
> > e.g. `int[] intArray = new int[10];`
> > Array is a container of elements of the same type. The type can be any type we want  
> > primitive-type or reference-type e.g. `String[] stringArray = new String[10];` is  
> > and array of `String` objects.
> > If an array hold primitive type values then each cell of the array is initialized to
> > corresponding primitive value default value:
> > `byte`, `short`, `int`, `long` => **0**  
> > `float`, `double` => **0.0**  
> > `boolean` => **false**  
> > `char` => **\u0000**  
> > If array hold reference type values then each cell is set to **null**

> 9.5.2 Which operator is used to access a data field or invoke a method from an object?
>
> > Using the **dot(.)** operator e.g. `Circle circle = new Circle(); circle.getArea();`

> 9.5.3 What is an **_anonymous_** object?
>
> > When an object created we can ignore the returning reference value from the constructor
> > doing so the object created is called an anonymous object because it was created and
> > we are not using it later. (create and dispose)  
> > An anonymous object is the one that does not have a reference variable referencing it.
> >
> > ```java
> > public class AnonymousExample {
> >   public static void main(String... args) {
> >     System.out.println(new String("We don\'t need this reference").length()); // 29
> >     // we created a String object but we only wanted the length of it
> >     // and we are not using the String further in the code.
> >   }
> > }
> > ```

> 9.5.4 What is **_NullPointerException_**?
>
> > Exception that can occur in runtime and it is caused by trying to invoke  
> > a method from a reference that holds a `null` value.
> > A `NullPointerException` occurs when a `null` reference variable is used to access  
> > the members of an object.
> >
> > ```java
> > public class NullEg {
> >   public static void main(String... args) {
> >     String s = null;
> >     s.length(); // NullPointerException: s currently referencing to no no where e.g. null
> >   }
> > }
> > ```

> 9.5.5 What is wrong with each of the following programs?
>
> > ```java
> > // (a)
> > public class ShowErrors {
> >   public static void main(String... args) {
> >     ShowErrors t = new ShowErrors();
> >     t.x(); // compilation-error: ShowErrors class don't have such method as x()
> >   }
> > }
> >
> > // (b)
> > public class ShowErrors {
> >   public void method1() {
> >     Circle c;
> >     System.out.println("What is radius " + c.getRadius()); // compilation-error: c hasn't been initialized
> >     c = new Circle();
> >   }
> > }
> > ```

> 9.5.6 What is the output of the following code?
>
> > ```java
> > public class A {
> >   boolean x; // default value of an instance field which is boolean is false
> >
> >   public static void main(String[] args) {
> >     A a = new A(); // automatically givin empty constructor thanks to Java
> >     System.out.println(a.x); // false
> >   }
> > }
> > ```

---

<h3 align="center" id="6"><u>9.6 Using Classes from the Java Library</u><a href="#home"> 👆</a></h3>

> 9.6.1 How do you create a `Date` for the current time?  
> How do you display the current time?
>
> > ```java
> > public class CurrentTime {
> >   public static void main(String[] args) {
> >     Date now = new Date();  // NOTE: Date class is replaced by LocalDate
> >     System.out.println(now.toString());
> >     System.out.println(now.getHours() + ":" +
> >                        now.getMinutes() + ":" +
> >                        now.getSeconds());
> >     // Wed Mar 17 15:14:19 IST 2021
> >     // 15:14:19
> >   }
> > }
> > ```

> 9.6.2 How do you create a `Point2D`?  
> Suppose `p1` and `p2` are two instances of `Point2D`, how do you obtain the distance  
> between the two points?
> How do you obtain the midpoint between the two points?
>
> > ```java
> > public class Point2DExample {
> >   public static void main(String[] args) {
> >     Random random = new Random();
> >
> >     // Creating 2 Point2D objects with random x, y coordinates
> >     Point2D p1 = new Point2D(random.getDouble(100), random.getDouble(100));
> >     Point2D p2 = new Point2D(random.getDouble(100), random.getDouble(100));
> >
> >     // Distance, using distance(other: Point2D): double
> >     System.out.println("Distance between p1 and p2 = " + p1.distance(p2));
> >
> >     // Midpoint, using the midpoint(p: Point2D): Point2D
> >     System.out.println("Midpoint between p1 and p2 = " + p1.midpoint(p2).toString());
> >   }
> > }
> > ```

> 9.6.3 Which packages contain the classes `Date`, `Random`, `Point2D`, `System`, and `Math`?
>
> > `Date` ϵ `java.util`  
> > `Random` ϵ `java.util`  
> > `Point2D` ϵ `javafx.geometry`  
> > `System` ϵ `java.lang`  
> > `Math` ϵ `java.lang`

---

<h3 align="center" id="7"><u>9.7 Static Variables, Constants, and Methods</u><a href="#home"> 👆</a></h3>

> 9.7.1 Suppose the class `F` is defined in (a).
> Let `f` be an instance of `F`.
> Which of the statements in (b) are correct?
>
> > ```java
> > // (a)
> > public class F {
> >   int i;
> >   static String s;
> >   void imethod() {}
> >   static void smethod() {}
> >
> > // (b)
> > F f = new F();
> > System.out.println(f.i);     // ✔, i is an instance variable and can be accessed via object of type F
> > System.out.println(f.s);     // ✔, equivalent to F.s, accessing static field using object of type F
> > f.imethod();                 // ✔, invoking instance method via object of type F
> > f.smethod();                 // ✔, reference type can invoke any static methods
> > System.out.println(F.i);     // ✖, i is an instance variable and can't be accessed in static context
> > System.out.println(F.s);     // ✔, accessing static field in static context
> > F.imethod();                 // ✖, instance method can't be access in static context
> > F.smethod();                 // ✔, static method invoked in static way
> > }
> > ```

> 9.7.2 Add the `static` keyword in the place of ? if appropriate.
>
> > ```java
> > public class Test {
> >   int count;
> >
> >   public /* ? */ static void main(String[] args) { /* ... */ }
> >
> >   public ? int getCount() { return count; } // adding static here will result in compilation-error
> >
> >   public /* ? */ static int factorial(int n) {
> >     int result = 1;
> >     for (int i = 1; i <= n; i++)
> >       result *= i;
> >     return result;
> >   }
> > }
> > ```

> 9.7.3
>
> 1. Can you invoke an instance method or reference an instance variable from a static method?
> 2. Can you invoke a static method or reference a static variable from an instance method?
> 3. What is wrong in the following code?
>
> > 1. Yes, first we have to create an object of that class and when we have a reference to  
> >    that object we can invoke instance methods or access instance variable e.g.
> >
> > ```java
> > public class Ex1 {
> >  int a = 1;
> >  char m() { return 'a'; }
> >  public static void main(String[] args) {
> >    Ex1 ex1 = new Ex1();
> >    System.out.println(ex1.a);   // 1
> >    System.out.println(ex1.m()); // a
> >    // accessing and invoking from static context instance variable and instance method
> >  }
> > }
> > ```
> >
> > 2. Yes, accessing static fields or methods from instance methods always possible
> > 3. What is wrong in the following code?
> >
> > ```java
> > public class C {
> >   Circle c = new Circle();
> >   public static void main(String[] args) { method1(); }
> >   // compilation-error, method1() is
> >   // instance method and can't be invoked from static context if no instance of that class created
> >   // before hand
> >
> >   public void method1() { method2(); } // ✔, static method can be invoked from instance method
> >
> >   public static void method2() { System.out.println("What is radius " + c.getRadius()); }
> >   // compilation-error, static methods/variables are created when class is loaded
> >   // thus c is not known when the class is loaded.
> > }
> > ```

<h3 align="center" id="9"><u>9.9 Data Field Encapsulation</u><a href="#home"> 👆</a></h3>

> 9.9.1 What is an `accessor` method?  
> What is a `mutator` method?  
> What are the naming conventions for accessor methods and mutator methods?
>
> > Fields of an object should not be publicly exposed thus to prevent tampering with the  
> > object state fields should be marked as `private`.  
> > For a client to be able to access and modify these fields public methods should be  
> > provided.  
> > **Accessor** method is for **retrieving** private data value.
> > **Mutator** method is for **changing** private data value.
> > Accessor methods should have the **get** prefix e.g. `getName()`, `getRadius()`  
> > or **is** prefix if the field is of a `boolean` e.g. `isNegative()`.  
> > Mutator method should have the **set** prefix e.g. `setX()`, `setBalance()`

> 9.9.2 What are the benefits of data field encapsulation?
>
> > 1. **Prevent client code tampering with object fields** which can result in  
> >    bringing the object state into invalid state.  
> >    E.g. BankBalance object if the balance field is not encapsulated (i.e. marked as private)  
> >    client code can freely modify the balance value and set it to whichever value he wants to.
> > 2. Easy to maintain code when we know that fields will be only in legal states.

> 9.9.3 In the following code, `radius` is `private` in the `Circle` class, and `myCircle`  
> is an object of the `Circle` class.  
> Does the highlighted code cause any problems? If so, explain why.
>
> > ```java
> > public class Circle {
> >   private double radius = 1;
> >   public double getArea() { return radius * radius * Math.PI; }
> >
> >   public static void main(String[] args) {
> >     Circle myCircle = new Circle();
> >     System.out.println("Radius is " + myCircle.radius);
> >     // no problem, main() method is part of the Circle class thus
> >     // radius field is accessible from main() method
> >   }
> > }
> > ```

<h3 align="center" id="10"><u>9.10 Passing Objects to Methods</u><a href="#home"> 👆</a></h3>

> 9.10.1 Describe the difference between passing a parameter of a primitive type and passing  
> a parameter of a reference type.
>
> > Java uses **"pass by value"** to pass parameters to a method.  
> > When passing a variable of a **primitive type** to a method, the variable remains **unchanged**  
> > after the method finishes. However, when passing a variable of a **reference type** to a method,  
> > any changes to the object referenced by the variable inside the method are **permanent changes**  
> > to the object referenced by the variable outside of the method.  
> > **Both the actual parameter and the formal parameter variables reference to the same object**.

> 9.10.1.1 Show the output of the following programs:
>
> > ```java
> > // (a)
> > public class Test {
> >   public static void main(String[] args) {
> >     Count myCount = new Count();
> >     int times = 0;
> >     for (int i = 0; i < 100; i++)
> >       increment(myCount, times);
> >
> >     System.out.println("count is " + myCount.count);  // count is 101 (reference changes)
> >     System.out.println("times is " + times);          // times is 0 (primitive unchanged)
> >   }
> >
> >   public static void increment(Count c, int times) {
> >     c.count++;
> >     times++;
> >   }
> > }
> >
> > public class Count {
> >   public int count;
> >   public Count (int c) { count = c; }
> >   public Count () { count = 1; }
> > }
> > ```

> 9.10.2 Show the output of the following program:
>
> > ```java
> > public class Test {
> >   public static void main(String[] args) {
> >     Circle circle1 = new Circle(1);
> >     Circle circle2 = new Circle(2);
> >
> >     swap1(circle1, circle2);
> >     System.out.println("After swap1: circle1 = " +
> >                        circle1.radius +
> >                        " circle2 = " + circle2.radius); // after swap1: circle1 = 1.0 circle2 = 2.0
> >
> >     swap2(circle1, circle2);
> >     System.out.println("After swap2: circle1 = " +
> >                        circle1.radius +
> >                        " circle2 = " + circle2.radius); // after swap2: circle1 = 2.0 circle2 = 1.0
> >   }
> >
> >   public static void swap1(Circle x, Circle y) {
> >     Circle temp = x;
> >     x = y;
> >     y = temp;
> >   }
> >
> >   public static void swap2(Circle x, Circle y) {
> >     double temp = x.radius;
> >     x.radius = y.radius;
> >     y.radius = temp;
> >   }
> > }
> >
> > class Circle {
> >   double radius;
> >   Circle(double newRadius) { radius = newRadius; }
> > }
> > ```

> 9.10.3 Show the output of the following code:
>
> > ```java
> > // (a)
> > public class Test {
> >   public static void main(String[] args) {
> >     int[] a = {1, 2};
> >     swap(a[0], a[1]); // primitive type pass to method i.e. caller isn't affected by the swap method
> >     System.out.println("a[0] = " + a[0] + " a[1] = " + a[1]); // a[0] = 1 a[1] = 2
> >   }
> >
> >   public static void swap(int n1, int n2) {
> >     int temp = n1;
> >     n1 = n2;
> >     n2 = temp;
> >   }
> > }
> >
> > // (b)
> > public class Test {
> >   public static void main(String[] args) {
> >     int[] a = {1, 2};
> >     swap(a); // reference of array is passed, caller could be affected by the swap method
> >     System.out.println("a[0] = " + a[0] + " a[1] = " + a[1]); // a[0] = 2, a[1] = 1
> >   }
> >
> >   public static void swap(int[] a) {
> >     int temp = a[0];
> >     a[0] = a[1];
> >     a[1] = temp;
> >   }
> > }
> >
> > // (c)
> > public class Test {
> >   public static void main(String[] args) {
> >     T t = new T();
> >     swap(t);
> >     System.out.println("e1 = " + t.e1 + " e2 = " + t.e2); // e1 = 2 e2 = 1
> >   }
> >
> >   public static void swap(T t) {
> >     int temp = t.e1;
> >     t.e1 = t.e2;
> >     t.e2 = temp;
> >   }
> > }
> >
> > class T {
> >   int e1 = 1;
> >   int e2 = 2;
> > }
> >
> > // (d)
> > public class Test {
> >   public static void main(String[] args) {
> >     T t1 = new T();
> >     T t2 = new T();
> >     System.out.println("t1's i = " + t1.i + " and j = " + t1.j); // t1's i = 2 and j = 1
> >     System.out.println("t2's i = " + t2.i + " and j = " + t2.j); // t2's i = 2 and j = 1
> >   }
> > }
> >
> > class T {
> >   static int i = 0;
> >   int j = 0;
> >
> >   T() {
> >     i++;
> >     j = 1;
> >   }
> > }
> > ```

> 9.10.4 What is the output of the following programs?
>
> > ```java
> > // (a)
> > import java.util.Date;
> > public class Test {
> >   public static void main(String[] args) {
> >     Date date = null;
> >     m1(date);
> >     System.out.println(date); // null
> >   }
> >
> >   // date is local to m1 thus assigning new reference of Date class do not change the caller
> >   // if you wanted to change the caller new Date() should have been a return value of m1
> >   public static void m1(Date date) { date = new Date(); }
> > }
> >
> > // (b)
> > import java.util.Date;
> > public class Test {
> >   public static void main(String[] args) {
> >     Date date = new Date(1234567);
> >     m1(date);
> >     System.out.println(date.getTime()); // 1234567
> >   }
> >
> >   // same as (a) m1 is not changing the caller
> >   public static void m1(Date date) {
> >     date = new Date(7654321);
> >   }
> > }
> >
> > // (c)
> > import java.util.Date;
> > public class Test {
> >   public static void main(String[] args) {
> >     Date date = new Date(1234567);
> >     m1(date);
> >     System.out.println(date.getTime()); // 7654321
> >   }
> >
> >   public static void m1(Date date) {
> >     // setting new time value to the object referenced by date, changing the caller
> >     date.setTime(7654321);
> >   }
> > }
> >
> > // (d)
> > import java.util.Date;
> > public class Test {
> >   public static void main(String[] args) {
> >     Date date = new Date(1234567);
> >     m1(date);
> >     System.out.println(date.getTime()); // 1234567
> >   }
> >
> >   // same as (a) and (b) m1 not affecting the caller
> >   public static void m1(Date date) {
> >     date = null;
> >   }
> > }
> > ```

> 9.11.1 What is wrong in the following code?
>
> > ```java
> >   import java.util.Date;
> >   public class Test {
> >     public static void main(String[] args) {
> >       Date[] dates = new Date[10];             // [null, null, null, null, null, null, null, null, null, null]
> >       System.out.println(dates[0]);            // null
> >       System.out.println(dates[0].toString()); // null.toString() => NullPointerException
> >     }
> >   }
> > ```

<h3 align="center" id="12"><u>9.12 Immutable Objects and Classes</u><a href="#home"> 👆</a></h3>

> 9.12.1 If a class contains only `private` data fields and no setter methods, is the class immutable?
>
> > **No**. If there is a field that is mutable and a getter method is present for this field
> > and the return value of that getter is the field itself we are returning the reference to
> > that field to the **caller that can change the values of that field** breaking the immutability
> > of that class.  
> > So, to make sure a class is fully immutable, fields of that class that are
> > mutable we must **return a copy of that field** to prevent caller from tempering with the data.
> >
> > ```java
> > public class NotMutable {
> >   private int[] intArray = {1, 2, 3, 4, 5, 6};
> >   public int[] getIntArray() {
> >     return Arrays.copyOf(intArray, intArray.length()); // return copy of the data
> >   }
> >
> >   // public int[] getIntArray() {
> >   //   return inArray; // breaking immutability
> >   // }
> > }
> > ```

> 9.12.2 If all the data fields in a class are `private` and of **primitive types**, and the class
> doesn’t contain any setter methods, is the class immutable?
>
> > **Yes**. Later we also want the make sure the class can't be `extended` so we will make the  
> > class `final`.

> 9.12.3 Is the following class immutable?
>
> ```java
> public class A {
>   private int[] values;
>   public int[] getValues() {
>     return values;
>   }
> }
> ```
>
> > **No**. `values` field is a reference type value, if returned to the caller can be easily  
> > tempered with changing the values of it thus breaking the immutability of the class.  
> > To overcome this problem we would want to **return a copy** of the `values` array.  
> > `return Arrays.copyOf(values, values.length());`

> 9.13.1 What is the output of the following program?
>
> > ```java
> > public class Test {
> >   private static int i = 0;
> >   private static int j = 0;
> >
> >   public static void main(String[] args) {
> >     int i = 2;
> >     int k = 3;
> >
> >     { // creating new scope
> >       int j = 3;
> >       System.out.println("i + j is " + i + j); // i + j is 23
> >     }
> >
> >     k = i + j; // k = 2 + 0 = 2
> >     System.out.println("k is " + k); // k is 2
> >     System.out.println("j is " + j); // j is 0
> >   }
> > }
> > ```

<h3 align="center" id="14"><u>9.14 The this Reference</u><a href="#home"> 👆</a></h3>

> 9.14.1 Describe the role of the `this` keyword
>
> > 1. `this` is used for accessing class instance variables/method. e.g. if there is  
> >    a same variable name as instance variable in a method scope then this varaible is  
> >    "hiding" the instance variable and to be able to access the instance variable  
> >    we can use the `this`.
> >
> > ```java
> > public class D {
> >   private int i = 5;
> >   public void setI(int i) {
> >     this.i = i;
> >   }
> > }
> > ```
> >
> > 2. `this` can also be used in constructor context.  
> >    using `this(args-list)` we can invoke other constructor of the same class.  
> >    NOTE: `this(args-list)` must be the first line in the constructor scope.
> >
> > ```java
> > public class Ball {
> >   private double radius;
> >   public Ball(double radius) {
> >     this.radius = radius;
> >   }
> >   public Ball() {
> >     this(1.0); // calling one-arg constructor
> >   }
> > }
> > ```

> 9.14.2 What is wrong in the following code?
>
> > ```java
> > public class C {
> >   private int p;
> >
> >   public C() {
> >     System.out.println("C's no-arg constructor invoked");
> >     this(0); // compilation-error, calling other constructors must be the first line
> >   }
> >
> >   public C(int p) {
> >     p = p; // local p is set to itself, should have been this.p = p
> >   }
> >
> >   public void setP(int p) {
> >     p = p; // same problem as in C(int) constructor, should be this.p = p
> >   }
> > }
> > ```

> 9.14.3 What is wrong in the following code?
>
> > ```java
> > public class Test {
> >  private int id;
> >
> >  public void m1() {
> >    this.id = 45;
> >  }
> >
> >  public void m2() {
> >    Test.id = 45; // compilation-error, id is not a static field, should have been this.id = 46
> >  }
> > }
> > ```
