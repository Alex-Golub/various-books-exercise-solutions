package CodeStepByStep_java.inheritance;

/**
 * 1 element 0 Eve ts
 *             Eve a
 *             Eve b
 *
 * 2 element 1 Sam ts
 *             Eve a
 *             Eve a   Sam b
 *
 * 3 element 2 Sam ts Sam ts
 *             Lucas a   Sam ts Sam ts
 *             Lucas a   Sam ts Sam ts   Sam b
 *
 * 4 element 3 Josh ts
 *             Lucas a   Josh ts
 *             Josh b   Lucas a   Josh ts   Sam b
 *
 * @author Alex Golub
 * @since 29-Mar-21 12:01 PM
 */
class Eve {
  public void a() { System.out.print("Eve a   "); }
  public void b() { System.out.print("Eve b   "); }
  public String toString() { return "Eve ts"; }
}

class Sam extends Eve {
  public void b() { a(); System.out.print("Sam b   "); }
  public String toString() { return "Sam ts"; }
}

class Lucas extends Sam {
  public void a() {
    System.out.print("Lucas a   ");
    System.out.print(toString() + "   ");
  }

  public String toString() {
    String sup = super.toString();
    return sup + " " + sup;
  }
}

class Josh extends Lucas {
  public void b() { System.out.print("Josh b   "); super.b(); }
  public String toString() { return "Josh ts"; }
}

public class inheritanceMystery5 {
  public static void main(String[] args) {
    Eve[] elements = { new Eve(), new Sam(), new Lucas(), new Josh() };

    for (Eve element : elements) {
      System.out.println(element);
      element.a();
      System.out.println();
      element.b();
      System.out.println();
      System.out.println();
    }
  }
}
