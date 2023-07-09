package org.mrdrprof.solutions.chapter11_Inheritance_and_Polymorphism;

import org.mrdrprof.solutions.utils.chapter_10.Loan;
import org.mrdrprof.solutions.utils.chapter_11.Circle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * 11.6 (Use ArrayList)
 *
 * @author Alex Golub
 * @since 02/06/2023 2:06 PM
 */
class Ex6 {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();

        list.add(new Loan(0.3, 1, 20_000));
        list.add(new Circle(2.5));
        list.add(LocalDate.now());
        list.add("A String");

        list.forEach(System.out::println);
    }
}
