package cse_142.cs1_sections.section05_midterm_practice;

/**
 * https://practiceit.cs.washington.edu/problem/view/1414?categoryid=303
 *
 * saying(you, it, you);      => she can't take she with her
 * saying(it, her, she);      => it can't take her with you
 * saying(she, "you", her);   => you can't take it with you
 * saying(it, "him", "fred"); => fred can't take her with him
 *
 * @author Alex Golub
 * @since 04-Apr-21 9:33 AM
 */
class Mystery {
  public static void main(String[] args) {
    String she = "it";
    String it = "her";
    String her = "you";
    String you = "she";

    saying(you, it, you);
    saying(it, her, she);
    saying(she, "you", her);
    saying(it, "him", "fred");
  }

  public static void saying(String it, String her, String she) {
    System.out.println(she + " can't take " + it + " with " + her);
  }
}
