package chapter11_Inheritance_and_Polymorphism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * **11.18 (ArrayList of Character)
 *
 * @author Alex Golub
 * @since 02/06/2023 6:58 PM
 */
class Ex18 {

    public static void main(String[] args) {
        System.out.println("toCharacterArray(\"John Wick\") = " + toCharacterArray("John Wick"));
        System.out.println("toCharacterArray(\"a123\") = " + toCharacterArray("a123"));
        System.out.println("toCharacterArray(\"  abc   \") = " + toCharacterArray("  abc   "));
        System.out.println("toCharacterArray(\"  a b c d e   \") = " + toCharacterArray("  a b c d e   "));
        System.out.println("toCharacterArray(\"\") = " + toCharacterArray(""));
        System.out.println("toCharacterArray(null) = " + toCharacterArray(null));
    }

    public static List<Character> toCharacterArray(String s) {
        if (s == null || s.isEmpty()) {
            return Collections.emptyList();
        }

        List<Character> characterList = new ArrayList<>();
        for (Character c : s.toCharArray()) {
            characterList.add(c);
        }
        return characterList;
    }

}
