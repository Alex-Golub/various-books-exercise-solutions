package org.mrdrprof.solutions.utils.chapter_13;

/**
 * @author Alex Golub
 * @since 20/06/2023 6:01 PM
 */
public class Chicken extends Animal implements Edible {
    @Override
    public String howToEat() {
        return "Chicken: Fry it";
    }

    @Override
    public String sound() {
        return "Chicken: cock-a-doodle-doo";
    }
}
