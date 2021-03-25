package chapter10_Object_Oriented_Thinking;

import java.util.Random;

/**
 * 10.3 (The MyInteger class)
 *
 * @author Mr.Dr.Professor
 * @since 3/22/2021 7:46 PM
 */
/*public*/ class MyInteger {
  private int value;

  public MyInteger(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public boolean isEven() {
    return MyInteger.isEven(getValue());
  }

  public boolean isOdd() {
    return MyInteger.isOdd(getValue());
  }

  public boolean isPrime() {
    return MyInteger.isPrime(getValue());
  }

  public static boolean isEven(int value) {
    return value % 2 == 0;
  }

  public static boolean isOdd(int value) {
    return !MyInteger.isEven(value);
  }

  public static boolean isPrime(int value) {
    if (value <= 1) {
      return false;
    }

    if (value == 2 || value == 3) {
      return true;
    }

    if (value % 2 == 0) {
      return false;
    }

    if (value % 6 != 1 && value % 6 != 5) {
      return false;
    }

    for (int i = 5; i * i <= value; i += 2) {
      if (value % i == 0) {
        return false;
      }
    }

    return true;
  }

  public static boolean isEven(MyInteger myInteger) {
    return MyInteger.isEven(myInteger.getValue());
  }

  public static boolean isOdd(MyInteger myInteger) {
    return MyInteger.isOdd(myInteger.getValue());
  }

  public static boolean isPrime(MyInteger myInteger) {
    return MyInteger.isPrime(myInteger.value);
  }

  public boolean equals(int other) {
    return getValue() == other;
  }

  public boolean equals(MyInteger other) {
    return other != null && equals(other.getValue());
  }

  /**
   * parse char array into integer, works with negative values.
   * NOTE: if number is greater then Integer.MAX_VALUE are smaller then
   * Integer.MIN_VALUE overflow occurs
   */
  public static int parseInt(char[] chars) {
    int result = 0, power = 1;
    for (int i = chars.length - 1; i > 0; i--) {
      result += (chars[i] - '0') * power;
      power *= 10;
    }

    // consider first character value in chars
    if (chars[0] == '-') {
      result *= -1;
    } else {
      result += (chars[0] - '0') * power;
    }

    return result;
  }

  public static int parseInt(String s) {
    return MyInteger.parseInt(s.toCharArray());
  }

  /** Class test method */
  public static void main(String[] args) {
    Random random = new Random();
    final int BOUND = 100;

    MyInteger myInteger = new MyInteger(random.nextInt(BOUND));
    int value = myInteger.getValue();

    System.out.printf("myInteger.isEven(%d)  => %b\n", value, myInteger.isEven());
    System.out.printf("myInteger.isOdd(%d)   => %b\n", value, myInteger.isOdd());
    System.out.printf("myInteger.isPrime(%d) => %b\n\n", value, myInteger.isPrime());

    int randomValue = random.nextInt(BOUND);
    System.out.printf("MyInteger.isEven(%d)  => %b\n", randomValue, MyInteger.isEven(randomValue));
    System.out.printf("MyInteger.isOdd(%d)   => %b\n", randomValue, MyInteger.isOdd(randomValue));
    System.out.printf("MyInteger.isPrime(%d) => %b\n\n", randomValue, MyInteger.isPrime(randomValue));

    randomValue = random.nextInt(BOUND);
    System.out.printf("MyInteger.isEven(new MyInteger(%d))  => %b\n", randomValue, MyInteger.isEven(new MyInteger(randomValue)));
    randomValue = random.nextInt(BOUND);
    System.out.printf("MyInteger.isOdd(new MyInteger(%d))   => %b\n", randomValue, MyInteger.isOdd(new MyInteger(randomValue)));
    randomValue = random.nextInt(BOUND);
    System.out.printf("MyInteger.isPrime(new MyInteger(%d)) => %b\n\n", randomValue, MyInteger.isPrime(new MyInteger(randomValue)));

    System.out.printf("myInteger.equals(%d) => %b\n", value, myInteger.equals(value));
    System.out.printf("myInteger.equals(%d) => %b\n", randomValue, myInteger.equals(randomValue));
    System.out.printf("myInteger.equals(new MyInteger(%d)) => %b\n",
                      randomValue, myInteger.equals(new MyInteger(randomValue)));

    System.out.println(MyInteger.parseInt((Integer.MAX_VALUE + "").toCharArray()) == Integer.MAX_VALUE);
    System.out.println(MyInteger.parseInt((Integer.MIN_VALUE + "").toCharArray()) == Integer.MIN_VALUE);

    System.out.println(MyInteger.parseInt((Integer.MAX_VALUE + "")) == Integer.MAX_VALUE);
    System.out.println(MyInteger.parseInt((Integer.MIN_VALUE + "")) == Integer.MIN_VALUE);
  }
}
