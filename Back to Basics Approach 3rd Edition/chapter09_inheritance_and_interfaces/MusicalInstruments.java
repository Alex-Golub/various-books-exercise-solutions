package chapter09_inheritance_and_interfaces;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Alex Golub
 * @since 01-Apr-21 2:07 PM
 */
abstract class MusicalInstruments {
  private final String[] stringInstruments;
  private final String[] windInstrument;
  private final String[] percussionInstrument;

  public MusicalInstruments(String[] stringInstruments,
                            String[] windInstrument,
                            String[] percussionInstrument) {
    this.stringInstruments = stringInstruments;
    this.windInstrument = windInstrument;
    this.percussionInstrument = percussionInstrument;
  }

  public String[] getStringInstruments() {
    return Arrays.copyOf(stringInstruments, stringInstruments.length);
  }

  public String[] getWindInstrument() {
    return Arrays.copyOf(windInstrument, windInstrument.length);
  }

  public String[] getPercussionInstrument() {
    return Arrays.copyOf(percussionInstrument, percussionInstrument.length);
  }

  abstract void menu();
  abstract void show(String type);
}

class TypeOfInstrument extends MusicalInstruments {
  public TypeOfInstrument(String[] stringInstruments,
                          String[] windInstrument,
                          String[] percussionInstrument) {
    super(stringInstruments, windInstrument, percussionInstrument);
  }

  /**
   * display a menu of the types of instruments available
   */
  void menu() {
    System.out.print(
            "Types of instruments available:\n" +
            "[a] String Instruments\n" +
            "[b] Wind Instruments\n" +
            "[c] Percussion Instruments\n" +
            "Enter choice to display the names of the type of instrument: "
    );
  }

  /**
   * display the names of the type of instrument chosen by the user.
   */
  void show(String type) {
    switch (type) {
      case "a":
        System.out.println("String Instruments:");
        for (String s : getStringInstruments()) {
          System.out.println("  " + s);
        }
        break;
      case "b":
        System.out.println("Wind Instruments:");
        for (String s : getWindInstrument()) {
          System.out.println("  " + s);
        }
        break;
      case "c":
        System.out.println("Percussion Instruments:");
        for (String s : getPercussionInstrument()) {
          System.out.println("  " + s);
        }
        break;
      default:
        System.out.println("Sorry, there is no such option, try again");
    }
  }
}

class Test {
  public static void main(String[] args) {
    String[] stringInst = {"Guitar", "Violin"};
    String[] windInst = {"Trumpet", "Bassoon"};
    String[] percussionInst = {"Drums", "Tabula"};
    MusicalInstruments instruments =
            new TypeOfInstrument(stringInst, windInst, percussionInst);

    Scanner sc = new Scanner(System.in);
    while (true) {
      instruments.menu();
      String choice = sc.next().toLowerCase().substring(0, 1);
      instruments.show(choice);
      System.out.println();
    }
  }
}