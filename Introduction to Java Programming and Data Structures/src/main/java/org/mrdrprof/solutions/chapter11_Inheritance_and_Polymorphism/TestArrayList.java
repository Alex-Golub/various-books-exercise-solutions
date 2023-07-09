package org.mrdrprof.solutions.chapter11_Inheritance_and_Polymorphism;

import org.mrdrprof.solutions.utils.chapter_11.Circle;

import java.util.ArrayList;
import java.util.List;

class TestArrayList {
    public static void main(String[] args) {
        // Create a list to store cities
        List<String> cityList = new ArrayList<>();

        // Add some cities in the list
        cityList.add("London");
        // cityList now contains [London]
        cityList.add("Denver");
        // cityList now contains [London, Denver]
        cityList.add("Paris");
        // cityList now contains [London, Denver, Paris]
        cityList.add("Miami");
        // cityList now contains [London, Denver, Paris, Miami]
        cityList.add("Seoul");
        // contains [London, Denver, Paris, Miami, Seoul]
        cityList.add("Tokyo");
        // contains [London, Denver, Paris, Miami, Seoul, Tokyo]

        System.out.printf("List size? %d%n", cityList.size());
        System.out.printf("Is Miami in the list? %s%n", cityList.contains("Miami"));
        System.out.printf("The location of Denver in the list? %d%n", cityList.indexOf("Denver"));
        System.out.printf("Is the list empty? %s%n", cityList.isEmpty()); // Print false

        // Insert a new city at index 2
        cityList.add(2, "Xian");
        // contains [London, Denver, Xian, Paris, Miami, Seoul, Tokyo]

        // Remove a city from the list
        cityList.remove("Miami");
        // contains [London, Denver, Xian, Paris, Seoul, Tokyo]

        // Remove a city at index 1
        cityList.remove(1);
        // contains [London, Xian, Paris, Seoul, Tokyo]

        // Display the contents in the list
        System.out.println(cityList);

        // Display the contents in the list in reverse order
        for (int i = cityList.size() - 1; i >= 0; i--) {
            System.out.printf("%s ", cityList.get(i));
        }
        System.out.println();

        // Create a list to store two circles
        List<Circle> list = new ArrayList<>();

        // Add two circles
        list.add(new Circle(2));
        list.add(new Circle(3));

        // Display the area of the first circle in the list
        System.out.printf("The area of the circle? %s%n", list.get(0).getArea());
    }
}
