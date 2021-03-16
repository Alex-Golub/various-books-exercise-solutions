package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/rowColumnConvert
 *
 * rowColumnConvert("ABCDEFGHIJKLMN", 3)                      => "ADGJMBEHKNCFIL"
 * rowColumnConvert("Hello There my friend", 2)               => "HloTeem redel hr yfin"
 * rowColumnConvert("Programmer", 5)                          => "Parmomgerr"
 * rowColumnConvert("supercalifragilisticexpialadocious", 11) => "sapsugipiaellriacsdatolicicifeorxu"
 * rowColumnConvert("Testing", 1)                             => "Testing"
 * rowColumnConvert("ABC", 0)                                 => ""
 *
 * @author Mr.Dr.Professor
 * @since 15/03/2021 22:10
 */
/*public*/ class rowColumnConvert {
  public static void main(String[] args) {
    System.out.println(rowColumnConvert("ABCDEFGHIJKLMN", 3)
                               .equals("ADGJMBEHKNCFIL"));
    System.out.println(rowColumnConvert("Hello There my friend", 2));
  }

  public static String rowColumnConvert(String s, int rows) {
    if (rows <= 0) {
      return "";
    }

    int len = s.length();
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < rows; i++) {
      for (int j = i; j < len; j += rows) {
        result.append(s.charAt(j));
      }
    }

    return result.toString();
  }
}
