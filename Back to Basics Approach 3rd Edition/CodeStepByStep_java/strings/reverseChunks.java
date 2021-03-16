package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/reverseChunks
 *
 * reverseChunks("MehranSahami", 3) => "heMnarhaSima"
 * reverseChunks("MartyStepp", 4)   => "traMetSypp"
 * reverseChunks("KeithSchwarz", 5) => "htieKawhcSrz"
 * reverseChunks("beautiful", 8)    => "ufituaebl"
 * reverseChunks("banana", 6)       => "ananab"
 * reverseChunks("ABCDE", 1)        => "ABCDE"
 * reverseChunks("x", 2)            => "x"
 * reverseChunks("", 3)             => ""
 *
 * @author Mr.Dr.Professor
 * @since 15/03/2021 20:42
 */
/*public*/ class reverseChunks {
  public static void main(String[] args) {
    System.out.println(reverseChunks("MehranSahami", 3));
    System.out.println(reverseChunks("MehranSahami", 3).equals("heMnarhaSima"));
    System.out.println(reverseChunks("MartyStepp", 4).equals("traMetSypp"));
  }

  public static String reverseChunks(String s, int k) {
    StringBuilder sb = new StringBuilder();
    int i = 0;
    for (; i <= s.length() - k; i += k) {
      sb.append(reverse(s.substring(i, i + k)));
    }

    return sb.append(s.substring(i)).toString();
  }

  private static String reverse(String s) {
    return new StringBuilder(s).reverse().toString();
  }
}
