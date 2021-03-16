package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/reverse
 *
 * reverse("Pikachu")      => "uhcakiP"
 * reverse("banana split") => "tilps ananab"
 * reverse("rAcEcAr")      => "rAcEcAr"
 * reverse("X")            => "X"
 *
 * @author Mr.Dr.Professor
 * @since 15/03/2021 20:40
 */
/*public*/ class reverse {
  public static String reverse(String s) {
    return new StringBuilder(s).reverse().toString();
  }
}
