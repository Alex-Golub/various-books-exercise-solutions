package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/zigzagConvert
 *
 * zigzagConvert("ABCDEFGHIJKLMNOPQRS", 5)                => "AIQBHJPRCGKOSDFLNEM"
 * zigzagConvert("ABCDEFGHIJKLMNOPQRS", 4)                => "AGMSBFHLNRCEIKOQDJP"
 * zigzagConvert("ABCDEFGH", 2)                           => "ACEGBDFH"
 * zigzagConvert("ABCDEFGHIJKLMNOPQRST", 9)               => "AQBPRCOSDNTEMFLGKHJI"
 * zigzagConvert("TUVWXYZ", 3)                            => "TXUWYVZ"
 * zigzagConvert("supercalifragilisticexpialadocious", 7) => "sgauaiilprlpaefixdsriseoucltccoaii"
 * zigzagConvert("ABCD", 1)                               => "ABCD"
 * zigzagConvert("ABCD", 0)                               => ""
 *
 * @author Mr.Dr.Professor
 * @since 16/03/2021 22:14
 */
/*public*/ class zigzagConvert {
  public static void main(String[] args) {
    System.out.println(zigzagConvert("ABCDEFGHIJKLMNOPQRS", 5));
  }

  public static String zigzagConvert(String s, int numRows) {
    if (numRows == 1) {
      return s;
    }

    int steps = 2 * numRows - 2;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < numRows; i++) {
      if (i == 0 || i == numRows - 1) {
        for (int j = i; j < s.length(); j += steps) {
          sb.append(s.charAt(j));
        }
      } else {
        int j = i;
        int step1 = 2 * (numRows - i - 1);
        int step2 = steps - step1;
        boolean flag = true;
        while (j < s.length()) {
          sb.append(s.charAt(j));
          if (flag) {
            j = j + step1;
          } else {
            j = j + step2;
          }

          flag = !flag;
        }
      }
    }

    return sb.toString();
  }
}
