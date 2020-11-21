package chapter3_parameters_and_objects;

/**
 * 3. Write a program that shows the total number of presents
 * that the person in the song “The Twelve Days of Christmas”
 * received on each day
 *
 * @author Mr.Dr.Professor
 * @since 21-Nov-20 10:42 PM
 */
class PP3_3_PresentsTable {
  static final int DAYS = 12;

  public static void main(String[] args) {
    // headers
    System.out.printf("%-6s%-20s%-25s\n",
            "Day", "Presents Received", "Total Presents");
    int totalPresents = 0;
    for (int i = 1; i <= DAYS; i++) {
      totalPresents += i;
      System.out.printf("%-6s%-20s%-25s\n", i, i, totalPresents);
    }
  }
}
