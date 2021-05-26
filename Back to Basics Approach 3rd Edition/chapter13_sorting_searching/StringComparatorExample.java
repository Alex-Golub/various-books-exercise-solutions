package chapter13_sorting_searching;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringComparatorExample {
  public static void main(String[] args) {
    String[] strings = {"Foxtrot", "alpha", "echo", "golf",
                        "bravo", "hotel", "Charlie", "DELTA"};
    
    // using custom length comparator
    Arrays.sort(strings, Comparator.comparingInt(String::length));
    System.out.println(Arrays.toString(strings));
    
    // built-in string comparator
    Arrays.sort(strings, String.CASE_INSENSITIVE_ORDER);
    System.out.println(Arrays.toString(strings));
    
    // creating comparator instance to use within sort methods
    Comparator<String> reverse = Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER);
    Arrays.sort(strings, reverse);
    System.out.println(Arrays.toString(strings));
    
    
    List<String> stringList = Arrays.asList(strings);
    stringList.sort(Comparator.comparingInt(String::length).reversed());
    System.out.println(stringList);
  }
}
