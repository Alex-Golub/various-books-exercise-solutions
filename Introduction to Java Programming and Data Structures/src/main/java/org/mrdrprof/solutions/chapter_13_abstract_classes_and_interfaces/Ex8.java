package org.mrdrprof.solutions.chapter_13_abstract_classes_and_interfaces;

import org.mrdrprof.solutions.utils.chapter_11.MyStack;

/**
 * *13.8 (Revise the MyStack class) Rewrite the MyStack class in Listing 11.10 to perform
 * a deep copy of the list field.
 * 
 * @author Alex Golub
 * @since June 23, 2023 10:18 PM
 */
class Ex8 {
    public static void main(String[] args) {
        MyStack<Integer> integers = new MyStack<>();
        integers.push(1);
        integers.push(2);
        integers.push(3);
        MyStack<Integer> cloned = new MyStack<>(integers);
        integers.push(4);
        cloned.push(5);

        System.out.println("integers == cloned = " + (integers == cloned));
        System.out.println("integers = " + integers);
        System.out.println("cloned = " + cloned);
    }
}
