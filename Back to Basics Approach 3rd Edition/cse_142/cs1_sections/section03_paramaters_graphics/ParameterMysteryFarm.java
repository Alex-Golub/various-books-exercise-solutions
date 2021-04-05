package cse_142.cs1_sections.section03_paramaters_graphics;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/sections/section3/ParameterMysteryFarm
 *
 * mystery(macdonald, there, "everywhere");  => everywhere there had a old
 * mystery(old, macdonald, farm);            => here macdonald had a there
 * mystery("quack", here, "there");          => there quack had a everywhere
 * mystery(quack, "here", "farm");           => farm duck had a here
 * mystery(old, everywhere, there);          => old macdonald had a farm
 *
 * @author Alex Golub
 * @since 01-Apr-21 6:18 PM
 */
class ParameterMysteryFarm {
  public static void main(String[] args) {
    String farm = "here";
    String old = "macdonald";
    String macdonald = "there";
    String everywhere = "farm";
    String here = "everywhere";
    String there = "old";
    String quack = "duck";

    mystery(macdonald, there, "everywhere");
    mystery(old, macdonald, farm);
    mystery("quack", here, "there");
    mystery(quack, "here", "farm");
    mystery(old, everywhere, there);
  }

  public static void mystery(String macdonald, String farm, String old) {
    System.out.println(old + " " + macdonald + " had a " + farm);
  }
}
