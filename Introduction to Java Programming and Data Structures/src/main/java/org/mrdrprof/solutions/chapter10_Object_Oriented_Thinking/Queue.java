package org.mrdrprof.solutions.chapter10_Object_Oriented_Thinking;

import java.util.Arrays;

/**
 * *10.10 (The Queue class)
 *
 * @author Mr.Dr.Professor
 * @since 3/23/2021 8:37 PM
 */
/*public*/ class Queue {
  private int[] elements;
  private int size;
  private int head; // points to head of the queue

  public Queue() {
    elements = new int[8];
  }

  public void enqueue(int ele) {
    if (size == elements.length) {
      resize();
    }

    elements[size++] = ele;
  }

  private void resize() {
    int[] temp = new int[elements.length * 2];
    System.arraycopy(elements, 0, temp, 0, elements.length);
    elements = temp;
  }

  public int dequeue() {
    if (empty()) {
      throw new RuntimeException("Queue is empty");
    }

    int returnValue = elements[head++];

    // [1, 2, 3, 4, 5, 6, 0]
    //                    ^
    //                    head, size
    // all values up to head had been dequeued
    // return head and size to first position
    // [1, 2, 3, 4, 5, 6, 0]
    //  ^
    //  head, size
    // and keep enqueuing from start instead of resizing
    // elements array
    if (head == size) {
      head = size = 0;
    }

    return returnValue;
  }

  public boolean empty() {
    return getSize() == 0;
  }

  public int getSize() {
    return size - head;
  }

  // debugging method
  private int[] getElements() {
    return elements;
  }

  public static void main(String[] args) {
    Queue queue = new Queue();
    for (int i = 0; i < 9; i++) {
      queue.enqueue(i + 1);
    }

    System.out.println(Arrays.toString(queue.getElements()));
    System.out.println("queue.getSize() => " + queue.getSize() + "\n");

    for (int i = 0; i < 9; i++) {
      System.out.println("queue.dequeue() => " + queue.dequeue());
    }

    for (int i = 0; i < 3; i++) {
      queue.enqueue((int) (Math.random() * 20));
    }

    System.out.println("\n" + Arrays.toString(queue.getElements()));
    System.out.println("queue.getSize() => " + queue.getSize() + "\n");

    for (int i = 0; i < 3; i++) {
      System.out.println("queue.dequeue() => " + queue.dequeue());
    }

    System.out.println("\n" + Arrays.toString(queue.getElements()));
    System.out.println("queue.getSize() => " + queue.getSize() + "\n");
  }
}
