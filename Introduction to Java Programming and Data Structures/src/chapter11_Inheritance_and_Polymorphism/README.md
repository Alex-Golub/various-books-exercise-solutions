# CheckPoint Answers

## Superclasses and Subclasses

### 11.2.1 True or false? A subclass is a subset of a superclass.

True. In object-oriented programming, a subclass is a class that inherits properties and behaviors from a superclass.  
A subclass is considered to be a specialized version of its superclass, inheriting all the characteristics of the superclass and potentially adding additional features specific to itself.  
Therefore, a subclass can be seen as a subset of a superclass.

### 11.2.2 What keyword do you use to define a subclass?

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

### 11.2.3 What is single inheritance? What is multiple inheritance? Does Java support multiple inheritance?

Single inheritance is a feature in object-oriented programming where a class can inherit from only one superclass.  
In single inheritance, a class can have only one direct parent class or superclass.

Multiple inheritance, on the other hand, is a feature where a class can inherit from multiple superclasses.  
This means that a class can have multiple direct parent classes.

Java supports single inheritance, but it does not support multiple inheritance.  
This design choice was made to simplify the language and avoid certain complexities and conflicts that can arise with multiple inheritance.  
However, Java provides an alternative mechanism for achieving similar functionality through interfaces, where a class can implement multiple interfaces to inherit behavior from multiple sources.

[Back to Top 👆](#table-of-contents)

## Using the `super` Keyword

### 11.3.1 What is the output of running the class C in (a)? What problem arises in compiling the program in (b)?

```java
class A {
    public A() {
        System.out.println("A's no-arg constructor is invoked");
    }
}

class B extends A {
}

public class C {
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

public class C {
    public static void main(String[] args) {
        B b = new B();
    }
}
```

The code snippet DOES NOT COMPILE because in `B()` compiler inserts an implicit call to `A()` which is not presented in `A`.

### 11.3.2 How does a subclass invoke its superclass’s constructor?

Using the `super` keyword. E.g. `super()` will invoke the empty constructor of the superclass.

### 11.3.3 True or false? When invoking a constructor from a subclass, its superclass’s no-arg constructor is always invoked.

False. Only if there is no explicit invocation of a constructor java will insert call to no-arg constructor of the superclass.  
If there is no no-arg constructor in the superclass and no other super call to superclass constructor is invoked there will be compilation error.

[Back to Top 👆](#table-of-contents)

## Overriding Methods

### 11.4.1 True or false? You can override a private method defined in a superclass.

False. You cannot override a private method defined in a superclass. Private methods are not accessible to subclasses and are not part of the subclass's contract.  
Therefore, you cannot override them.

### 11.4.2 True or false? You can override a static method defined in a superclass.

False. You cannot override a static method defined in a superclass.  
Static methods belong to the class itself, not to instances of the class.  
Subclasses cannot override static methods; they can only hide them by redefining them with the same name in the subclass.

### 11.4.3 How do you explicitly invoke a superclass’s constructor from a subclass?

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

### 11.4.4 How do you invoke an overridden superclass method from a subclass?

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

### 11.5.1 Identify the problems in the following code:

```java
public class Circle {
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

### 11.5.2 Explain the difference between method overloading and method overriding.

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

### 11.5.3 If a method in a subclass has the same signature as a method in its superclass with the same return type, is the method overridden or overloaded?

The method is overridden. Method overriding occurs when a subclass provides a different implementation of a method that is already defined in its superclass.  
The method in the subclass has the same signature (name, return type, and parameters) as the method in the superclass.

### 11.5.4 If a method in a subclass has the same signature as a method in its superclass with a different return type, will this be a problem?

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

### 11.5.5 If a method in a subclass has the same name as a method in its superclass with different parameter types, is the method overridden or overloaded?

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

### 11.5.6 What is the benefit of using the `@Override` annotation?

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

[Back to Top 👆](#table-of-contents)

## Polymorphism

### 11.7.1 What are the three pillars of object-oriented programming? What is polymorphism?

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

[Back to Top 👆](#table-of-contents)

## Dynamic Binding

### 11.8.1 What is dynamic binding?

Dynamic binding, also known as late binding, is a mechanism in object-oriented programming where the appropriate implementation of a method is determined at runtime based on the actual type of the object that the method is invoked upon.  
It allows for polymorphism, as different objects of related classes can have different implementations of the same method.  
Dynamic binding enables flexibility and extensibility in object-oriented systems.

### 11.8.2 Describe the difference between method matching and method binding.

- Method Matching: Method matching is the process of finding the appropriate method to invoke based on the method name, argument types, and the number of arguments provided in a method call.    
  It is done at compile-time and determines which method signature matches the given arguments.  
  Method overloading is an example of method matching, where different methods with the same name but different parameters are distinguished based on the arguments provided.

- Method Binding: Method binding is the process of connecting a method call to its implementation at runtime.  
  It determines which specific implementation of a method will be executed based on the actual type of the object that the method is invoked upon.  
  Method binding is done dynamically during runtime, enabling polymorphism and allowing objects of different classes to have different implementations of the same method.  
  Method overriding is an example of method binding.

### 11.8.3 Can you assign `new int[50]`, `new Integer[50]`, `new String[50]`, or `new Object[50]` into a variable of `Object[]` type?

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

### 11.8.4 What is wrong in the following code?

```java
public class Test {
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

### 11.8.5 Show the output of the following code:

```java
public class Test {
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
public class Test {
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

### 11.8.6 Show the output of following program: Is the no-arg constructor of Object invoked when `new A(3)` is invoked?

```java
public class Test {
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

### 11.8.7 Show the output of following program:

```java
public class Test {
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

[Back to Top 👆](#table-of-contents)

## Casting Objects and the `instanceof` Operator

[Back to Top 👆](#table-of-contents)

## The Object’s `boolean equals(Object obj)` Method

[Back to Top 👆](#table-of-contents)

## The `ArrayList<T>` Class

[Back to Top 👆](#table-of-contents)

## Useful Methods for Lists

[Back to Top 👆](#table-of-contents)

## Case Study: A Custom Stack Class

[Back to Top 👆](#table-of-contents)

## The `protected` Data and Methods

[Back to Top 👆](#table-of-contents)

## Preventing Extending and Overriding

[Back to Top 👆](#table-of-contents)
