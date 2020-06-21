package chapter3_Intro_Classes_Objects_Methods_Strings._3_14_Date;

/**
 * Created by ag on 21-Jun-20 12:08 PM
 */
public class Date {

  private int month;
  private int day;
  private int year;

  public Date(int month, int day, int year) { // assumes that the values provided are correct
    this.month = month;
    this.day = day;
    this.year = year;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String displayDate() {
    return String.format("%02d/%02d/%04d", this.getMonth(), this.getDay(), this.getYear());
  }
}
