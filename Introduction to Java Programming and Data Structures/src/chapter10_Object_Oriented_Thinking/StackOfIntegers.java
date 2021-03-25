package chapter10_Object_Oriented_Thinking;

/*public*/ class StackOfIntegers {
  public static final int DEFAULT_CAPACITY = 16;
  private int[] elements;
  private int size;

  public StackOfIntegers() {
    this(DEFAULT_CAPACITY);
  }

  public StackOfIntegers(int capacity) {
    elements = new int[capacity];
  }

  public void push(int value) {
    if (size >= elements.length) {
      int[] temp = new int[elements.length * 2];
      System.arraycopy(elements, 0, temp, 0, elements.length);
      elements = temp;
    }

    elements[size++] = value;
  }

  public int pop() {
    return elements[--size];
  }

  public int peek() {
    return elements[size - 1];
  }

  public boolean empty() {
    return size == 0;
  }

  public int getSize() {
    return size;
  }

  public static void main(String[] args) {
    StackOfIntegers stack = new StackOfIntegers();

    for (int i = 0; i < 10; i++)
      stack.push(i); // Push i to the stack

    while (!stack.empty()) // Test if stack is empty
      System.out.print(stack.pop() + " "); // Remove and return from stack
  }
}
