package chapter09_inheritance_and_interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * BJP3 Exercise 9.10: DiscountBill
 * https://practiceit.cs.washington.edu/problem/view/bjp3/chapter9/e10-DiscountBill
 *
 * @author Alex Golub
 * @since 30-Mar-21 3:57 PM
 */
public class GroceryBill {
  private final Employee clerk;
  private final List<Item> receipt;
  private double total;
  private double internalDiscount;

  public GroceryBill(Employee clerk) {
    this.clerk = clerk;
    receipt = new ArrayList<>();
    total = 0.0;
    internalDiscount = 0.0;
  }

  public void add(Item i) {
    receipt.add(i);
    total += i.getPrice();
    internalDiscount += i.getDiscount();
  }

  public double getTotal() {
    return Math.rint(total * 100) / 100.0;
  }

  public Employee getClerk() {
    return clerk;
  }

  public void printReceipt() {
    System.out.println(this);
  }

  private String valueToString(double value) {
    value = Math.rint(value * 100) / 100.0;
    String result = "" + Math.abs(value);
    if (result.indexOf(".") == result.length() - 2) {
      result += "0";
    }
    result = "$" + result;

    return result;
  }

  public String receiptToString() {
    StringBuilder build = new StringBuilder("items:\n");
    for (int i = 0; i < receipt.size(); i++) {
      build.append("   ").append(receipt.get(i));

      if (i != receipt.size() - 1) {
        build.append("\n");
      }
    }

    return build.toString();
  }

  public String toString() {
    return receiptToString() + "\ntotal: " + valueToString(total);
  }

  public String discountToString() {
    return receiptToString() +
           "\nsub-total: " + valueToString(total) +
           "\ndiscount: " + valueToString(internalDiscount) +
           "\ntotal: " + valueToString(total - internalDiscount);
  }

  public static class Employee {
    private final String name;

    public Employee(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }
  }

  public static class Item {
    private final String name;
    private final double price;
    private final double discount;

    public Item(String name, double price, double discount) {
      this.name = name;
      this.price = price;
      this.discount = discount;
    }

    public double getPrice() {
      return price;
    }

    public double getDiscount() {
      return discount;
    }

    private String valueToString(double value) {
      String result = "" + Math.abs(value);
      if (result.indexOf(".") == result.length() - 2) {
        result += "0";
      }
      result = "$" + result;

      return result;
    }

    public String toString() {
      return name + " " + valueToString(price) +
             " (-" + valueToString(discount) + ")";
    }
  }
}

class DiscountBill extends GroceryBill {
  private final boolean preferred;
  private int discountCount;
  private double discountAmount;

  public DiscountBill(Employee clerk, boolean preferred) {
    super(clerk);
    this.preferred = preferred;
  }

  @Override
  public void add(Item i) {
    super.add(i);

    if (preferred && i.getDiscount() > 0.0) {
      discountCount++;
      discountAmount += i.getDiscount();
    }
  }

  @Override
  public double getTotal() {
    return super.getTotal() - getDiscountAmount();
  }

  /** returns the number of items that were discounted, if any */
  public int getDiscountCount() {
    return discountCount;
  }

  /** returns the total discount for this list of items, if any */
  public double getDiscountAmount() {
    return discountAmount;
  }

  /**
   * returns the percent of the total discount as a percent of
   * what the total would have been otherwise
   */
  public double getDiscountPercent() {
    return 100 * getDiscountAmount() / super.getTotal();
  }
}