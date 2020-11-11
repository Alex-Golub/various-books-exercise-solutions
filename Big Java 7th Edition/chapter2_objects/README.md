## Review Exercises

> • R2.1 In Java, objects are grouped into classes according to their behavior.  
> Would a `window` object and a `water heater` object belong to the same class  
> or to different classes? Why?
>
> > Different classes. `window` object has different behavior then `water heater` object.
> > e.g. `water heater` can have a `turn-on` method and this method is meaningless
> > for a `window` object.

> • R2.2 Some light bulbs use a glowing filament, others use a fluorescent gas.  
> If you consider a light bulb a Java object with an `illuminate` method, would you  
> need to know which kind of bulb it is?
>
> > No. Every light bulb can be `illuminated` thus we don't care how it is `illuminated`  
> > (i.e. its internal operation).
> > We just know that if `illuminate` is invoked on a light-bulb object must illuminate.

> • R2.3 Explain the difference between an `object` and a `class`.
>
> > `Class` is so called the "**_blueprint_**" from which objects are created.  
> > `Object` is an instance of some `Class`.  
> > From one `Class` one or more objects can be created.  
> > Objects are entities that can be manipulated by calling methods on them, while  
> > `Class` describes a set of objects with the same behavior.

> • R2.4 Give three examples of objects that belong to the `String` class.  
> Give an example of an object that belongs to the `PrintStream` class.  
> Name two methods that belong to the `String` class but not the `PrintStream` class.  
> Name a method of the `PrintStream` class that does not belong to the `String` class.
>
> > ```java
> > /** Objects that belong to the String class */
> > String name = "MrDrProfessor";
> > String programingLanguage = new String("Java");
> > String bookName = new String(new char[]{'b', 'i', 'g'});
> >
> > /** Object that belongs to the PrintStream class */
> > PrintStream stream = new PrintStream("filename.txt");
> > stream.append("is this real?");
> > stream.format("%s", "some String");
> >
> > /** String methods */
> > int len = name.length(); // return name character count length
> > name.substring(len / 2, len); // return half of a substring
> > ```

> • R2.5 What is the **_public interface of a class_**?  
> How does it differ from the implementation of a class?
>
> > public interface of a class meaning: which of this class methods are exposed to  
> > all other classes? Users of this object can invoke this public methods.  
> > class implementation is the actual code that is used to operate on objects.

> • R2.6 Declare and initialize variables for holding the `price` and the `description`  
> of an `article` that is available for sale.
>
> > ```java
> > double price = 9.99;
> > String description = "USA 2020 Election";
> > ```

> • R2.7 What is the value of `mystery` after this sequence of statements?
>
> > ```java
> > int mystery = 1;
> > mystery = 1 - 2 * mystery; // mystery == -1
> > mystery = mystery + 1; // mystery == 0
> > ```

> • R2.8 What is wrong with the following sequence of statements?
>
> > ```java
> > int mystery = 1;
> > mystery = mystery + 1;
> > int mystery = 1 - 2 * mystery; // declaring new int variable with the same name -> CE
> > ```

> •• R2.9 Explain the difference between the `=` symbol in Java and in mathematics.
>
> > = in Java used for assignment operation, while in mathematics it is used for equality
> >
> > ```java
> > int i = 5; // i will be set to the value of 5
> > boolean areEqual = i == 6; // will be checked if 5 is equal to 6 -> false
> > ```

> •• R2.10 Give an example of a method that has an argument of type `int`.
> Give an example of a method that has a return value of type `int`.
> Repeat for the type `String`.
>
> > ```java
> > public void setAge(int newAge) { age = newAge; }
> > public int getAge() { return age; }
> >
> > public void setName(String newName) { name = newName; }
> > public String getName() { return name; }
> > ```

> •• R2.11 Write Java statements that initialize a string message with "Hello"
> and then change it to "HELLO"..
>
> > ```java
> > String greeting = "hello";
> > greeting = greeting.toUpperCase();
> > greeting = greeting.replace("HELLO", "hello"); // •• R2.12
> >
> > String message = "Hello, World!";
> > message = message.replace(",", "").replace("!", ""); // •• R2.13
> > ```

> • R2.14 Explain the difference between an `object` and an `object variable`.
>
> > `Object` is the actual instance created from a `class`.  
> > Each object created (using **_new_** operator) is stored in memory at some  
> > memory address location. To be able to get it from this address we must save its
> > address upon creation. This address of an object is stored in `object variable`

> •• R2.15 Give the Java code for constructing an object of class `Rectangle`,  
> and for declaring an object variable of class Rectangle.
>
> > ```java
> > new Rectangle(5, 5, 10, 20); // constructing but its memory address is ignored
> > Rectangle box = new Rectangle(5, 5, 10, 20); // constructing and storing reference to it
> > ```

> •• R2.16 Give Java code for objects with the following descriptions:  
> a. A `rectangle` with center (100, 100) and all side lengths equal to 50  
> b. A `string` with the contents “Hello, Dave”  
> Create objects, not object variables.
>
> > ```java
> > new Rectangle(100, 100, 50, 50);
> > new String("Hello, Dave");
> >
> > /** •• R2.17 */
> > Rectangle box = new Rectangle(100, 100, 50, 50);
> > String greetDave = new String("Hello, Dave");
> > ```

> •• R2.18 Write a Java statement to initialize a variable `square` with a rectangle  
> object whose top-left corner is (10, 20) and whose sides all have length 40.  
> Then write a statement that replaces `square` with a rectangle of the same size and  
> top-left corner (20, 20).
>
> > ```java
> > Rectangle square = new Rectangle(10, 20, 40, 40);
> > square = new Rectangle(20, 20, 40, 40);
> > ```

> •• R2.19 Write Java statements that initialize two variables `square1` and `square2`  
> to refer to the same square with center (20, 20) and side length 40.
>
> > ```java
> > Rectangle square1 = new Rectangle(0, 0, 40, 40);
> > Rectangle square2 = square1;
> > ```

> •• R2.20 Find the errors in the following statements:
>
> > ```java
> > Rectangle r = (5, 10, 15, 20); // CE: new Rectangle absent
> > double width = Rectangle(5, 10, 15, 20).getWidth(); // CE: new operator absent
> > Rectangle r;
> > r.translate(15, 25); // CE: r hasn't been initialized
> > r = new Rectangle(); // CE: no type specified for r
> > r.translate("far, far away!"); // CE: r variable of unknown type
> > ```

> • R2.21 Name two accessor methods and two mutator methods of the `Rectangle` class.
>
> > `getWidth();` `getHeight();`  
> > `setSize(int height, int width);` `setLocation(int x, int y);`

> •• R2.22 Consult the API documentation to find methods for  
> • **_Concatenating two strings_**, that is, making a string consisting of the first  
> string, followed by the second string.  
> • **_Removing leading and trailing white space_** of a string.  
> • Converting a **_rectangle to a string_**.  
> • Computing the smallest rectangle that contains two given rectangles.  
> • Returning a **_random floating-point_** number.  
> For each method, list the class in which it is defined, the return type, the method  
> name, and the types of the arguments.
>
> > `String => public String concat(String str)`  
> > `String => public String trim()`  
> > `Rectangle => public String toString()`  
> > `Rectangle => public Rectangle getBounds()`  
> > `Math => public static double random()`

> • R2.23 Explain the difference between an `object` and an `object reference`.
>
> > We get an object reference when we invoke the constructor with the `new` operator.  
> > An object reference is a way for us to know where the create object is in the memory.

> • Graphics R2.24 What is the difference between a `console` application and a `graphical`  
> application?
>
> > Console application is when the program runs entirely in the command line window.
> > All interactively is done by the keyboard and output shows on the console.
> > Graphical enable the program to run on a `Frame` window which can present graphical
> > object.

> •• Graphics R2.25 Who calls the `paintComponent` method of a `component`?  
> When does the call to the `paintComponent` method occur?
>
> > `paintComponent` is called from the class that `extends` JComponent.
> > `paintComponent` That method is called whenever the component needs to be repainted.

> •• Graphics R2.26 Why does the argument of the `paintComponent` method have type  
> `Graphics` and not `Graphics2D`?
>
> > To be able to draw more sophisticated methods draw two-dimensional graphics  
> > objects, we need to use the `Graphics2D` class.
> > To be more "object oriented" drawing Java developers added `Graphics2D`.
> > `Graphics2D` class, which extends the `Graphics` class.

> •• Graphics R2.27 What is the purpose of a graphics context?
>
> > graphics give us the ability to draw shapes and then show them on a Frame object.

> • Graphics R2.29 How do you specify a text color?
>
> > ```java
> > Graphics2D g2 = (Graphics2D) g;
> > g.setColor(Color.Magenta);
> > ```
