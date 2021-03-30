package CodeStepByStep_java.inheritance;

/**
 * 1 element 0 George 1
 *             Kramer 2 George 1
 *             Elaine Kramer
 *
 * 2 element 1 Jerry 1 Kramer 1
 *             Kramer 2 Jerry 1 Kramer 1
 *             Kramer
 *
 * 3 element 2 Jerry 1
 *             Jerry 2
 *             Jerry
 *
 * 4 element 3 Jerry 1 Kramer 1
 *             Kramer 2 Jerry 1 Kramer 1
 *             Elaine Kramer
 *
 * @author Alex Golub
 * @since 29-Mar-21 11:26 AM
 */
class George extends Elaine {
  public void method1() { System.out.print("George 1 "); }
}

class Jerry {
  public void method1() { System.out.print("Jerry 1 "); }
  public void method2() { System.out.print("Jerry 2 "); }
  public String toString() { return "Jerry"; }
}

class Elaine extends Kramer {
  public String toString() { return "Elaine " + super.toString(); }
}

class Kramer extends Jerry {
  public void method1() { super.method1(); System.out.print("Kramer 1 "); }
  public void method2() { System.out.print("Kramer 2 "); method1(); }
  public String toString() { return "Kramer"; }
}

public class inheritanceMystery3 {
  public static void main(String[] args) {
    Jerry[] seinfeld = { new George(), new Kramer(), new Jerry(), new Elaine() };

    for (Jerry jerry : seinfeld) {
      jerry.method1();
      System.out.println();
      jerry.method2();
      System.out.println();
      System.out.println(jerry);
      System.out.println();
    }
  }
}
