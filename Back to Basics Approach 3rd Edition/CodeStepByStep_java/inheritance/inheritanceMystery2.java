package CodeStepByStep_java.inheritance;

/**
 * 1 element 0 Arya-a
 *             Oberyn
 *             Oberyn-b   Arya-a   Arya-b
 *
 * 2 element 1 Arya-a
 *             Arya
 *             Arya-a   Arya-b
 *
 * 3 element 2 Brienne-a
 *             Oberyn
 *             Oberyn-b   Brienne-a   Arya-b
 *
 * 4 element 3 Arya-a   Tyrion-a
 *             Arya
 *             Arya-a   Tyrion-a   Arya-b
 *
 * @author Alex Golub
 * @since 29-Mar-21 10:56 AM
 */
class Brienne extends Oberyn {
  public void a() { System.out.print("Brienne-a   "); }
}

class Arya {
  public void a() {System.out.print("Arya-a   "); }
  public void b() { a(); System.out.print("Arya-b   "); }
  public String toString() { return "Arya"; }
}

class Tyrion extends Arya {
  public void a() { super.a(); System.out.print("Tyrion-a   "); }
}

class Oberyn extends Arya {
  public void b() { System.out.print("Oberyn-b   "); super.b(); }
  public String toString() { return "Oberyn"; }
}

public class inheritanceMystery2 {
  public static void main(String[] args) {
    Arya[] thrones = { new Oberyn(), new Arya(), new Brienne(), new Tyrion() };

    for (Arya throne : thrones) {
      throne.a();
      System.out.println();
      System.out.println(throne);
      throne.b();
      System.out.println();
      System.out.println();
    }
  }
}
