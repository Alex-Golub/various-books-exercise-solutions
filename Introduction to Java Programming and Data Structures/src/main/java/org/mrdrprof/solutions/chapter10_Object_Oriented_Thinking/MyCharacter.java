package org.mrdrprof.solutions.chapter10_Object_Oriented_Thinking;

/**
 * 10.24 (Implement the Character class)
 *
 * @author Mr.Dr.Professor
 * @since 25-Mar-21 2:46 PM
 */
/*public*/ class MyCharacter {
  private final char value;

  public MyCharacter(char value) {
    this.value = value;
  }

  public char charValue() {
    return value;
  }

  public int compareTo(MyCharacter other) {
    return value - other.charValue();
  }

  public boolean equals(MyCharacter other) {
    return compareTo(other) == 0;
  }

  public boolean isDigit() {
    return MyCharacter.isDigit(value);
  }

  public static boolean isDigit(char c) {
    return '0' <= c && c <= '9';
  }

  public static boolean isLetter(char c) {
    return MyCharacter.isLowerCase(c) || MyCharacter.isUpperCase(c);
  }

  public static boolean isLetterOrDigit(char c) {
    return MyCharacter.isDigit(c) || MyCharacter.isLetter(c);
  }

  public static boolean isLowerCase(char c) {
    return 'a' <= c && c <= 'z';
  }

  public static boolean isUpperCase(char c) {
    return 'A' <= c && c <= 'Z';
  }

  public static char toUpperCase(char c) {
    if (isLowerCase(c)) {
      return (char) (c - 'a' + 'A');
    }

    return c; // already uppercase letter or not a letter
  }

  public static char toLowerCase(char c) {
    if (isUpperCase(c)) {
      return (char) (c - 'A' + 'a');
    }

    return c; // already lowercase letter or not a letter
  }

  public static void main(String[] args) {
    char value = 'b';
    MyCharacter myCharacter = new MyCharacter(value);
    System.out.println(myCharacter.charValue());

    MyCharacter a = new MyCharacter('a');
    MyCharacter b = new MyCharacter('b');
    MyCharacter c = new MyCharacter('c');

    System.out.println("compareTo(MyCharacter):");
    System.out.println("  " + myCharacter.compareTo(a));
    System.out.println("  " + myCharacter.compareTo(b));
    System.out.println("  " + myCharacter.compareTo(c));

    System.out.println("\nequals(MyCharacter):");
    System.out.println("  " + myCharacter.equals(a));
    System.out.println("  " + myCharacter.equals(b));
    System.out.println("  " + myCharacter.equals(c));

    System.out.println("\nisDigit(char):");
    System.out.println("  " + myCharacter.isDigit());
    System.out.println("  " + MyCharacter.isDigit('a'));
    System.out.println("  " + MyCharacter.isDigit('9'));

    System.out.println();
    System.out.println(MyCharacter.toUpperCase('z'));
    System.out.println(MyCharacter.toLowerCase('A'));
  }
}
