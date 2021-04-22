package cse_143.cs2_sections.section01_arrayList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Class ArrayIntList can be used to store a list of integers.
 *
 * @since 21-Apr-21, 10:57 PM
 */
class ArrayIntList implements Iterable<Integer> {
  private int[] elementData;  // list of integers
  private int size = 0;       // current number of elements in the list
  
  public static final int DEFAULT_CAPACITY = 10;
  
  // post: constructs an empty list of default capacity
  public ArrayIntList() {
    this(DEFAULT_CAPACITY);
  }
  
  // pre : capacity >= 0
  // post: constructs an empty list with the given capacity
  private ArrayIntList(int capacity) {
    if (capacity < 0) {
      throw new IllegalArgumentException("Capacity must be at least 0: " + capacity);
    }
    elementData = new int[capacity];
  }
  
  // for creating test cases more easily
  public ArrayIntList(int... elements) {
    this(Math.max(DEFAULT_CAPACITY, elements.length * 2));
    for (int n : elements) {
      add(n);
    }
  }
  
  // for creating test cases more easily (a dupe of the above constructor)
  public static ArrayIntList withValues(int... elements) {
    ArrayIntList list = new ArrayIntList(Math.max(DEFAULT_CAPACITY, elements.length * 2));
    for (int n : elements) {
      list.add(n);
    }
    return list;
  }
  
  // for creating test cases more easily
  public ArrayIntList(int element, boolean notCapacity) {
    this();
    add(element);
  }
  
  // for creating test cases more easily
  public ArrayIntList(Collection<Integer> elements) {
    this(Math.max(DEFAULT_CAPACITY, elements.size() * 2));
    for (int n : elements) {
      add(n);
    }
  }
  
  // copy constructor; for creating test cases more easily
  public ArrayIntList(ArrayIntList list) {
    this(Math.max(DEFAULT_CAPACITY, list.size() * 2));
    addAll(list);
  }
  
  // pre : size() < capacity (elementData.length)
  // post: appends the given value to the end of the list
  public void add(int value) {
    add(size, value);
  }
  
  // pre: size() < capacity (elementData.length) && 0 <= index <= size()
  // post: inserts the given value at the given index, shifting subsequent
  //     values right
  public void add(int index, int value) {
    checkIndex(index, 0, size);
    ensureCapacity(size + 1);
    
    for (int i = size; i > index; i--) {
      elementData[i] = elementData[i - 1];
    }
    elementData[index] = value;
    size++;
  }
  
  // post: appends all values in the given list to the end of this list
  public void addAll(ArrayIntList other) {
    for (int i = 0; i < other.size; i++) {
      add(other.elementData[i]);
    }
  }
  
  // post: list is empty
  public void clear() {
    size = 0;
  }
  
  // post: returns true if the given value is contained in the list, false otherwise
  public boolean contains(int value) {
    return indexOf(value) != -1;
  }
  
  // post: ensures that the underlying array has the given capacity; if not,
  // the size is doubled (or more if given capacity is even larger)
  public void ensureCapacity(int capacity) {
    if (capacity > elementData.length) {
      int newCapacity = elementData.length * 2 + 1;
      if (capacity > newCapacity) {
        newCapacity = capacity;
      }
      int[] newList = new int[newCapacity];
      for (int i = 0; i < size; i++) {
        newList[i] = elementData[i];
      }
      elementData = newList;
    }
  }
  
  // returns true if o is an ArrayIntList with the same size and elements as this one
  public boolean equals(Object o) {
    if (!(o instanceof ArrayIntList)) {
      return false;
    }
    
    ArrayIntList other = (ArrayIntList) o;
    if (this.size != other.size) {
      return false;
    }
    
    for (int i = 0; i < size; i++) {
      if (elementData[i] != other.elementData[i]) {
        return false;
      }
    }
    
    return true;
  }
  
  // pre : 0 <= index < size()
  // post: returns the integer at the given index in the list
  public int get(int index) {
    checkIndex(index);
    return elementData[index];
  }
  
  // post: returns capacity of this list's underlying array
  public int getCapacity() {
    return elementData.length;
  }
  
  // post : returns the position of the first occurence of the given
  //      value (-1 if not found)
  public int indexOf(int value) {
    for (int i = 0; i < size; i++) {
      if (elementData[i] == value) {
        return i;
      }
    }
    return -1;
  }
  
  // post: returns true if list is empty, false otherwise
  public boolean isEmpty() {
    return size == 0;
  }
  
  // post: returns an iterator for this list
  public Iterator<Integer> iterator() {
    return new ArrayIntListIterator(this);
  }
  
  // pre : 0 <= index < size()
  // post: removes value at the given index, shifting subsequent values left
  public void remove(int index) {
    checkIndex(index);
    for (int i = index; i < size - 1; i++) {
      elementData[i] = elementData[i + 1];
    }
    size--;
  }
  
  // post: removes all occurrences of the values in the given list from this list
  public void removeAll(ArrayIntList other) {
    int newSize = 0;
    for (int i = 0; i < size; i++) {
      if (!other.contains(elementData[i])) {
        elementData[newSize] = elementData[i];
        newSize++;
      }
      size = newSize;
    }
  }
  
  // pre : 0 <= index < size()
  // post: replaces the integer at the given index with the given value
  public void set(int index, int value) {
    checkIndex(index);
    elementData[index] = value;
  }
  
  // post: returns the current number of elements in the list
  public int size() {
    return size;
  }
  
  // post: returns an array version of the contents of this list
  public int[] toArray() {
    return Arrays.copyOf(elementData, size);
  }
  
  // post: creates a comma-separated, bracketed version of the list
  public String toString() {
    StringBuilder result = new StringBuilder("[");
    for (int i = 0; i < size; i++) {
      if (i > 0) {
        result.append(", ");
      }
      if (i < elementData.length) {
        result.append(elementData[i]);
      } else {
        // student's code is bogus; OOB
        result.append("OOB!");
      }
    }
    result.append("]");
    return result.toString();
  }
  
  // helpers to make sure indexes do not fall out of bounds
  private void checkIndex(int index) {
    checkIndex(index, 0, size - 1);
  }
  
  private void checkIndex(int index, int min, int max) {
    if (!(min <= index && index <= max)) {
      throw new ArrayIndexOutOfBoundsException("Illegal index " + index +
                                               "; must be between " + min + " and " + max + "\n"
                                               + "list : " + toString() + " (size=" + size + ")\n"
                                               + "array: " + Arrays.toString(elementData) + " (capacity=" + elementData.length + ")");
    }
  }
  
  
  // Stuart Reges
  // 4/4/05
  //
  // The ArrayIntListIterator class provides a set of utilities for iterating
  // over an ArrayIntList and possibly removing values from the list.
  
  private static class ArrayIntListIterator implements Iterator<Integer> {
    private final ArrayIntList list;    // list to iterate over
    private int position;          // current position within the list
    private boolean removeOK;      // whether it's okay to remove now
    
    // pre : list != null
    // post: constructs an iterator for the given list
    public ArrayIntListIterator(ArrayIntList list) {
      this.list = list;
      position = 0;
      removeOK = false;
    }
    
    // post: returns true if there are more elements left, false otherwise
    public boolean hasNext() {
      return position < list.size();
    }
    
    // pre : hasNext()
    // post: returns the next element in the iteration
    public Integer next() {
      if (!hasNext())
        throw new NoSuchElementException();
      int result = list.get(position);
      position++;
      removeOK = true;
      return result;
    }
    
    // pre : next() has been called without a call on remove (i.e., at most one
    //     call per call on next)
    // post: removes the last element returned by the iterator
    public void remove() {
      if (!removeOK)
        throw new IllegalStateException();
      list.remove(position - 1);
      position--;
      removeOK = false;
    }
  }
  
  /**
   * https://practiceit.cs.washington.edu/problem/view/4271?categoryid=326
   */
  public int learnIndexOf(int target) {
    return this.indexOf(target);
  }
  
  /**
   * https://practiceit.cs.washington.edu/problem/view/cs2/sections/section1/stutter
   */
  public void stutter() {
    ArrayIntList temp = new ArrayIntList(this.size() * 2);
    for (int i = 0; i < this.size(); i++) {
      temp.add(this.get(i));
      temp.add(this.get(i));
    }
    this.clear();
    this.addAll(temp);
  }
  
  /**
   * https://practiceit.cs.washington.edu/problem/view/cs2/sections/section1/learnRemove
   */
  public void learnRemove(int index) {
    this.remove(index);
  }
  
  /**
   * https://practiceit.cs.washington.edu/problem/view/cs2/sections/section1/learnAdd
   */
  public void learnAdd(int index, int value) {
    this.add(index, value);
  }
  
  /**
   * https://practiceit.cs.washington.edu/problem/view/724?categoryid=327
   * A list is considered pairwise sorted if each successive pair of numbers
   * is in sorted (non-decreasing) order.
   */
  public boolean isPairwiseSorted() {
    for (int i = 1; i < size(); i += 2) {
      if (get(i) < get(i - 1)) {
        return false;
      }
    }
    
    return true;
  }
  
  /**
   * https://practiceit.cs.washington.edu/problem/view/720?categoryid=327
   * Doubles the size of a list of integers by appending the mirror image
   * of the original sequence to the end of the list.
   */
  public void mirror() {
    ensureCapacity(size() * 2);
    for (int i = size() - 1; i >= 0; i--) {
      add(get(i));
    }
  }
  
  /**
   * https://practiceit.cs.washington.edu/problem/view/2516?categoryid=327
   * Converts an ArrayIntList of counts into a new ArrayIntList of values.
   * Assume that the ArrayIntList that is called stores a sequence of integer
   * pairs that each indicate a count and a number.
   * <p>
   * You may assume that the ArrayIntList that is called stores a legal sequence
   * of pairs (which means it will always have an even size)
   * and that the default constructor for ArrayIntList will construct an array
   * of sufficient capacity to store the result.
   * Your method should not change the original list.
   * If the sequence of pairs is empty, the result should be an empty list.
   */
  public ArrayIntList fromCounts() {
    ArrayIntList values = new ArrayIntList();
    for (int i = 0; i < size - 1; i += 2) {
      int count = elementData[i];
      int value = elementData[i + 1];
      
      while (count-- > 0) {
        values.add(value);
      }
    }
    
    return values;
  }
  
  /**
   * https://practiceit.cs.washington.edu/problem/view/cs2/sections/arrayintlist/removeAll
   */
  public void removeAll(int value) {
    ArrayIntList temp = new ArrayIntList();
    for (Integer i : this) {
      if (value != i) {
        temp.add(i);
      }
    }
    
    clear();
    addAll(temp);
  }
  
  /**
   * https://practiceit.cs.washington.edu/problem/view/cs2/sections/arrayintlist/printInversions
   * An inversion is defined as a pair of numbers where the first appears before
   * the second in the list, but the first is greater than the second.
   * NB: You may assume that the list has no duplicates.
   */
  public void printInversions() {
    for (int i = 0; i < size; i++) {
      for (int j = i + 1; j < size; j++) {
        if (elementData[i] > elementData[j]) {
          System.out.println("(" + elementData[i] + ", " + elementData[j] + ")");
        }
      }
    }
  }
  
  /**
   * https://practiceit.cs.washington.edu/problem/view/cs2/sections/arrayintlist/maxCount
   * <p>
   * Returns the number of occurrences of the most frequently occurring
   * value in a <strong>sorted</strong> list of integers.
   */
  public int maxCount() {
    if (size == 0) {
      return 0;
    }
    
    int maxOccurrencesSoFar = 0;
    int count = 1;
    for (int i = 1; i < size; i++) {
      if (elementData[i] == elementData[i - 1]) {
        count++;
      } else {
        maxOccurrencesSoFar = Math.max(count, maxOccurrencesSoFar);
        count = 1;
      }
    }
    
    return Math.max(count, maxOccurrencesSoFar);
  }
  
  /**
   * https://practiceit.cs.washington.edu/problem/view/cs2/sections/arrayintlist/stretch
   * Increases a list of integers by a factor of n by replacing each integer in
   * the original list with n copies of that integer.
   *
   * NB: If the value of n is less than or equal to 0,
   * the list should be empty after the call.
   */
  public void stretch(int n) {
    if (n <= 0) {
      clear();
      return;
    }
    
    n--;
    ensureCapacity(size * n);
    for (int i = size - 1; i >= 0; i--) {
      for (int j = 0; j < n; j++) {
        add(i, elementData[i]);
      }
    }
  }
  
  /**
   * https://practiceit.cs.washington.edu/problem/view/cs2/sections/arrayintlist/longestSortedSequence
   * Returns the length of the longest sorted sequence within a list of integers.
   * NG: If the list is empty, your method should return 0.
   */
  public int longestSortedSequence() {
    int longestSoFar = 1;
    int count = 1;
    for (int i = 1; i < size; i++) {
      if (elementData[i] >= elementData[i - 1]) {
        count++;
      } else {
        longestSoFar = Math.max(longestSoFar, count);
        count = 1; // any individual element constitutes a sorted sequence.
      }
    }
    
    return size == 0 ? 0 : Math.max(longestSoFar, count);
  }
  
  /**
   * https://practiceit.cs.washington.edu/problem/view/cs2/sections/arrayintlist/runningTotal
   * Returns a new ArrayIntList that contains a running total of the original list.
   * i-th value in the new list should store the sum of elements 0 through i of the original list.
   * The original list should not be changed by the method.
   * If the original list is empty, the result should be an empty list.
   */
  public ArrayIntList runningTotal() {
    ArrayIntList runningSum = new ArrayIntList(size);
    if (size == 0) {
      return runningSum;
    }
    
    runningSum.add(elementData[0]);
    for (int i = 1; i < size; i++) { // sum with the previous cumulated sum
      runningSum.add(runningSum.get(i - 1) + elementData[i]);
    }
    
    return runningSum;
  }
  
  /**
   * https://practiceit.cs.washington.edu/problem/view/cs2/sections/arrayintlist/removeFront
   * You may assume that the parameter value passed
   * is between 0 and the size of the list inclusive.
   */
  public void removeFront(int n) {
    ArrayIntList temp = new ArrayIntList();
    for (int i = n; i < size(); i++) {
      temp.add(get(i));
    }
    
    clear();
    addAll(temp);
  }
}
