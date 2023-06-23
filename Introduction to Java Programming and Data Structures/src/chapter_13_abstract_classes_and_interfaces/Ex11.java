package chapter_13_abstract_classes_and_interfaces;

import utils.chapter_13.Octagon;

/**
 * @author Alex Golub
 * @since June 26, 2023 7:07 PM
 */
class Ex11 {
    public static void main(String[] args) {
        Octagon zeroSide = new Octagon();
        Octagon unity = new Octagon(1);
        Octagon unityClone = new Octagon(unity);

        System.out.println("zeroSide = " + zeroSide);
        System.out.println("unity = " + unity);
        System.out.println("unityClone = " + unityClone);

        System.out.println("unity.compareTo(unityClone) = " + unity.compareTo(unityClone));
        System.out.println("unity == unityClone = " + (unity == unityClone));
        System.out.println("unity.getArea() = " + unity.getArea());
        System.out.println("unity.getPerimeter() = " + unity.getPerimeter());
        System.out.println("unity.getSide() = " + unity.getSide());
    }
}
