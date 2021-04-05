package cse_142.cs1_sections.section01_printing_methods;

/**
 * https://practiceit.cs.washington.edu/problem/view/3571?categoryid=301
 *
 * I am method 1.
 * I am method 1.
 * I am method 2.
 * I am method 3.
 * I am method 1.
 * I am method 1.
 * I am method 2.
 * I am method 1.
 * I am method 2.
 * I am method 3.
 * I am method 1.
 *
 * @author Alex Golub
 * @since 01-Apr-21 3:36 PM
 */
class Confusing {
  public static void method1() {
    System.out.println("I am method 1.");
  }

  public static void method2() {
    method1();
    System.out.println("I am method 2.");
  }

  public static void method3() {
    method2();
    System.out.println("I am method 3.");
    method1();
  }

  public static void main(String[] args) {
    method1();
    method3();
    method2();
    method3();
  }
}
