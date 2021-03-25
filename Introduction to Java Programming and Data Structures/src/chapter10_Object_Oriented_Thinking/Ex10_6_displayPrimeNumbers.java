package chapter10_Object_Oriented_Thinking;

/**
 * *10.6 (Display the prime numbers)
 *
 * Prime number up to 200:
 * 199 197 193 191 181 179 173 167 163 157
 * 151 149 139 137 131 127 113 109 107 103
 * 101 97  89  83  79  73  71  67  61  59
 * 53  47  43  41  37  31  29  23  19  17
 * 13  11  7   5   3   2
 *
 * @author Mr.Dr.Professor
 * @since 3/22/2021 9:49 PM
 */
/*public*/ class Ex10_6_displayPrimeNumbers {
  public static void main(String[] args) {
    final int BOUND = 200;
    final int PER_LINE = 10;

    StackOfIntegers stack = new StackOfIntegers();
    for (int i = 0; i <= BOUND; i++) {
      if (MyInteger.isPrime(i)) {
        stack.push(i);
      }
    }

    System.out.println("Prime number up to " + BOUND + ":");
    for (int i = 0; !stack.empty(); i++) {
      System.out.printf("%-4d", stack.pop());

      if ((i + 1) % PER_LINE == 0) {
        System.out.println();
      }
    }
  }
}
