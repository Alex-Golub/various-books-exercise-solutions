package org.mrdrprof.solutions.chapter_13_abstract_classes_and_interfaces;

import org.mrdrprof.solutions.utils.chapter_13.*;

class TestEdible {
  public static void main(String[] args) {
    Object[] objects = { new Tiger(), new Chicken(), new Apple() };
    for (Object object : objects) {
      if (object instanceof Edible edible) {
        System.out.println(edible.howToEat());
      }

      if (object instanceof Animal animal) {
        System.out.println(animal.sound());
      }
    }
  }
}
