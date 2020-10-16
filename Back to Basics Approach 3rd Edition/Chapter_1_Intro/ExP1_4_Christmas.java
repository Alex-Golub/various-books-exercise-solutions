package Chapter_1_Intro;

/**
 * 4. Write a program that produces as output the words of
 * “The Twelve Days of Christmas.” (Static methods simplify
 * this task.)
 * <p>
 * Created by ag on 17-Oct-20 2:04 AM
 */
class ExP1_4_Christmas {
  public static void main(String[] args) {
    day1();
  }

  public static void present1() {
    System.out.println("a partridge in a pear tree.");
  }

  public static void present2() {
    System.out.println("two turtle doves, and");
    present1();
  }

  public static void present3() {
    System.out.println("Three french hens");
    present2();
  }

  public static void present4() {
    System.out.println("Four calling birds");
    present3();
  }

  public static void present5() {
    System.out.println("Five golden rings");
    present4();
  }

  public static void present6() {
    System.out.println("Six geese a-laying");
    present5();
  }

  public static void present7() {
    System.out.println("Seven swans a-swimming");
    present6();
  }

  public static void present8() {
    System.out.println("Eight maids a-milking");
    present7();
  }

  public static void present9() {
    System.out.println("Nine ladies dancing");
    present8();
  }

  public static void present10() {
    System.out.println("10 lords a-leaping");
    present9();
  }

  public static void present11() {
    System.out.println("11 pipers piping");
    present10();
  }

  public static void present12() {
    System.out.println("12 drummers drumming");
    present11();
  }

  public static void day1() {
    System.out.println("On the first day of Christmas, my true love sent to me");
    present1();
    System.out.println();
    day2();
  }

  public static void day2() {
    System.out.println("On the second day of Christmas, my true love sent to me");
    present2();
    System.out.println();
    day3();
  }

  public static void day3() {
    System.out.println("On the third day of Christmas my true love sent to me");
    present3();
    System.out.println();
    day4();
  }

  public static void day4() {
    System.out.println("On the fourth day of Christmas my true love sent to me");
    present4();
    System.out.println();
    day5();
  }

  public static void day5() {
    System.out.println("On the fifth day of Christmas my true love sent to me");
    present5();
    System.out.println();
    day6();
  }

  public static void day6() {
    System.out.println("On the sixth day of Christmas my true love sent to me");
    present6();
    System.out.println();
    day7();
  }

  public static void day7() {
    System.out.println("On the seventh day of Christmas my true love sent to me");
    present7();
    System.out.println();
    day8();
  }

  public static void day8() {
    System.out.println("On the eighth day of Christmas my true love sent to me");
    present8();
    System.out.println();
    day9();
  }

  public static void day9() {
    System.out.println("On the ninth day of Christmas my true love sent to me");
    present9();
    System.out.println();
    day10();
  }

  public static void day10() {
    System.out.println("On the 10th day of Christmas my true love sent to me");
    present10();
    System.out.println();
    day11();
  }

  public static void day11() {
    System.out.println("On the 11th day of Christmas my true love sent to me");
    present11();
    System.out.println();
    day12();
  }

  public static void day12() {
    System.out.println("On the 12th day of Christmas my true love sent to me");
    present12();
  }
}
