package chapter3_Intro_Classes_Objects_Methods_Strings._3_14_Date;

/**
 * 3.14 (Date Class) Create a class called Date that includes three instance variables—a month (type
 * int), a day (type int) and a year (type int). Provide a constructor that initializes the three instance
 * variables and assumes that the values provided are correct. Provide a set and a get method for each
 * instance variable. Provide a method displayDate that displays the month, day and year separated
 * by forward slashes (/). Write a test app named DateTest that demonstrates class Date’s capabilities.
 * <p>
 * Created by ag on 21-Jun-20 12:11 PM
 */
public class DateTest {
  public static void main(String[] args) {
    Date date = new Date(5, 12, 1988);
    System.out.println(date.displayDate());

    Date date2 = new Date(12, 2, 188);
    System.out.println(date2.displayDate());
  }
}
