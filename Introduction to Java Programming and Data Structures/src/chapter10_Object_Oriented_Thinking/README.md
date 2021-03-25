<h1 align="center" id="home"><u>CheckPoint Answers</u></h1>

[10.2 Class Abstraction and Encapsulation](#2)  
[10.3 Thinking in Objects](#3)  
[10.4 Class Relationships](#4)  
[10.5 Case Study: Designing the Course Class](#5)  
[10.6 Case Study: Designing a Class for Stacks](#6)  
[10.7 Processing Primitive Data Type Values as Objects](#7)  
[10.9 The BigInteger and BigDecimal Classes](#9)  
[10.10 The String Class](#10)  
[10.11 The StringBuilder and StringBuffer Classes](#11)

<h3 align="center" id="2"><u>10.2 Class Abstraction and Encapsulation</u><a href="#home"> 👆</a></h3>

> 10.2.1 If you redefine the `Loan` class in Listing 10.2 without setter methods,  
> is the class **_immutable_**?
>
> > Class considered immutable if:
> >
> > 1. Fields are **not publicly accessible** i.e. `private`.
> > 2. No `public` setter methods are provided.
> > 3. Fields that are mutable, getter methods must **return a copy** of the field content.
> > 4. Extending the class is forbidden i.e. class is marked `final`.
> >
> > Thus `Loan` class if `getLoanDate(): Date` method will change its return type to  
> > `new Date(loanDate.getTime());` and removing the setter methods, `Loan` class will be immutable.

---

<h3 align="center" id="3"><u>10.3 Thinking in Objects</u><a href="#home"> 👆</a></h3>

> 10.3.1 Is the `BMI` class defined in Listing 10.4 immutable?
>
> > Although class is not marked `final` it is immutable.

---

<h3 align="center" id="4"><u>10.4 Class Relationships</u><a href="#home"> 👆</a></h3>

> 10.4.1 What are common relationships among classes?
>
> > Association, aggregation, composition and inheritance.

> 10.4.2 What is association?
> What is aggregation?
> What is composition?
>
> > - **_Association_** binary relationship that describes an activity between two classes.
> > - **_Aggregation_** is a special form of association that represents an  
> >   **ownership relationship** between two objects. Models `has-a` relationship.  
> >   Aggregated class can exists without the aggregating class i.e. it is not tightly coupled with  
> >   the aggregating class. E.g. `Motorcycle` and `Brand`. Once Motorcycle is destroyed `Brand` object  
> >   can exits.
> > - **_Composition_** existence of the aggregated object is dependent on the aggregating object.  
> >   E.g. `Student` and `Name`. Once `Student` object destroyed `Name` object has no meaning staying.
> >
> > Association is a general binary relationship that describes an activity between two classes.  
> > Aggregation is a special form of association that represents an ownership relationship between  
> > two objects.  
> > Aggregation models `has-a` relationships.  
> > An object can be owned by several other aggregating objects.  
> > If an object is exclusively owned by an aggregating object, the relationship between the  
> > object and its aggregating object is referred to as a composition.

> 10.4.3 What is `UML` notation of aggregation and composition?
>
> > Aggregation -> empty diamond on the aggregating class.  
> > Composition -> filled diamond on the aggregating class.

> 10.4.4 Why both aggregation and composition are together referred to as composition?
>
> > Since aggregation and composition relationships are represented using classes in  
> > the **same way**, we will not differentiate them and call both compositions for simplicity.

---

<h3 align="center" id="5"><u>10.5 Case Study: Designing the Course Class</u><a href="#home"> 👆</a></h3>

> 10.5.1 Replace the statement in line 17 in Listing 10.5, `TestCourse.java`, so the loop  
> displays each student name followed by a comma except the last student name.
>
> > ```java
> > int numberOfStudents = course1.getNumberOfStudents();
> > String[] students = course1.getStudents();
> > if (numberOfStudents > 0) {
> >   System.out.print(students[0]);
> >   for (int i = 1; i < numberOfStudents; i++) {
> >     System.out.print(", " + students[i]);
> >   }
> > }
> > ```

<h3 align="center" id="6"><u>10.6 Case Study: Designing a Class for Stacks</u><a href="#home"> 👆</a></h3>

> 10.6.1 What happens when invoking the `pop()` method on a stack while `size` is 0?
>
> > ```java
> >   public int pop() {
> >     return elements[--size]; // java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds
> >   }
> > ```

<h3 align="center" id="7"><u>10.7 Processing Primitive Data Type Values as Objects</u><a href="#home"> 👆</a></h3>

> 10.7.1 Describe primitive-type wrapper classes.
>
> > In Java for each primitive-type can be converted to an object using the corresponding wrapper  
> > classes.
> > `byte` => Byte | `short` => Short | `int` => Integer | `long` => Long  
> > `float` => Float | `double` => Double  
> > `boolean` => Boolean  
> > `char` => Character

> 10.7.2 Can each of the following statements be compiled?
>
> > ```java
> > Integer i = new Integer("23");                      // => ✔, though using wrapper class is deprecated
> > Integer i = new Integer(23);                        // => ✔, new Integer(String s | int i)
> > Integer i = Integer.valueOf("23");                  // => ✔
> > Integer i = Integer.parseInt("23", 8);              // => ✔, (23)_8 == 19
> > Double d = new Double();                            // => ✖, there is no no-args constructor
> > Double d = Double.valueOf("23.45");                 // => ✔
> > int i = (Integer.valueOf("23")).intValue();         // => ✔, Integer.valueOf(String s): Integer
> > double d = (Double.valueOf("23.4")).doubleValue();  // => ✔
> > int i = (Double.valueOf("23.4")).intValue();        // => ✔, return value from intValue() is 23
> > String s = (Double.valueOf("23.4")).toString();     // => ✔, Double.valueOf(String s): Double
> > ```

> 10.7.3
>
> 1. How do you convert an integer into a string?
> 2. How do you convert a numeric string into an integer?
> 3. How do you convert a double number into a string?
> 4. How do you convert a numeric string into a double value?
>
> > ```java
> > int n = 15;
> > System.out.println("\"" + Integer.valueOf(15).toString() + "\""); // "15"
> >
> > String sInt = "15";
> > System.out.println(Integer.parseInt(sInt)); // 15
> >
> > double d = 12.34;
> > System.out.println("\"" + Double.valueOf(d).toString() + "\""); // "12.34"
> >
> > String sDouble = "12.34";
> > System.out.println(Double.parseDouble(sDouble)); // 12.34
> > ```

> 10.7.4 Show the output of the following code:
>
> > ```java
> > public class Test {
> >  public static void main(String... args) {
> >    Integer x = Integer.valueOf(3);
> >    System.out.println(x.intValue()); // 3
> >    System.out.println(x.compareTo(4)); // -1
> >    // int compareTo(Object other);
> >    //  return -1 if this less then other
> >    //  return 0 if this is same as other
> >    //  return 1 if this is greater then other
> >  }
> > }
> > ```

> 10.7.5 What is the output of the following code?
>
> > ```java
> > public class Test {
> >   public static void main(String[] args) {
> >     System.out.println(Integer.parseInt("10"));      // => 10
> >     System.out.println(Integer.parseInt("10", 10));  // => 10
> >     System.out.println(Integer.parseInt("10", 16));  // => 16
> >     System.out.println(Integer.parseInt("11"));      // => 11
> >     System.out.println(Integer.parseInt("11", 10));  // => 11
> >     System.out.println(Integer.parseInt("11", 16));  // => 17, F = 15, 10 = 16, 11 = 17
> >   }
> > }
> > ```

> 10.8.1 What are **_auto-boxing_** and **_auto-unboxing_**?  
> Are the following statements correct?
>
> > Java will convert primitive-types to Wrapper object and vise-versa depending
> > on the context. When wrapper class is needed and there is a primitive type
> > java will take care to box it into th wrapper class before using it.
> >
> > ```java
> > Integer x = 3 + Integer.valueOf(5);               // => ✔, 5 is unboxed to primitive 3 + 5 then autoboxing
> > Integer x = 3;                                    // => ✔, same as Integer.valueOf(3);
> > Double x = 3;                                     // => ✖, provided int not double compilation-error
> > Double x = 3.0;                                   // => ✔, same as Double.valueOf(3);
> > int x = Integer.valueOf(3);                       // => ✔, same as Integer.valueOf(3).intValue();
> > int x = Integer.valueOf(3) + Integer.valueOf(4);  // => ✔, unboxing using intValue() before addition
> > ```

> 10.8.2 Show the output of the following code.
>
> > ```java
> > public class Test {
> >   public static void main(String[] args) {
> >     Double x = 3.5;                        // autoboxing same as Double.valueOf(3.5)
> >     System.out.println(x.intValue());      // => 3
> >     System.out.println(x.compareTo(4.5));  // => -1
> >   }
> > }
> > ```

<h3 align="center" id="9"><u>10.9 The BigInteger and BigDecimal Classes</u><a href="#home"> 👆</a></h3>

> 10.9.1 What is the output of the following code?
>
> > ```java
> > import java.math.BigInteger;
> > public class Test {
> >   public static void main(String[] args) {
> >     BigInteger x = new BigInteger("3");
> >     BigInteger y = new BigInteger("7");
> >     BigInteger z = x.add(y);
> >     System.out.println("x is " + x); // x is 3
> >     System.out.println("y is " + y); // y is 7
> >     System.out.println("z is " + z); // z is 10
> >   }
> > }
> > ```

<h3 align="center" id="10"><u>10.10 The String Class</u><a href="#home"> 👆</a></h3>

> 10.10.1 Suppose `s1`, `s2`, `s3`, and `s4` are four strings, given as follows:
>
> ```java
> String s1 = "Welcome to Java";
> String s2 = s1;
> String s3 = new String("Welcome to Java");
> String s4 = "Welcome to Java";
> ```
>
> What are the results of the following expressions?
>
> ```java
> s1 == s2                                   // => true, both reference to interned String literal
> s1 == s3                                   // => false, s3 points to newly created String object
> s1 == s4                                   // => true, both reference to interned String literal
> s1.equals(s3)                              // => true, both String content is equivalent
> s1.equals(s4)                              // => true, both points to same String literal
> "Welcome to Java".replace("Java", "HTML")  // => Welcome to HTML
> s1.replace('o', 'T')                       // => WelcTme tT Java
> s1.replaceAll("o", "T")                    // => WelcTme tT Java
> s1.replaceFirst("o", "T")                  // => WelcTme to Java
> s1.toCharArray()                           // => [W, e, l, c, o, m, e, ,t ,o, , J, a, v, a]
> ```

> 10.10.2 To create the string `Welcome to Java`, you may use a statement like this:
> `String s = "Welcome to Java";`  
> or  
> `String s = new String("Welcome to Java");`  
> Which one is better? Why?
>
> > Because `String`s are used a lot and to prevent memory overload `String`s object should be  
> > **_created using literals_** i.e. `String s = "Welcome to Java";` this `String` will be  
> > **_interned_** by the JVM which a special location on the Heap and this `String` can  
> > be shared among all other `String` references that should have the same literal value  
> > instead of creating for the same `String` literal a new object.

> 10.10.3 What is the output of the following code?
>
> > ```java
> > String s1 = "Welcome to HyperSkill";  // => s1 is interned
> > String s2 = s1.replace("o", "ABC");   // => s2 = "WelcABCme tABC HyperSkill"
> > System.out.println(s1);               // => Welcome to HyperSkill
> > System.out.println(s2);               // => WelcABCme tABC HyperSkill
> > ```

> 10.10.4 Let `s1` be `" Welcome "` and `s2` be `" welcome "`  
> Write the code for the following statements:
>
> 1. Replace all occurrences of the character `e` with `E` in `s1` and assign the new string to `s3`.
> 2. Split `"Welcome to Java and HTML"` into an array tokens delimited by a space and assign  
>    the first two tokens into `s1` and `s2`.
>
> > ```java
> > String s1 = " Welcome ";
> > String s2 = " welcome ";
> > String s3 = s1.replace('e', 'E'); // (1), s3 = " WElcomE "
> > String [] tokens = "Welcome to Java and HTML".split(" ");
> > s1 = tokens[0]; // s1 = "Welcome"
> > s2 = tokens[1]; // s2 = "to"
> > ```

> 10.10.5 Does any method in the `String` class change the contents of the string?
>
> > **No**. String objects are immutable which means that any method invoked on a `String`  
> > object will result in getting a new `String` object as return value.
> > Further more, `String` class is final and don't have any `set` methods to change the
> > current `String` instance (two of the requirements of a immutable objects)

> 10.10.6 Suppose string s is created using `new String();` what is `s.length()`?
>
> > `new String();` is the same as `String s = "";` invoking thus `s.length()` will give 0 as result.

> 10.10.7 How do you convert a `char`, an array of characters, or a number to a string?
>
> > ```java
> > char c = 'x';
> > char[] charArray = {'a', 'b', 'c', 'd'};
> > int number = 42;
> >
> > String charToString = String.valueOf(c);  // c + "" | Character.toString(c)
> > String charArrayToString = new String(charArray);
> > String numberToString = String.valueOf(number); // number + "" | Integer.toString(number)
> > ```

> 10.10.8 Why does the following code cause a `NullPointerException`?
>
> > ```java
> > class WhyNPE {
> >   private String text;
> >
> >   public Test(String s) {
> >     String text = s; // text is a local variable not the actual text field attribute of WhyNPE
> >   }
> >
> >   public static void main(String[] args) {
> >     Test test = new Test("ABC");
> >     System.out.println(test.text.toLowerCase());
> >   }
> > }
> > ```

> 10.10.9 What is wrong in the following program?
>
> > ```java
> > public class Test {
> >    String text;
> >
> >    public void Test(String s) {
> >      text = s;
> >    }
> >
> >    public static void main(String[] args) {
> >      Test test = new Test("ABC"); // compilation-error, constructor of type Test(String) is not present
> >      System.out.println(test);
> >   }
> > }
> > ```

> 10.10.10 Show the output of the following code:
>
> > ```java
> > public class Test {
> >   public static void main(String[] args) {
> >     System.out.println("Hi, ABC, good".matches("ABC "));     // => false
> >     System.out.println("Hi, ABC, good".matches(".*ABC.*"));  // => true
> >     System.out.println("A,B;C".replaceAll(",;", "#"));       // => A,B;C
> >     System.out.println("A,B;C".replaceAll("[,;]", "#"));     // => A#B#C
> >
> >     String[] tokens = "A,B;C".split("[,;]");                 // ["A", "B", "C"]
> >     for (int i = 0; i < tokens.length; i++)
> >       System.out.print(tokens[i] +  " ");                    // A B C
> >   }
> > }
> > ```

> 10.10.11 Show the output of the following code:
>
> > ```java
> > public class Test {
> >   public static void main(String[] args) {
> >     String s = "Hi, Good Morning";
> >     System.out.println(m(s));  // 3, m(String) counts the uppercase letters of s
> >   }
> >
> >   public static int m(String s) {
> >     int count = 0;
> >     for (int i = 0; i < s.length(); i++)
> >       if (Character.isUpperCase(s.charAt(i)))
> >         count++;
> >
> >     return count;
> >   }
> > }
> > ```

<h3 align="center" id="11"><u>10.11 The StringBuilder and StringBuffer Classes</u><a href="#home"> 👆</a></h3>

> 10.11.1 What is the difference between `StringBuilder` and `StringBuffer`?
>
> > `StringBuffer` is **_synchronized_**. Two or more threads can't change/use the `StringBuffer` object.
> > `StringBuilder` is **_not-synchronized_** and ideal for manipulating the same object content
> > on one thread is only going to use/change it.

> 10.11.2 How do you create a string builder from a string?  
> How do you return a string from a string builder?
>
> > ```java
> > String str = "I Love Java";
> > StringBuilder sb = new StringBuilder(str); // using StringBuilder(String) constructor
> > String sbToString = sb.toString();
> > ```

> 10.11.3 Write three statements to reverse a string `s` using the reverse method in the  
> `StringBuilder` class.
>
> > ```java
> > String s = "abcde";
> > StringBuilder sb = new StringBuilder(s);
> > String sReversed = sb.reverse().toString();
> > ```

> 10.11.4 Write three statements to delete a substring from a string `s` of 20 characters,  
> starting at index 4 and ending with index 10.  
> Use the `delete` method in the `StringBuilder` class.
>
> > ```java
> > StringBuilder sb = new StringBuilder("12345678901234567890");
> > sb.delete(4, 10);
> > System.out.println(sb.toString()); // 12341234567890
> > ```

> 10.11.5 What is the internal storage for characters in a string and a string builder?
>
> > `StringBuilder` class extends `AbstractStringBuilder` which is using an array  
> > of `byte[]` to store characters.

> 10.11.6 Suppose `s1` and `s2` are given as follows:
>
> ```java
> StringBuilder s1 = new StringBuilder("Java");
> StringBuilder s2 = new StringBuilder("HTML");
> ```
>
> Show the value of `s1` after each of the following statements.  
> **_Assume the statements are independent_**.
>
> > ```java
> > s1.append(" is fun");          // => "Java is fun"
> > s1.append(s2);                 // => "JavaHTML"
> > s1.insert(2, "is fun");        // => "Jais funva"
> > s1.insert(1, s2);              // => "JHTMLava"
> > s1.charAt(2);                  // => 'v'
> > s1.length();                   // => 4
> > s1.deleteCharAt(3);            // => "Jav"
> > s1.delete(1, 3);               // => "Ja"
> > s1.reverse();                  // => "avaJ"
> > s1.replace(1, 3, "Computer");  // => "JComputera"
> > s1.substring(1, 3);            // => "av"
> > s1.substring(2);               // => "va"
> > ```

> 10.11.7 Show the output of the following program:
>
> > ```java
> > public class Test {
> >   public static void main(String[] args) {
> >     String s = "Java";
> >     StringBuilder builder = new StringBuilder(s);
> >     change(s, builder);
> >
> >     System.out.println(s);        // Java
> >     System.out.println(builder);  // Java and HTML
> >   }
> >
> >   private static void change(String s, StringBuilder builder) {
> >     s = s + " and HTML"; // String is immutable s + "" create new String and s points to new String object
> >     builder.append(" and HTML"); // "Java and HTML"
> >   }
> > }
> > ```
