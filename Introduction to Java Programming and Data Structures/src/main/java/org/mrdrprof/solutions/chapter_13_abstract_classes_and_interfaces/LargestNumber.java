package org.mrdrprof.solutions.chapter_13_abstract_classes_and_interfaces;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

class LargestNumber {
  public static void main(String[] args) {
    List<Number> list = new ArrayList<>();
    list.add(45);
    list.add(3445.53);
    list.add(new BigInteger("3432323234344343101"));
    list.add(new BigInteger("3432323234344343102"));
    list.add(new BigDecimal("2.0909090989091343433344343"));

    System.out.println("The largest number is " + getLargestNumber(list));
  }

  public static Number getLargestNumber(List<Number> list) {
    if (list == null || list.isEmpty()) {
      return null;
    }

    Number number = list.get(0);
    for (int i = 1; i < list.size(); i++) {
      if (number.doubleValue() < list.get(i).doubleValue())
        number = list.get(i);
    }

    return number;
  }
}
