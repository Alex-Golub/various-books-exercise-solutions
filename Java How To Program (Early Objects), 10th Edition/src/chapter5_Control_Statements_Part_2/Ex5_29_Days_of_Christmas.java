package chapter5_Control_Statements_Part_2;

/**
 * 5.29
 * (“The Twelve Days of Christmas” Song) Write an application that uses repetition and
 * switch statements to print the song “The Twelve Days of Christmas.”
 * One switch statement should be used to print the day (“first,” “second,” and so on).
 * A separate switch statement should be used to print the remainder of each verse.
 * Visit the website https://en.wikipedia.org/wiki/The_Twelve_Days_of_Christmas_(song)
 * for the lyrics of the song.
 *
 * Created by ag on 12-Oct-20 1:54 PM 
 */
class Ex5_29_Days_of_Christmas {
  public static void main(String[] args) {
    String[] days = {"", "first", "second", "third", "forth", "fifth", "sixth",
        "seventh", "eighth", "ninth", "10th", "11th", "12th"};

    String[] presents = {
        "",
        "A partridge in a pear tree",
        "Two turtle doves",
        "Three french hens",
        "Four calling birds",
        "Five golden rings",
        "Six geese a-laying",
        "Seven swans a-swimming",
        "Eight maids a-milking",
        "Nine ladies dancing",
        "10 lords a-leaping",
        "11 pipers piping",
        "12 drummers drumming"
    };

    String prev = presents[1];
    for (int i = 1; i <= 12; i++) {
      System.out.printf("On the %s day of Christmas my true love sent to me\n",
                        days[i]);
      System.out.println(prev);

      if (i < 12)
        prev = presents[i + 1] + ", and\n" + prev;

      System.out.println();
    }
  }
}