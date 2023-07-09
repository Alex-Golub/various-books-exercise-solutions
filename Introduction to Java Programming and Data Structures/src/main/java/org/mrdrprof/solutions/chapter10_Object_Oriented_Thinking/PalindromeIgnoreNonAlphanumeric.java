package org.mrdrprof.solutions.chapter10_Object_Oriented_Thinking;

/*public*/ class PalindromeIgnoreNonAlphanumeric {
  public static void main(String[] args) {
//    Scanner input = new Scanner(System.in);
//
//    System.out.print("Enter a string: ");
//    String s = input.nextLine();
//
//    System.out.println("Ignoring non-alphanumeric characters, \nis "
//                       + s + " a palindrome? " + isPalindrome(s));

    System.out.println(reverse("JLais funva is funHTML"));
  }

  public static boolean isPalindrome(String s) {
    String s1 = filter(s);
    String s2 = reverse(s1);
    return s2.equals(s1);
  }

  public static String filter(String s) {
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
      if (Character.isLetterOrDigit(s.charAt(i))) {
        stringBuilder.append(s.charAt(i));
      }
    }

    return stringBuilder.toString();
  }

  public static String reverse(String s) {
    return new StringBuilder(s).reverse().toString();
  }
}
