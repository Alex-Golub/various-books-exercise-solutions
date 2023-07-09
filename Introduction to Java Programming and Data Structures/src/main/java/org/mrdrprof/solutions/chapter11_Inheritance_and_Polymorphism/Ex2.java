package org.mrdrprof.solutions.chapter11_Inheritance_and_Polymorphism;

import org.mrdrprof.solutions.utils.chapter_11.*;

import java.util.Date;

/**
 * 11.2 (The Person, Student, Employee, Faculty, and Staff classes)
 */
class Ex2 {
    public static void main(String[] args) {
        Person person = new Person("John Smith",
                                   "123 Main St",
                                   "123-456-7890",
                                   "john@example.com");
        Student student = new Student("Jane Doe",
                                      "456 Elm St",
                                      "987-654-3210",
                                      "jane@example.com",
                                      "Junior");
        Employee employee = new Employee("David Johnson",
                                         "789 Oak St",
                                         "555-123-4567",
                                         "david@example.com",
                                         "Office 101",
                                         50000,
                                         new MyDate(new Date()));
        Faculty faculty = new Faculty("Mary Williams",
                                      "321 Pine St",
                                      "444-555-6666",
                                      "mary@example.com",
                                      "Office 202",
                                      60000,
                                      new MyDate(new Date()),
                                      "9 AM - 12 PM",
                                      "Professor");
        Staff staff = new Staff("Michael Davis",
                                "555 Cedar St",
                                "777-888-9999",
                                "michael@example.com",
                                "Office 303",
                                40000,
                                new MyDate(new Date()),
                                "Assistant");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
