# Chapter 4 Check Point Questions

```java
Math.toDegrees(Math.PI / 2)   // => returns 90.0
Math.toRadians(30)            // => returns 0.5236 (same as π/6)
Math.sin(0)                   // => returns 0.0
Math.sin(Math.toRadians(270)) // => returns −1.0
Math.sin(Math.PI / 6)         // => returns 0.5
Math.sin(Math.PI / 2)         // => returns 1.0
Math.cos(0)                   // => returns 1.0
Math.cos(Math.PI / 6)         // => returns 0.866
Math.cos(Math.PI / 2)         // => returns 0
Math.asin(0.5)                // => returns 0.523598333 (same as π/6)
Math.acos(0.5)                // => returns 1.0472 (same as π/3)
Math.atan(1.0)                // => returns 0.785398 (same as π/4)

Math.exp(3.5)                 // => ^3.5        , which returns 33.11545
Math.log(3.5)                 // => (3.5)       , which returns 1.25276
Math.log10(3.5)               // => log10(3.5)  , which returns 0.544
Math.pow(2, 3)                // => 2^3         , which returns 8.0
Math.pow(3, 2)                // => 3^2         , which returns 9.0
Math.pow(4.5, 2.5)            // => 4.5^(2.5)   , which returns 42.9567
Math.sqrt(4)                  // => 4^(1/2)     , which returns 2.0
Math.sqrt(10.5)               // => (10.5)^1/2  , which returns 3.24

Math.ceil(2.1)                // => returns 3.0 rounded up to its nearest integer.
Math.ceil(2.0)                // => returns 2.0
Math.ceil(−2.0)               // => returns −2.0
Math.ceil(−2.1)               // => returns −2.0
Math.floor(2.1)               // => returns 2.0 rounded down to its nearest integer.
Math.floor(2.0)               // => returns 2.0
Math.floor(−2.0)              // => returns −2.0
Math.floor(−2.1)              // => returns −3.0
Math.rint(2.1)                // => returns 2.0 rounded to its nearest integer.
Math.rint(−2.0)               // => returns −2.0
Math.rint(−2.1)               // => returns −2.0
Math.rint(2.5)                // => returns 2.0
Math.rint(4.5)                // => returns 4.0
Math.rint(−2.5)               // => returns −2.0
Math.round(2.6f)              // => returns 3 Returns int (int) Math.floor(x + 0.5) if x is a float
Math.round(2.0)               // => returns 2 Returns long (long) Math.floor(x + 0.5) if x is a double
Math.round(−2.0f)             // => returns −2 Returns int
Math.round(−2.6)              // => returns −3 Returns long
Math.round(−2.4)              // => returns −2 Returns long

a + Math.random() * b         // => Returns a random number between [a, a + b)
```

> **4.2.1**  
> Evaluate the following method calls:
>
> > ```java
> > Math.sqrt(4)                 // => 4^(0.5)                      = 2.0d
> > Math.sin(2 * Math.PI)        // => sin(2π)                      = 0.0d
> > Math.cos(2 * Math.PI)        // => cos(2π)                      = 1.0d
> > Math.pow(2, 2)               // => 2^2                          = 4.0d
> > Math.log(Math.E)             // => ln(e)                        = 1.0d
> > Math.exp(1)                  // => e^1                          = e = 2.71...d
> > Math.max(2, Math.min(3, 4))  // => max(2, 3)                    = 3
> > Math.rint(−2.5)              // => evenly close to -2.0 and -3.0 return even int -2
> > Math.ceil(−2.5)              // => round up to nearest integer -2.0d
> > Math.floor(−2.5)             // => round down to nearest integer -3.0d
> > Math.round(−2.5f)            // => (int) Math.floor(-2.5f + 0.5f) = -2
> > Math.round(−2.5)             // => (long) Math.floor(-2.5d + 0.5d) = -2L
> > Math.rint(2.5)               // => evenly close to 2.0 and 3.0 return even int 2
> > Math.ceil(2.5)               // => round up to nearest integer value 3.0d
> > Math.floor(2.5)              // => round down to nearest integer value 2.0d
> > Math.round(2.5f)             // => (int) Math.floor(2.5f + 0.5f) = 3
> > Math.round(2.5)              // => (long) Math.floor(2.5d + 0.5d) = 3L
> > Math.round(Math.abs(−2.5))   // => Math.round(2.5) = (long) Math.floor(2.5d + 0.5d) = 3L
> > ```

> **4.2.2**  
> True or false? The argument for trigonometric methods is an angle in radians.
>
> > True. All trigonometric functions arguments should be radians.  
> > To convert Degree to Radians we can use `Math.toRadians(double degrees)` and vice  
> > versa `Math.toDegrees(double radians)`

> **4.2.3, 4.2.4**
>
> > ```java
> > double radians = Math.toRadians(47);        // => 47° to radians
> > double piDegrees = Math.toDegrees(Math.PI); // => 180°
> > ```

> **4.2.5**
>
> > ```java
> > 34 + (int) (Math.random() * (55 - 34)); // 34 + [0, 20] = [34, 54]
> > (int) (Math.random() * 1000);           // [0, 999]
> > 5.5 + Math.random() * (55. 5 - 5.5);    // 5.49999 + [0, 50.00001] = [5.5, 54.499999]
> > ```

> **4.2.6**
> Why does the `Math` class not need to be imported?
>
> > `Math` class is part of the `java.lang` package which is automatically imported to  
> > each `.java` file, there is no need to write `import java.lang.*;`

> **4.2.7**
>
> > ```java
> > Math.log(Math.exp(5.5));          // => ln(e^5.5) = 5.5 * ln(e) = 5.5 * 1.0 = 5.5
> > Math.exp(Math.log(5.5));          // => e^ln(5.5) = e^log(e)5.5 = 5.5
> > Math.asin(Math.sin(Math.PI / 6)); // => asin(π / 6) = 0.52
> > Math.sin(Math.asin(Math.PI / 6)); // => sin(asin(π / 6)) = sin(0.52) = 0.52
> > ```

> **4.3.1**
> Use print statements to find out the ASCII code for '1', 'A', 'B', 'a', and 'b'.  
> Use print statements to find out the character for the decimal codes 40, 59, 79, 85, and 90.  
> Use print statements to find out the character for the hexadecimal code 40, 5A, 71, 72, and 7A.
>
> > ```java
> >   System.out.println((int) '1'); // => 49
> >   System.out.println((int) 'A'); // => 65
> >   System.out.println((int) 'B'); // => 66
> >   System.out.println((int) 'a'); // => 97
> >   System.out.println((int) 'b'); // => 98
> >
> >   System.out.println((char) 40); // => (
> >   System.out.println((char) 59); // => ;
> >   System.out.println((char) 79); // => O
> >   System.out.println((char) 85); // => U
> >   System.out.println((char) 90); // => Z
> >
> >   System.out.println((char) 0x40); // => @
> >   System.out.println((char) 0x5A); // => Z
> >   System.out.println((char) 0x71); // => q
> >   System.out.println((char) 0x72); // => r
> >   System.out.println((char) 0x7A); // => z
> > ```

> **4.3.2**
> Which of the following are correct literals for characters?
>
> > ```java
> > '1'       // => ✔
> > '\u345dE' // => ✖ unicode character range is \u0000 - \uFFFF
> > '\u3fFa'  // => ✔ unicode character 㿺
> > '\b'      // => ✔ backspace escape character
> > '\t'      // => ✔ tab escape character
> > ```

> **4.3.3**
> How do you display the characters `\` and `"`?
>
> > We must use an escape character.
> >
> > ```java
> > System.out.println("\\/");                   // => \/
> > System.out.println("\"Java\" vs. \"Ruby\""); // => "Java" vs "Ruby"
> > ```

> **4.3.4**
> Evaluate the following:
>
> > ```java
> > int i = '1'; // (int) '1' => 49
> > int j = '1' + '2' * ('4' − '3') + 'b' / 'a'; // ((int)'4' - (int)'3') = 52 - 51 = 1
> >                                              // (int)'2' * 1 = 50 * 1 = 50
> >                                              // (int)'b' / (int)'a' = 98 / 97 = 1
> >                                              // (int)'1' + 50 + 1 = 49 + 50 + 1 = 100
> > int k = 'a'; // (int)'a' = 97
> > char c = 90; // (char) 90 = Z
> > ```

> **4.3.5**
> Can the following conversions involving casting be allowed?
> If so, find the converted result.
>
> > ```java
> > char c = 'A';
> > int i = (int)c; // ✔ => i = 65
> >
> > float f = 1000.34f;
> > int i = (int)f; // ✔ => i = 1000
> >
> > double d = 1000.34;
> > int i = (int)d; // ✔ => i = 1000
> >
> > int i = 97;
> > char c = (char)i; // ✔ => c = 'a'
> > ```

> **4.3.6**
>
> > ```java
> > public class Test {
> >  public static void main(String[] args) {
> >    char x = 'a';
> >    char y = 'c';
> >    System.out.println(++x);   // => 'b'
> >    System.out.println(y++);   // => 'c'
> >    System.out.println(x - y); // (int)'b' - (int)'d' = 98 - 100 = -2
> >  }
> > }
> > ```

> **4.3.7**
> Write the code that generates a random lowercase letter.
>
> > ```java
> > char rndLowerCase = (int) (Math.random() * 26 + 'a'); // [0, 25] + 'a' => ['a', 'z']
> > ```

> **4.3.8**
>
> > ```java
> > System.out.println('a' < 'b');  // true, same as: (int)'a' < (int)'b' => 97 < 98
> > System.out.println('a' <= 'A'); // false, 97 <= 65
> > System.out.println('a' > 'b');  // false, 97 > 98
> > System.out.println('a' >= 'A'); // true, 97 >= 65
> > System.out.println('a' == 'a'); // true, 97 == 97
> > System.out.println('a' != 'b'); // true, 97 != 98
> > ```

> **4.4.1**
> Suppose s1, s2, and s3 are three strings.
> What are the results of the following expressions?
>
> > ```java
> > String s1 = "Welcome to Java";
> > String s2 = "Programming is fun";
> > String s3 = "Welcome to Java";
> >
> > s1 == s2;                // => false, s1 and s2 both interned with different references
> > s2 == s3;                // => false, same reason as the above
> > s1.equals(s2);           // => false, different content
> > s2.equals(s3);           // => false, different content
> > s1.compareTo(s2);        // => 'W' = 87, 'P' = 80 thus 'W' > 'P' result is 7 i.e. s1 is lexicographically after s2
> > s2.compareTo(s3);        // => 'P' = 80, 'W' = 87 thus 'P' < 'W' result is -7 i.e. s1 is lexicographically before s2
> > s2.compareTo(s2);        // => == 0, s1 and s2 are the same word
> > s1.charAt(0);            // => W
> > s1.indexOf('j');         // => -1, there is no 'j' character in s1
> > s1.indexOf("to");        // => 8, left-to-right searching of "to"
> > s1.lastIndexOf('a');     // => 14, right-to-left searching of lowercase character 'a'
> > s1.lastIndexOf("o", 15); // => 9, start from last 'a' search for lowercase String "o"
> > s1.length();             // => 15
> > s1.substring(5);         // => "me to Java", extract substring starting from index 5 to end
> > s1.substring(5, 11);     // => "me to "
> > s1.startsWith("Wel");    // => true
> > s1.endsWith("Java");     // => true
> > s1.toLowerCase();        // => "welcome to java"
> > s1.toUpperCase();        // => "WELCOME TO JAVA"
> > s1.concat(s2);           // => "Welcome to JavaProgramming is fun"
> > s1.contain(s2);          // => compilation error - there is no such method in String class
> > "\t Wel \t".trim();      // => "Wel", trim whitespace characters (' ', \t, \n, \r, \f) from beginning and end
> > ```

> **4.4.2**
> Suppose `s1` and `s2` are two strings.
> Which of the following statements or expressions are incorrect?
>
> > ```java
> > String s = "Welcome to Java";
> > String s3 = s1 + s2;             // ✔, + operator can be used for concatenating strings
> > String s3 = s1 − s2;             // ✖, - is not overloaded operator as +, thus compile-error
> > s1 == s2;                        // ✔, correct if we want to check if both strings are in the same memory location
> > s1 >= s2;                        // ✖, relational operators can't be used for String compression. Use compareTo
> > s1.compareTo(s2);                // ✔, comparing s1 and s2 lexicographically
> > int i = s1.length();             // ✔, get total number of characters of s1
> > char c = s1(0);                  // ✖, compile-error. Use charAt(int index);
> > char c = s1.charAt(s1.length()); // ✖, runtime-error - String index out of range
> > ```

> **4.4.3**
>
> > ```java
> > System.out.println("1" + 1);       // => 11
> > System.out.println('1' + 1);       // => (int)'1' + 1 = 49 + 1 = 50
> > System.out.println("1" + 1 + 1);   // => 111
> > System.out.println("1" + (1 + 1)); // => 12
> > System.out.println('1' + 1 + 1);   // => (int)'1' + 1 + 1 = 49 + 2 = 51
> > ```

> **4.4.4**
> Evaluate the following expressions:
>
> > ```java
> > 1 + "Welcome " + 1 + 1           // => 1Welcome 11
> > 1 + "Welcome " + (1 + 1)         // => 1Welcome 2
> > 1 + "Welcome " + ('\u0001' + 1)  // => 1Welcome 1, \u0001 Start of Heading
> > 1 + "Welcome " + 'a' + 1         // => 1Welcome a1
> > ```

> **4.4.5**
>
> > ```java
> > String s1 = " Welcome ";
> > String s2 = " welcome ";
> >
> > boolean isEqual = s1.equals(s2);            // (a)
> > boolean isEqual = s1.equalsIgnoreCase(s2);  // (b)
> > int x = s1.compareTo(s2);                   // (c)
> > int x = s1.compareToIgnoreCase(s2);         // (d)
> > boolean b = s1.startsWith("AAAA");          // (e)
> > boolean b = s1.endsWith("AAA");             // (f)
> > int x = s1.length();                        // (g)
> > char c = s1.charAt(0);                      // (h)
> > String s3 = s1 + s2;                        // (i)
> > String sub = s1.substring(1);               // (j)
> > String sub = s1.substring(1, 5);            // (k)
> > String downcase = s1.toLowerCase();         // (l)
> > String upcase = s1.toUpperCase();           // (m)
> > String trimmed = s1.trim();                 // (n)
> > int x = s1.indexOf('e');                    // (o)
> > int x = s1.lastIndexOf("abc");              // (p)
> > ```

> **4.4.6, 4.4.7**
> Write one statement to return the number of digits in an `integer` i.
> Write one statement to return the number of digits in a `double` value d.
>
> > ```java
> > int i = (int) (Math.random() * Integer.MAX_VALUE);
> > int digits = ("" + i).length();
> >
> > double j = Math.random() * Double.MAX_VALUE
> > int doubleDigits = (j + "").replace(".", "").length();
> > ```

> **4.5.1**
> If you run Listing 4.3 GuessBirthday.java with input 1 for Set1, Set3, and Set4 and  
> 0 for Set2 and Set5, what will be the birthday?
>
> > Order is: `s5s4s3s2s1` = `01101 => 1 * 2**3 + 1 * 2**2 + 1 * 2**0 = 8 + 4 + 1 = 13`

> **4.5.2**
> If you enter a lowercase letter such as `b`, the program in Listing 4.4  
> displays `B` is `11`. Revise the code as to display `b is 11`.
>
> > ```java
> > System.out.println("The decimal value for hex digit "
> >   + Character.toLowerCase(ch) + " is " + value);
> > ```

> **4.5.3**
> What would be wrong if lines 6 and 7 are in Listing 4.5 replaced by the following code?
> `String lottery = "" + (int)(Math.random() * 100);`
>
> > Lottery number is 2 digit number. Invoking `(int) (Math.random() * 100)` could  
> > pick a number which is one digit long, causing `lottery.charAt(1);` (line 16)  
> > to raise error if one digit number is picked.

> **4.6.1**
> What are the format specifiers for outputting a `Boolean` value,  
>  a `character`, a `decimal integer`, a `floating-point` number, and a `string`?
>
> > `boolean => %b`  
> > `character => %c`  
> > `integer => %d`  
> > `floating-point => %f`  
> > `string => %s`

> **4.6.2**
> What is wrong?
>
> > ```java
> > System.out.printf("|%5d| |%d|", 1, 2, 3);          // => |    1| |2|, warning: Too many arguments for format string (found: 3, expected: 2)
> > System.out.printf("%5d %f", 1);                    // => MissingFormatArgumentException: 2 specifiers but 1 argument
> > System.out.printf("|%5d| |%f|", 1, 2);             // => f != java.lang.Integer, IllegalFormatConversionException
> > System.out.printf("%.2f\n%0.3f\n", 1.23456, 2.34); // => MissingFormatWidthException: 2nd specifier of width 0
> > System.out.printf("%08s\n", "Java");               // => %s can't contain padding zeros only number can. FormatFlagsConversionMismatchException
> > ```

> **4.6.3**
> Show the output:
>
> > NOTES:
> >
> > 1. `%f` by default 6 digits after decimal point.
> > 2. `%f` accepts only floating-point numbers thus `souf("%f", 5); // IllegalFormatConversionException`.
> > 3. `%e` scientific notation. `<0-9>.d1d2d3d4d5d6e**0d`.
> > 4. `%.<n_th>f` will round n-th digit see `e.g. 2`, if evenly spaced rounding up.
> > 5. More arguments can be provided then specifiers (compiler warning) but not the opposite.
> > 6. To print `%` we must escape it with `%%`
> > 7. `Positive width => right justified`, `Negative width => left justified`
> >
> > ```java
> > System.out.printf("amount is %f %e\n", 32.32, 32.32);              // => amount is 32.320000 3.232000e+01
> > System.out.printf("amount is |%5.2f|%% |%5.4e|\n", 32.327, 32.32); // => amount is |32.33|% |3.2320e+01|
> > System.out.printf("|%6b|\n", (1 > 2));                             // => | false|
> > System.out.printf("|%6s|\n", "Java");                              // => |  Java|
> > System.out.printf("|%-6b| |%s|\n", (1 > 2), "Java");               // => |false | |Java|
> > System.out.printf("|%6b| |%-8s|\n", (1 > 2), "Java");              // => | false| |Java    |
> > System.out.printf("|%,5d| |%,6.1f|\n", 312342, 315562.932);        // => |312,342| |315,562.9|
> > System.out.printf("|%05d| |%06.1f|\n", 32, 32.32);                 // => |00032| |0032.3|
> > ```
