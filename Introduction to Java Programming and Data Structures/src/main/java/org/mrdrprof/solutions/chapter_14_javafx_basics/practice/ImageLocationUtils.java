package org.mrdrprof.solutions.chapter_14_javafx_basics.practice;

/**
 * @author Alex Golub
 * @since July 19, 2023 7:40 PM
 */
class ImageLocationUtils {
    private ImageLocationUtils() {
    }

    static String getImageDirectory() {
        return System.getProperty("user.dir") + "/src/main/java/org/mrdrprof/solutions/chapter_14_javafx_basics/practice/image";
    }

    static String getCardsDirectory() {
        return System.getProperty("user.dir") + "/src/main/java/org/mrdrprof/solutions/chapter_14_javafx_basics/practice/image/cards";
    }
}
