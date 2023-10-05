package org.mrdrprof.solutions.utils.chapter_14;

/**
 * @author Alex Golub
 * @since July 19, 2023 7:40 PM
 */
public class ImageLocationUtils {
    private ImageLocationUtils() {
    }

    public static String getImageDirectory() {
        return System.getProperty("user.dir") + "/src/main/java/org/mrdrprof/solutions/chapter_14_javafx_basics/practice/image";
    }

    public static String getCardsDirectory() {
        return System.getProperty("user.dir") + "/src/main/java/org/mrdrprof/solutions/utils/cards";
    }
}
