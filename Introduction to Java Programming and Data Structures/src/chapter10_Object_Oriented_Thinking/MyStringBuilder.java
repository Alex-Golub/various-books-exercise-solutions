package chapter10_Object_Oriented_Thinking;

import java.util.Arrays;

/**
 * **10.27-28 (Implement the StringBuilder class)
 *
 * @author Mr.Dr.Professor
 * @since 25-Mar-21 4:45 PM
 */
/*public*/ class MyStringBuilder {
  private char[] buffer;
  private int size; // actual elements present in buffer
  private int capacity = 10; // buffer capacity

  public MyStringBuilder() {
    buffer = new char[capacity];
  }

  public MyStringBuilder(String s) {
    this(s.toCharArray());
  }

  public MyStringBuilder(char[] chars) {
    this.buffer = Arrays.copyOf(chars, chars.length);
    capacity = size = chars.length;
  }

  public int length() {
    return size;
  }

  public char charAt(int idx) {
    return buffer[idx];
  }

  /** mutable method, changing the actual content of this object */
  public MyStringBuilder toUpperCase() {
    for (int i = 0; i < length(); i++) {
      buffer[i] = Character.toUpperCase(buffer[i]);
    }

    return this;
  }

  public MyStringBuilder toLowerCase() {
    for (int i = 0; i < length(); i++) {
      buffer[i] = Character.toLowerCase(buffer[i]);
    }

    return this;
  }

  public MyStringBuilder substring(int startIdx, int endIdx) {
    char[] substring = new char[endIdx - startIdx];
    for (int i = 0; i < substring.length; i++) {
      substring[i] = buffer[startIdx++];
    }

    return new MyStringBuilder(substring);
  }

  public MyStringBuilder substring(int startIdx) {
    return substring(startIdx, length());
  }

  public MyStringBuilder reverse() {
    for (int i = 0; i < length() / 2; i++) {
      char temp = buffer[i];
      buffer[i] = buffer[length() - i - 1];
      buffer[length() - i - 1] = temp;
    }

    return this;
  }

  public MyStringBuilder append(MyStringBuilder other) {
    if (capacity - length() < other.length()) {
      increaseCapacity(2 * (length() + other.length())); // double the capacity
    }

    System.arraycopy(other.buffer, 0, buffer, length(), other.length());
    size += other.length();

    return this;
  }

  public MyStringBuilder append(int n) {
    return append(new MyStringBuilder(n + ""));
  }

  public MyStringBuilder insert(int offset, MyStringBuilder s) {
    if (capacity < size + s.length()) {
      increaseCapacity(2 * (size + s.length()));
    }

    String temp = s.toString();
    for (int i = 0; i < temp.length(); i++)
      buffer[size - 1 + temp.length() - i] = buffer[size - 1 - i];

    for (int i = 0; i < temp.length(); i++)
      buffer[i + offset] = temp.charAt(i);

    size += temp.length();

    return this;
  }

  private void increaseCapacity(int newCapacity) {
    char[] temp = new char[newCapacity];
    System.arraycopy(buffer, 0, temp, 0, size);
    buffer = temp;
    capacity = newCapacity;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    for (char c : buffer) {
      if (c == '\u0000') {
        break;
      }
      builder.append(c);
    }

    return builder.toString();
  }

  public static void main(String[] args) {
//    MyStringBuilder builder = new MyStringBuilder();
//    MyStringBuilder builder = new MyStringBuilder("Alex");
//    MyStringBuilder builder = new MyStringBuilder(new char[]{});
    MyStringBuilder builder = new MyStringBuilder("Alex".toCharArray());
    System.out.println(builder);

    System.out.println(builder.length());
    System.out.println(builder.charAt(2));

    MyStringBuilder builder1 = builder.toUpperCase();
    System.out.println(builder1 == builder); // mutable object
    System.out.println(builder);

    builder.toLowerCase();
    System.out.println(builder);

//    MyStringBuilder substring = builder.substring(0, 5);
//    MyStringBuilder substring = builder.substring(0, 0);
    MyStringBuilder substring = builder.substring(2, 4);
//    MyStringBuilder substring = builder.substring(2);
    System.out.println(substring);

    builder.reverse();
    System.out.println(builder);

    System.out.println(builder.append(new MyStringBuilder(" what if this is a joke")));
    System.out.println(builder.length());
    System.out.println(builder.capacity);

    System.out.println(builder.insert(2, new MyStringBuilder("WWWW")));
  }
}