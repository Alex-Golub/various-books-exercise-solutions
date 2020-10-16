package Chapter_1_Intro;

/**
 * 2. Write a program that prints similar letters such
 * as these to three people of your choice.
 * Each letter should  have at least one paragraph in
 * common with each of the other letters.
 * Your main program should have three method calls,
 * one for each of the people
 * to whom you are writing.
 * Try to isolate repeated tasks into methods.
 *
 * Created by ag on 17-Oct-20 1:45 AM
 */
class ExP1_2_Letters {
  public static void main(String[] args) {
    parents();
    System.out.println();
    girlfriend();
    System.out.println();
    brother();
  }

  public static void money() {
    System.out.println("Give me money please so I can buy new car");
  }

  public static void friend() {
    System.out.println("No friends no problems");
  }

  public static void classes() {
    System.out.println("Computer Science and Math class are the best");
  }

  public static void hobbies() {
    System.out.println("Programing all day long");
  }

  public static void parents() {
    classes();
    friend();
    money();
  }

  public static void girlfriend() {
    hobbies();
    classes();
    money();
  }

  public static void brother() {
    hobbies();
    money();
  }
}
