package chapter_13_abstract_classes_and_interfaces;

import utils.chapter_13.Complex;

import java.util.Arrays;
import java.util.Scanner;

/**
 * *13.17 (Math: The Complex class) 
 * 
 * Enter the first complex number: 3.5 5.5
 * Enter the second complex number: –3.5 1
 * (3.5 + 5.5i) + (–3.5 + 1.0i) = 0.0 + 6.5i
 * (3.5 + 5.5i) – (–3.5 + 1.0i) = 7.0 + 4.5i
 * (3.5 + 5.5i) * (–3.5 + 1.0i) = –17.75 + –15.75i
 * (3.5 + 5.5i) / (–3.5 + 1.0i) = –0.5094 + –1.7i
 * |(3.5 + 5.5i)| = 6.519202405202649
 * false
 * 3.5
 * 5.5
 * [–3.5 + 1.0i, 4.0 + –0.5i, 3.5 + 5.5i, 3.5 + 5.5i]
 * 
 * @author Alex Golub
 * @since July 01, 2023 2:06 PM
 */
class Ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first complex number: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        Complex c1 = new Complex(a, b);

        System.out.print("Enter the second complex number: ");
        double c = input.nextDouble();
        double d = input.nextDouble();
        Complex c2 = new Complex(c, d);

        System.out.println("(" + c1 + ")" + " + " + "(" + c2 + ")" + " = " + c1.add(c2));
        System.out.println("(" + c1 + ")" + " - " + "(" + c2 + ")" + " = " + c1.subtract(c2));
        System.out.println("(" + c1 + ")" + " * " + "(" + c2 + ")" + " = " + c1.multiply(c2));
        System.out.println("(" + c1 + ")" + " / " + "(" + c2 + ")" + " = " + c1.divide(c2));
        System.out.println("|" + c1 + "| = " + c1.abs());

//        Complex c3 = (Complex) c1.clone();
        Complex c3 = new Complex(c1); // copy constructor is considered a best practice rather then implementing the Cloneable<T> interface
        System.out.println(c1 == c3);
        System.out.println(c3.getRealPart());
        System.out.println(c3.getImaginaryPart());
        Complex c4 = new Complex(4, -0.5);
        Complex[] list = { c1, c2, c3, c4 };
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
