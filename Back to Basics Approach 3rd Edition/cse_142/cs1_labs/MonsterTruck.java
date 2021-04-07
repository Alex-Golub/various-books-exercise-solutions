package cse_142.cs1_labs;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab9/MonsterTruck
 *
 * test #1:m1
 * console output:
 * monster 1
 * result: pass
 *
 * test #2:m2
 * console output:
 * truck 1
 * car 1
 * result: pass
 *
 * test #3:toString
 * console output:
 * "monster vroomvroom"
 * "monster vroomvroom"
 * result: pass
 *
 *
 * @author Alex Golub
 * @since 07-Apr-21 5:57 PM
 */
class Car {
  public void m1() {
    System.out.println("car 1");
  }

  public void m2() {
    System.out.println("car 2");
  }

  public String toString() {
    return "vroom";
  }
}

class Truck extends Car {
  public void m1() {
    System.out.println("truck 1");
  }

  public void m2() {
    super.m1();
  }

  public String toString() {
    return super.toString() + super.toString();
  }
}

class MonsterTruck extends Truck {
  public void m1() {
    System.out.println("monster 1");
  }

  public void m2() {
    super.m1(); // truck 1
    super.m2(); // car 1
  }

  public String toString() {
    return "monster " + super.toString();
  }
}