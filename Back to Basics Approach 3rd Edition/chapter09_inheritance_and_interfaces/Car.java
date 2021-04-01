package chapter09_inheritance_and_interfaces;

import java.awt.*;

/**
 * BJP3 Exercise 9.4: MonsterTruck
 * https://practiceit.cs.washington.edu/problem/view/bjp3/chapter9/e4-MonsterTruck
 *
 * Project #6
 *
 * @author Alex Golub
 * @since 30-Mar-21 2:34 PM
 */
class Car {
  private Color color;
  private String make;

  Car() {
    color = Color.BLUE;
    make = "Wagon";
  }

  Car(Color color, String make) {
    this.color = color;
    this.make = make;
  }

  void display() {
    System.out.println("Color: " + color + ", Make: " + make);
  }

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

class SubCar extends Car {
  public SubCar() {}

  public SubCar(Color color, String make) {
    super(color, make);
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
  @Override
  public void m1() {
    System.out.println("monster 1");
  }

  @Override
  public void m2() {
    super.m1();
    super.m2();
  }

  @Override
  public String toString() {
    return "monster " + super.toString();
  }

  public static void main(String[] args) {
    Car[] cars = { new Car(), new Truck(), new MonsterTruck() };
    for (Car car : cars) {
      car.m1();
      car.m2();
      System.out.println(car);
      System.out.println();
    }

    Car car = new SubCar();
    car.display();
    car = new SubCar(Color.RED, "Ferrari");
    car.display();
  }
}
