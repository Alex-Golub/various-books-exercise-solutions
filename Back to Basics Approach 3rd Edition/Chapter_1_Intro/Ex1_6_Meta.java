package Chapter_1_Intro;

/**
 * 6. Write a complete Java program called Meta whose output
 * is the text that would be the source code of a Java program
 * that prints "Hello, world!" as its output.
 *
 * Created by ag on 16-Oct-20 10:58 PM
 */
class Ex1_6_Meta {
  public static void main(String[] args) {
    System.out.println("public class Hello {");
    System.out.println("    public static void main(String[] args) {");
    System.out.println("        System.out.println(\"Hello, world!\");");
    System.out.println("    }");
    System.out.println("}");
  }
}
