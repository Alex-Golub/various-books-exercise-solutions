package chapter09_inheritance_and_interfaces;

/**
 * 17. Declare an interface called Incrementable which represents
 * items that store an integer that can be incremented in
 * some way.
 * ...
 *
 * @author Alex Golub
 * @since 30-Mar-21 5:39 PM
 */
interface Incrementable {
  void increment();
  int getValue();
}

class SequentialIncrementer implements Incrementable {
  private int value;

  @Override
  public void increment() {
    value++;
  }

  @Override
  public int getValue() {
    return value;
  }
}

class RandomIncrementer implements Incrementable {
  private int value = (int) (Math.random() * Integer.MAX_VALUE);

  @Override
  public void increment() {
    value = (int) (Math.random() * Integer.MAX_VALUE);
  }

  @Override
  public int getValue() {
    return value;
  }
}

class IncrementableTest {
  public static void main(String[] args) {
    Incrementable[] incrementables = {new SequentialIncrementer(),
                                      new RandomIncrementer()};

    for (int i = 0; i <= 10; i++) {
      System.out.println(incrementables[0].getClass().getSimpleName() +
                         " value: " + incrementables[0].getValue());
      System.out.println(incrementables[1].getClass().getSimpleName() +
                         " value: " + incrementables[1].getValue());
      System.out.println();

      incrementables[0].increment();
      incrementables[1].increment();
    }
  }
}