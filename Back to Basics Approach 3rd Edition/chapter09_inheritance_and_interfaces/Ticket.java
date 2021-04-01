package chapter09_inheritance_and_interfaces;

/**
 * @author Alex Golub
 * @since 30-Mar-21 2:46 PM
 */
abstract class Ticket {
  private final int number;

  public Ticket(int number) {
    this.number = number;
  }

  public int getNumber() {
    return number;
  }

  public abstract double getPrice();

  public String toString() {
    return "Number: " + getNumber() + ", Price: " + getPrice();
  }
}

class WalkupTicket extends Ticket {
  public WalkupTicket(int number) {
    super(number);
  }

  @Override
  public double getPrice() {
    return 50.0;
  }
}

/**
 * Advance tickets purchased 10 or more days before the event cost $30,
 * and advance tickets purchased fewer than 10 days before the event cost $40.
 */
class AdvancedTicket extends Ticket {
  private final int daysInAdvance;

  public AdvancedTicket(int number, int days) {
    super(number);
    daysInAdvance = days;
  }

  @Override
  public double getPrice() {
    return daysInAdvance >= 10 ? 30 : 40;
  }
}

/**
 * Student advance tickets are sold at half the price of normal advance tickets:
 * When they are purchased 10 or more days early they cost $15,
 * and when they are purchased fewer than 10 days early they cost $20.
 */
class StudentAdvanceTicket extends AdvancedTicket {
  public StudentAdvanceTicket(int number, int days) {
    super(number, days);
  }

  @Override
  public double getPrice() {
    return super.getPrice() / 2;
  }

  @Override
  public String toString() {
    return super.toString() + " (ID required)";
  }
}

class TestTicket {
  public static void main(String[] args) {
    Ticket[] tickets = {
            new WalkupTicket(17),
            new AdvancedTicket(18, 5), // 40
            new StudentAdvanceTicket(18, 5), // 20
            new StudentAdvanceTicket(19, 10) // 15
    };

    for (Ticket ticket : tickets) {
      System.out.println(ticket.getClass().getSimpleName() + " => " +
                         ticket.toString());
    }
  }
}
