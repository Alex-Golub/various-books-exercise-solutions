package chapter6_file_processing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 3. Write a program that prompts the user for a file name,
 * assuming that the file contains a Java program.
 * Your program should read the file and print its contents properly indented.
 * 1. When you see a left-brace character ({) in the file, increase your
 * indentation level by four spaces.
 * 2. When you see a right-brace character (}), decrease your indentation
 * level by four spaces.
 *
 * You may assume that the file has only one opening or closing brace per line,
 * that every block statement (such as if or for) uses braces rather than
 * omitting them, and that every relevant occurrence of a { or }
 * character in the file occurs at the end of a line.
 *
 * Use jc.txt from this directory otherwise use you own
 *
 * @author Mr.Dr.Professor
 * @since 04-Jan-21 3:17 PM
 */
class PP6_3_indent {
  static final Scanner console   = new Scanner(System.in);
  static       int     INDENT_BY = 4;

  public static void main(String[] args) throws FileNotFoundException {
    File file = readFile();
    indent(new Scanner(file));
  }

  private static File readFile() {
    File f;
    while (true) {
      System.out.print("Enter file name: ");
      f = new File(console.next());
      if (f.canRead())
        break;

      System.out.println(">> Error: " + f.getName() + " can't be read, try again");
    }

    return f;
  }

  // { ...
  // ... {
  // } ...
  // ... }
  public static void indent(Scanner input) {
    int indentation = 0;

    if (input.hasNextLine()) {
      String prevLine = input.nextLine();
      System.out.println(prevLine);

      while (input.hasNextLine()) {
        String line = input.nextLine();

        if (prevLine.startsWith("{") || prevLine.endsWith("{")) {
          indentation += INDENT_BY;
        } else if (line.startsWith("}") || line.endsWith("}")) {
          indentation -= INDENT_BY;
        }

        System.out.println(" ".repeat(indentation) + line);
        prevLine = line;
      }
    }
  }
}
