package chapter3_Intro_Classes_Objects_Methods_Strings._3_12_Invoice;

/**
 * Created by ag on 18-Jun-20 3:59 PM
 */
class InvoiceTest {
  public static void main(String[] args) {
    printInfo(new Invoice("123", "Bike", 2, 20));
    System.out.println();
    printInfo(new Invoice("", "", 2, 20));
    System.out.println();
    printInfo(new Invoice(null, null, -2, -20));
    System.out.println();


  }

  private static void printInfo(Invoice invoice) {
    System.out.printf("PartNumber: %s%nDescription: %s%nQuantity: %d%nPrice: $%.2f%nInvoice Amount: $%.2f%n",
            invoice.getPartNumber(), invoice.getDescription(), invoice.getQuantity(),
            invoice.getPrice(), invoice.getInvoiceAmount());
  }
}
