package Chapter_1_Intro;

/**
 * Created by ag on 17-Oct-20 1:52 AM
 */
class ExP1_3_Song {
  public static void main(String[] args) {
    v1();
    System.out.println();
    v2();
    System.out.println();
    v3();
    System.out.println();
    v4();
    System.out.println();
    v5();
    System.out.println();
    v6();
    System.out.println();
    v7();
    System.out.println();
    moral();
  }

  public static void v1() {
    System.out.println("There was an old lady who swallowed a fly\n" +
                    "I don’t know why she swallowed the fly\n" +
                    "Perhaps she’ll die\n" +
                    "But it’s only a fly\n" +
                    "I think I’ll cry\n" +
                    "She gulped it out of the sky\n" +
                    "Oh, my!"
    );
  }

  public static void v2() {
    System.out.println(
            "There was an old lady who swallowed a spider\n" +
                    "That wiggled and jiggled and tickled inside her.\n" +
                    "She swallowed the spider to catch the fly\n" +
                    "I don’t know why\n" +
                    "She swallowed the fly\n" +
                    die() +
                    "Gone to the by and by\n" +
                    "Sigh"
    );
  }

  public static void v3() {
    System.out.println(
            "There was an old lady who swallowed a bird.\n" +
                    "How absurd! She swallowed a bird!\n" +
                    "She swallowed the bird to catch the spider.\n" +
                    "She swallowed the spider to catch the fly\n" +
                    "I don’t know why\n" +
                    "She swallowed the fly\n" +
                    die() +
                    "She’ll leave us high and dry."
    );
  }

  public static void v4() {
    System.out.println(
            "There was an old lady who swallowed a cat.\n" +
                    "Imagine that! She swallowed a cat.\n" +
                    "She swallowed the cat to catch the bird.\n" +
                    "She swallowed the bird to catch the spider.\n" +
                    "She swallowed the spider to catch the fly.\n" +
                    "I don’t know why\n" +
                    "She swallowed the fly\n" +
                    die() +
                    "I hope it’s a lie."
    );
  }

  public static void v5() {
    System.out.println(
            "There was an old lady who swallowed a dog.\n" +
                    "She went whole hog to swallow the dog.\n" +
                    "She swallowed the dog to catch the cat.\n" +
                    "She swallowed the cat to catch the bird.\n" +
                    "She swallowed the bird to catch the spider.\n" +
                    "She swallowed the spider to catch the fly.\n" +
                    "I don’t know why\n" +
                    "She swallowed the fly\n" +
                    die() +
                    "There’s a tear in my eye."
    );
  }

  public static void v6() {
    System.out.println(
            "There was an old lady who swallowed a cow.\n" +
                    "I don’t know how she swallowed the cow.\n" +
                    "She swallowed the cow to catch the dog.\n" +
                    "She swallowed the dog to catch the cat.\n" +
                    "She swallowed the cat to catch the bird.\n" +
                    "She swallowed the bird to catch the spider.\n" +
                    "She swallowed the spider to catch the fly.\n" +
                    "I don’t know why\n" +
                    "She swallowed the fly\n" +
                    die() +
                    "I’d rather have ham on rye.\n" +
                    "And she had a frog on the sly.\n" +
                    "She did it in one try"
    );
  }

  private static String die() {
    return "Perhaps she’ll die.\n";
  }

  public static void v7() {
    System.out.println(
            "There was an old lady who swallowed a horse.\n" +
                    "She died, of course.\n" +
                    "It was the last course.\n" +
                    "I’m filled with remorse.\n" +
                    "What’s left to say...\n" +
                    "Even the artist is crying.\n" +
                    "We’ll miss her dearly.\n" +
                    "It is such a loss.\n" +
                    "She had no time to floss.\n" +
                    "She missed out on the sauce."
    );
  }

  public static void moral() {
    System.out.println("Moral: Never swallow a horse.");
  }

}
