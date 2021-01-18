package chapter8_classes;

/**
 * @author Mr.Dr.Professor
 * @since 18-Jan-21 6:10 PM
 */
class Employee {
  private int     id;
  private String  name;
  private Address address;

  public Employee(int id, String name, Address address) {
    this.id = id;
    this.name = name;
    this.address = address;
  }

  public void display() {
    System.out.printf("Name: %s\nID: %d\nAddress: %s\n",
            name, id, address);
  }

  public static void main(String[] args) {
    Employee employee = new Employee(123, "Bibi",
            new Address("Tel-Aviv", "Center", "Uganda", "1234"));
    employee.display();
  }
}
