package chapter3_Intro_Classes_Objects_Methods_Strings._3_12_Invoice;

/**
 * Created by ag on 18-Jun-20 3:50 PM
 */
public class Invoice {

  private String partNumber;
  private String description;
  private int quantity;
  private double price;

  public Invoice(String partNumber, String description, int quantity, double price) {
    if (partNumber == null || partNumber.isBlank())
      partNumber = "## No part number provided ##";

    if (description == null || description.isBlank())
      description = "## No description provided ##";

    // If the quantity is not positive, it should be set to 0
    if (quantity < 0)
      quantity = 0;

    // If the price per item is not positive, it should be set to 0.0.
    if (price <= 0.0)
      price = 0.0;

    this.partNumber = partNumber;
    this.description = description;
    this.quantity = quantity;
    this.price = price;
  }

  public String getPartNumber() {
    return partNumber;
  }

  public void setPartNumber(String partNumber) {
    if (partNumber != null && !partNumber.isBlank())
      this.partNumber = partNumber;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    if (description != null && !description.isBlank())
      this.description = description;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    if (quantity >= 0)
      this.quantity = quantity;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    if (price >= 0.0)
      this.price = price;
  }

  public double getInvoiceAmount() {
    return this.quantity * this.price;
  }
}
