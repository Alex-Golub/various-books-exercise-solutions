package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/romanNumeralToInteger
 *
 * I: 1
 * V: 5
 * X: 10
 * L: 50
 * C: 100
 * D: 500
 * M: 1000
 *
 * IV: 4
 * IX: 9
 *
 * XL: 40
 * XC: 90
 *
 * CD: 400
 * CM: 900
 *
 * romanNumeralToInteger("I")         => 1
 * romanNumeralToInteger("III")       => 3
 * romanNumeralToInteger("IV")        => 4
 * romanNumeralToInteger("VI")        => 6
 * romanNumeralToInteger("VIII")      => 8
 * romanNumeralToInteger("IX")        => 9
 * romanNumeralToInteger("X")         => 10
 * romanNumeralToInteger("XIII")      => 13
 * romanNumeralToInteger("XIV")       => 14
 * romanNumeralToInteger("XVII")      => 17
 * romanNumeralToInteger("XIX")       => 19
 * romanNumeralToInteger("XX")        => 20
 * romanNumeralToInteger("XXXIX")     => 39
 * romanNumeralToInteger("XLI")       => 41
 * romanNumeralToInteger("LIX")       => 59
 * romanNumeralToInteger("DCXXIV")    => 624
 * romanNumeralToInteger("CMXCIX")    => 999
 * romanNumeralToInteger("MCXIX")     => 1119
 * romanNumeralToInteger("MCMXCVIII") => 1998
 * romanNumeralToInteger("MMMCDXIV")  => 3414
 *
 * @author Mr.Dr.Professor
 * @since 15/03/2021 21:09
 */
/*public*/ class romanNumeralToInteger {
  public static void main(String[] args) {
    System.out.println(romanNumeralToInteger("XIII") == 13);
    System.out.println(romanNumeralToInteger("DCXXIV") == 624);
  }

  private static int decode(String s) {
    int val = 0;
    switch (s) {
      case "I": val = 1; break;
      case "V": val = 5; break;
      case "X": val = 10; break;
      case "L": val = 50; break;
      case "C": val = 100; break;
      case "D": val = 500; break;
      case "M": val = 1000; break;
      case "IV": val = 4; break;
      case "IX": val = 9; break;
      case "XL": val = 40; break;
      case "XC": val = 90; break;
      case "CD": val = 400; break;
      case "CM": val = 900; break;
    }
    return val;
  }

  public static int romanNumeralToInteger(String s) {
    int res = 0;
    int i = 0;
    while (i < s.length()) {
      String number = s.substring(i, i + 1);

      if (i + 2 <= s.length()) {
        number = s.substring(i, i + 2);

        if (decode(number) != 0) {
          i += 1;
        } else {
          number = s.substring(i, i + 1);
        }
      }

      res += decode(number);
      i += 1;
    }

    return res;
  }
}