package org.mrdrprof.solutions.chapter10_Object_Oriented_Thinking;

import java.util.Arrays;

/**
 * **10.22-23 (Implement the String class)
 *
 * String class from Java library is immutable:
 * 1. All fields are private
 * 2. No setter methods
 * 3. Fields that are mutable (chars) return copy of them
 * 4. Class can't be extended i.e. final
 *
 * @author Mr.Dr.Professor
 * @since 25-Mar-21 12:26 PM
 */
/*public*/ final class MyString {
  private final char[] chars;
  private final int length;

  public MyString(char[] chars) {
    if (chars == null) {
      chars = new char[0];
    }

    this.chars = Arrays.copyOf(chars, chars.length);
    length = chars.length;
  }

  public MyString(String s) {
    this(s == null ? new char[]{} : s.toCharArray());
  }

  public char charAt(int i) {
    if (i < 0 || i >= length()) {
      throw new StringIndexOutOfBoundsException("Index " + i + " out of bound. " +
                                                "Range: [0, " + (length() - 1) + "]");
    }

    return chars[i];
  }

  public MyString toLowerCase() {
    return convertTo("lowerCase");
  }

  public MyString toUpperCase() {
    return convertTo("upperCase");
  }

  private MyString convertTo(String thisCase) {
    int length = length();
    char[] converted = new char[length];

    switch (thisCase) {
      case "lowerCase":
        for (int i = 0; i < length; i++) {
          converted[i] = Character.toLowerCase(chars[i]);
        }
        break;

      case "upperCase":
        for (int i = 0; i < length; i++) {
          converted[i] = Character.toUpperCase(chars[i]);
        }
        break;
    }

    return new MyString(converted);
  }

  /** return copy of this class string representation as char array */
  public char[] toChars() {
    // chars: char[] is mutable object, return copy of the content
    // to prevent from client directly manipulating this field
    return Arrays.copyOf(chars, length());
  }

  public int length() {
    return length;
  }

  /** extract part of string from start to end (excluded) */
  public MyString substring(int start, int end) {
    if (start > end || Math.abs(end - start) > length()) {
      throw new StringIndexOutOfBoundsException("Can't extract substring from this range");
    }

    char[] substring = new char[end - start];
    for (int i = 0; i < substring.length; i++) {
      substring[i] = chars[start++];
    }

    return new MyString(substring);
  }

  /** extract string from start to end of this string */
  public MyString substring(int from) {
    return substring(from, length());
  }

  /** 0  - if this object and s have the same content
   *  -1 - if this object lexicographically smaller then s
   *  1  - if this object lexicographically greater then s
   */
  public int compare(String s) {
    return toString().compareTo(s);
  }

  /** covert int value to MyString object. Considering sign */
  public static MyString valueOf(int n) {
    int numberLength = (Math.abs(n) + "").length();

    boolean isNegative = false;
    if (n < 0) {
      n *= -1;
      numberLength++; // left most character is left for the sign
      isNegative = true;
    }

    char[] nToChars = new char[numberLength];
    for (int i = nToChars.length - 1; i > 0; i--) {
      nToChars[i] = (char) (n % 10 + '0');
      n /= 10;
    }

    nToChars[0] = isNegative ? '-' : (char) (n + '0');

    return new MyString(nToChars);
  }

  public static MyString valueOf(boolean b) {
    return new MyString(b ? "true" : "false");
  }

  public boolean equals(MyString other) {
    if (other == this) { // same object
      return true;
    }

    return Arrays.equals(other.chars, chars);
  }

  /** string representation of this class */
  public String toString() {
    return new String(chars);
  }

  // Testing method
  public static void main(String[] args) {
    char[] chars = {'a', 'b'};
    MyString myString = new MyString(chars);
    System.out.println("myString.length(): " + myString.length() +
                       ", expected: " + chars.length);
    System.out.println("myString.toChars(): " + Arrays.toString(myString.toChars()) +
                       ", expected: " + Arrays.toString(chars));

    String testString = "alex";
    myString = new MyString(testString);
    System.out.println("\nmyString.length(): " + myString.length() +
                       ", expected: " + testString.length());
    System.out.println("myString.toChars(): " + Arrays.toString(myString.toChars()) +
                       ", expected: " + Arrays.toString(testString.toCharArray()));

    testString = "";
    myString = new MyString(testString);
    System.out.println("\nmyString.length(): " + myString.length() +
                       ", expected: " + testString.length());
    System.out.println("myString.toChars(): " + Arrays.toString(myString.toChars()) +
                       ", expected: " + Arrays.toString(testString.toCharArray()));

    testString = null;
    myString = new MyString(testString);
    System.out.println("\nmyString.length(): " + myString.length() +
                       ", expected: " + 0);
    System.out.println("myString.toChars(): " + Arrays.toString(myString.toChars()) +
                       ", expected: []");

    testString = "alex";
    myString = new MyString(testString);
    int index = 3;
    System.out.println("\nmyString.charAt(3): " + myString.charAt(index) +
                       ", expected: " + testString.charAt(index));

    testString = "ALEX alex AlEx";
    myString = new MyString(testString);
    System.out.println("\nmyString.toLowerCase(): " + myString.toLowerCase() +
                       ", expected: " + testString.toLowerCase());
    System.out.println("\nmyString.toUpperCase(): " + myString.toUpperCase() +
                       ", expected: " + testString.toUpperCase());

    testString = "Test_string";
    myString = new MyString(testString);
    int start = 5, end = 11;
    System.out.printf("\nmyString.substring(%d, %d): \"%s\", expected: \"%s\"\n",
                      start, end,
                      myString.substring(start, end),
                      testString.substring(start, end));

    System.out.printf("\nmyString.substring(%d): \"%s\", expected: \"%s\"\n",
                      start,
                      myString.substring(start),
                      testString.substring(start));

    testString = "tEST";
    System.out.printf("\nmyString.compare(\"%s\"): %d, expected: %d\n",
                      testString,
                      myString.compare(testString),
                      myString.toString().compareTo(testString));

    String s = "abc";
    MyString s1 = new MyString(s);
    MyString s2 = new MyString(s + "d");
    System.out.printf("\ns1.equals(s2): %b, expected: %b\n",
                      s1.equals(s2),
                      s.equals(s + "d"));

    int n = -123;
    MyString valueOf = MyString.valueOf(n);
    System.out.printf("MyString.valueOf(%d): %s, expected: %s\n",
                      n, valueOf, n + "");

    boolean b = false;
    MyString valueOf1 = MyString.valueOf(b);
    System.out.printf("MyString.valueOf(b): %s, expected: %s\n",
                      valueOf1, b);
  }
}
