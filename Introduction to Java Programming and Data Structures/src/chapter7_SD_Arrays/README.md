<h1 align="center" id="home"><u>CheckPoint Answers</u></h1>

[7.2 Array Basics](#2)  
[7.4 Case Study: Deck of Cards](#4)  
[7.5 Copying Arrays](#5)  
[7.7 Returning an Array from a Method](#7)  
[7.8 Case Study: Counting the Occurrences of Each Letter](#8)  
[7.9 Variable-Length Argument Lists](#9)  
[7.10 Searching Arrays](#10)  
[7.11 Sorting Arrays](#11)  
[7.12 The Arrays Class](#12)  
[7.13 Command-Line Arguments](#13)

<h3 align="center" id="2"><u>7.2 Array Basics</u><a href="#home"> 👆</a></h3>

> 7.2.1 How do you declare an array reference variable and how do you create an array?
>
> > ```java
> > // reference variable of type int
> > int[] arrRefVar; // arrRefVar -> null
> >
> > // creating the actual array of size 5 with default values of 0
> > arrRefVar = new int[5]; // arrRefVar -> {0, 0, 0, 0, 0}
> > ```

> 7.2.2 When is the memory allocated for an array?
>
> > Memory allocation is done when we creating the actual array i.e. when we
> > use the `new` keyword along with the type and size of the array.
> > e.g. `new int[10];` this is when memory allocation starts.
> > When memory allocation is completed we get back `reference` (i.e. **_memory location address_**)
> > where this array is residing.

> 7.2.3 What is the output of the following code?
>
> > ```java
> > int n = 30;
> > int[] numbers = new int[n];                                     // {0, 0, 0, ... 0} (30 zeros)
> > n = 60;
> > System.out.println("n is " + n);                                // => n is 60
> > System.out.println("The size of numbers is " + numbers.length); // => The size of numbers is 30
> > ```

> 7.2.4 Indicate `true` or `false` for the following statements:
>
> > ```java
> > // a. Every element in an array has the same type.
> > //    => true, array is a collection of elements of the same type
> >
> > // b. The array size is fixed after an array reference variable is declared.
> > //    => false, array size is fixed only after it has been created i.e. new keyword was used.
> > //       declaring array reference variable is only stating that this variable can point to
> > //       a memory location where array can be located.
> >
> > // c. The array size is fixed after it is created.
> > //    => true, once we used new keyword along with type and size of array
> > //       it will be created in memory and its size will be fixed.
> >
> > // d. The elements in an array must be of a primitive data type.
> > //    => false, array elements can be of any type primitive or objects.
> > //       but all the elements will be of the same type.
> > //       E.g. int[] nums = new int[5];        // array of integers only
> > //            String[] words = new String[2]; // array of String object only
> > ```

> 7.2.5 Which of the following statements are valid?
>
> > ```java
> > // a. int i = new int(30);         // ✖, int is data type not an array, int(30) is invalid syntax
> > // b. double d[] = new double[30]; // ✔, array of doubles of size 30 (C syntax)
> > // c. char[] r = new char(1..30);  // ✖, char(1..30) invalid should be char[30]
> > // d. int i[] = (3, 4, 3, 2);      // ✖, incorrect initializing should use {} instead of ()
> > // e. float f[] = {2.3, 4.5, 6.6}; // ✔, declare + initialize
> > // f. char[] c = new char();       // ✖, () is wrong syntax should be [], and size must be givin
> > ```

> 7.2.6 How do you access elements in an array?
>
> > Array elements can be access using int data type as index.
> > E.g. `arrRefVar[5]` will retrieve the six-th element (zero based) of the array

> 7.2.7 What is the array index **type**?  
> What is the **lowest** index?  
> What is the representation of the third element in an array named `a`?
>
> > Array index type is `int`  
> > Lowest index of an array is `0`  
> > Arrays are zero based thus 3-rd element of a is at index 2 i.e. `a[2]`

> 7.2.8 Write statements to do the following:
>
> > ```java
> > // a. Create an array to hold 10 double values.
> > double[] doubleValues = new double[10];
> >
> > // b. Assign the value 5.5 to the last element in the array.
> > doubleValues[doubleValues.length - 1] = 5.5;
> >
> > // c. Display the sum of the first two elements.
> > System.out.println(doubleValues[0] + doubleValues[1]);
> >
> > // d. Write a loop that computes the sum of all elements in the array.
> > double sum = 0;
> > for (double val : doubleValues)
> >   sum += val;
> >
> > // e. Write a loop that finds the minimum element in the array.
> > double minValue = Double.MAX_VALUE;
> > for (double val : doubleValues)
> >   minValue = Math.min(val, minValue);
> >
> > // f. Randomly generate an index and display the element of this index in the array.
> > int randomIdx = (int) (Math.random() * doubleValues.length);
> > System.out.println(doubleValues(randomIdx));
> >
> > // g. Use an array initializer to create another array with the initial values
> > // 3.5, 5.5, 4.52, and 5.6
> > double[] oneMore = {3.5, 5.5, 4.52, 5.6}
> > ```

> 7.2.9 What happens when your program attempts to access an array element with an  
> invalid index?
>
> > Accessing array with index that is not part of that array will cause  
> > **_ArrayIndexOutOfBounds_** runtime exception e.g. `arr[-1]` or `arr[arr.length]`

> 7.2.10 Identify and fix the errors in the following code:
>
> > ```java
> > public class Test {
> >   public static void main(String[] args) {
> >     double[/* 100 */] r = new double[100];
> >
> >     for (int i = 0; i < r.length/* () */; i++)/* ; */
> >       r/* (i) */[i] = Math.random() * 100;
> >   }
> > }
> > ```

> 7.2.11 What is the output of the following code?
>
> > ```java
> > public class Test {
> >   public static void main(String[] args) {
> >     int list[] = {1, 2, 3, 4, 5, 6}:
> >
> >     for (int i = 1; i < list.length; i++)
> >       list[i] = list[i - 1]; // {1, 1, 1, 1, 1, 1}
> >
> >     for (int i = 0; i < list.length; i++)
> >       System.out.print(list[i] + " "); // 1 1 1 1 1 1
> >   }
> > }
> > ```

---

<h3 align="center" id="4"><u>7.4 Case Study: Deck of Cards</u><a href="#home"> 👆</a></h3>

> 7.4.1 Will the program pick four random cards if you replace lines 22–27 in Listing 7.2,
> `DeckOfCards.java`, with the following code?
>
> > ```java
> > for (int i = 0; i < 4; i++) {
> >   int cardNumber = (int)(Math.random() * deck.length);
> >   String suit = suits[cardNumber / 13];
> >   String rank = ranks[cardNumber % 13];
> >   System.out.println("Card number " + cardNumber + ": " + rank + " of " + suit);
> > }
> > ```
> >
> > **No** it will not work because `cardNumber` can be picked **more then once** so
> > it is possible that we get 4 same cards.

---

<h3 align="center" id="5"><u>7.5 Copying Arrays</u><a href="#home"> 👆</a></h3>

> 7.5.1 Use the `arraycopy` method to copy the following array to a target array `t`:
>
> > ```java
> > int[] source = {3, 4, 5};
> > int[] t = new int[source.length];
> > System.arraycopy(source, 0, t, 0, source.length);
> > ```

> 7.5.2 Once an array is created, its size cannot be changed.  
> Does the following code resize the array?
>
> > ```java
> > int[] myList;
> > myList = new int[10];
> >
> > // Sometime later you want to assign a new array to myList
> > myList = new int[20];
> > ```
> >
> > **No**. `myList` is now referencing (pointing) to a new array created with size 20.  
> > The previous array `myList` was pointing to is no longer referenced by `myList`  
> > and if no other array reference is pointing to it, it is now **eligible** to be  
> > collected by the `garbage collector`.

---

<h3 align="center" id="7"><u>7.7 Returning an Array from a Method</u><a href="#home"> 👆</a></h3>

> 7.7.1 Suppose the following code is written to reverse the contents in an array, explain
> why it is wrong. How do you fix it?
>
> > ```java
> > int[] list = {1, 2, 3, 5, 4};
> > for (int i = 0, j = list.length − 1; i < list.length; i++, j−−) {
> >   // Swap list[i] with list[j]
> >   int temp = list[i];
> >   list[i] = list[j];
> >   list[j] = temp;
> > }
> > ```
> >
> > Problem is with the condition, is should be up to **list.length / 2**

---

<h3 align="center" id="8"><u>7.8 Case Study: Counting the Occurrences of Each Letter</u><a href="#home"> 👆</a></h3>

> 7.8.1 True or false? When an array is passed to a method, a new array is created and
> passed to the method.
>
> > **False**. Whats passed is a reference to that array which located on the heap.
> > Java is pass-by-value which mean the the `arrayRefVar` **stores the reference (address)**
> > to the array that has been allocated on the heap.
> > Thus **both the points to the same array**.

> 7.8.2 Show the output of the following two programs:
>
> > ```java
> > // (a) number is 0 and number[0] is 3
> > // (b) 1 2 3 4 5  Explanation: list referencing the the same list from caller
> > //                             within the method it is assigned to new array newList, java is pass-by-value
> > //                             meaning that caller is not effected by the changed in the method.
> > //                             Thus list from caller still pointing to the original list {1,2,3,4,5}
> > ```

> 7.8.3 Where are the arrays stored during execution?
>
> > Arrays stored on the **_Heap_** which is used for dynamic memory allocation.

---

<h3 align="center" id="9"><u>7.9 Variable-Length Argument Lists</u><a href="#home"> 👆</a></h3>

> 7.9.1 What is wrong with each of the following method headers?
>
> > ```java
> > // a. public static void print(String... strings, double... numbers) // only one vararg may be specified in a method header
> > // b. public static void print(double... numbers, String name)       // vararg if present must be the last argument in method pharmacist
> > // c. public static double... print(double d1, double d2)            // vararg can be part of parameter list only and not a return value
> > ```

> 7.9.2 Can you invoke the `printMax` method in Listing 7.5 using the following statements?
>
> > a. printMax(1, 2, 2, 1, 4); // ✔, int values will be casted to double type
> > b. printMax(new double[]{1, 2, 3}); // ✔, `numbers` in `printMax` will point to this passed array
> > c. printMax(new int[]{1, 2, 3}); // ✖, `numbers` if of type double can't store `int[]` type

---

<h3 align="center" id="10"><u>7.10 Searching Arrays</u><a href="#home"> 👆</a></h3>

> 7.10.1 If `high` is a very large integer such as the maximum int value 2147483647,
> `(low + high) / 2` may cause overflow. How do you fix it to avoid overflow?
>
> > **_low + (high - low) / 2;_**

> 7.10.2 Use Figure 7.9 as an example to show how to apply the binary search approach to a
> search for `key 10` and `key 12` in list `{2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79}`.
>
> > |    **low**    |   **high**    | **low <= high** |       **mid**        | **key** | **list[mid]** |
> > | :-----------: | :-----------: | :-------------: | :------------------: | :-----: | :-----------: |
> > |       0       |      12       |      true       | **(12 + 0) / 2 = 6** |   10    |      50       |
> > |               | **6 - 1 = 5** |                 | **(5 + 0) / 2 = 2**  |         |     **7**     |
> > | **2 + 1 = 3** |               |                 | **(5 + 3) / 2 = 4**  |         |    **11**     |
> > |       3       | **4 - 1 = 3** |                 | **(3 + 3) / 2 = 3**  |         |   **10**✅    |
> >
> > return `mid` index = 3
> >
> > |    **low**    |   **high**    | **low <= high** |       **mid**        | **key** | **list[mid]** |
> > | :-----------: | :-----------: | :-------------: | :------------------: | :-----: | :-----------: |
> > |       0       |      12       |      true       | **(12 + 0) / 2 = 6** |   12    |      50       |
> > |               | **6 - 1 = 5** |                 | **(5 + 0) / 2 = 2**  |         |     **7**     |
> > | **2 + 1 = 3** |               |                 | **(5 + 3) / 2 = 4**  |         |    **11**     |
> > | **4 + 1 = 5** |               |                 | **(5 + 5) / 2 = 5**  |         |    **45**     |
> > |               | **5 - 1 = 4** |   **false**✅   |                      |         |               |
> > |               |               |                 |                      |         |               |
> >
> > return `-low -1 = -5-1 = -6` i.e. `key 12` should have been in the **position of 45 = list[5]**

> 7.10.3 If the binary search method `returns −4`, is the key in the list?
> Where should the key be inserted if you wish to insert the key into the list?
>
> > negtaive value from binary search indicates that the key we are searching for
> > is **not found in the list** and if it was pasrt of it its index was as the place
> > of the value in the index **_-(return_index + 1)_**

---

<h3 align="center" id="11"><u>7.11 Sorting Arrays</u><a href="#home"> 👆</a></h3>

> 7.11.1 Use Figure 7.11 as an example to show how to apply the selection-sort approach to
> sort `{3.4, 5, 3, 3.5, 2.2, 1.9, 2}`.
>
> > | iteration # |                 array                 |
> > | :---------: | :-----------------------------------: |
> > |      0      |     {3.4, 5, 3, 3.5, 2.2, 1.9, 2}     |
> > |      1      | {**1.9**, 5, 3, 3.5, 2.2, **3.4**, 2} |
> > |      2      | {1.9, **2**, 3, 3.5, 2.2, 3.4, **5**} |
> > |      3      | {1.9, 2, **2.2**, **3**, 3.5, 3.4, 5} |
> > |      4      | {1.9, 2, 2.2, 3, **3.4**, **3.5**, 5} |

> 7.11.2 How do you modify the `selectionSort` method in Listing 7.8 to sort numbers in
> **decreasing** order?
>
> > ```java
> > public class chapter7_SD_Arrays.SelectionSort {
> >   public static void selectionSort(int[] list) {
> >     for (int i = 0; i < list.length - 1; i++) {
> >       int currentMinValue = list[i];
> >       int currentMinIndex = i;
> >
> >       boolean isSorted = true;
> >       for (int j = i + 1; j < list.length; j++) {
> >         if (currentMinValue < list[j]) { // change sign from > (ASC order) to < (DESC order)
> >           currentMinValue = list[j];
> >           currentMinIndex = j;
> >           isSorted = false;
> >         }
> >       }
> >
> >       if (isSorted)
> >         break;
> >
> >       if (currentMinIndex != i)
> >         swap(list, currentMinIndex, i);
> >     }
> >   }
> >
> >   public static void swap(int[] list, int i, int j) {
> >     int tmp = list[i];
> >     list[i] = list[j];
> >     list[j] = tmp;
> >   }
> > }
> > ```

---

<h3 align="center" id="12"><u>7.12 The Arrays Class</u><a href="#home"> 👆</a></h3>

> 7.12.1 What types of array can be sorted using the `java.util.Arrays.sort` method?
> Does this sort method create a new array?
>
> > The static method `sort()` in `Arrays` class by default will sort the array in ascending order.
> > But sort method is overloaded and there is one that we can specify how we want the sort
> > method to do the sorting `sort(type[], Comparator)`.
> > `sort()` method is a **procedure** i.e. it is not returning anything from its method once
> > it is done, thus sort() method don't created new array (sorting is done in-place).

> 7.12.2 To apply `java.util.Arrays.binarySearch(array, key)`, should the array
> be sorted in increasing order, in decreasing order, or neither?
>
> > Array should be sorted in **ascending order**.
> > If we want to search for the key in descending order array we must use the overloaded
> > method of `binarySearch(type[], Comparator)` where in comparator we specify how the
> > array is ordered.

> 7.12.3 Show the output of the following code:
>
> > ```java
> > int[] list1 = {2, 4, 7, 10};
> > java.util.Arrays.fill(list1, 7);
> > System.out.println(java.util.Arrays.toString(list1)); // [7, 7, 7, 7]
> >
> > int[] list2 = {2, 4, 7, 10};
> > System.out.println(java.util.Arrays.toString(list2)); // [2, 4, 7, 10]
> > System.out.print(java.util.Arrays.equals(list1, list2)); // false
> > ```

---

<h3 align="center" id="13"><u>7.13 Command-Line Arguments</u><a href="#home"> 👆</a></h3>

> 7.13.1 This book declares the main method as
> `public static void main(String[] args)` Can it be replaced by one of the following lines?
>
> > a. `public static void main(String args[])` // ✔, C/C++ style  
> > b. `public static void main(String[] x)` // ✔, there is no restriction for `main()` argument names  
> > c. `public static void main(String x[])` // ✔  
> > d. `static void main(String x[])` // ✖, `main()` must be public method otherwise it can't be invoked by JVM

> 7.13.2 Show the output of the following program when invoked using
> `1. java Test I have a dream`  
> `2. java Test “1 2 3”`  
> `3. java Test`
>
> > ```java
> > public class Test {
> >   public static void main(String[] args) {
> >     System.out.println("Number of strings is " + args.length); // (1): 3, (2): 1, (3): 0
> >     for (int i = 0; i < args.length; i++)
> >       System.out.println(args[i]); // (1): I\nhave\na\ndream, (2): 1 2 3\n, (3): \n
> >   }
> > }
> > ```
