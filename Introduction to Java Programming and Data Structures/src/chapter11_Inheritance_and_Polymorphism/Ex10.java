package chapter11_Inheritance_and_Polymorphism;

import utils.chapter_11.MyStack;

/**
 * 11.10 (Implement MyStack using inheritance)
 *
 * @author Alex Golub
 * @since 02/06/2023 5:10 PM
 */
class Ex10 {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        while (!myStack.isEmpty()) {
            System.out.println("myStack = " + myStack);
            System.out.println(myStack.pop());
        }
    }
}
