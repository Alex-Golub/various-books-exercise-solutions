package chapter8_classes;

/**
 * Represents a request to purchase a particular item
 * in a given quantity (e.g., four boxes of cookies).
 *
 * @author Mr.Dr.Professor
 * @since 18-Jan-21 6:19 PM
 */
class GroceryItemOrder {
  private String name;
  private int quantity;
  private double pricePerUnit;

  public GroceryItemOrder(String name, int quantity, double pricePerUnit) {
    if (quantity < 0 || pricePerUnit < 0)
      throw new IllegalArgumentException("Quantity or Price per Unit can't be negative");

    this.name = name;
    this.quantity = quantity;
    this.pricePerUnit = pricePerUnit;
  }

  public double getCost() {
    return pricePerUnit * quantity;
  }

  public void setQuantity(int quantity) {
    if (quantity < 0)
      return;

    this.quantity = quantity;
  }
}
