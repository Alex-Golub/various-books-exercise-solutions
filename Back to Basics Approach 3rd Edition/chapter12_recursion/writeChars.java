package chapter12_recursion;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp3/chapter12/e7-writeChars
 *
 * 1. The middle character of the output should always be an asterisk ("*").
 * 2. even number of characters, then there will be two asterisks in the middle ("**").
 * 3. Before the asterisk(s) you should write out less-than characters ("<").
 *    After the asterisk(s) you should write out greater-than characters (">").
 *
 * writeChars(1);	*
 * writeChars(2);	**
 * writeChars(3);	<*>
 * writeChars(4);	<**>
 * writeChars(5);	<<*>>
 * writeChars(6);	<<**>>
 * writeChars(7);	<<<*>>>
 * writeChars(8);	<<<**>>>
 *
 * @author Alex Golub
 * @since 06-May-21, 12:44 PM
 */
class writeChars {
  public static void main(String[] args) {
    writeChars(1);
    System.out.println();
    writeChars(2);
    System.out.println();
    writeChars(3);
    System.out.println();
    writeChars(4);
    System.out.println();
    writeChars(5);
    System.out.println();
    writeChars(6);
    System.out.println();
    writeChars(7);
  }
  
  public static void writeChars(int n) {
    if (n < 1) {
      throw new IllegalArgumentException();
    }
    
    if (n == 1) {
      System.out.print("*");
    } else if (n == 2) {
      System.out.print("**");
    } else {
      System.out.print("<");
      writeChars(n - 2); // n is odd/even this will be taken care of here
      System.out.print(">");
    }
  }
}
