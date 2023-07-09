package org.mrdrprof.solutions.chapter_13_abstract_classes_and_interfaces;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SortComparableObjects {
    public static void main(String[] args) {
        String[] cities = { "Savannah", "Boston", "Atlanta", "Tampa" };
        Arrays.sort(cities);
        System.out.println(String.join(", ", cities));
        System.out.println();

        BigInteger[] hugeNumbers = { BigInteger.valueOf(2323231092923992L),
                new BigInteger("432232323239123123124292"),
                new BigInteger("5462322352521351325234123439292") };
        Arrays.sort(hugeNumbers);
        String collect = Arrays.stream(hugeNumbers)
                               .map(BigInteger::toString)
                               .collect(Collectors.joining(", "));
        System.out.println(collect);
    }
}
