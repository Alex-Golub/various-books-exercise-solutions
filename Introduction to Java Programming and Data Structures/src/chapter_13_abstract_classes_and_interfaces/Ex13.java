package chapter_13_abstract_classes_and_interfaces;

import utils.chapter_10.Course;

/**
 * *13.13 (Enable the Course class cloneable) Rewrite the Course class in Listing 10.6
 * to add a clone method to perform a deep copy on the students field.
 *
 * @author Alex Golub
 * @since July 01, 2023 11:54 AM
 */
class Ex13 {
    public static void main(String[] args) {
        Course cs50 = new Course("CS50");
        cs50.addStudent("John Doe");
        cs50.addStudent("Jane Grow");
        cs50.addStudent("Max Conversion");

        System.out.printf("%-10s = %s%n", "cs50", cs50);

        Course cs50Clone = new Course(cs50);
        System.out.printf("%-10s = %s%n", "cs50Clone", cs50Clone);

        System.out.println("cs50 == cs50Clone = " + (cs50 == cs50Clone));
        System.out.println("cs50.equals(cs50Clone) = " + cs50.equals(cs50Clone));
    }
}
