<h1 align="center" id="home"><u>Self-Check Answers</u></h1>

[Section 9.1: Inheritance Basics](#1)  
[Section 9.2: Interacting with the Superclass](#2)  
[Section 9.3: Polymorphism](#3)  
[Section 9.4: Inheritance and Design](#4)  
[Section 9.5: Interfaces](#5)  
[Section 9.6: Case Study: Financial Class Hierarchy](#6)

<h3 align="center" id="1"><u>Section 9.1: Inheritance Basics</u><a href="#home">
👆</a></h3>

> 1. What is code reuse?  
     > How does inheritance help achieve code reuse?
     >    > Code reuse is the practice of writing a single piece of code and using it many times in  
     > > different programs and contexts.  
     > > **_Inheritance_** is useful for code reuse because it allows you to write a class that  
     > > **captures common useful code** and then extend that class to add more features and behavior  
     > > to it.

> 2. What is the difference between **_overloading_** and **_overriding_** a method?
     >    > `Overloading`, occurs when one class contains multiple methods that have  
     > > the **same name but different parameter signatures**.  
     > > `Overriding` occurs when a subclass substitutes its own version of an otherwise inherited  
     > > method that uses exactly the same name and the same parameters.
     >    >
     >    > `Overloading` a method involves creating two methods in the same class that  
     > > **have the same name but different parameters**.  
     > > `Overriding` a method involves **creating a new version of an inherited method**  
     > > in a subclass, with identical parameters but new behavior to replace the old.

> 3. Which of the following is the correct syntax to indicate that class `A` is a subclass of `B`?
>
> > ```java
> > public class A : super B {  // => ✖, compilation-error invalid syntax
> > public class B extends A {  // => ✖, compiles fine but B is subclass of A which is opposite
> > public class A extends B {  // => ✔, A is subclass of B
> > public A implements B {     // => ✖, compilation-error, class keyword is missing
> > public A(super B) {         // => ✖, compilation-error
> > ```

---

<h3 align="center" id="2"><u>Section 9.2: Interacting with the
Superclass</u><a href="#home"> 👆</a></h3>

> 4. Explain the difference between the `this` keyword and the `super` keyword.  
     > When should each be used?
     >    > `this` keyword can be used to refer to current invoked object fields e.g `this.age`  
     > > `this` can be used to invoke a constructor within the same class e.g. `this(name, age)`  
     > > **_NB:_** invoking a constructor can be done only from this class other constructor and
     > > it must be the first statement otherwise we get compile time error.
     >    >
     >    > `super` can be used to invoke `superclass` methods or access fields of the superclass
     > > if they are not `private`.  
     > > `super` is used to invoke superclass constructor from a subclass constructor.  
     > > In fact subclass must sooner or later invoke the superclass constructor and the invocation
     > > of the superclass constructor must be the first statement in the constructor
     >    >
     >    > The `this` keyword refers to the **current object**, while  
     > > the `super` keyword refers to the **current class's superclass**.  
     > > Use the `super` keyword when **calling a method or constructor** from the **superclass**  
     > > that you've overridden, and use the `this` keyword when  
     > > **accessing your object's own fields, constructors, and methods**.

> 5. For the next three problems, consider the following class:
     > Can the code in the `UndergraduateStudent` class access the `name` and `age` fields it  
     > inherits from `Student`?  
     > Can it call the `setAge` method?
>
> ```java
>  // Represents a university student.
> public class Student {
>   private String name;
>   private int age;
>
>   public Student(String name, int age) {
>     this.name = name;
>     this.age = age;
>   }
>
>   public void setAge(int age) {
>     this.age = age;
>   }
> }
>
> public class UndergraduateStudent extends Student {
>   private int year;
> }
> ```
>
> > `UndergraduateStudent` class don't have access to `Student` `name` and `age` fields.
> > The fields have `private` access and thus not accessible outside of the `Student` class

> 6. Write a constructor for the `UndergraduateStudent` class that accepts a `name` as a parameter  
     > and initializes the `UnderGraduateStudent`’s state with that `name`, an `age` value of 18,  
     > and a `year` value of 0.
     >    > ```java
>    > public class UndergraduateStudent extends Student {
>    >   private int year;
>    >
>    >   public UndergraduateStudent(String name) {
>    >     super(name, 18); // delegate parameters to superclass, we don't have access to them
>    >     year = 0;
>    >   }
>    > }
>    > ```

> 7. Write a version of the `setAge` method in the `UndergraduateStudent` class that not only sets  
     > the `age` but also increments the `year` field’s value by one.
     >    > ```java
>    > public class UndergraduateStudent extends Student {
>    >   private int year;
>    >
>    >   public UndergraduateStudent(String name) {
>    >     super(name, 18);
>    >     year = 0;
>    >   }
>    >
>    >   @Override // UndergraduateStudent setting the age a little bit differently then its Student
>    >   public void setAge(int age) {
>    >     // => we will get compile-time error because UndergraduateStudent don't have
>    >     // access to age field of Student class
>    >     /* this.age = age; */
>    >     super.setAge(age); // delegate age to superclass to do its work with age field
>    >     year += 1;         // UndergraduateStudent responsibility here
>    >   }
>    > }
>    > ```

> 8. Consider the following two automobile classes:
     > Given the following declared variables, what is the output from the following statements?
     >    > ```java
>    > public class Car {
>    >  public void m1() { System.out.println("car 1"); }
>    >  public void m2() { System.out.println("car 2"); }
>    >  public String toString() { return "vroom"; }
>    >
>    > public class Truck extends Car {
>    >  public void m1() { System.out.println("truck 1"); }
>    > }
>    >
>    > public class Test {
>    >  public static void main(String... args) {
>    >    Car mycar = new Car();
>    >    Truck mytruck = new Truck();
>    >
>    >    System.out.println(mycar);    // Car toString() invoked => "vroom"
>    >    mycar.m1();                   // Car m1() invoked       => "car 1"
>    >    mycar.m2();                   // Car m2() invoked       => "car 2"
>    >
>    >    System.out.println(mytruck);  // Truck didn't override Car toString() then Car toString() invoked => "vroom"
>    >    mytruck.m1();                 // Truck correctly overrides m1() method of Car => "truck 1"
>    >    mytruck.m2();                 // Truck didn't override Car m2() then Car m2() invoked => "car 2"
>    >  }
>    > }
>    > ```
     >    >
     >    > `vroom`  
     > > `car 1`  
     > > `car 2`  
     > > `vroom`  
     > > `truck 1`  
     > > `car 2`

> 9. Suppose the `Truck` code from the previous problem changes to the following:
     > Using the same variables from the previous problem, what is the output from the following statements?
     >    > ```java
>    > public class Truck extends Car {
>    >   public void m1() { System.out.println("truck 1"); }
>    >   public void m2() { super.m1(); }
>    >   public String toString() { return super.toString() + super.toString(); }
>    > }
>    >
>    > public class Test {
>    >   public static void main(String... args) {
>    >     System.out.println(mytruck); // => vroomvroom
>    >     mytruck.m1();                // => truck 1
>    >     mytruck.m2();                // => car 1
>    >   }
>    > }
>    > ```

---

<h3 align="center" id="3"><u>Section 9.3: Polymorphism</u><a href="#home">
👆</a></h3>

> 10. Consider the following classes:  
      > Which of the following are legal statements?
      >     > ```java
>     > public class Vehicle {/* ... */}
>     > public class Car extends Vehicle {/* ... */}
>     > public class SUV extends Car {/* ... */}
>     >
>     > public class Test {
>     >   public static void main(String[] args) {
>     >     Vehicle v = new Car(); // ✔, Car is-a Vehicle
>     >     Vehicle v = new SUV(); // ✔, SUV is-a Vehicle
>     >     Car c = new SUV();     // ✔, SUV is-a Car
>     >     SUV s = new SUV();     // ✔, SUV is-a SUV
>     >     SUV s = new Car();     // ✖, Not every Car is an SUV
>     >     Car c = new Vehicle(); // ✖, Not every Vehicle is a Car
>     >   }
>     > }
>     > ```

> 11. Using the `A`, `B`, `C`, and `D` classes from this section, what is the output of the  
      > following code fragment?
      >     > ```java
>     > class A extends B {
>     >   public void method2() { System.out.print("a 2  "); method1(); }
>     > }
>     >
>     > class B extends C {
>     >   public String toString() { return "b"; }
>     >   public void method2() { System.out.print("b 2  "); super.method2(); }
>     > }
>     >
>     > class C {
>     >   public String toString() { return "c"; }
>     >   public void method1() { System.out.print("c 1  "); }
>     >   public void method2() { System.out.print("c 2  "); }
>     > }
>     >
>     > class D extends B {
>     >   public void method1() { System.out.print("d 1  "); method2(); }
>     > }
>     >
>     > public class Test {
>     >   public static void main(String[] args) {
>     >     A[] elements = { new B(), new D(), new A(), new C() }; // compile-time error
>     >
>     >     for (int i = 0; i < elements.length; i++) {
>     >       elements[i].method2();
>     >       System.out.println(elements[i]);
>     >       elements[i].method1();
>     >       System.out.println();
>     >     }
>     >   }
>     > }
>     > ```

> 12. Assume that the following classes have been defined:
      > What is the output produced by the following code fragment?
      >     > ```java
>     > public class Flute extends Blue {
>     >   public void method2() { System.out.println("flute 2"); }
>     >   public String toString() { return "flute"; }
>     > }
>     >
>     > public class Blue extends Moo {
>     >   public void method1() { System.out.println("blue 1"); }
>     > }
>     >
>     > public class Shoe extends Flute {
>     >   public void method1() { System.out.println("shoe 1"); }
>     > }
>     >
>     > public class Moo {
>     >   public void method1() { System.out.println("moo 1"); }
>     >   public void method2() { System.out.println("moo 2"); }
>     >   public String toString() { return "moo"; }
>     > }
>     >
>     > public class Test {
>     >   public static void main(String[] args) {
>     >     Moo[] elements = { new Shoe(), new Flute(), new Moo(), new Blue() };
>     >
>     >     for (int i = 0; i < elements.length; i++) {
>     >       System.out.println(elements[i]);
>     >       elements[i].method1();
>     >       elements[i].method2();
>     >       System.out.println();
>     >     }
>     >   }
>     > }
>     > ```
      >     >
      >     > Inheritance tree: `Moo` > `Blue` > `Flute` > `Shoe`
      >     >
      >     > ```java
>     > flute
>     > shoe 1
>     > flute 2
>     >
>     > flute
>     > blue 1
>     > flute 2
>     >
>     > moo
>     > moo 1
>     > moo 2
>     >
>     > moo
>     > blue 1
>     > moo 2
>     > ```

> 13. Using the classes from the previous problem, write the output that is produced  
      > by the following code fragment.
      >     > ```java
>     > public class Test2 {
>     >   public static void main(String[] args) {
>     >     Moo[] elements = { new Blue(), new Moo(), new Shoe(), new Flute() };
>     >
>     >     for (int i = 0; i < elements.length; i++) {
>     >       elements[i].method2();
>     >       elements[i].method1();
>     >       System.out.println(elements[i]);
>     >       System.out.println();
>     >     }
>     >   }
>     > }
>     > ```
      >     >
      >     > Inheritance tree: `Moo` > `Blue` > `Flute` > `Shoe`
      >     >
      >     > ```java
>     > moo 2
>     > blue 1
>     > moo
>     >
>     > moo 2
>     > moo 1
>     > moo
>     >
>     > flute 2
>     > shoe 1
>     > flute
>     >
>     > flute 2
>     > blue 1
>     > flute
>     > ```

> 14. Assume that the following classes have been defined:
      > What output is produced by the following code fragment?
      >     > ```java
>     > public class Mammal extends SeaCreature {
>     >   public void method1() { System.out.println("warm-blooded"); }
>     > }
>     >
>     > public class SeaCreature {
>     >   public void method1() { System.out.println("creature 1"); }
>     >   public void method2() { System.out.println("creature 2"); }
>     >   public String toString() { return "ocean-dwelling"; }
>     > }
>     >
>     > public class Whale extends Mammal {
>     >   public void method1() { System.out.println("spout"); }
>     >   public String toString() { return "BIG!"; }
>     > }
>     >
>     > public class Squid extends SeaCreature {
>     >   public void method2() { System.out.println("tentacles"); }
>     >   public String toString() { return "squid"; }
>     > }
>     >
>     > public class Test3 {
>     >   public static void main(String[] args) {
>     >     SeaCreature[] elements = { new Squid(), new Whale(), new SeaCreature(), new Mammal() };
>     >
>     >     for (int i = 0; i < elements.length; i++) {
>     >       System.out.println(elements[i]);
>     >       elements[i].method1();
>     >       elements[i].method2();
>     >       System.out.println();
>     >     }
>     >   }
>     > }
>     > ```
      >     >
      >     > Inheritance tree:  
      > > SeaCreature > Mammal > Whale  
      > > SeaCreature > Squid
      >     >
      >     > ```java
>     > squid
>     > creature 1
>     > tentacles
>     >
>     > BIG!
>     > spout
>     > creature 2
>     >
>     > ocean-dwelling
>     > creature 1
>     > creature 2
>     >
>     > ocean-dwelling
>     > warm-blooded
>     > creature 2
>     > ```

> 15. Using the classes from the previous problem, write the output that is produced  
      > by the following code fragment:
      >     > ```java
>     > public class Test4 {
>     >   public static void main(String[] args) {
>     >     SeaCreature[] elements = { new SeaCreature(), new Squid(), new Mammal(), new Whale() };
>     >
>     >     for (int i = 0; i < elements.length; i++) {
>     >       elements[i].method2();
>     >       System.out.println(elements[i]);
>     >       elements[i].method1();
>     >       System.out.println();
>     >     }
>     >   }
>     > }
>     > ```
      >     >
      >     > Inheritance tree:  
      > > SeaCreature > Mammal > Whale  
      > > SeaCreature > Squid
      >     >
      >     > ```java
>     > tentacles
>     > squid
>     > creature 1
>     >
>     > creature 2
>     > BIG!
>     > spout
>     >
>     > creature 2
>     > ocean-dwelling
>     > creature 1
>     >
>     > creature 2
>     > ocean-dwelling
>     > warm-blooded
>     > ```

> 16. Assume that the following classes have been defined:
      > What output is produced by the following code fragment?
      >     > ```java
>     > public class Bay extends Lake {
>     >   public void method1() { System.out.print("Bay 1 "); super.method2(); }
>     >   public void method2() { System.out.print("Bay 2 "); }
>     > }
>     >
>     > public class Pond {
>     >   public void method1() { System.out.print("Pond 1 "); }
>     >   public void method2() { System.out.print("Pond 2 "); }
>     >   public void method3() { System.out.print("Pond 3 "); }
>     > }
>     >
>     > public class Ocean extends Bay {
>     >   public void method2() { System.out.print("Ocean 2 "); }
>     > }
>     >
>     > public class Lake extends Pond {
>     >   public void method3() { System.out.print("Lake 3 "); method2(); }
>     > }
>     >
>     > public class Test5 {
>     >   public static void main(String[] args) {
>     >     Pond[] ponds = { new Ocean(), new Pond(), new Lake(), new Bay() };
>     >
>     >     for (Pond p : ponds) {
>     >       p.method1();
>     >       System.out.println();
>     >       p.method2();
>     >       System.out.println();
>     >       p.method3();
>     >       System.out.println("\n");
>     >     }
>     >   }
>     > }
>     > ```
      >     >
      >     > Inheritance tree: `Pond` > `Lake` > `Bay` > `Ocean`
      >     >
      >     > ```java
>     > Bay 1 Pond 2
>     > Ocean 2
>     > Lake 3 Ocean 2
>     >
>     > Pond 1
>     > Pond 2
>     > Pond 3
>     >
>     > Pond 1
>     > Pond 2
>     > Lake 3 Pond 2
>     >
>     > Bay 1 Pond 2
>     > Bay 2
>     > Lake 3 Bay 2
>     > ```

> 17. Suppose that the following variables referring to the classes from the previous  
      > problem are declared.
      > Which of the following statements produce compiler errors?  
      > For the statements that do not produce errors, what is the output of each statement?
      >     > ```java
>     > Pond var1 = new Bay();
>     > Object var2 = new Ocean();
>     >
>     > ((Lake) var1).method1();
>     > ((Bay) var1).method1();
>     > ((Pond) var2).method2();
>     > ((Lake) var2).method2();
>     > ((Ocean) var2).method3();
>     > ```
      >     >
      >     > ```java
>     > Bay 1 Pond 2
>     > Bay 1 Pond 2
>     > Ocean 2
>     > Ocean 2
>     > Lake 3 Ocean 2
>     > ```

> 17.1. Given the classes above, what output is produced by the following code?
>
> ```java
> class A extends B {
>   public void method2() { System.out.print("a 2  "); method1(); }
> }
>
> class B extends C {
>   public String toString() { return "b"; }
>   public void method2() { System.out.print("b 2  "); super.method2(); }
> }
>
> class C {
>   public String toString() { return "c"; }
>   public void method1() { System.out.print("c 1  "); }
>   public void method2() { System.out.print("c 2  "); }
> }
>
> class D extends B {
>   public void method1() { System.out.print("d 1  "); method2(); }
> }
>
> public class inheritanceMystery1 {
>   public static void main(String[] args) {
>     C[] elements = {new A(), new B(), new C(), new D()};
>
>     for (C element : elements) {
>       System.out.println(element);
>       element.method1();
>       System.out.println();
>       element.method2();
>       System.out.println();
>       System.out.println();
>     }
>   }
> }
> ```
>
> > Inheritance tree:  
> > `C` > `B` > `A`  
> > `B` > `D`
> >
> > ```java
> > b
> > c 1
> > a 2  c 1
> >
> > b
> > c 1
> > b 2  c 2
> >
> > c
> > c 1
> > c 2
> >
> > b
> > d 1  b 2  c 2
> > b 2  c 2
> > ```

> 17.2 Given the classes above, what output is produced by the following code?
>
> ```java
> class Brienne extends Oberyn {
>   public void a() { System.out.print("Brienne-a   "); }
> }
>
> class Arya {
>   public void a() {System.out.print("Arya-a   "); }
>   public void b() { a(); System.out.print("Arya-b   "); }
>   public String toString() { return "Arya"; }
> }
>
> class Tyrion extends Arya {
>   public void a() { super.a(); System.out.print("Tyrion-a   "); }
> }
>
> class Oberyn extends Arya {
>   public void b() { System.out.print("Oberyn-b   "); super.b(); }
>   public String toString() { return "Oberyn"; }
> }
>
> public class inheritanceMystery2 {
>   public static void main(String[] args) {
>     Arya[] thrones = { new Oberyn(), new Arya(), new Brienne(), new Tyrion() };
>
>     for (Arya throne : thrones) {
>       throne.a();
>       System.out.println();
>       System.out.println(throne);
>       throne.b();
>       System.out.println();
>       System.out.println();
>     }
>   }
> }
> ```
>
> > Inheritance tree:  
> > `Arya` > `Tyrion`  
> > `Arya` > `Oberyn` > `Brienne`
> >
> > ```java
> > Arya-a
> > Oberyn
> > Oberyn-b   Arya-a   Arya-b
> >
> > Arya-a
> > Arya
> > Arya-a   Arya-b
> >
> > Brienne-a
> > Oberyn
> > Oberyn-b   Brienne-a   Arya-b
> >
> > Arya-a   Tyrion-a
> > Arya
> > Arya-a   Tyrion-a   Arya-b
> > ```

> 17.3 Given the classes above, what output is produced by the following code?
>
> ```java
> class George extends Elaine {
>   public void method1() { System.out.print("George 1 "); }
> }
>
> class Jerry {
>   public void method1() { System.out.print("Jerry 1 "); }
>   public void method2() { System.out.print("Jerry 2 "); }
>   public String toString() { return "Jerry"; }
> }
>
> class Elaine extends Kramer {
>   public String toString() { return "Elaine " + super.toString(); }
> }
>
> class Kramer extends Jerry {
>   public void method1() { super.method1(); System.out.print("Kramer 1 "); }
>   public void method2() { System.out.print("Kramer 2 "); method1(); }
>   public String toString() { return "Kramer"; }
> }
>
> public class inheritanceMystery3 {
>   public static void main(String[] args) {
>     Jerry[] seinfeld = { new George(), new Kramer(), new Jerry(), new Elaine() };
>
>     for (Jerry jerry : seinfeld) {
>       jerry.method1();
>       System.out.println();
>       jerry.method2();
>       System.out.println();
>       System.out.println(jerry);
>       System.out.println();
>     }
>   }
> }
> ```
>
> > Inheritance tree: `Jerry` > `Kramer` > `Elaine` > `George`
> >
> > ```java
> > George 1
> > Kramer 2 George 1
> > Elaine Kramer
> >
> > Jerry 1 Kramer 1
> > Kramer 2 Jerry 1 Kramer 1
> > Kramer
> >
> > Jerry 1
> > Jerry 2
> > Jerry
> >
> > Jerry 1 Kramer 1
> > Kramer 2 Jerry 1 Kramer 1
> > Elaine Kramer
> > ```

> 17.4 Given the classes above, what output is produced by the following code?
>
> ```java
> class Poe extends Kylo {
>   public void method2() { super.method2(); System.out.print("Poe 2   "); }
>   public String toString() { return "Poe " + super.toString(); }
> }
>
> class Kylo extends Finn {
>   public void method1() { System.out.print("Kylo 1   "); }
>   public String toString() { return "Kylo"; }
> }
>
> class Finn extends Rey {
>   public void method2() { System.out.print("Finn 2   "); method1(); }
> }
>
> class Rey {
>   public String toString() { return "Rey";}
>   public void method1() { System.out.print("Rey 1   ");}
>   public void method2() { System.out.print("Rey 2   "); }
> }
>
> public class inheritanceMystery4 {
>   public static void main(String[] args) {
>     Rey[] elements = { new Finn(), new Rey(), new Poe(), new Kylo() };
>
>     for (Rey element : elements) {
>       System.out.println(element);
>       element.method1();
>       System.out.println();
>       element.method2();
>       System.out.println();
>       System.out.println();
>     }
>   }
> }
> ```
>
> > Inheritance tree: `Rey` > `Finn` > `Kylo` > `Poe`
> >
> > ```java
> > Rey
> > Rey 1
> > Finn 2   Rey 1
> >
> > Rey
> > Rey 1
> > Rey 2
> >
> > Poe Kylo
> > Kylo 1
> > Finn 2   Kylo 1   Poe 2
> >
> > Kylo
> > Kylo 1
> > Finn 2   Kylo 1
> > ```

> 17.5 Given the classes above, what output is produced by the following code?
>
> ```java
> class Eve {
>   public void a() { System.out.print("Eve a   "); }
>   public void b() { System.out.print("Eve b   "); }
>   public String toString() { return "Eve ts"; }
> }
>
> class Sam extends Eve {
>   public void b() { a(); System.out.print("Sam b   "); }
>   public String toString() { return "Sam ts"; }
> }
>
> class Lucas extends Sam {
>   public void a() {
>     System.out.print("Lucas a   ");
>     System.out.print(toString() + "   ");
>   }
>
>   public String toString() {
>     String sup = super.toString();
>     return sup + " " + sup;
>   }
> }
>
> class Josh extends Lucas {
>   public void b() { System.out.print("Josh b   "); super.b(); }
>   public String toString() { return "Josh ts"; }
> }
>
> public class inheritanceMystery5 {
>   public static void main(String[] args) {
>     Eve[] elements = { new Eve(), new Sam(), new Lucas(), new Josh() };
>
>     for (Eve element : elements) {
>       System.out.println(element);
>       element.a();
>       System.out.println();
>       element.b();
>       System.out.println();
>       System.out.println();
>     }
>   }
> }
> ```
>
> > Inheritance tree: `Eve` > `Sam` > `Lucas` > `Josh`
> >
> > ```java
> > Eve ts
> > Eve a
> > Eve b
> >
> > Sam ts
> > Eve a
> > Eve a   Sam b
> >
> > Sam ts Sam ts
> > Lucas a   Sam ts Sam ts
> > Lucas a   Sam ts Sam ts   Sam b
> >
> > Josh ts
> > Lucas a   Josh ts
> > Josh b   Lucas a   Josh ts   Sam b
> > ```

<h3 align="center" id="4"><u>Section 9.4: Inheritance and
Design</u><a href="#home"> 👆</a></h3>

> 18. What is the difference between an `is-a` and a `has-a` relationship?  
      > How do you create a `has-a` relationship in your code?
      >     > An `is-a` relationship is a subclass relationship such as those created by **_inheritance_**.
      > > A `has-a` relationship is when one **object contains a reference to another as a field**.
      >     >
      >     > ```java
>     > // is-a relationship
>     > class Car {}
>     > class SUV extends Car {}
>     >
>     > // has-a relationship
>     > class Car {
>     >   private Engine point; // has-a relationship i.e. Car has-an Engine
>     > }
>     > ```

> 19. Imagine a `Rectangle` class with objects that represent two-dimensional rectangles.  
      > The `Rectangle` has `width` and `height` fields with appropriate accessors and mutators,  
      > as well as `getArea` and `getPerimeter` methods.  
      > You would like to add a `Square` class into your system.  
      > Is it a good design to make `Square` a subclass of `Rectangle`?  
      > Why or why not?
      >     > **No**. this design will violate **_Liskov substitution principal_**.  
      > > Client calling `setWidth` or `setHeight` on `Square` can think that different value  
      > > will be set to `height` and `width` fields of `Square` which is not true.

> 20. Imagine that you are going to write a program to play card games.  
      > Consider a design with a `Card` class and 52 sub-classes, one for each of the unique  
      > playing cards (for example, `NineOfSpades` and `JackOfClubs`).  
      > Is this a good design?
      > If so, why? If not, why not, and what might be a better design?
      >     > Creating such tree hierarchy is not good design. Instead a `Card` class that has-a  
      > > `Rank` and `Suit` fields will be better.

> 21. In Section 9.2 we discussed adding functionality for dividend payments to the `Stock` class.  
      > Why was it preferable to create a `DividendStock` class rather than editing the `Stock` class  
      > and adding this feature directly to it?
      >     > Another important principle is the so called **_open-closed_** design which states  
      > > that if a code was written, tested and is already in extensive use don't touch that code
      > > rather try to extend it i.e. add functionality without changing the already working code.

---

<h3 align="center" id="5"><u>Section 9.5: Interfaces</u><a href="#home">
👆</a></h3>

> 22. What is the difference between **_implementing_** an interface and **_extending_** a class?
      >     > **Extending** a class causes your class to **inherit all methods and data from that class**.  
      > > **Implementing** an interface forces you to **write your own code to implement** all the  
      > > methods in that interface.

> 23. Consider the following interface and class:
      > What must be true about the code for class `C` in order for that code to compile successfully?
>
> > ```java
> > public interface I {
> >   public void m1();
> >   public void m2();
> > }
> > public class C implements I { /* code for class C */ }
> > ```
> >
> > Class `C` must provide implementations of the methods of interface `I`

> 24. What’s wrong with the code for the following interface?  
      > What should be changed to make a valid interface for objects that have colors?
      >     > ```java
>     > public interface Colored {
>     >   private Color color;
>     >     public Color getColor() {
>     >     return color;
>     >   }
>     > }
>     > ```
      >     >
      >     > Interfaces can't declare private fields an contain method implementations.

> 25. Modify the `Point` class from Chapter 8 so that it implements the `Colored` interface  
      > and `Points` have colors. (You may wish to create a `ColoredPoint` class that extends `Point`.)
      >     > ```java
>     > public class ColoredPoint extends Point implements Colored {
>     >   private Color color;
>     >
>     >   public ColoredPoint(int x, int y, Color color) {
>     >     super(x, y);
>     >     this.color = color;
>     >   }
>     >
>     >   @Override
>     >   public Color getColor() {
>     >     return color;
>     >   }
>     > }
>     > ```

> 26. Declare a method called `getSideCount` in the `Shape` interface that returns the number
      > of sides that the shape has.  
      > Implement the method in all shape classes.
      >     > ```java
>     > public interface Shape {
>     >   public abstract double getArea();
>     >   public abstract double getPerimeter();
>     >   public abstract int getSideCount();
>     > }
>     >
>     > class Rectangle implements Shape {
>     >   @Override public double getArea() {/* return rectangle area */}
>     >   @Override public double getPerimeter() {/* return rectangle perimeter */}
>     >   @Override public int getSideCount() { return 4; };
>     > }
>     >
>     > class Circle implements Shape {
>     >   @Override public double getArea() {/* return circle area */}
>     >   @Override public double getPerimeter() {/* return circle perimeter */}
>     >   @Override public int getSideCount() { return 0; };
>     > }
>     >
>     > class Triangle implements Shape {
>     >   @Override public double getArea() {/* return triangle area */}
>     >   @Override public double getPerimeter() {/* return triangle perimeter */}
>     >   @Override public int getSideCount() { return 3; };
>     > }
>     > ```

---

<h3 align="center" id="6"><u>Section 9.6: Case Study: Financial Class
Hierarchy</u><a href="#home"> 👆</a></h3>

> 27. What is an **_abstract class_**?  
      > How is an abstract class like a normal class, and how does it differ?
      >     > An abstract class is a class intended to be used only as a superclass for inheritance.  
      > > Concrete and abstract classes both can contain data field, constructors, and methods but,  
      > > an abstract class can also contain abstract methods  
      > > (methods that are not implemented, only method headers)  
      > > and abstract classes can't be instantiated i.e. writing `new AbstractClassName()` will  
      > > cause a compilation-error.

> 28. Consider the following abstract class and its subclass.  
      > What **state** and **behavior** do you know for sure will be present in the subclass?  
      > How do you know?
      >     > ```java
>     > public abstract class Ordered {
>     >   private String[] data;
>     >
>     >   public void getElement(int i) { return data[i]; }
>     >   public abstract void arrange();
>     > }
>     >
>     > public class OrderedByLength extends Ordered { /* ... */ }
>     > ```
      >     >
      >     > The first concrete class that will extend the `Ordered` class must provide an implementation for the  
      > > `arrange()` method thus, `OrderedByLength` class must implement `arrange()` method  
      > > otherwise, a compilation-error will occur.  
      > > If in case `OrderedByLength` was also abstract class extending `Ordered` it can skip the  
      > > `arrange()` method implementation.  
      > > `getElement(int)` method is public thus inherited to `OrderedByLength` class.

> 29. Consider writing a program to be used to manage a collection of movies.  
      > There are three kinds of movies in the collection: `dramas`, `comedies`, and `documentaries`.  
      > The collector would like to keep track of each movie’s `title`, the `name` of its director,
      > and the `year` the movie was made.  
      > Some operations are to be implemented for all movies, and there will also be special  
      > operations for each of the three different kinds of movies.  
      > How would you design the class(es) to represent this system of movies?
      >     > One good design would be to have an abstract superclass named `Movie` with data such  
      > > as `name`, `director`, and `date`.  
      > > There would be subclasses of `Movie` to represent particular movie types,  
      > > such as `Drama`, `Comedy`, and `Documentary`.  
      > > Each subclass would store its specific data and behavior.
