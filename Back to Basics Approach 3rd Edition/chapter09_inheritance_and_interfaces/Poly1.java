package chapter09_inheritance_and_interfaces;

/**
 * @author Alex Golub
 * @since 28-Mar-21 8:04 PM
 */
class Bay extends Lake {
  public void method1() {
    System.out.print("Bay 1 ");
    super.method2();
  }

  public void method2() {
    System.out.print("Bay 2 ");
  }
}

class Pond {
  public void method1() {
    System.out.print("Pond 1 ");
  }

  public void method2() {
    System.out.print("Pond 2 ");
  }

  public void method3() {
    System.out.print("Pond 3 ");
  }
}

class Ocean extends Bay {
  public void method2() {
    System.out.print("Ocean 2 ");
  }
}

class Lake extends Pond {
  public void method3() {
    System.out.print("Lake 3 ");
    method2();
  }
}

public class Poly1 {
  public static void main(String[] args) {
    Pond[] ponds = {new Ocean(), new Pond(), new Lake(), new Bay()};

    for (Pond p : ponds) {
      p.method1();
      System.out.println();
      p.method2();
      System.out.println();
      p.method3();
      System.out.println("\n");
    }

    Pond var1 = new Bay();
    Object var2 = new Ocean();

    ((Lake) var1).method1();
    System.out.println();
    ((Bay) var1).method1();
    System.out.println();
    ((Pond) var2).method2();
    System.out.println();
    ((Lake) var2).method2();
    System.out.println();
    ((Ocean) var2).method3();
    System.out.println();
  }
}
