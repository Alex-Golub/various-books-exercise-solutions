package CodeStepByStep_java.classes_and_objects;

/**
 * @author Mr.Dr.Professor
 * @since 18-Jan-21 4:16 PM
 */
class Student {
  private String name;
  private int    id;
  private int    units;

  public Student(String name, int id) {
    this.name = name;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public int getID() {
    return id;
  }

  public int getUnits() {
    return units;
  }

  public void incrementUnits(int units) {
    if (units < 0)
      return;
    this.units += units;
  }

  public boolean hasEnoughUnits() {
    return getUnits() >= 180;
  }

  public String toString() {
    return String.format("%s (#%d)", getName(), getID());
  }
}
