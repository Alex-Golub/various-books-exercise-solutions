package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/addBinary
 *
 * test #3: addBinary("101", "100101")
 * return:  "101010"
 *
 * @author Mr.Dr.Professor
 * @since 12-Mar-21 11:25 PM
 */
/*public*/ class addBinary {
  public static void main(String[] args) {
    System.out.println(addBinary("1111", "1101"));
  }

  public static String addBinary(String a, String b) {
    StringBuilder sb = new StringBuilder();
    int i = a.length() - 1;
    int j = b.length() - 1;
    int carry = 0;
    int sum = carry;

    while (i >= 0 || j >= 0) {
      sum = carry;

      if (i >= 0) {
        sum = sum + a.charAt(i--) - '0';
      }

      if (j >= 0) {
        sum = sum + b.charAt(j--) - '0';
      }

      sb.append(sum % 2);
      carry = sum / 2;

    }

    if (carry != 0) {
      sb.append(carry);
    }

    return sb.reverse().toString();
  }
}
