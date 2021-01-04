package chapter6_file_processing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 5. Write a program that plays a game where a player is asked to
 * fill in various words of a mostly complete story without being
 * able to see the rest. Then the user is shown his/her story,
 * which is often funny. The input for your program
 * is a set of story files, each of which contains “placeholder”
 * tokens surrounded by < and >
 *
 * NOTE: you can use story.txt from directory or create you own
 *
 * @author Mr.Dr.Professor
 * @since 04-Jan-21 5:25 PM
 */
class PP6_5_wordGame {
  static final Scanner console = new Scanner(System.in);

  public static void main(String[] args) throws FileNotFoundException {
    File file = prompt();
    showStory(new Scanner(file));
    replacePlaceholders(new Scanner(file));
  }

  private static void replacePlaceholders(Scanner input) {
    StringBuilder res = new StringBuilder();

    while (input.hasNextLine()) {
      String line = input.nextLine();

      Scanner tokenReader = new Scanner(line);
      while (tokenReader.hasNext()) {
        String token = tokenReader.next();

        if (token.startsWith("<") && token.endsWith(">")) {
          String placeholder = token.substring(1, token.length() - 1);
          token = askUser(placeholder);
        }

        res.append(token);
        if (tokenReader.hasNext())
          res.append(" ");
      }

      res.append("\n");
    }

    System.out.println("\n" + res);
  }

  private static String askUser(String placeholder) {
    System.out.print("Please enter an " + placeholder + ": ");
    return console.next();
  }

  private static void showStory(Scanner input) {
    System.out.println();
    while (input.hasNextLine())
      System.out.println(input.nextLine());
    System.out.println();
  }

  private static File prompt() {
    File f;
    while (true) {
      System.out.print("Input file name? ");
      f = new File(console.next());
      if (f.canRead())
        break;

      System.out.println(">> Error: file \"" + f.getName() +
                         "\" can't be read, try again");
    }

    return f;
  }
}
