package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/dnaErrors
 *
 * The letters are paired as follows:
 * - A is paired with T and vice-versa.
 * - C is paired with G and vice-versa.
 *
 * In some cases, errors occur within DNA molecules;
 * the task of your method is to find two particular kinds of errors:
 * 1. Unmatched nucleotides, in which one strand contains a dash ('-') at a
 * given index, or does not contain a nucleotide at the given index
 * (if the strings are not the same length).
 * Each of these counts as 1 error.
 *
 * 2. Point mutations, in which a letter from one strand is matched against
 * the wrong letter in the other strand.
 * For example, A might accidentally pair with C, or G might pair with G.
 * Each of these counts as 2 errors.
 *
 * You may assume that each string consists purely of the characters
 * A, C, T, G, and - (the dash character), but the letters could appear
 * in either upper or lowercase.
 * The strings might be the same length, or the first or second might be
 * longer than the other.
 * Either string could be very long, very short, or even the empty string.
 * If the strings match perfectly with no errors as defined above,
 * your method should return 0.
 *
 * @author Mr.Dr.Professor
 * @since 13-Mar-21 9:46 PM
 */
/*public*/ class dnaErrors {
  public static void main(String[] args) {
    String dna1 = "GGGA-GAATCTCTGGACT";
    String dna2 = "CTCTACTTA-AGACCGGTACAGG";
    System.out.println(dnaErrors(dna1, dna2));
  }

  public static int dnaErrors(String dna1, String dna2) {
    int i = 0, j = 0, errors = 0;
    dna1 = dna1.toLowerCase();
    dna2 = dna2.toLowerCase();

    while (i < dna1.length() && j < dna2.length()) {
      char c1 = dna1.charAt(i);
      char c2 = dna2.charAt(j);

      errors += getErrors(c1, c2);

      i++;
      j++;
    }

    errors += dna1.substring(i).length() + dna2.substring(j).length();

    return errors;
  }

  private static int getErrors(char c1, char c2) {
    if ((c1 == 'a' || c1 == 't') &&
        (c1 == c2 || c2 == 'c' || c2 == 'g')
        ||
        ((c1 == 'c' || c1 == 'g') &&
         (c1 == c2 || c2 == 'a' || c2 == 't'))) {
      return 2;
    }

    if (c1 == '-' || c2 == '-') {
      return 1;
    }

    return 0;
  }
}
