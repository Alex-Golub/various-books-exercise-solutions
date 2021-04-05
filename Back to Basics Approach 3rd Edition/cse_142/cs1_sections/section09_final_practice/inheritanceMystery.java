package cse_142.cs1_sections.section09_final_practice;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/sections/section9/inheritanceMystery
 *
 * elements[0]: B  => a
 *                    a 1
 *                    b 2
 * elements[1]: C  => c
 *                    c 1
 *                    c 2
 * elements[2]: A  => a
 *                    a 1
 *                    c 2
 * elements[3]: D  => c
 *                    d 1
 *                    c 2
 *
 * @author Alex Golub
 * @since 04-Apr-21 2:32 PM
 */
class inheritanceMystery {
  public static void main(String[] args) {
    C[] elements = {new B(), new C(), new A(), new D()};
    for (C element : elements) {
      System.out.println(element);
      element.method1();
      element.method2();
      System.out.println();
    }
  }
}

class D extends C {
  public void method1() { System.out.println("d 1"); }
}

class C {
  public void method1() { System.out.println("c 1"); }
  public void method2() { System.out.println("c 2"); }
  public String toString() { return "c"; }
}

class A extends C {
  public void method1() { System.out.println("a 1"); }
  public String toString() { return "a"; }
}

class B extends A {
  public void method2() { System.out.println("b 2"); }
}