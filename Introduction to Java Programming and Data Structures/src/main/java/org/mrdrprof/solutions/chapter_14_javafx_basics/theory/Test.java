package org.mrdrprof.solutions.chapter_14_javafx_basics.theory;

import javafx.scene.text.Font;

/**
 * @author Alex Golub
 * @since July 11, 2023 10:04 PM
 */
public class Test {
    public static void main(String[] args) {
        Font.getFontNames().forEach(System.out::println);
    }
}
