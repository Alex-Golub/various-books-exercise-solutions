package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/addNumeric
 *
 * You may assume that both strings will be non-empty and will consist
 * entirely of the characters from 0-9.
 * Do not assume that the numbers represented would fit into the numeric range
 * of type int nor long.
 * Do not use Java's built-in conversion methods to convert strings into
 * integers, nor a large-integer library such as BigInteger.
 *
 * @author Mr.Dr.Professor
 * @since 13-Mar-21 12:49 AM
 */
/*public*/ class addNumeric {
  public static void main(String[] args) {
    System.out.println(addNumeric("123", "456"));
    System.out.println(addNumeric("42", "3079"));
  }

  // addNumeric("15", "4700") => "4715"
  // addNumeric("42", "3079") => "3121"
  public static String addNumeric(String a, String b) {
    StringBuilder sb = new StringBuilder();
    int i = a.length() - 1;
    int j = b.length() - 1;
    int carry = 0;
    int sum = carry;

    while (i >= 0 || j >= 0) {
      sum = carry;

      if (i >= 0) {
        sum += (char) (a.charAt(i--) - '0');
      }

      if (j >= 0) {
        sum += (char) (b.charAt(j--) - '0');
      }

      sb.append(sum % 10);
      carry = sum / 10;
    }

    if (carry != 0) {
      sb.append(carry);
    }

    return sb.reverse().toString();
  }
}
