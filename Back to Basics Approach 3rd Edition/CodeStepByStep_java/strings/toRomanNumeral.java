package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/toRomanNumeral
 *
 * assume that the integer passed will be between 1 and 3999 inclusive.
 *
 * toRomanNumeral(1)    => "I"
 * toRomanNumeral(3)    => "III"
 * toRomanNumeral(4)    => "IV"
 * toRomanNumeral(6)    => "VI"
 * toRomanNumeral(8)    => "VIII"
 * toRomanNumeral(9)    => "IX"
 * toRomanNumeral(10)   => "X"
 * toRomanNumeral(13)   => "XIII"
 * toRomanNumeral(14)   => "XIV"
 * toRomanNumeral(17)   => "XVII"
 * toRomanNumeral(19)   => "XIX"
 * toRomanNumeral(20)   => "XX"
 * toRomanNumeral(39)   => "XXXIX"
 * toRomanNumeral(41)   => "XLI"
 * toRomanNumeral(59)   => "LIX"
 * toRomanNumeral(624)  => "DCXXIV"
 * toRomanNumeral(999)  => "CMXCIX"
 * toRomanNumeral(1119) => "MCXIX"
 * toRomanNumeral(1998) => "MCMXCVIII"
 * toRomanNumeral(3414) => "MMMCDXIV"
 *
 * @author Mr.Dr.Professor
 * @since 16/03/2021 22:01
 */
/*public*/ class toRomanNumeral {
  public static String toRomanNumeral(int num) {
    String m[] = {"", "M", "MM", "MMM"};
    String c[] = {"", "C", "CC", "CCC", "CD", "D",
                  "DC", "DCC", "DCCC", "CM"};
    String x[] = {"", "X", "XX", "XXX", "XL", "L",
                  "LX", "LXX", "LXXX", "XC"};
    String i[] = {"", "I", "II", "III", "IV", "V",
                  "VI", "VII", "VIII", "IX"};

    // Converting to roman
    String thousands = m[num / 1000];
    String hundereds = c[(num % 1000) / 100];
    String tens = x[(num % 100) / 10];
    String ones = i[num % 10];

    String ans = thousands + hundereds + tens + ones;

    return ans;
  }
}
