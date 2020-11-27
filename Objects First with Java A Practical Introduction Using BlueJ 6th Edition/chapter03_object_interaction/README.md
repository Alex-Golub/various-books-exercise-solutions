<h3 align="center"><mark><u>Concepts</u></mark></h3>

> **_Divide and Conquer_** - divide the problem into sub-problems, then again
> into sub-sub-problems, and so on, until the individual problems are small enough
> to be easy to deal with.
> Once we solve one of the sub-problems, we do not think about the details of that part
> any more, but treat the solution as a single building block for our next problem.

> **_Abstraction_** is the ability to ignore details of parts, to focus attention on a higher
> level of a problem. (_E.g._ car consists of so many parts that it is practically
> impossible for a single person to know every detail about every part at the same time.)

> **_Modularization_** is the process of dividing a whole into well-defined parts that can
> be built and examined separately, and that interact in well-defined ways.

> **_Classes define types_** - A class name can be used as the type for a variable.
> When a variable stores an object, the object is not stored in the variable directly,  
> but rather an **_object reference_** is stored in the variable.

> The **_class diagram_** shows the classes of an application and the relationships between them.  
> It gives information about the source code and presents the `static view` of a program.

> The **_object diagram_** shows the objects and their relationships at one moment in time during  
> the execution (`runtime`) of an application.  
> It gives information about objects at runtime and presents the `dynamic view` of a program.

> The **_primitive types_** in ,Java are the non-object types.  
> Types such as `boolean`, `byte`, `short`, `int`, `char`, `double`, and `long` are the most common  
> primitive types. Primitive values are stored directly in a variable.  
> _Primitive types have no methods_.

> **_Object creation._** Objects can create other objects, using the `new` operator.

> **_Overloading._** A class may contain more than one constructor, or more than one method of the  
> same name, as long as each has a _distinctive set of parameter types_.

> Methods can call other methods of the same class as part of their implementation.  
> This is called an **_internal method call_**.
> An internal method call does not have a variable name (reference) and a dot before the method name
> **_this_** keyword can be used to reference the current object.
> **_NOTE:_** instance methods can call static methods (i.e. class methods) and also
> read class variables (static attributes). But the opposite is not possible.
> static methods can't invoke non-static methods and read non-static variables.

> Methods can call methods of other objects using **_dot notation_**  
> `object_reference.methodName(parameter-list)`.
> This is called an **_external method call_**.

> **_name overloading_**—the same name being used for two different entities.  
> fields and the parameters are separate variables that exist independently of each other,  
> even though they share similar names. The definition originating in the closest enclosing  
> block will always be used.
> **_this_** refers to the current object. `this.from` refers to the `from` field in the current
> object.

---

<h3 align="center"><mark><u>Exercises Answers</u></mark></h3>

> **Exercise 3.2** At what time(s) can a class diagram change? How is it changed?
>
> > 1. If new class is added and other classes make use of it (an arrow will be pointed to  
> >    that new class).
> > 2. If one class is not using other class (arrow will be removed)

> **Exercise 3.3** At what time(s) can an object diagram change? How is it changed?
>
> > Adding/removing to an object another class variable.

> **Exercise 3.4** Write a definition of a field named `tutor` that can hold a reference  
> to an object of type `Instructor`.
>
> > ```java
> > private Instructor tutor;
> > ```

> **Exercise 3.6** What should you do each time you call _increment_ on `minutes` to decide  
> whether it has rolled over and whether _increment_ should therefore be called on  
> the `hours` object?
>
> > if `minutes.getValue() == 0` then `hour.increment()` should be invoked because `minutes`
> > has passed the rollover limit.

> **Exercise 3.7**
>
> > ```java
> > NumberDisplay nd = new NumberDisplay(6);
> > nd.getValue();   // => 0
> > nd.setValue(5);  // => 5
> > nd.increment();
> > nd.getValue();   // => 0
> > nd.setValue(-5); // => 0
> > nd.setValue(6);  // => 0
> > ```

> **Exercise 3.8** What error message do you see in the Code Pad if you type the following?
>
> > ```java
> > NumberDisplay.getValue(); // Error: non-static method getValue() cannot be referenced from a static context
> > ```
> >
> > We try to invoke `getValue()` using the class name i.e. we treat `getValue()` as class
> > method which clearly is not a `class method`, it is `instance method` which means,
> > to invoke it we must have an object of class `NumberDisplay` and with it we can invoke
> > `getValue()` e.g. `nd.getValue()`;

> **Exercise 3.9** What error message do you see in the Code Pad if you type the following?
>
> > ```java
> > nd.setValue(int 5); // Error: '.class' expected
> > nd.setValue(5);     // => correct answer
> > ```
> >
> > `setValue()` method signature is `setValue(int)` which means "it accepts an primitive type
> > `int` argument".
> > In this case we try to defined a number of type int rather then pass primitive value.

> **Exercise 3.10** What happens when the `setValue` method is called with an illegal value?  
> Is this a good solution?  
> Can you think of a better solution?
>
> > **_Solution 1:_** `setValue()` will do nothing if illegal value will be passed as argument.
> > It would be better to notify the user (with a message) that an illegal value has  
> > been passed. And values should be passed are between a range so he can  
> > insert valid values next time.
> > **_Solution 2:_** if value passed is `limit` or grater we can set the value to `limit - 1`
> > or if value passed is negative the value will be set to zero.

> **Exercise 3.11** What would happen if you replaced the "`>=`" operator in the
> test with "`>`" so that it reads
> `if((replacementValue > 0) && (replacementValue < limit))`
>
> > value range will be `[1, limit - 1]` means that we can't set the value to zero whice
> > clearly is not what we want.

> **Exercise 3.12** What would happen if you replaced the `&&` operator in the test  
> with `||` so that it reads
> `if((replacementValue >= 0) || (replacementValue < limit))`
>
> > E.g. our `NumberDisplay` object `limit` is 24, invoking `setValue(42);` will result
> > in assigning `limit` with 42 because the first logical expression will result in true
> > which evaluates all the expression to true causing un-intended result.

> **Exercise 3.13** Which of the following expressions return true?
>
> > ```java
> > !(4 < 5)                          // !(true) => false
> > !false                            // => true
> > (2 > 2) || ((4 == 4) && (1 < 0))  // false || (true && false) => false || false => false
> > (2 > 2) || (4 == 4) && (1 < 0)    // false || true && false => false || false => false
> > (34 != 33) && !false              // true && true => true
> > ```

> **Exercise 3.14** Write an expression using boolean variables `a` and `b` that  
> evaluates to true when `a` and `b` are either both `true` or both `false`.
>
> > ```java
> > a == b                 // solution 1
> > !(a ^ b)               // solution 2
> > (a && b) || (!a && !b) // solution 3
> > ```

> **Exercise 3.15** Write an expression using boolean variables `a` and `b` that  
> evaluates to true when only one of `a` and `b` is true, and that is false if  
> `a` and `b` are both false or both true.
>
> > ```java
> > a ^ b                  // solution 1
> > !(a == b)              // solution 2
> > (a || b) && (!a || !b) // solution 3
> > ```

> **Exercise 3.16** Consider the expression `(a && b)`.  
> Write an equivalent expression (one that evaluates to true at exactly the same  
> values for a and b) without using the `&&` operator.
>
> > ```java
> > !(!a || !b)
> > ```

> **Exercise 3.17** Does the `getDisplayValue` method work correctly in all circumstances?  
> What assumptions are made within it?  
> What happens if you create a number display with `limit` 800, for instance?
>
> > `getDisplayValue()` will work correctly because we assume that value will in the range
> > [0, limit - 1].
> > E.g. creating `NumberDisplay` object with limit of 800 will produce the String "800"
> > as expected.

> **Exercise 3.18** Is there any difference in the result of writing
> `return value + "";` rather than `return "" + value;` in the `getDisplayValue` method?
>
> > No, there isn't any difference.
> > `"" + value` is the same as `value + ""`, the result will be a String instance in both
> > cases.
> >
> > ```java
> > int a = 1, b = 2;
> > "@" + 1 + 2;   // => @12
> > 1 + "@" + 2;   // => 1@2
> > 1 + 2 + "@";   // => 3@
> > "@" + (1 + 2); // => @3
> > ```

> **Exercise 3.19** In Exercise 2.79 you were asked to investigate (among other things)  
> the expressions `9 + 3 + "cat"` and `"cat" + 3 + 9`
> Predict, and then test, the result of these two expressions again. (Did they
> surprise you?) Explain why the results are what they are.
>
> > `String + other => String` > > `other + String => String`
> >
> > ```java
> > 9 + 3 + "cat"; // => 12cat
> > "cat" + 3 + 9; // => cat39
> > ```

> **Exercise 3.20** Explain the modulo (`%`) operator.
>
> > % operator will give back the reminder of of a division operation.
> > `n = q * d + r, 0 <= r < a` where q - quotient, r - reminder, d - divisor
> > % operator works for integer division (positive and negative)
> > and also for floating-point values.
> > **_NOTE:_** if dividend is negative then result will be negative remainder.
> > To work with positive reminders when dividend is negative we can use `Math.floorMod(int, int)`
> > or apply negative reminder e.g. -5 % 3 == -2 + 3 = 1

> **Exercise 3.21** What is the result of the expression (8 % 3) `== 2`?

> **Exercise 3.22** Try out the expression `(8 % 3)` in the Code Pad.  
> Try other numbers.  
> What happens when you use the modulo operator with negative numbers?
>
> > If dividend is negative we will get a negative result (negative reminder).
> > To convert it back to positive we should add the divisor.
> > E.g. 7 / 4 => q = 1, r = 3
> > (12 - 5) / 4 => r = -5 + 8 = 3

> **Exercise 3.23** What are all possible results of the expression **(n % 5)**, where
> n is a positive integer variable?
>
> > n % 5 => n = 5 \* q + r
> > => 0 <= r < 5
> > r ϵ [0, 4]

> **Exercise 3.24** What are all possible results of the expression **(n % m)**, where
> n and m are positive integer variables?
>
> > `res ϵ [0, m - 1]`

> **Exercise 3.25** Explain in detail how the `increment()` method works.
>
> > Each time `increment()` is invoked `NumberDisplay value` attribute will be incremented by 1  
> > only if the next value of it is less then `limit`.  
> > To achieve it % operator is used. If next value is limit then value is assigned 0.

> **Exercise 3.26** Rewrite the `increment` method without the modulo operator,  
> using an `if-statement`. Which solution is better?
>
> > Using % is better.
> >
> > ```java
> > public void increment() {
> >   if (value + 1 >= limit) value = 0;
> >   else value += 1;
> > }
> > ```

> **Exercise 3.27** Can you work out why it starts at that particular time?
>
> > `new ClockDisplay();` was used to create an instance of `ClockDisplay`.
> > Looking within the code we can see that the empty constructor creates two
> > instances of `NumberDisplay` which in its turn sets is initial values to zero.
> > Thus invoking `getTIme()` on `ClockDisplay()` will invoked the `getDisplayValue()` of each
> > of `NumberDisplay` objects which are zero at the beginning.

> **Exercise 3.29** How many times would you need to call the `timeTick` method
> on a newly created `ClockDisplay` object to make its time reach 01:00?
> How else could you make it display that time?
>
> > New instance of `ClockDisplay` starts at 00:00. We should call `timeTick` 60 times
> > To see the result 01:00.
> > Another way to change the `ClockDisplay` time is to use `setTime(int, int)` method
> > and set the time manually like so: `clock.setTime(1, 0);` upon invoking `getTime`  
> > we will get the string `"01:00"` back.

> **Exercise 3.30** Write ,Java statements that define a variable named `window` of
> type `Rectangle`, and then create a `Rectangle` object and assign it to that variable.  
> The `Rectangle` constructor has two `int` parameters.
>
> > ```java
> > Rectangle window = new Rectangle(5, 7); // assuming Rectangle(int width, int height)
> > ```

> **Exercise 3.31** Look at the second constructor in `ClockDisplay`’s source code.
> Explain what it does and how it does it.
>
> > ```java
> > /** Create instance of ClockDisplay with manual values for hour and minutes */
> > public ClockDisplay(int hour, int minute) {
> >  hours = new NumberDisplay(24);
> >  minutes = new NumberDisplay(60);
> >  setTime(hour, minute);
> > }
> >
> > /** Set current CLockDisplay hour and minutes objects with passed in hour and minute values */
> > public void setTime(int hour, int minute) {
> >  hours.setValue(hour);
> >  minutes.setValue(minute);
> >  updateDisplay();
> > }
> > ```

> **Exercise 3.32** Identify the similarities and differences between the two constructors.  
> Why is there no call to `updateDisplay` in the second constructor, for instance?
>
> > Both constructors create the same `hours` and `minutes` objects (repeating code)
> > 1st constructor is invoking `updateDisplay` right away because starting values
> > of `hours` and `minutes` are zero and there is no need the set them up with zero values.
> > On the other hand, 2nd constructor first must call `setTIme(int, int)` because the starting
> > time is different then the default ("00:00") thus in `setTIme(int, int)` `hours` and `minutes`  
> > are set to the passed-in `hour` and `minute` values to that constructor and only then `updateDisplay`  
> > is invoked (from `setTIme(int, int)`)
> >
> > ```java
> > public ClockDisplay() {
> >   hours = new NumberDisplay(24);
> >   minutes = new NumberDisplay(60);
> >   updateDisplay();
> > }
> >
> > public ClockDisplay(int hour, int minute) {
> >   hours = new NumberDisplay(24);
> >   minutes = new NumberDisplay(60);
> >   setTime(hour, minute);
> > }
> > ```

> **Exercise 3.33** Given a variable `Printer p1;` which currently holds a reference to  
> a printer object, and two methods inside the `Printer` class with the headers:
> `public void print(String filename, boolean doubleSided)`  
> `public int getStatus(int delay)`  
> write two possible calls to each of these methods.
>
> > ```java
> > p1.print("homework.txt", true);
> > System.out.println("Printer status: " + p1.getStatus(1000);
> > ```

> **Exercise 3.34** Open the house project from Chapter 1 and review the `Picture` class.
> What types of object are created by the constructor of `Picture`?
>
> > `Square, Triangle, Circle` and `Person`
> >
> > ```java
> > public Picture() {
> >   wall = new Square();
> >   window = new Square();
> >   roof = new Triangle();
> >   sun = new Circle();
> >   sun2 = new Circle();
> >   person = new Person();
> >   drawn = false;
> > }
> > ```

> **Exercise 3.35** List all of the **_external method_** calls that are made in the `draw`
> method of `Picture` on the `Triangle` object called `roof`.
>
> > `changeSize(int, int), moveHorizontal(int), moveVertical(int), makeVisible()`
> >
> > ```java
> > public void draw() {
> >   if (!drawn) {
> >     // ...
> >
> >     roof.changeSize(60, 180);
> >     roof.moveHorizontal(20);
> >     roof.moveVertical(-60);
> >     roof.makeVisible();
> >
> >     // ...
> >   }
> > }
> > ```

> **Exercise 3.36** Does the `Picture` class contain any **_internal method_** calls?
>
> > No. All methods calls are external.

> **Exercise 3.37** Remove the following two statements from the draw method of Picture:
> `window.changeColor("black");`  
> `sun.changeColor("yellow");`  
> and make the color setting, instead, via a single call to an internal method called
> `setColor` (which you need to create).
>
> > ```java
> > // every place within Picture class where
> > // window.changeColor("black"); and sun.changeColor("yellow");
> > // are written change it to setColor();
> >
> > public void setColor() {
> >   window.changeColor("black");
> >   sun.changeColor("yellow");
> > }
> > ```

> **Exercise 3.38** Challenge exercise Change the clock from a 24-hour clock
> to a 12-hour clock.
>
> > See `clock_12_hour` package for solution

> **Exercise 3.40** Assume a class `Tree` has a field of type `Triangle` called  
> `leaves` and a field of type `Square` called `trunk`. The constructor of `Tree` takes
> no parameters and its constructor creates the `Triangle` and `Square` objects for
> its fields. Using the figures project from Chapter 1, create a simple `Tree` class to
> fit this description.  
> You do not need to define any methods in the class and the shapes do not have to be  
> made visible.
>
> > ```java
> > public class Tree {
> >   private Triangle leaves;
> >   private Square trunk;
> >
> >   public Tree() {
> >     leaves = new Triangle();
> >     trunk = new Square();
> >   }
> > }
> > ```

> **Exercise 3.41** Challenge exercise. Complete the `Tree` class described in the
> previous exercise, by having the constructor move the trunk square beneath the
> leaves triangle and then make both shapes visible.
>
> > ```java
> > public class Tree {
> >   private Triangle leaves;
> >   private Square trunk;
> >
> >   public Tree() {
> >     leaves = new Triangle();
> >     trunk = new Square();
> >     setup();
> >   }
> >
> >   public void setup() {
> >     trunk.moveVertical(-50);
> >     leaves.changeSize(50, 100);
> >     trunk.makeVisible();
> >     leaves.makeVisible();
> >   }
> > }
> > ```

> **Exercise 3.47** Predict which line will be marked as the next line to execute  
> after the next step.  
> Then execute another single step and check your prediction.
> Were you right or wrong? Explain what happened and why.
>
> > `MailItem` object `item` is not null thus next line is the `item.print()`.

> **Exercise 3.48** Call the same method (`printNextMailItem`) again.  
> Step through the method again, as before.
> What do you observe? Explain why this is.
>
> > This time `item` is `null` because no new mail was sent to the server.
> > Thus if condition is met and we get `"No new mail."`

> **Exercise 3.49** use the `Step Into` command instead of the Step command.
> Make sure you can see the text terminal window as you step forward.
> What do you observe? Explain what you see.
>
> > on the line `item.print();` we are stepping into the `MailServer print()` method
> > stopping at the first line of the method, stepping though it and returning to the next
> > line after `item.print()` in `MailClient`

> **Exercise 3.55**
>
> > ```java
> > public class Screen {
> >   private int xRes;
> >   private int yRes;
> >
> >   public Screen(int xRes, int yRes) {
> >     this.xRes = xRes;
> >     this.yRes = yRes;
> >   }
> >
> >   public int numberOfPixels() {
> >     return xRes * yRes;
> >   }
> >
> >   public void clear(boolean invert) {
> >     // ... some code here
> >   }
> > }
> >
> > public class ScreenTest {
> >   public static void main(String... args) {
> >     Screen screen = new Screen(1920, 1080);
> >     if (screen.numberOfPixels() > 2e6) {
> >       screen.clear(true);
> >     }
> >   }
> > }
> > ```

> **Exercise 3.56 - 57** Describe the changes that would be required to the `ClockDisplay`  
> class in order to be able to display hours, minutes, and seconds.
> How many `NumberDisplay` objects would a `ClockDisplay` object need to use?
>
> > see implementation in `clock_24_hour_with_seconds` package

> **Exercise 3.58** support the display of hours, minutes, seconds, tenths of a second, and
> hundredths of a second. // TODO
