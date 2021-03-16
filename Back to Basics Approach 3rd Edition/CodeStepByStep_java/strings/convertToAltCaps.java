package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/convertToAltCaps
 *
 * convertToAltCaps("hello")                 => "hElLo"
 * convertToAltCaps("banana")                => "bAnAnA"
 * convertToAltCaps("section is AWESOME")    => "sEcTiOn Is AwEsOmE"
 * convertToAltCaps("Summer is here!")       => "sUmMeR iS hErE!"
 * convertToAltCaps("this  is   a     test") => "tHiS  iS   a     TeSt"
 * convertToAltCaps("xxxxx")                 => "xXxXx"
 * convertToAltCaps("")                      => ""
 *
 * @author Mr.Dr.Professor
 * @since 13-Mar-21 8:42 PM
 */
/*public*/ class convertToAltCaps {
  public static void main(String[] args) {
    System.out.println(convertToAltCaps("Pikachu").equals("pIkAcHu"));
    System.out.println(convertToAltCaps("section is AWESOME")
                               .equals("sEcTiOn Is AwEsOmE"));
  }

  public static String convertToAltCaps(String s) {
    int length = s.length();
    StringBuilder sb = new StringBuilder(length);

    for (int i = 0, j = 0; i < length; i++) {
      char c = s.charAt(i);

      if (Character.isLetter(c)) {
        c = j % 2 == 0 ?
            Character.toLowerCase(c) :
            Character.toUpperCase(c);
        j++;
      }

      sb.append(c);
    }

    return sb.toString();
  }
}
