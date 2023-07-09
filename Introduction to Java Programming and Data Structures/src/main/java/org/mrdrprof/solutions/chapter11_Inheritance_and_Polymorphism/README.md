# CheckPoint Answers

* [CheckPoint Answers](#checkpoint-answers)
  * [Superclasses and Subclasses](#superclasses-and-subclasses)
    * [11.2.1](#1121)
    * [11.2.2](#1122)
    * [11.2.3](#1123)
  * [Using the `super` Keyword](#using-the-super-keyword)
    * [11.3.1](#1131)
    * [11.3.2](#1132)
    * [11.3.3](#1133)
  * [Overriding Methods](#overriding-methods)
    * [11.4.1](#1141)
    * [11.4.2](#1142)
    * [11.4.3](#1143)
    * [11.4.4](#1144)
  * [Overriding vs. Overloading](#overriding-vs-overloading)
    * [11.5.1](#1151)
    * [11.5.2](#1152)
    * [11.5.3](#1153)
    * [11.5.4](#1154)
    * [11.5.5](#1155)
    * [11.5.6](#1156)
  * [Polymorphism](#polymorphism)
    * [11.7.1](#1171)
  * [Dynamic Binding](#dynamic-binding)
    * [11.8.1](#1181)
    * [11.8.2](#1182)
    * [11.8.3](#1183)
    * [11.8.4](#1184)
    * [11.8.5](#1185)
    * [11.8.6](#1186)
    * [11.8.7](#1187)
  * [Casting Objects and the `instanceof` Operator](#casting-objects-and-the-instanceof-operator)
    * [11.9.1](#1191)
    * [11.9.2](#1192)
    * [11.9.3](#1193)
    * [11.9.4](#1194)
  * [The Object’s `boolean equals(Object obj)` Method](#the-objects-boolean-equalsobject-obj-method)
    * [11.10.1](#11101)
  * [The `ArrayList<T>` Class](#the-arraylistt-class)
    * [11.11.1](#11111)
    * [11.11.2](#11112)
    * [11.11.3](#11113)
    * [11.11.4](#11114)
    * [11.11.5](#11115-)
  * [Useful Methods for Lists](#useful-methods-for-lists)
    * [11.12.1](#11121-)
    * [11.12.2](#11122-)
  * [Case Study: A Custom Stack Class](#case-study-a-custom-stack-class)
    * [11.13.1](#11131)
  * [The `protected` Data and Methods](#the-protected-data-and-methods)
    * [11.14.1](#11141)
    * [11.14.2](#11142)
    * [11.14.3](#11143)
    * [11.14.4](#11144)
  * [Preventing Extending and Overriding](#preventing-extending-and-overriding)
    * [11.15.1](#11151)
    * [11.15.2](#11152)

## Superclasses and Subclasses

### 11.2.1

> True or false? A subclass is a subset of a superclass.

True. In object-oriented programming, a subclass is a class that inherits properties and behaviors from a superclass.  
A subclass is considered to be a specialized version of its superclass, inheriting all the characteristics of the superclass and potentially adding additional features specific to itself.  
Therefore, a subclass can be seen as a subset of a superclass.

### 11.2.2

> What keyword do you use to define a subclass?

In Java, the `extends` keyword is used to define a subclass. When defining a class, the `extends` keyword is followed by the name of the superclass that the subclass is inheriting from.

Example:

```java
class Superclass {
    // superclass implementation
}

class Subclass extends Superclass {
    // subclass implementation
}
```

In the above example, the `Subclass` is defined by using the `extends` keyword followed by the name of the `Superclass` it is inheriting from.

### 11.2.3

> What is single inheritance? What is multiple inheritance? Does Java support multiple inheritance?

Single inheritance is a feature in object-oriented programming where a class can inherit from only one superclass.  
In single inheritance, a class can have only one direct parent class or superclass.

Multiple inheritance, on the other hand, is a feature where a class can inherit from multiple superclasses.  
This means that a class can have multiple direct parent classes.

Java supports single inheritance, but it does not support multiple inheritance.  
This design choice was made to simplify the language and avoid certain complexities and conflicts that can arise with multiple inheritance.  
However, Java provides an alternative mechanism for achieving similar functionality through interfaces, where a class can implement multiple interfaces to inherit behavior from multiple sources.

[Back to Top 👆](#checkpoint-answers)

## Using the `super` Keyword

### 11.3.1

> What is the output of running the class C in (a)? What problem arises in compiling the program in (b)?

```java
class A {
    public A() {
        System.out.println("A's no-arg constructor is invoked");
    }
}

class B extends A {
}

class C {
    public static void main(String[] args) {
        B b = new B();
    }
}
```

The string `A's no-arg constructor is invoked` is printed to the console.  
Invoking `B()` the compiler implicitly inserts invocation to the superclass of B which is `super()`.

```java
class A {
    public A(int x) {
    }
}

class B extends A {
    public B() {
    }
}

class C {
    public static void main(String[] args) {
        B b = new B();
    }
}
```

The code snippet DOES NOT COMPILE because in `B()` compiler inserts an implicit call to `A()` which is not presented in `A`.

### 11.3.2

> How does a subclass invoke its superclass’s constructor?

Using the `super` keyword. E.g. `super()` will invoke the empty constructor of the superclass.

### 11.3.3

> True or false? When invoking a constructor from a subclass, its superclass’s no-arg constructor is always invoked.

False. Only if there is no explicit invocation of a constructor java will insert call to no-arg constructor of the superclass.  
If there is no no-arg constructor in the superclass and no other super call to superclass constructor is invoked there will be compilation error.

[Back to Top 👆](#checkpoint-answers)

## Overriding Methods

### 11.4.1

> True or false? You can override a private method defined in a superclass.

False. You cannot override a private method defined in a superclass. Private methods are not accessible to subclasses and are not part of the subclass's contract.  
Therefore, you cannot override them.

### 11.4.2

> True or false? You can override a static method defined in a superclass.

False. You cannot override a static method defined in a superclass.  
Static methods belong to the class itself, not to instances of the class.  
Subclasses cannot override static methods; they can only hide them by redefining them with the same name in the subclass.

### 11.4.3

> How do you explicitly invoke a superclass’s constructor from a subclass?

To explicitly invoke a superclass's constructor from a subclass, you can use the `super()` keyword followed by the appropriate constructor arguments.  
This allows you to call a specific constructor of the superclass within the subclass's constructor.

Example:

```java
class Superclass {
    public Superclass(int value) {
        // constructor logic
    }
}

class Subclass extends Superclass {
    public Subclass(int value) {
        super(value); // invoking superclass constructor
        // subclass constructor logic
    }
}
```

In the above example, the `super(value)` call in the `Subclass` constructor explicitly invokes the constructor of the `Superclass` with the provided argument.

### 11.4.4

> How do you invoke an overridden superclass method from a subclass?

To invoke an overridden superclass method from a subclass, you can use the `super` keyword followed by the method name and any necessary arguments.  
This allows you to call the superclass's implementation of the method within the subclass.

Example:

```java
class Superclass {
    public void display() {
        System.out.println("Superclass display");
    }
}

class Subclass extends Superclass {
    @Override
    public void display() {
        super.display(); // invoking superclass method
        System.out.println("Subclass display");
    }
}
```

In the above example, the `super.display()` call within the `Subclass` invokes the `display()` method of the superclass.  
This allows the subclass to execute the superclass's implementation before adding its own logic.

## Overriding vs. Overloading

### 11.5.1

> Identify the problems in the following code:

```java
class Circle {
    private double radius;

    public Circle(double radius) {
        radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}

class B extends Circle {
    private double length;

    B(double radius, double length) {
        Circle(radius); // DOES NOT COMPILE, should be super(radius)
        length = length; // this.length = length;
    }

    @Override
    public double getArea() {
        return getArea() * length; // recursive call to this method - StackOverFlowException at runtime
    }
}
```

### 11.5.2

> Explain the difference between method overloading and method overriding.

Method overloading is when multiple methods in the same class have the same name but different parameters.  
The methods are differentiated based on the number, types, or order of the parameters.

Method overriding is when a subclass provides a different implementation of a method that is already defined in its superclass.  
The method in the subclass has the same name, return type, and parameters as the method in the superclass.

Example of method overloading:

```java
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

Example of method overriding:

```java
class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog is barking");
    }
}
```

### 11.5.3

> If a method in a subclass has the same signature as a method in its superclass with the same return type, is the method overridden or overloaded?

The method is overridden. Method overriding occurs when a subclass provides a different implementation of a method that is already defined in its superclass.  
The method in the subclass has the same signature (name, return type, and parameters) as the method in the superclass.

### 11.5.4

> If a method in a subclass has the same signature as a method in its superclass with a different return type, will this be a problem?

Yes, it will be a problem. Method overriding requires the method in the subclass to have the same return type (or a subtype) as the method in the superclass.  
If the return type is different, it will result in a compilation error.

Example:

```java
class Superclass {
    public int getValue() {
        return 10;
    }
}

class Subclass extends Superclass {
    public double getValue() { // Compilation error: Return type is different
        return 10.5;
    }
}
```

### 11.5.5

> If a method in a subclass has the same name as a method in its superclass with different parameter types, is the method overridden or overloaded?

The method is overloaded. Method overloading occurs when multiple methods in the same class have the same name but different parameters.  
The methods are differentiated based on the number, types, or order of the parameters.

Example:

```java
class Superclass {
    public void display(int a) {
        System.out.println("Superclass display: " + a);
    }
}

class Subclass extends Superclass {
    public void display(String str) {
        System.out.println("Subclass display: " + str);
    }
}
```

### 11.5.6

> What is the benefit of using the `@Override` annotation?

The `@Override` annotation is used to indicate that a method in a subclass is intended to override a method in its superclass.  
It is not mandatory, but it provides several benefits:

1. It helps catch errors at compile-time: If the annotated method does not override a method in the superclass, the compiler will generate an error.
2. It enhances code readability: The `@Override` annotation makes the code more explicit and self-documenting, indicating that the method is intended to override a superclass method.
3. It improves code maintainability: By using the `@Override` annotation, it becomes easier for developers to identify overridden methods and understand the class hierarchy.

Example:

```java
class Superclass {
    public void display

            () {
        System.out.println("Superclass display");
    }
}

class Subclass extends Superclass {
    @Override
    public void display() {
        System.out.println("Subclass display");
    }
}
```

In the above example, the `@Override` annotation ensures that the `display()` method in the `Subclass` correctly overrides the `display()` method in the `Superclass`.  
If there is any mistake in method signature or name, the compiler will generate an error.

[Back to Top 👆](#checkpoint-answers)

## Polymorphism

### 11.7.1

> What are the three pillars of object-oriented programming? What is polymorphism?

The three pillars of object-oriented programming are:

1. Encapsulation: Encapsulation is the process of bundling data and methods that operate on that data within a single unit called a class.  
   It provides the concept of data hiding, where the internal representation and functionality of an object are hidden from the outside world, and access to the object's data and behavior is controlled through public interfaces.

2. Inheritance: Inheritance is a mechanism that allows a class to inherit properties and behavior from another class called a superclass or base class.  
   It enables code reuse and the creation of a hierarchical relationship between classes.   
   A subclass inherits the attributes and methods of its superclass, allowing it to extend or override the inherited functionality.

3. Polymorphism: Polymorphism is the ability of objects of different classes to be treated as objects of a common superclass.  
   It allows objects to be represented in different forms or types and enables methods to be invoked based on the actual type of the object at runtime.  
   Polymorphism provides flexibility, code reusability, and dynamic behavior based on the specific object being referred to.

Polymorphism refers to the concept of having multiple forms or behaviors based on the context or the type of the object.  
In the context of object-oriented programming, polymorphism allows an object to take on different forms and respond to method calls based on its actual type or the type of its references.  
It enables code to be written in a more generic and flexible manner, where the same code can be used to operate on objects of different classes as long as they share a common superclass or interface.  
Polymorphism enhances code modularity, extensibility, and allows for dynamic binding of methods at runtime.

[Back to Top 👆](#checkpoint-answers)

## Dynamic Binding

### 11.8.1

> What is dynamic binding?

Dynamic binding, also known as late binding, is a mechanism in object-oriented programming where the appropriate implementation of a method is determined at runtime based on the actual type of the object that the method is invoked upon.  
It allows for polymorphism, as different objects of related classes can have different implementations of the same method.  
Dynamic binding enables flexibility and extensibility in object-oriented systems.

### 11.8.2

> Describe the difference between method matching and method binding.

- Method Matching: Method matching is the process of finding the appropriate method to invoke based on the method name, argument types, and the number of arguments provided in a method call.    
  It is done at compile-time and determines which method signature matches the given arguments.  
  Method overloading is an example of method matching, where different methods with the same name but different parameters are distinguished based on the arguments provided.

- Method Binding: Method binding is the process of connecting a method call to its implementation at runtime.  
  It determines which specific implementation of a method will be executed based on the actual type of the object that the method is invoked upon.  
  Method binding is done dynamically during runtime, enabling polymorphism and allowing objects of different classes to have different implementations of the same method.  
  Method overriding is an example of method binding.

### 11.8.3

> Can you assign `new int[50]`, `new Integer[50]`, `new String[50]`, or `new Object[50]` into a variable of `Object[]` type?

No, you can only assign `new Integer[50]`, `new String[50]`, or `new Object[50]` into a variable of `Object[]` type.

The reason is that arrays in Java have a covariant type relationship, meaning an array of a subtype can be assigned to a variable of a supertype.  
However, arrays of primitive types, such as `int[]`, do not have the same type relationship with arrays of reference types, such as `Object[]`.  
Therefore, you cannot directly assign `new int[50]` (or any other primitive array) into a variable of `Object[]` type.

Here's an example to illustrate this:

```java
class Test {
    public static void main(String[] args) {
        Object[] objectArray;
        objectArray = new Integer[50];  // Valid assignment
        objectArray = new String[50];   // Valid assignment
        objectArray = new Object[50];   // Valid assignment

        objectArray = new int[50];      // Invalid assignment
    }
}
```

In the above code, assigning `new int[50]` to `objectArray` would result in a compilation error because `int[]` is not a subtype of `Object[]`.

### 11.8.4

> What is wrong in the following code?

```java
class Test {
    public static void main(String[] args) {
        Integer[] list1 = { 12, 24, 55, 1 };
        Double[] list2 = { 12.4, 24.0, 55.2, 1.0 };
        int[] list3 = { 1, 2, 3 };
        printArray(list1);
        printArray(list2);
        printArray(list3); // DOES NOT COMPILE, expected: Object[] provided: int[]
    }

    public static void printArray(Object[] list) {
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
```

### 11.8.5

> Show the output of the following code:

```java
class Test {
    public static void main(String[] args) {
        new Person().printPerson();
        new Student().printPerson();
    }
}

class Student extends Person {
    @Override
    public String getInfo() {
        return "Student";
    }
}

class Person {
    public String getInfo() {
        return "Person";
    }

    public void printPerson() {
        System.out.println(getInfo());
    }
}
```

```text
Person
Student
```

```java
class Test {
    public static void main(String[] args) {
        new Person().printPerson();
        new Student().printPerson();
    }
}

class Student extends Person {
    private String getInfo() {
        return "Student";
    }
}

class Person {
    private String getInfo() {
        return "Person";
    }

    public void printPerson() {
        System.out.println(getInfo());
    }
}
```

```text
Person
Person
```

### 11.8.6

> Show the output of following program: Is the no-arg constructor of Object invoked when `new A(3)` is invoked?

```java
class Test {
    public static void main(String[] args) {
        A a = new A(3);
    }
}

class A extends B {
    public A(int t) {
//        super(); // is implicitly placed by the compiler
        System.out.println("A's constructor is invoked");
    }
}

class B {
    public B() {
        System.out.println("B's constructor is invoked");
    }
}
```

```text
B's constructor is invoked
A's constructor is invoked
```

### 11.8.7

> Show the output of following program:

```java
class Test {
    public static void main(String[] args) {
        new A();
        new B();
    }
}

class A {
    int i = 7;

    public A() {
        setI(20);
        System.out.println("i from A is " + i);
    }

    public void setI(int i) {
        this.i = 2 * i;
    }
}

class B extends A {
    public B() {
        System.out.println("i from B is " + i);
    }

    public void setI(int i) {
        this.i = 3 * i;
    }
}
```

```text
i from A is 20
i from A is 60
i from B is 60
```

[Back to Top 👆](#checkpoint-answers)

## Casting Objects and the `instanceof` Operator

### 11.9.1

> Indicate true or false for the following statements:

a. True. Casting an instance of a subclass to a superclass (upcasting) is always successful because a subclass is a specialized type of its superclass. The superclass reference can hold the subclass object without any issues.

b. False. Casting an instance of a superclass to a subclass (downcasting) is not always successful. It requires explicit casting and can only be done if the actual object being referred to is an instance of the subclass. If the object is not an instance of the subclass, a runtime error called `ClassCastException` will occur. Therefore, downcasting should be used cautiously, and it's a good practice to check the object's type before attempting downcasting using the `instanceof` operator.

Here are code examples demonstrating casting between superclass and subclass instances in Java 17:

a. Casting an instance of a subclass to a superclass (upcasting):

```java
class Superclass {
    public void superClassMethod() {
        System.out.println("Superclass method");
    }
}

class Subclass extends Superclass {
    public void subClassMethod() {
        System.out.println("Subclass method");
    }
}

class Main {
    public static void main(String[] args) {
        Subclass obj = new Subclass();
        Superclass superObj = obj; // Upcasting

        superObj.superClassMethod(); // Accessing superclass method
        // superObj.subClassMethod(); // Compilation error - Cannot access subclass-specific method
    }
}
```

b. Attempting to cast an instance of a superclass to a subclass (downcasting):

```java
class Superclass {
    public void superClassMethod() {
        System.out.println("Superclass method");
    }
}

class Subclass extends Superclass {
    public void subClassMethod() {
        System.out.println("Subclass method");
    }
}

class Main {
    public static void main(String[] args) {
        Superclass superObj = new Superclass();
        // Subclass subObj = superObj; // Compilation error - Cannot directly cast superclass to subclass

        if (superObj instanceof Subclass) {
            Subclass subObj = (Subclass) superObj; // Downcasting with instanceof check

            subObj.superClassMethod(); // Accessing inherited superclass method
            subObj.subClassMethod(); // Accessing subclass-specific method
        }
    }
}
```

Note: In the second example, the `instanceof` operator is used to check if the `superObj` is an instance of the `Subclass` before attempting the downcasting. This is important to avoid the `ClassCastException` at runtime.

### 11.9.2

> For the GeometricObject and Circle classes in Listings 11.1 and 11.2, answer the following questions:

a. The following Boolean expressions would evaluate as:

- (`circle instanceof GeometricObject`) - True: Since Circle is a subclass of GeometricObject, an instance of Circle can be considered an instance of GeometricObject.
- (`object instanceof GeometricObject`) - True: The variable object is explicitly declared as a GeometricObject, so it is an instance of GeometricObject.
- (`circle instanceof Circle`) - True: The variable circle is explicitly declared as a Circle, so it is an instance of Circle.
- (`object instanceof Circle`) - False: The variable object is declared as a GeometricObject, not a Circle, so it is not an instance of Circle.

b. Yes, the following statements can be compiled:

```java
Circle circle = new Circle(5);
GeometricObject object = circle;
```

In this case, a Circle object is created using `new Circle(5)`, and it is assigned to the `circle` variable. Then, the `circle` object is assigned to the `object` variable, which is of type GeometricObject. This is valid because a Circle is a GeometricObject (due to inheritance), and you can assign a subclass instance to a superclass reference.

You are correct, and I apologize for the confusion. The statements in option c can be compiled without any compilation errors, but they will indeed throw a `ClassCastException` at runtime.

Here's the corrected explanation for option c:

c. The following statements can be compiled, but they will throw a `ClassCastException` at runtime:

```java
GeometricObject object = new GeometricObject();
Circle circle = (Circle) object;
```

In this case, a GeometricObject object is created using `new GeometricObject()`, and it is assigned to the `object` variable. Then, an attempt is made to downcast the `object` to the `circle` variable, which is explicitly declared as a Circle type. However, since the actual object created is a GeometricObject, not a Circle, the downcasting operation will result in a `ClassCastException` at runtime.

It's important to ensure that the object being casted is actually an instance of the target class (or a subclass of it) to avoid runtime errors. In this case, the `new GeometricObject()` creates an object of type GeometricObject, and it cannot be downcasted to a Circle successfully.

### 11.9.3

> Suppose `Fruit`, `Apple`, `Orange`, `GoldenDelicious`, and `McIntosh` are defined in the following inheritance hierarchy:

```java
class Fruit {
}

class Apple extends Fruit {
    void makeAppleCider() {
    }
}

class Orange extends Fruit {
    void makeOrangeJuice() {
    }
}

class GoldenDelicious extends Apple {
}

class McIntosh extends Apple {
}

class Test {
    public static void main(String[] args) {
        Fruit fruit = new GoldenDelicious();
        Orange orange = new Orange();

        System.out.println(fruit instanceof Fruit);           // => true
        System.out.println(fruit instanceof Orange);          // => false
        System.out.println(fruit instanceof Apple);           // => true
        System.out.println(fruit instanceof GoldenDelicious); // => true
        System.out.println(fruit instanceof McIntosh);        // => false
        System.out.println(orange instanceof Orange);         // => true
        System.out.println(orange instanceof Fruit);          // => false
        System.out.println(orange instanceof Apple);          // => Inconvertible types; cannot cast 'Orange' to 'Apple'
        
        // i. Suppose the method makeAppleCider is defined in the Apple class. Can Fruit invoke this method? Can orange invoke this method?
        // j. Suppose the method makeOrangeJuice is defined in the Orange class. Can orange invoke this method? Can Fruit invoke this method?
        
        Orange p = new Apple();   // legal? => false
        McIntosh p = new Apple(); // legal? => false
        Apple p = new McIntosh(); // legal? => true
    }
}
```

i. Suppose the method `makeAppleCider` is defined in the Apple class. Can Fruit invoke this method? Can orange invoke this method?

No, the Fruit class cannot invoke the `makeAppleCider` method because it is not defined in the Fruit class or any of its superclasses. The `makeAppleCider` method is specific to the Apple class and its subclasses. Therefore, neither the Fruit class nor the Orange class can invoke this method.

```java
Fruit fruit = new GoldenDelicious();
fruit.makeAppleCider(); // This will result in a compilation error
```

```java
Orange orange = new Orange();
orange.makeAppleCider(); // This will result in a compilation error
```

ii. Suppose the method `makeOrangeJuice` is defined in the Orange class. Can orange invoke this method? Can Fruit invoke this method?

Yes, the Orange class can invoke the `makeOrangeJuice` method as it is defined in the Orange class itself. Since the `orange` variable is of type Orange, it can directly invoke the `makeOrangeJuice` method.

```java
Orange orange = new Orange();
orange.makeOrangeJuice(); // This is valid and will execute the makeOrangeJuice method
```

However, the Fruit class cannot directly invoke the `makeOrangeJuice` method because it is not defined in the Fruit class or any of its superclasses.

```java
Fruit fruit = new GoldenDelicious();
fruit.makeOrangeJuice(); // This will result in a compilation error
```

Note that the ability to invoke methods depends on the declared type of the variable, not the actual type of the object it references.

### 11.9.4

> What is wrong in the following code?

```java
class Test {
    public static void main(String[] args) {
        Object fruit = new Fruit();
        Object apple = (Apple) fruit;
    }
}

class Apple extends Fruit {
}

class Fruit {
}
```

```text
Exception in thread "main" java.lang.ClassCastException: class Fruit cannot be cast to class Apple (Fruit and Apple are in unnamed module of loader 'app')
	at Test.main(Test.java:4)
```

[Back to Top 👆](#checkpoint-answers)

## The Object’s `boolean equals(Object obj)` Method

### 11.10.1

> Does every object have a `toString` method and an `equals` method? Where do they come from? How are they used? Is it appropriate to override these methods?

Yes, every object in Java has a `toString` method and an `equals` method. These methods are inherited from the `Object` class, which is the root class for all classes in Java. The `Object` class provides default implementations for these methods, but they can be overridden in subclasses to provide custom behavior.

The `toString` method is used to obtain a string representation of an object. By default, the `toString` method in the `Object` class returns a string that includes the class name and the memory address of the object. However, it is common practice to override the `toString` method in subclasses to provide a more meaningful string representation that represents the state of the object.

The `equals` method is used to compare two objects for equality. The default implementation of the `equals` method in the `Object` class compares object references for equality, which means it checks if two references point to the same memory location. However, in many cases, it is necessary to override the `equals` method in subclasses to provide custom equality criteria. For example, in a `Person` class, you might override the `equals` method to compare the equality of the `id` field or other relevant attributes.

When working with objects, the `toString` method is commonly used to convert an object to a string representation for printing or logging purposes. The `equals` method is used to determine if two objects are considered equal based on the overridden criteria.

It is appropriate to override the `toString` and `equals` methods when the default implementations provided by the `Object` class are not sufficient for your specific class's behavior. By overriding these methods, you can define how your class should be represented as a string and how equality should be determined for instances of your class.

[Back to Top 👆](#checkpoint-answers)

## The `ArrayList<T>` Class

### 11.11.1

> How do you do the following?

```java
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.23);
        doubleList.add(0, 4.56);
        doubleList.add(7.89);
        System.out.println("doubleList = " + doubleList);
        System.out.printf("doubleList.size() = %d%n", doubleList.size());
        System.out.println("doubleList = " + doubleList);
        System.out.printf("doubleList.remove(Double.valueOf(1.23)) = %s%n", doubleList.remove(Double.valueOf(1.23)));
        System.out.println("doubleList = " + doubleList);
        System.out.println("doubleList.remove(doubleList.size() - 1) = " + doubleList.remove(doubleList.size() - 1));
        System.out.println("doubleList = " + doubleList);
        System.out.println("doubleList.contains(1.23) = " + doubleList.contains(1.23));
        System.out.println("doubleList = " + doubleList);
        System.out.println("doubleList.get(0) = " + doubleList.get(0));
    }
}
```

```text
doubleList = [4.56, 1.23, 7.89]
doubleList.size() = 3
doubleList = [4.56, 1.23, 7.89]
doubleList.remove(Double.valueOf(1.23)) = true
doubleList = [4.56, 7.89]
doubleList.remove(doubleList.size() - 1) = 7.89
doubleList = [4.56]
doubleList.contains(1.23) = false
doubleList = [4.56]
doubleList.get(0) = 4.56
```

### 11.11.2

> Identify the errors in the following code.

```java
class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Denver"); // => ["Denver"]
        list.add("Austin"); // => ["Denver", "Austin"]
        list.add(new java.util.Date()); // DOES NOT COMPILE, expected String got Date
        String city = list.get(0);
        list.set(3, "Dallas");
        System.out.println(list.get(3));
    }
}
```

### 11.11.3

> Suppose the `ArrayList` list contains `{"Dallas", "Dallas", "Houston", "Dallas"}`.  
> What is the list after invoking `list.remove("Dallas")` one time?  
> Does the following code correctly remove all elements with value "`Dallas`" from the list? If not, correct the code.
> ```java
> for (int i = 0; i < list.size(); i++) {
>     list.remove("Dallas");
> }
> ```

`{"Dallas", "Houston", "Dallas"}` Only the first "Dallas" is removed.

```java
import java.util.ArrayList;
import java.util.List;

class RemoveAll {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Dallas", "Dallas", "Houston", "Dallas"));
        System.out.println("list = " + list); // => list = [Dallas, Dallas, Houston, Dallas]
        list.remove("Dallas");
        System.out.println("list = " + list); // => list = [Dallas, Houston, Dallas]
        list.removeIf("Dallas"::equals);
        System.out.println("list = " + list); // => list = [Houston]
    }
}
```

### 11.11.4

> Explain why the following code displays `[1, 3]` rather than `[2, 3]`.
> ```java
> List<Integer> list = new ArrayList<>();
> list.add(1);
> list.add(2);
> list.add(3);
> list.remove(1);
> System.out.println(list);
> ```
> How do you remove integer value 3 from the list?

In order to remove the integer value `3` from a list using the `remove` method, you should use the `remove(Object)` method instead of the `remove(int)` method.

The `remove(Object)` method removes the first occurrence of the specified object from the list by utilizing the `equals` method of that object for comparison.  
By passing `Integer.valueOf(3)` as the argument to `remove(Object)`, you are creating an `Integer` object representing the value `3`, and the `equals` method of `Integer` class will be used to find and remove the corresponding element from the list.

Here's an example usage:

```java
List<Integer> list = new ArrayList<>();
list.add(1);
list.add(2);
list.add(3);
list.add(4);

list.remove(Integer.valueOf(3)); // Removes the integer value 3 from the list

System.out.println(list); // Output: [1, 2, 4]
```

By using `Integer.valueOf(3)`, you ensure that the `equals` method is used for comparison, and the first occurrence of the element with a value of `3` is removed from the list.

### 11.11.5 

> Explain why the following code is wrong:
> ```java
> ArrayList<Double> list = new ArrayList<>();
> list.add(1);
> ```

This code DOES NOT COMPILE, incompatible types: `int` cannot be converted to `java.lang.Double`.  
It will work if you change it to `list.add(1.0)`.

[Back to Top 👆](#checkpoint-answers)

## Useful Methods for Lists

### 11.12.1 

> Correct errors in the following statements:
> ```java
> int[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
> ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
> ```

```java
Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
List<Integer> list = new ArrayList<>(Arrays.asList(array));
```

`Arrays.asList(T... t)`
This method acts as bridge between array-based and collection-based APIs, in combination with `Collection.toArray`.  
This method provides a way to wrap an existing array:
```java
Integer[] numbers = ...  ...
List<Integer> values = Arrays.asList(numbers);
```
This method also provides a convenient way to create a fixed-size list initialized to contain several elements:
`List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");`
The list returned by this method is modifiable.

### 11.12.2 

> Correct errors in the following statements:
> ```java
> int[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
> System.out.println(java.util.Collections.max(array));
> ```

```java
Integer[]array={3,5,95,4,15,34,3,6,5};
System.out.println(java.util.Collections.max(Arrays.asList(array)));
```

[Back to Top 👆](#checkpoint-answers)

## Case Study: A Custom Stack Class

### 11.13.1

> Write statements that create a [MyStack](MyStack.java) and add number 11 to the stack.

```java
class MyStackRunner {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(11);
        System.out.println("myStack.peek() = " + myStack.peek());
        System.out.println("myStack.getSize() = " + myStack.getSize());
        System.out.println("myStack.isEmpty() = " + myStack.isEmpty());
        System.out.println("myStack = " + myStack);
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack = " + myStack);
    }
}
```

```text
myStack.peek() = 11
myStack.getSize() = 1
myStack.isEmpty() = false
myStack = stack: [11]
myStack.pop() = 11
myStack = stack: []
```

[Back to Top 👆](#checkpoint-answers)

## The `protected` Data and Methods

### 11.14.1

> What modifier should you use on a class so a class in the same package can access it, but a class in a different package cannot access it?

To allow a class to be accessible within the same package but not accessible to classes in different packages, you should use the default (no modifier) access level.

By not specifying any access modifier, the class will have package-private visibility, also known as default access. This means that the class is accessible only within the same package and cannot be accessed by classes in different packages.

Here's an example:

```java
package com.example.package1;

class MyClass {
    // Code goes here
}
```

In this example, the class `MyClass` is declared without any access modifier, making it package-private. It can be accessed by other classes within the `com.example.package1` package, but not by classes in different packages.

If you want to restrict access to the class from outside the package, while still allowing subclasses to access it, you can use the `protected` access modifier. However, note that this would allow subclasses to access the class, regardless of the package they are in. If you specifically want to restrict access to classes in different packages, the default (package-private) access level is the appropriate choice.

### 11.14.2

> What modifier should you use so a class in a different package cannot access the class, but its subclasses in any package can access it?

Certainly! To access a protected field or method of a superclass from a subclass in a different package, follow these steps:

1. Create a superclass in one package with a protected field or method:

```java
package com.example.package1;

public class Superclass {
    protected String protectedField = "Hello, World!";

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }
}
```

1. Create a subclass in a different package that extends the superclass and accesses the protected field or method:

```java
package com.example.package2;

import com.example.package1.Superclass;

public class Subclass extends Superclass {
    public void accessProtected() {
        System.out.println(protectedField); // Accessing protected field from superclass
        protectedMethod(); // Accessing protected method from superclass
    }
}
```

In this example, the `Superclass` is defined in the `com.example.package1` package, and the `Subclass` is defined in the `com.example.package2` package. The `Subclass` extends the `Superclass` and can access the protected field and method inherited from the superclass.

The `accessProtected()` method in the `Subclass` demonstrates how to access the protected field and method. By using the `protected` modifier, the subclass is allowed to access these members inherited from the superclass, even though they are in different packages.

Please note that the `protected` members can only be accessed within subclasses or within the same package, not by other unrelated classes in different packages.

### 11.14.3

> In the following code, the classes A and B are in the same package.  
> If the question marks in (a) are replaced by blanks, can class B be compiled?  
> If the question marks are replaced by private, can class B be compiled?  
> If the question marks are replaced by protected, can class B be compiled?
>
> ```java
> package p1;
> 
> public class A {
> ________ int i;
> ________ void m() {
> ...
>     }
> }
> ```
>
> ```java
> package p1;
> 
> public class B extends A {
>     public void m1(String[] args) {
>         System.out.println(i);
>         m();
>     }
> }
> ```

If the question marks in (a) are replaced by blanks (default access modifier), class B can be compiled because both classes A and B are in the same package (p1).  
In this case, class B can access the package-private members of class A (i and m).

If the question marks are replaced by private, class B cannot be compiled because private members in class A are not accessible by class B, even if they are in the same package.  
The private members are restricted to the declaring class only.

If the question marks are replaced by protected, class B can be compiled because protected members in class A are accessible to its subclasses, even if they are in a different package. In this case, class B can inherit the protected member i and invoke the protected method m from class A.

To summarize:

- Using the default (blank) access modifier: Class B can access the package-private members of class A.
- Using the `private` access modifier: Class B cannot access the private members of class A.
- Using the `protected` access modifier: Class B can access the protected members of class A, allowing inheritance and access from subclasses.

Note that the access modifiers control the visibility of members outside the class, so they affect the compilation of class B.

### 11.14.4

> In the following code, the classes A and B are in different packages.  
> If the question marks in (a) are replaced by blanks, can class B be compiled?  
> If the question marks are replaced by private, can class B be compiled? If the question marks are replaced by protected, can class B be compiled?
> ```java
> package p1;
> 
> public class A {
> ________ int i;
> ________ void m() {
>     }
> }
> ```
>
> ```java
> package p2;
> 
> public class B extends A {
>     public void m1(String[] args) {
>         System.out.println(i);
>         m();
>     }
> }
> ```

If the question marks in (a) are replaced by blanks (default access modifier), class B cannot be compiled because the default access level allows access only within the same package. Since class A and class B are in different packages (p1 and p2 respectively), class B cannot access the package-private members of class A.

If the question marks are replaced by private, class B cannot be compiled either. Private members in class A are not accessible by any subclasses, regardless of whether they are in the same or different packages.

If the question marks are replaced by protected, class B can be compiled. Protected members in class A are accessible to its subclasses, even if they are in a different package. In this case, class B can inherit the protected member `i` and invoke the protected method `m` from class A.

To summarize:

- Using the default (blank) access modifier: Class B cannot access the package-private members of class A since they are in different packages.
- Using the `private` access modifier: Class B cannot access the private members of class A, regardless of package.
- Using the `protected` access modifier: Class B can access the protected members of class A, even if they are in different packages.

Note that the access modifiers control the visibility of members outside the class, so they affect the compilation of class B.

[Back to Top 👆](#checkpoint-answers)

## Preventing Extending and Overriding

### 11.15.1

> How do you prevent a class from being extended? How do you prevent a method from being overridden?

To prevent a class from being extended, you can use the `final` modifier. When a class is marked as `final`, it cannot be subclassed. Any attempt to extend a `final` class will result in a compilation error. Here's an example:

```java
public final class FinalClass {
    // Class implementation
}
```

In the above code, the class `FinalClass` is marked as `final`, so it cannot be extended by any other class.

To prevent a method from being overridden, you can use the `final` modifier on the method declaration. When a method is marked as `final`, it cannot be overridden by any subclass. Here's an example:

```java
public class ParentClass {
    public final void finalMethod() {
        // Method implementation
    }
}

public class ChildClass extends ParentClass {
    // Attempting to override finalMethod will result in a compilation error
    // as it is marked as final in the parent class
}
```

In the above code, the `finalMethod` in the `ParentClass` is marked as `final`, so it cannot be overridden in the `ChildClass` or any other subclass.

It's important to note that making a class `final` or a method `final` should be used with caution. It restricts the extensibility and flexibility of the code, so it should be applied judiciously based on the design and requirements of the program.

### 11.15.2

> Indicate true or false for the following statements:  
> a. A protected datum or method can be accessed by any class in the same package.  
> b. A protected datum or method can be accessed by any class in different packages.  
> c. A protected datum or method can be accessed by its subclasses in any package.  
> d. A final class can have instances.  
> e. A final class can be extended.  
> f. A final method can be overridden.

a. True. A protected datum or method can be accessed by any class in the same package.  
The protected access modifier allows access within the same package, including subclasses outside the package.

b. False. A protected datum or method cannot be accessed by any class in different packages unless the accessing class is a subclass of the class containing the protected member.

c. True. A protected datum or method can be accessed by its subclasses in any package.  
The protected access modifier allows access by subclasses, regardless of whether they are in the same package or a different package.

d. True. A final class can have instances.  
The final modifier applied to a class means that the class cannot be subclassed, but it can still be instantiated.

e. False. A final class cannot be extended.  
The final modifier applied to a class prevents it from being subclassed.  
Once a class is marked as `final`, it cannot be extended by any other class.

f. False. A final method cannot be overridden.  
The final modifier applied to a method means that it cannot be overridden by subclasses.  
Once a method is marked as final in a superclass, it cannot be modified or overridden in any subclass.

[Back to Top 👆](#checkpoint-answers)
