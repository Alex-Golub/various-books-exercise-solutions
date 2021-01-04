<h1 align="center" id="home"><u>Self-Check Answers</u></h1>

[Section 6.1: File-Reading Basics](#1)  
[Section 6.2: Details of Token-Based Processing](#2)  
[Section 6.3: Line-Based Processing](#3)  
[Section 6.4: Advanced File Processing](#4)

<h3 align="center" id="1"><u>Section 6.1: File-Reading Basics</u><a href="#home"> 👆</a></h3>

> 1 . How can we read data from a file in Java?
>
> > Using a `Scanner` in conjunction with a `File` object.

> 2. What is wrong with the following line of code?
>    > ```java
>    > Scanner input = new Scanner("test.dat"); // Scanner will read the String "text.dat"
>    >                                          // and not the file text.dat
>    >                                          // Correct way will be new Scanner(new File("text.dat"));
>    > ```

> 3. Which of the following is the correct syntax to declare a `Scanner` to read the  
>     file `example.txt` in the current directory?
>    > ```java
>    > Scanner input = new Scanner("C:\example.txt");        // ✖, will read the string "C:\example.txt"
>    > Scanner input = new Scanner(new File("example.txt")); // ✔
>    > Scanner input = new File("\\example.txt");            // ✖, compilation-error, Scanner is not-a File
>    > File input = new Scanner("/example.txt");             // ✖, compilation-error, File is not-a Scanner
>    > Scanner input = new Scanner("C:/example.txt");        // ✖, will read the string "C:/example.txt"
>    > ```

> 4. Write code to construct a `Scanner` object to read the file `input.txt`,  
>     which exists in the same folder as your program.
>    > ```java
>    > Scanner input = new Scanner(new File("input.txt"));
>    > ```

---

<h3 align="center" id="2"><u>Section 6.2: Details of Token-Based Processing</u><a href="#home"> 👆</a></h3>

> 5. Given the following line of input, what tokens does a `Scanner` break the line apart into?
>    `welcome...to the matrix.`
>    > "welcome...to", "the", "matrix."

> 6. Given the following line of input, what tokens does a Scanner break the line apart into?
>    `in fourteen-hundred 92`  
>    `columbus sailed the ocean blue :)`
>    > "in", "fourteen-hundred", "92", "columbus", "sailed", "the", "ocean", "blue", ":)"

> 7. How many tokens are there in the following input, and what `Scanner` method(s)  
>     can be used to read each of the tokens?
>    `Hello there,how are you?`  
>     `I am "very well", thank you.`  
>     `12 34 5.67 (8 + 9) "10"`
>    > token #1 **_Hello_**
>    > token #2 **_there,how_**
>    > token #3 **_are_**
>    > token #4 **_you?_**
>    > token #5 **_I_**
>    > token #6 **_am_**
>    > token #7 **_"very_**
>    > token #8 **_well",_**
>    > token #9 **_thank_**
>    > token #10 **_you._**
>    > token #11 **_12_**
>    > token #12 **_34_**
>    > token #13 **_5.67_**
>    > token #14 **_(8_**
>    > token #15 **_+_**
>    > token #16 **_9)_**
>    > token #17 **_"10"_**
>    > number of tokens that can be read as an integer **_2_**
>    > number of tokens that can be read as a real number **_3_**
>    > number of tokens that can be read as a string **_17_**

> 8. What is wrong with the following line of code?
>    > ```java
>    > // \t is tab escape character and \n is new line character.
>    > // We have to escape it with another \ or use single /
>    > Scanner input = new Scanner(new File("C:\temp\new files\test.dat"));
>    >
>    > // correct statement
>    > Scanner input = new Scanner(new File("C:\\temp\\new files\\test.dat"));
>    > ```

> 9. Answer the following questions about a Java program located on a  
>     **_Windows machine_** in the folder `C:\Users\amanda\Documents\programs`
>    > a. What are the legal ways you can refer to the file `C:\Users\amanda\Documents\programs\numbers.dat?`  
>    > `"numbers.dat"`  
>    > `"C:/Users/amanda/Documents/programs/numbers.dat"`
>    >
>    > b. What are the legal ways you can refer to the file `C:\Users\amanda\Documents\programs\data\homework6\input.dat?`  
>    > `"C:/Users/amanda/Documents/programs/data/homework6/input.dat"`  
>    > `"data/homework6/input.dat"`
>    >
>    > c. What are the legal ways you can refer to the file `C:\Users\amanda\Documents\homework\data.txt?`  
>    > `"C:/Users/amanda/Documents/homework/data.txt"`

> 10. Answer the following questions about a Java program located on a **_Linux machine_** in the folder
>     `/home/amanda/Documents/hw6`
>     > a. What are two legal ways you can refer to the file `/home/amanda/Documents/hw6/names.txt`  
>     > `"/home/amanda/Documents/hw6/names.txt"`  
>     > `"names.txt"`
>     >
>     > b. How can you refer to the file `/home/amanda/Documents/hw6/data/numbers.txt`  
>     > `"/home/amanda/Documents/hw6/data/numbers.txt"`  
>     > `"data/numbers.txt"`
>     >
>     > c. How many legal ways can you refer to the file `/home/amanda/download/saved.html`  
>     > `"/home/amanda/download/saved.html"`

> 11. Correct
>     > ```java
>     > public class Oops6 {
>     >   public static void main(String[] args) throws FileNotFoundException {
>     >     Scanner in = new Scanner(new File("example.txt"));
>     >     countWords(in);
>     >   }
>     >
>     >   // Counts total lines and words in the input scanner.
>     >   public static void countWords(Scanner input) {
>     >     int lineCount = 0;
>     >     int wordCount = 0;
>     >
>     >     while (input.hasNextLine()) {
>     >       String line = input.nextLine();   // read one line
>     >       lineCount++;
>     >       Scanner sc = new Scanner(line);
>     >       while (sc.hasNext()) {           // tokens in line
>     >         wordCount++;
>     >         sc.next();
>     >       }
>     >     }
>     >
>     >     System.out.println("Lines: " + lineCount);
>     >     System.out.println("Words: " + wordCount);
>     >   }
>     > }
>     > ```

---

<h3 align="center" id="3"><u>Section 6.3: Line-Based Processing</u><a href="#home"> 👆</a></h3>

> 12. For the next several questions, consider a file called `readme.txt` that has the  
>      What would be the output from the following code when it is run on the `readme.txt` file?
>     > ```java
>     > Scanner input = new Scanner(new File("readme.txt"));
>     > int count = 0;
>     > while (input.hasNextLine()) {
>     >   System.out.println("input: " + input.nextLine());
>     >   count++;
>     > }
>     > System.out.println(count + " total");
>     >
>     > // input: 6.7     This file has
>     > // input:         several input lines.
>     > // input:
>     > // input:   10 20         30   40
>     > // input:
>     > // input: test
>     > // 6 total
>     > ```

> 13. What would be the output from the code in the previous exercise if the calls to  
>     `hasNextLine` and `nextLine` were replaced by calls to `hasNext` and `next`, respectively?
>     > ```java
>     > Scanner input = new Scanner(new File("readme.txt"));
>     > int count = 0;
>     > while (input.hasNext()) {
>     >   System.out.println("input: " + input.next());
>     >   count++;
>     > }
>     > System.out.println(count + " total");
>     >
>     > // input: 6.7
>     > // input: This
>     > // input: file
>     > // input: has
>     > // input: several
>     > // input: input
>     > // input: lines.
>     > // input: 10
>     > // input: 20
>     > // input: 30
>     > // input: 40
>     > // input: test
>     > // 12 total
>     > ```

> 14. What would be the output from the code in the previous exercise if the calls to  
>      `hasNextLine` and `nextLine` were replaced by calls to `hasNextInt` and `nextInt`, respectively?  
>      How about `hasNextDouble` and `nextDouble`?
>     > ```java
>     > // hasNextInt/nextInt       => 0 total
>     > // hasNextDouble/nextDouble => input: 6.7
>     > //                          => 1 total
>     > ```

> 15. Write a program that prints itself to the console as output.
>     For example, if the program is stored in `PrintMyself.java`, it will open the
>     file `PrintMyself.java` and print its contents to the console.
>     > ```java
>     > public class PrintMyself {
>     >   public static void main(String[] args) throws FileNotFoundException {
>     >     Scanner sc = new Scanner(new File("PrintMyself.java"));
>     >     while (sc.hasNextLine()) {
>     >       System.out.println(sc.nextLine());
>     >     }
>     >   }
>     > }
>     > ```

> 15.2. Given the following file contents, what will be the output from each of the  
> following code fragments?
>
> > ```java
> > // 1. Line based
> > Scanner input = new Scanner(new File("brownfox.txt"));
> > while (input.hasNextLine()) {
> >   String line = input.nextLine();
> >   System.out.println(line);
> > }
> > // the quick brown
> > //    fox   jumps
> > //
> > //        over
> > // the lazy    dog
> >
> > // 2. Token based
> > Scanner input = new Scanner(new File("brownfox.txt"));
> > while (input.hasNext()) {
> >   String token = input.next();
> >   System.out.println(token);
> > }
> > // the
> > // quick
> > // brown
> > // fox
> > // jumps
> > // over
> > // the
> > // lazy
> > // dog
> > ```

> 16. Write code that prompts the user for a file name and prints the contents of that  
>      file to the console as output. Assume that the file exists.
>     > ```java
>     > public static void printEntireFile() throws FileNotFoundException {
>     >   Scanner console = new Scanner(System.in);
>     >   System.out.print("Type a file name: ");
>     >   String fileName = console.nextLine();
>     >
>     >   Scanner reader = new Scanner(new File(fileName));
>     >   while (reader.hasNextLine())
>     >     System.out.println(reader.nextLine());
>     > }
>     > ```

> 17. Write a program that takes as input lines of text print them inside a box figure
>     > ```java
>     > public static void printBox(Scanner reader, int n) throws FileNotFoundException {
>     >   printLine(n);
>     >   while (reader.hasNextLine()) {
>     >     String line = reader.nextLine();
>     >     System.out.printf("| %s ", line);
>     >
>     >     // print spaces
>     >     for (int i = line.length(); i < n; i++)
>     >       System.out.print(" ");
>     >     System.out.println("|");
>     >   }
>     >   printLine(n);
>     > }
>     >
>     > public static void printLine(int n) {
>     >   System.out.print("+");
>     >   for (int i = 0; i < n + 2; i++)
>     >     System.out.print("-");
>     >   System.out.println("+");
>     > }
>     > ```

---

<h3 align="center" id="4"><u>Section 6.4:Advanced File Processing</u><a href="#home"> 👆</a></h3>

> 18. What object is used to write output to a file?
>     What methods does this object have available for you to use?
>     > ✔ `PrintStream` is the class of `out` in `System` class, it can be attached to  
>     > console as in `System.out` or into a file.  
>     > ✖ `String` is a String class providing String methods.
>     > ✖ `DrawingPanel` is Class used for drawings.  
>     > ✖ `Scanner` class allow to read from various sources (console, file, strings ...)
>     > ✖ `Random` class is used to generate pseudo-random numbers.
>     >
>     > `printf`, `print` and `println` are part of `PrintStream` class.

> 19. Write code to print the following four lines of text into a file named `message.txt`:
>     > Testing,  
>     > 1, 2, 3.
>     >
>     > This is my output file.
>     >
>     > ```java
>     > PrintStream output = new PrintStream("message.txt");
>     > String source = "" +
>     >                 "Testing,\n" +
>     >                 "1, 2, 3.\n" +
>     >                 "\n" +
>     >                 "This is my output file.";
>     > Scanner reader = new Scanner(source);
>     > while (reader.hasNextLine())
>     >   output.println(reader.nextLine());
>     > ```

> 20. Write code that repeatedly prompts the user for a file name until the user types  
>      the name of a file that exists on the system.
>     > ```java
>     > public static String getFileName() {
>     >   Scanner console = new Scanner(System.in);
>     >   File f;
>     >   do {
>     >     System.out.print("Type a file name: ");
>     >     f = new File(console.nextLine());
>     >   } while (!f.canRead());
>     >
>     >   return f.getName();
>     > }
>     > ```

> 21. In Problem 16, you wrote a piece of code that prompted the user for a file name  
>      and printed that file’s contents to the console.  
>      Modify your code so that it will repeatedly prompt the user for the file name  
>      until the user types the name of a file that exists on the system.
>     > ```java
>     > public static void printEntireFile2() throws FileNotFoundException {
>     >   Scanner console = new Scanner(System.in);
>     >   File file;
>     >   do {
>     >     System.out.print("Type a file name: ");
>     >     file = new File(console.nextLine());
>     >   } while (!file.canRead());
>     >
>     >   Scanner reader = new Scanner(file);
>     >   while (reader.hasNextLine()) {
>     >     System.out.println(reader.nextLine());
>     >   }
>     > }
>     > ```

---
