package chapter3_object_interaction.mail_system;

/**
 * A class to model a simple mail item. The item has sender and recipient
 * addresses and a message string.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MailItem {
  // The sender of the item.
  private String from;
  // The intended recipient.
  private String to;
  // The text of the message.
  private String message;
  private String subject;

  /**
   * Create a mail item from sender to the given recipient,
   * containing the given message.
   *
   * @param from    The sender of this item.
   * @param to      The intended recipient of this item.
   * @param message The text of the message to be sent.
   */
  public MailItem(String subject, String from, String to, String message) {
    this.subject = subject;
    this.from = from;
    this.to = to;
    this.message = message;
  }

  public String getSubject() {
    return subject;
  }

  /**
   * @return The sender of this message.
   */
  public String getFrom() {
    return from;
  }

  /**
   * @return The intended recipient of this message.
   */
  public String getTo() {
    return to;
  }

  /**
   * @return The text of the message.
   */
  public String getMessage() {
    return message;
  }

  /**
   * Print this mail message to the text terminal.
   */
  public void print() {
    System.out.printf("Subject: %s\nFrom: %s\nTo: %s\nMessage: %s\n", subject, from, to, message);
  }
}
