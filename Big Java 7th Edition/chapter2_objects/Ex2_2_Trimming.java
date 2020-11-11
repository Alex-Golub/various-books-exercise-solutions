package chapter2_objects;

/**
 * • E2.2 Look into the API documentation of the String class and locate
 * the trim method.
 * Write a program demonstrating what it does.
 * Then show how you can use the replace method to remove all
 * spaces from a string.
 *
 * Created by ag on 08-Nov-20 12:53 PM
 */
class Ex2_2_Trimming {
  public static void main(String[] args) {
    String name = "    MrDrProf.    ";
    System.out.println("name => |" + name +
            "|, length => " + name.length());

    String trimmed = name.trim();
    System.out.println("trimmed => |" + trimmed +
            "|, length => " + trimmed.length());

    String replaced = name.replace(" ", "");
    System.out.println("replaced => |" + replaced +
            "|, length => " + replaced.length());

    String leadingRemoved = name.stripLeading();
    System.out.println("leadingRemoved => |" + leadingRemoved +
            "|, length => " + leadingRemoved.length());

    String trailingRemoved = name.stripTrailing();
    System.out.println("trailingRemoved => |" + trailingRemoved +
            "|, length => " + trailingRemoved.length());
  }
}
