> Exercise 2.2
> **What value is returned if you get the machine’s balance after it has printed a ticket?**
>
> > 0

> Exercise 2.3
> **Experiment with inserting different amounts of money before printing tickets.
> Do you notice anything strange about the machine’s behavior?
> What happens if you insert too much money into the machine—do you receive any refund?
> What happens if you do not insert enough and then try to print a ticket?**
>
> > No matter how much money we inserting we are not getting any refund.
> > We can insert 20 cents and still get a ticket with higher price

> Exercise 2.5
> **Create another ticket machine for tickets of a different price;
> remember that you have to supply this value when you create the machine object.
> Buy a ticket from that machine. Does the printed ticket look any different from
> those printed by the first machine?**
>
> > Yes, the price is different

> Exercise 2.6
> **Write out what you think the outer wrappers of the Student and LabClass classes
> might look like; do not worry about the inner part.**
>
> > `public class Student {...}` >>`public class LabClass {...}`

> Exercise 2.7
> **Does it matter whether we write
> public class TicketMachine or class public TicketMachine in the outer wrapper of a class?**
>
> > Yes it does.
> > public modifier should come before class keyword.

> Exercise 2.8
> **Check whether or not it is possible to leave out the word public
> from the outer wrapper of the TicketMachine class.**
>
> > Yes it is possible. (makes the class package-private)

> Exercise 2.9
> **Put back the word public, and then check whether it is possible
> to leave out the word class by trying to compile again.**
>
> > We get an error. `class` keyword can't be omitted.
> > `Compile-error: class, interface or enum expected.`

> Exercise 2.10
> **Look at the class definition in Code 2.1 and use this
> knowledge, along with the additional information about ordering we have given
> you, to make a list of the names of the fields, constructors, and methods in the
> TicketMachine class. Hint: There is only one constructor in the class.**
>
> > fields: `price, balance, total`
> > constructor: `TicketMachine(int)`
> > methods: `getPrice(), getBalance(), insertMoney(int), printTicket()`

> Exercise 2.11
> **What are the two features of the constructor that make it look
> significantly different from the methods of the class?**
>
> > 1.  It doesn't have return type.
> > 2.  Its name is the same as the class name.

> Exercise 2.12
> **What do you think is the type of each of the following fields?**
>
> > `private int count; // => int` >> `private Student representative; // => Student, i.e. its an object instance` >> `private Server host; // => Server`

> Exercise 2.13
> **What are the names of the following fields?**
>
> > `private boolean alive; // => alive` >> `private Person tutor; // => tutor` >> `private Game game; // => game`

> Exercise 2.14
> **From what you know about the naming conventions for classes,
> which of the type names in Exercises 2.12 and 2.13 would you say are class
> names?**
>
> > `Student, Server, Person and Game.`

> Exercise 2.15
> **In the following field declaration from the TicketMachine class
> private int price;
> does it matter which order the three words appear in?**
>
> > Yes it does.
> > `int private price; // => CE - <identifer> expected` >> `int price private; // => CE - ; expected after price` >> `int price; // => OK but this field is not private anymore`
> > Conclusion, fields must have the format => `<access modifier> <data type> <name>;`

> Exercise 2.16
> **Is it always necessary to have a semicolon at the end of a field declaration?**
>
> > Absolutely yes.
> > Java syntax require each statement to be terminated with semi-colon.

> Exercise 2.17
> **Write in full the declaration for a field of type int whose name is status.**
>
> > `private int status;`

> Exercise 2.18
> **To what class does the following constructor belong?
> `public Student(String name)`**
>
> > Constructors have the same name as the Class name.
> > Thus, this constructor belongs to Student class.

> Exercise 2.19
> **How many parameters does the following constructor have, and what are their types?** > `public Book(String title, double price)`
>
> > Two formal parameters, title of type String and price of type double.

> Exercise 2.20
> **Can you guess what types some of the `Book` class’s fields might
> be, from the parameters in its constructor?
> Can you assume anything about the names of its fields?**
>
> > From constructor parameters we can assume is has those attributes but its not
> > all ways true. E.g. in the TicketMachine the parameter is cost but there is no
> > such attribute as cost in the created instance.
> > Tell you something useful about the information being stored in that variable.

> Exercise 2.21
> **Suppose that the class `Pet` has a field called `name` that is of the type
> `String`.
> Write an _assignment statement_ in the body of the following constructor so
> that the `name` field will be initialized with the value of the constructor’s parameter.**
>
> > ```java
> > public Pet(String petsName) { name = petsName; }
> > ```

> Exercise 2.22
> **_Challenge exercise:_ The following object creation will result in the
> constructor of the `Date` class being called.
> Can you write the constructor’s header?
> `new Date("March", 23, 1861)`
> Try to give meaningful names to the parameters.**
>
> > ```java
> > public Date(String month, int dayOfMonth, int year) {/**/}
> > ```

> Exercise 2.23
> **Compare the header and body of the `getBalance` method
> with the header and body of the `getPrice` method.
> What are the differences between them?**
>
> > `int getPrice()` and `int getBalance()` have similar headers.
> > both of them are _accessors_ i.e. returning a state of objects attributes
> > Only difference between them is the attribute that is returning.

> Exercise 2.24
> **If a call to `getPrice` can be characterized as “What do tickets cost?”
> how would you characterize a call to `getBalance`?**
>
> > What is the amount of money entered by a customers so far?

> Exercise 2.25
> **If the name of `getBalance` is changed to `getAmount`, does the
> return statement in the body of the method also need to be changed for the code to compile?
> Try it out within BlueJ.
> What does this tell you about the name of an accessor method and the name of the field
> associated with it?**
>
> > No, we can change the header to `getAmount` but we will get unexpected return value.
> > `getAmount` tells that if this method will be called we are expected to get back
> > a value that represents an amount of money.

> Exercise 2.26
> ** Write an accessor method `getTotal` in the TicketMachine class.
> The new method should return the value of the total field.**
>
> > ```java
> > public int getTotal() { return total; }
> > ```

> Exercise 2.27
> **Try removing the return statement from the body of `getPrice`.
> What error message do you see now when you try compiling the class?**
>
> > `getPrice` as the method name says should eventually return a value.
> > removing the single return statement leave this block with no return value
> > which causes compilation-error `missing return statement`

> Exercise 2.28
> **Compare the method headers of `getPrice` and `printTicket` in Code 2.1.
> Apart from their names, what is the main difference between them?**
>
> > headers: `int getPrice()` `void printTicket()`
> > The first return int data type value where's the second is not returning anything.
> > `printTicket()` as the name suggest probably will print something to the screen
> > where's `getPrice()` will give back to the caller a value.

> Exercise 2.29
> **Do the `insertMoney` and `printTicket` methods have return statements?
> Why do you think this might be?
> Do you notice anything about their headers that might suggest why they do not require
> return statements?**
>
> > Both their headers have void return type thus they are not required to return any
> > value back to the caller.
> > When inserting money we could wait for a change if we insert more money then
> > thicket cost. Printing ticket is just printing the ticket and do not pass values
> > back to the caller because he is not intended to receive any thing from printing method.

> Exercise 2.31
> **How can we tell from just its header that `setPrice` is a method and not a constructor?
> `public void setPrice(int cost)`**
>
> > 1.  Constructor don't have return type of any kind, even not void.
> > 2.  Constructor's name is the same name of the class

> Exercise 2.32
> **Complete the body of the `setPrice` method so that it assigns the value of its
> parameter to the price field**
>
> > ```java
> > public void setPrice(int newPrice) { price = newPrice; }
> > ```

> Exercise 2.33
> **Complete the body of the following method, whose purpose is
> to add the value of its parameter to a field named `score`.**
>
> > ```java
> > /** Increase score by the given number of points. */
> > public void increase(int points) { score += points; }
> > ```

> Exercise 2.34
> **Is the `increase` method a mutator?
> If so, how could you demonstrate this?**
>
> > Yes its a mutator because, it is changing the state of the object.
> > If `score` was 70 before invoking `increase` so after invoking the method
> > with say points = 30, after this method is completed `score` attribute is no longer
> > 70 but 100.

> Exercise 2.35
> **Complete the following method, whose purpose is to subtract the value of its
> parameter from a field named `price`**
>
> > ```java
> > /** Reduce price by the given amount. */
> > public void discount(int amount) { price -= amount; }
> > ```

> Exercise 2.36
> **Write down exactly what will be printed by the following statement:
> `System.out.println("My cat has green eyes.");`**
>
> > My cat has green eyes.

> Exercise 2.37
> **Add a method called `prompt` to the `TicketMachine` class.
> This should have a `void` return type and take no parameters.
> The body of the method should print the following single line of output:
> `Please insert the correct amount of money.`**
>
> > ```java
> > public void prompt() {
> >    System.out.println("Please insert the correct amount of money.");
> >  }
> > ```

> Exercise 2.38
> **What do you think would be printed if you altered the fourth statement of
> `printTicket` so that price also has quotes around it, as follows?
> `System.out.println("# " + "price" + " cents.");`**
>
> > The resulting print message was: `# price cents.`

> Exercise 2.39
> **What about the following version? System.out.println("# price cents.");**
>
> > `# price cents.`

> Exercise 2.40
> **Could either of the previous two versions be used to show the
> price of tickets in different ticket machines? Explain your answer.**
>
> > No, because the String within the println method doesn't print the price attribute
> > of the ticket, its just a String literal.

> Exercise 2.41
> **Add a `showPrice` method to the `TicketMachine` class.
> This should have a `void` return type and take no parameters.
> The body of the method should print: `The price of a ticket is xyz cents.`
> where xyz should be replaced by the value held in the `price` field when the
> method is called.**
>
> > ```java
> > public void showPrice() {
> >   System.out.println("The price of a ticket is " + price + " cents.");
> > }
> > ```

> Exercise 2.42
> **Create two ticket machines with differently priced tickets.
> Do calls to their `showPrice` methods show the same output, or different?
> How do you explain this effect?**
>
> > They show different output because when we construct the machines we provide to
> > the constructor price of a ticket which is assigned to the price attribute.
> > Invoking `showPrice` prints a message that contains `price` attribute this is why
> > we see messages with different price values.

> Exercise 2.43
> **Modify the constructor of `TicketMachine` so that it no longer has a parameter.
> Instead, the price of tickets should be fixed at 1,000 cents.
> What effect does this have when you construct ticket-machine objects within BlueJ?**

> > ```java
> > public TicketMachine() {
> >         price = 1_000;
> >         balance = 0;
> >         total = 0;
> >     }
> > ```
> >
> > Every instance of `TicketMachine` that will be created will have its ticket price
> > set at 1_000 cents.

> Exercise 2.45
> **Implement a method, `empty`, that simulates the effect of removing all money from
> the machine.
> This method should have a `void` return type, and its body should simply set the
> `total` field to zero.
> Does this method need to take any parameters?
> Test your method by creating a machine, inserting some money, printing some tickets,
> checking the total, and then emptying the machine.
> Is the empty method a mutator or an accessor?**
>
> > ```java
> > public void empty() { total = 0; }
> > ```
> >
> > As its method name suggest we should empty (i.e. collect) the machine so, there is
> > no need to supply any arguments to this method.
> > The `empty` method is mutator method because it changes the `total` attribute of the
> > machine after invoking it.

> Exercise 2.46
> **Check the balance both before and after calling `insertMoney`.
> Does the `balance` ever change in the cases when an error message is printed?
> Try to predict what will happen if you enter the value zero as the parameter,
> and then see if you are right.**
>
> > If we try to insert zero or negative values balance will not change and we will
> > be prompted with a message: `"Use a positive amount rather than: 0"`

> Exercise 2.47
> **Predict what you think will happen if you change the test in `insertMoney` to use
> the greater-than or equal-to operator: `if(amount >= 0)`
> Check your predictions by running some tests.
> What is the one situation in which it makes a difference to the behavior of the method?**
>
> > Changes to `>=` will result in adding 0 to current balance value which doesn't change
> > it (redundant operation).

> Exercise 2.48
> **Rewrite the `if-else` statement so that the method still behaves correctly but the
> error message is printed if the boolean expression is true but the balance is
> increased if the expression is false.
> You will obviously have to rewrite the condition to make things happen this way around.**
>
> > ```java
> > public void insertMoney(int amount) {
> >   if (amount <= 0) {
> >     System.out.println("Use a positive amount rather than: " + amount);
> >   } else {
> >     balance += amount;
> >   }
> > }
> > ```

> Exercise 2.49
> **In the figures project we looked at in Chapter 1 we used a `boolean` field to
> control a feature of the circle objects.
> What was that feature?
> Was it well suited to being controlled by a type with only two different values?**
>
> > The field was `private boolean isVisible;`
> > This feature is a type of toggler which boolean type is well suited for.

> Exercise 2.50
> **In this version of `printTicket`, we also do something slightly different with the
> `total` and `balance` fields.
> Compare the implementation of the method in Code 2.1 with that in Code 2.8 to see
> whether you can tell what those differences are.**
>
> > In `Code 2.1` there is no conditional check to see whether the user inserted enough
> > money to get him a ticket, its just printing a ticket regardless of the balance.
> > Where's in `Code 2.8` before the user can get a ticket it must insert enough money
> > to get him a ticket otherwise he will be prompted to insert difference between
> > the price and the current balance.

> Exercise 2.51
> **Is it possible to remove the `else` part of the `if-statement` in the `printTicket`
> method (i.e., remove the word else and the block attached to it)?
> Try doing this and seeing if the code still compiles.
> What happens now if you try to print a ticket without inserting any money?**
>
> > Removing the else part will result in not getting any message if there is not
> > enough balance to print a message. User will not know what exactly wrong.
> > Its better to inform the user what happened if something wrong so he can take action
> > accordingly.
> > NOTE: `else` can be omitted as follows
> >
> > ```java
> > public void printTicket() {
> >         if (balance < price) {
> >             System.out.println("You must insert at least: " + (price - balance) + " more cents.");
> >             return;
> >         }
> >
> >         // Simulate the printing of a ticket.
> >         System.out.println("##################");
> >         System.out.println("# The BlueJ Line");
> >         System.out.println("# Ticket");
> >         System.out.println("# " + price + " cents.");
> >         System.out.println("##################");
> >         System.out.println();
> >
> >         total = total + price;     // Update the total collected with the price.
> >         balance = balance - price; // Reduce the balance by the price.
> >     }
> > ```

> Exercise 2.52
> **After a ticket has been printed, could the value in the `balance` field ever be
> set to a negative value by subtracting price from it?
> Justify your answer.**
>
> > No it can't. We are printing a ticket only if `balance >= price`
> > i.e. only if `balance - price >= 0`, thus ensuring that `balance` will never
> > be a negative value (though it can be zero if `balance == price`)

> Exercise 2.54
> **Write an _assignment statement_ that will store the result of multiplying two variables,
> `price` and `discount`, into a third variable, `saving`.**
>
> > ```java
> > double saving = price * discount;
> > ```

> Exercise 2.55
> **Write an _assignment statement_ that will divide the value in `total` by the
> value in `count` and store the result in `mean`.**
>
> > ```java
> > double mean = 1.0 * total / count; // NOTE: taking into account digits after decimal point
> > ```

> Exercise 2.56
> **Write an `if-statement` that will compare the value in `price` against the value
> in `budget`.
> If `price` is greater than `budget`, then print the message `“Too expensive”`;
> otherwise print the message `“Just right”`.**

```java
if (price > budget) System.out.println("Too expensive");
else                System.out.println("Just right");
```

> Exercise 2.57
> **Modify your answer to the previous exercise so that the
> message includes the value of your `budget` if the `price` is too high.**

```java
if (price > budget) System.out.println("Too expensive; Budget: $" + budget);
else                System.out.println("Just right");
```

> Exercise 2.58
> **Why does the following version of `refundBalance` not give the same results
> as the original? What tests can you run to demonstrate that it does not?**
>
> ```java
> public int refundBalance() {
>   balance = 0;
>   return balance;
> }
> ```
>
> > We always assign zero to `balance` and returning it which is not what we want.
> > E.g. if user inserted 50 cents and don't want to buy a ticket and to get his money back
> > invoking `refundBalance` will give him back 0 cents which clearly not what we want.
> >
> > 1. TicketMachine(50)
> > 2. insertMoney(60);
> > 3. printTicket();
> > 4. refundBalance(); // => 10 cents supposed to give back but we get 0

> Exercise 2.59
> **What happens if you try to compile the `TicketMachine` class
> with the following version of `refundBalance`?**
>
> ```java
> public int refundBalance() {
>   return balance;
>   balance = 0;
> }
> ```
>
> **What do you know about return statements that helps to explain why this
> version does not compile?**
>
> > We get `compilation-error: "unreachable statement"` because when we return from
> > a method lines underneath it will not be executed.

> Exercise 2.60
> **What is wrong with the following version of the constructor of `TicketMachine`?**
>
> ```java
> public TicketMachine(int cost) {
>   int price = cost;
>   balance = 0;
>   total = 0;
> }
> ```
>
> **Does this version compile?
> Do you notice something wrong about the value of the `price` field in the inspector
> with this version?
> Can you explain why this is?**
>
> > Yes, this version compiles fine.
> > But, because we declared a local variable that has the **same name** as the field
> > variable `price` the assignment assigns `cost` to that local variable and not the
> > instance field variable (instance price variable will be set to its default value 0)

> Exercise 2.61
> **Add a new method, `emptyMachine`, that is designed to simulate emptying the
> machine of money.
> It should reset `total` to be zero, but also return the value that was stored
> in `total` before it was reset.**
>
> > ```java
> > /** Take all accumulated money from the machine */
> > public int emptyMachine() {
> >   int accumulated = total;
> >   total = 0;
> >   return accumulated;
> > }
> > ```

> Exercise 2.62
> **Rewrite the `printTicket` method so that it declares a local variable, `amountLeftToPay`.
> This should then be initialized to contain the difference between `price` and `balance`.
> Rewrite the test in the conditional statement to check the value of `amountLeftToPay`.
> If its value is less than or equal to zero, a ticket should be printed;
> otherwise, an error message should be printed stating the amount left to pay.**
>
> > ```java
> >  public void printTicket() {
> >    int amountLeftToPay = price - balance;
> >    if (amountLeftToPay <= 0) {
> >      System.out.println("##################");
> >      System.out.println("# The BlueJ Line");
> >      System.out.println("# Ticket");
> >      System.out.println("# " + price + " cents.");
> >      System.out.println("##################");
> >      System.out.println();
> >
> >      total += price;    // Update the total collected with the price.
> >      balance -= price;  // Reduce the balance by the price
> >    } else {
> >      System.out.println("You must insert at least: " +
> >              amountLeftToPay + " more cents.");
> >    }
> >  }
> > ```

> Exercise 2.63
> **Challenge exercise: Suppose we wished a single `TicketMachine` object to be able
> to issue tickets of different prices. For instance, users might
> press a button on the physical machine to select a discounted ticket price. What
> further methods and/or fields would need to be added to `TicketMachine` to
> allow this kind of functionality?
> Do you think that many of the existing methods would need to be changed as well?**
>
> > Only `printTicket` header should be changed to allow discounted ticket
> >
> > ```java
> > /** Allow user to specify if discount of 25% should be applied (true) or not (false) */
> > public void printTicket(boolean discount) {
> >     price *= discount ? 0.75 : 1;
> >     /* rest of code */
> > }
> > ```

> Exercise 2.64
> **List the name and return type of this method:**
>
> ```java
> public String getCode() {
>  return code;
> }
> ```
>
> > Method signature: `getCode()`
> > Return type: `String`

> Exercise 2.65
> **List the name of this method and the name and type of its parameter:**
>
> ```java
> public void setCredits(int creditValue) {
>   credits = creditValue;
> }
> ```
>
> > Method signature: `setCredits(int)`
> > Formal parameters: `creditValue` of type `int`

> Exercise 2.66, .67, .69, .71, .73
> **Write out the outer wrapping of a class called `Person`, instance fields
> constructor, accessor method called `getName`, mutator method called `setAge`
> and `printDetails`**
>
> > ```java
> > public class Person {
> >   private String name;
> >   private int age;
> >   private String code;
> >   private int credits;
> >
> >   public Person(String myName, int myAge) {
> >     name = myName;
> >     age = myAge;
> >   }
> >
> >   public String getName()        { return name; }
> >   public void setAge(int newAge) { age = newAge >= 0 ? newAge : age; }
> >
> >   public void printDetails() {
> >     System.out.println("The name of this person is " + name);
> >   }
> > }
> > ```

> Exercise 2.68
> **Write out a constructor for a class called `Module`.
> The constructor should take a single parameter of type `String` called `moduleCode`.
> The body of the constructor should assign the value of its parameter to a field
> called `code`.**
>
> > ```java
> > public class Module {
> >   private String code;
> >   // possibly more fields
> >
> >   public Module(String moduleCode) {
> >     code = moduleCode;
> >     // possibly more initializations follows
> >   }
> > }
> > ```

> Exercise 2.70
> **Correct the error in this method:**
>
> > ```java
> > // public void getAge() { // getAge returning age instance field thus change void => int
> > public int getAge() {
> >   return age;
> > }
> > ```

> Exercise 2.74
> **Draw a picture of the form shown in Figure 2.3, representing
> the initial state of a `Student` object following its construction, with the
> following actual parameter values: `new Student("Benjamin Jonson", "738321")`**
>
> > After create new Student instance its instance fields are as follows:
> >
> > ```java
> > name = "Benjamin Jonson"
> > id = "738321"
> > credits = 0
> > ```

> Exercise 2.75
> **What would be returned by `getLoginName` for a student with
> `name "Henry Moore"` and `id "557214"`?**
>
> > ```java
> > "Henry Moore".substring(0, 4); // => "Henr"
> > "557214".substring(0, 3);      // => "557"
> > ```
> >
> > final result: `"Henr557"`

> Exercise 2.76
> **Create a `Student` with name `"djb"` and id `"859012"`.
> What happens when `getLoginName` is called on this student?
> Why do you think this is?**
>
> > ```java
> > Student student = new Student("djb", "859012");
> > student.getLoginName(); // => java.lang.StringIndexOutOfBoundsException: begin 0, end 4, length 3
> > ```
> >
> > This exception happening because we try to extract a substring up to index that
> > is not available.
> > "djb" is of length 3, indexes are: d = 0, j = 1, b = 2.
> > There is no index (endIndex - 1) = (4 - 1) = 3, thus we get `IndexOutOfBoundsException`

> Exercise 2.77
> **Add conditional statements to the constructor of `Student` to print an error
> message if either the length of the `fullName` parameter is less than four
> characters, or the length of the `studentId` parameter is less than three
> characters.
> However, the constructor should still use those parameters to set the
> `name` and `id` fields, even if the error message is printed.**
>
> > ```java
> > public Student(String fullName, String studentId) {
> >   if (fullName.length() < 4)
> >     System.out.println(fullName + " length is less then 4 chars");
> >   if (studentId.length() < 3)
> >     System.out.println(fullName + " length is less then 3 chars");
> >
> >   name = fullName;
> >   id = studentId;
> > }
> > ```

> Exercise 2.78
> **Challenge exercise Modify the `getLoginName` method of
> `Student` so that it always generates a login name, even if either the `name` or the
> `id` field is not strictly long enough.
> For strings shorter than the required length, use the whole string.**
>
> > ```java
> > public String getLoginName() {
> >   String loginName = "";
> >   loginName = name.length() < 4 ? name : name.substring(0, 4);
> >   loginName += id.length() < 3 ? id : id.substring(0, 3);
> >
> >   return loginName;
> > }
> > ```

> Exercise 2.81
> **Now add the following in the Code Pad:
> `TicketMachine t2 = t1;`
> What would you expect a call to `t2.getBalance()` to return?**
>
> > t2 is now pointing to t1 i.e. t2 and t1 points to the same instance of TicketMachine.
> > Invoking `t2.getBalance()` will give the same result as invoking `t1.getBalance()`

> Exercise 2.82
> **Add the following: `t1.insertMoney(500);`
> What would you expect the following to return?
> Think carefully about this before you try it, and be sure to use the t2
> variable this time.
> `t2.getBalance()`
> Did you get the answer you expected?
> Can you find a connection between the variables t1 and t2 that would
> explain what is happening?**
>
> > `public void insertMoney(int amount)` is not retuning anything (void)
> > Because t2 and t1 are pointing to the same instance of TicketMachine invoking
> > `t2.getBalance()` will get us the same balance as invoking `t1.getBalance()`
> > The connection is in the assignment line: `TicketMachine t2 = t1;`
> > There is now `new` keyword to create new instance of `TicketMachine` for t2.

> Exercise 2.86
> **Are the `Book` objects you have implemented immutable?
> Justify your answer.**
>
> > Yes it is immutable.
> > There is no mutator methods nor methods that can change any of the fields
> > of a Book instance i.e. Book instance state can't be changed once created,
> > to change something we must create a new Book instance with the updated information
> > which will be the values for the constructor.

> **Exercise 2.83 - .92
> Exercise 2.93 - .94**
>
> > In chapter02_class_definitions directory
