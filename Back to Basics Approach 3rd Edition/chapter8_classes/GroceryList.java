package chapter8_classes;

/**
 * Represents a list of items to buy from the market
 *
 * @author Mr.Dr.Professor
 * @since 18-Jan-21 6:19 PM
 */
class GroceryList {
  private GroceryItemOrder[] list;
  private int size;

  public GroceryList() {
    list = new GroceryItemOrder[10];
    size = 0;
  }

  public void add(GroceryItemOrder item) {
    if (size < list.length) {
      list[size] = item;
      size++;
    }
  }

  public double getTotalCost() {
    double total = 0;
    for (int i = 0; i < size; i++)
      total = list[i].getCost();
    return total;
  }
}
