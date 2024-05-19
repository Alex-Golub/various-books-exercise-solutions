# CheckPoint Answers

## 17.2 How Is Text I/O Handled in Java?

### 17.2.1

> What is a text file and what is a binary file? Can you view a text file or a binary file using a text editor?

### 17.2.2

> How do you read or write text data in Java? What is a stream?

## 17.3 Text I/O vs. Binary I/O

## 17.3.1

> What are the differences between text I/O and binary I/O?

## 17.3.2

> How is a Java character represented in the memory, and how is a character represented in a text file?

## 17.3.3

> If you write the string "ABC" to an ASCII text file, what values are stored in the file?

## 17.3.4

> If you write the string "100" to an ASCII text file, what values are stored in the file?  
> If you write a numeric byte-type value 100 using binary I/O, what values are stored in the file?

## 17.3.5

> What is the encoding scheme for representing a character in a Java program?  
> By default, what is the encoding scheme for a text file on Windows?

## 17.4 Binary I/O Classes

### 17.4.1

> The read() method in InputStream reads a byte. Why does it return an int instead of a byte? Find the abstract methods in InputStream and OutputStream.

### 17.4.2

> Why do you have to declare to throw IOException in the method or use a try-catch block to handle IOException for Java I/O programs?

### 17.4.3

> Why should you always close streams? How do you close streams?

### 17.4.4

> Does FileInputStream/FileOutputStream introduce any new methods beyond the methods inherited from InputStream/OutputStream? How do you create a FileInputStream/FileOutputStream?

### 17.4.5

> What will happen if you attempt to create an input stream on a nonexistent file? What will happen if you attempt to create an output stream on an existing file? Can you append data to an existing file?

### 17.4.6

> How do you append data to an existing text file using java.io.PrintWriter? 17.4.7 What is written to a file using writeByte(91) on a FileOutputStream? 17.4.8 What is wrong in the following code? import java.io.*;

> ```java
> public class Test {
>     public static void main(String[] args) {
>         try (
>                 FileInputStream fis = new FileInputStream("test.dat");) {
>         } catch (IOException ex) {
>             ex.printStackTrace();
>         } catch (FileNotFoundException ex) {
>             ex.printStackTrace();
>         }
>     }
> }
> ```

### 17.4.9

> Suppose a file contains an unspecified number of double values that were written to the file using the writeDouble method using a DataOutputStream.  
> How do you write a program to read all these values? How do you detect the end of a file?

### 17.4.10

> How do you check the end of a file in an input stream (FileInputStream, DataInputStream)?

### 17.4.11

> Suppose you run the following program on Windows using the default ASCII encoding after the program is finished.  
> How many bytes are there in the file t.txt? Show the contents of each byte.

> ```java
> public class Test {
>     public static void main(String[] args)
>             throws java.io.IOException {
>         try (java.io.PrintWriter output =
>                      new java.io.PrintWriter("t.txt");) {
>             output.printf("%s", "1234");
>             output.printf("%s", "5678");
>             output.close();
>         }
>     }
> }
> ```

17.4.12 After the following program is finished, how many bytes are there in the file t.dat? Show the contents of each byte.

```java
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        try (DataOutputStream output = new DataOutputStream(
                new FileOutputStream("t.dat"));) {
            output.writeInt(1234);
            output.writeInt(5678);
            output.close();
        }
    }
}
```

17.4.13 For each of the following statements on a DataOutputStream output, how many bytes are sent to the output?

```java
class FooBar {
    public static void main(String[] args) {
        output.writeChar('A');
        output.writeChars("BC");
        output.writeUTF("DEF");
    }
}
```

17.4.14 What are the advantages of using buffered streams? Are the following statements correct?

```java
class FooBarTwo {
    public static void main(String[] args) {
        BufferedInputStream input1 = new BufferedInputStream(new FileInputStream("t.dat"));
        DataInputStream input2 = new DataInputStream(new BufferedInputStream(new FileInputStream("t.dat")));
        DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutnputStream("t.dat")));
    }
}

```
