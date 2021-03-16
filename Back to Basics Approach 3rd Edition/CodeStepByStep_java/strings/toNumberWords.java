package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/toNumberWords
 *
 * FIXME:
 * toNumberWords(100101)
 * expected return:
 * "one hundred thousand one hundred one"
 * your return:
 * "one hundred  thousand one hundred one"
 *              ^
 *
 * @author Mr.Dr.Professor
 * @since 16/03/2021 21:21
 */
/*public*/ class toNumberWords {
  public static void main(String[] args) {
    System.out.println(toNumberWords(100_101));
  }

  public static String toNumberWords(int number) {
    if (number == 0)
      return "zero";

    if (number < 0) {
      return "negative " + generate(-number).trim();
    }

    return generate(number).trim();
  }

  public static String generate(int number) {
    if (number >= 1_000_000_000) {
      return generate(number / 1_000_000_000) + " billion " +
             generate(number % 1_000_000_000);
    } else if (number >= 1_000_000) {
      return generate(number / 1_000_000) + " million " +
             generate(number % 1_000_000);
    } else if (number >= 1_000) {
      return generate(number / 1_000) + " thousand " +
             generate(number % 1_000);
    } else if (number >= 100) {
      return generate(number / 100) + " hundred " +
             generate(number % 100);
    }

    return generate1To99(number);
  }

  private static String generate1To99(int number) {
    if (number == 0) {
      return "";
    }

    String[] oneToNine = {
            "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine"
    };
    String[] tenToNinteen = {
            "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };
    String[] dozens = {
            "ten", "twenty", "thirty", "forty", "fifty",
            "sixty", "seventy", "eighty", "ninety"
    };

    if (number <= 9)
      return oneToNine[number - 1];
    else if (number <= 19)
      return tenToNinteen[number % 10];
    else {
      return dozens[number / 10 - 1] + " " +
             generate1To99(number % 10);
    }
  }
}
