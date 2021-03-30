package CodeStepByStep_java.inheritance;

/**
 *
 * 1	element b
 *            c 1
 *            a 2  c 1
 *
 * 2	element b
 *            c 1
 *            b 2  c 2
 *
 * 3	element c
 *            c 1
 *            c 2
 *
 * 4	element b
 *            d 1  b 2  c 2
 *            b 2  c 2
 *
 * @author Alex Golub
 * @since 29-Mar-21 10:42 AM
 */
class A extends B {
  public void method2() { System.out.print("a 2  "); method1(); }
}

class B extends C {
  public String toString() { return "b"; }
  public void method2() { System.out.print("b 2  "); super.method2(); }
}

class C {
  public String toString() { return "c"; }
  public void method1() { System.out.print("c 1  "); }
  public void method2() { System.out.print("c 2  "); }
}

class D extends B {
  public void method1() { System.out.print("d 1  "); method2(); }
}

public class inheritanceMystery1 {
  public static void main(String[] args) {
    C[] elements = {new A(), new B(), new C(), new D()};

    for (C element : elements) {
      System.out.println(element);
      element.method1();
      System.out.println();
      element.method2();
      System.out.println();
      System.out.println();
    }
  }
}
