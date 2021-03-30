package CodeStepByStep_java.inheritance;

/**
 * 1 element 0 Rey
 *             Rey 1
 *             Finn 2   Rey 1
 *
 * 2 element 1 Rey
 *             Rey 1
 *             Rey 2
 *
 * 3 element 2 Poe Kylo
 *             Kylo 1
 *             Finn 2   Kylo 1   Poe 2
 *
 * 4 element 3 Kylo
 *             Kylo 1
 *             Finn 2   Kylo 1
 *
 * @author Alex Golub
 * @since 29-Mar-21 11:47 AM
 */
class Poe extends Kylo {
  public void method2() { super.method2(); System.out.print("Poe 2   "); }
  public String toString() { return "Poe " + super.toString(); }
}

class Kylo extends Finn {
  public void method1() { System.out.print("Kylo 1   "); }
  public String toString() { return "Kylo"; }
}

class Finn extends Rey {
  public void method2() { System.out.print("Finn 2   "); method1(); }
}

class Rey {
  public String toString() { return "Rey";}
  public void method1() { System.out.print("Rey 1   ");}
  public void method2() { System.out.print("Rey 2   "); }
}

public class inheritanceMystery4 {
  public static void main(String[] args) {
    Rey[] elements = { new Finn(), new Rey(), new Poe(), new Kylo() };

    for (Rey element : elements) {
      System.out.println(element);
      element.method1();
      System.out.println();
      element.method2();
      System.out.println();
      System.out.println();
    }
  }
}
