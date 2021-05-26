<h1 align="center" id="home"><u>CheckPoint Answers</u></h1>

[Section 13.1: Searching and Sorting in the Java Class Libraries](#1)  
[Section 13.2: Program Complexity](#2)  
[Section 13.3: Implementing Searching and Sorting Algorithms](#3)  
[Section 13.4: Case Study: Implementing Merge Sort](#4)

<h3 align="center" id="1"><u>Section 13.1: Searching and Sorting in the Java Class Libraries</u><a href="#home"> 👆</a></h3>

> 1. Describe two ways to search an **unsorted array** of `String` objects using the Java class libraries.
>
>    > 1: Use **linear search** with a simple `for` loop examining each value of the array.  
>    > 2: **Sort** the array using `Arrays.sort(String[])` and then **search** using the `Arrays.binarySearch(String[], String)`  
>    > to find the required target string.

> 2. If you perform a **binary search** on an array of one million integers,  
>    which of the following is closest to the number of elements that the search algorithm will  
>    need to examine?
>
>    > ```java
>    > a. all 1,000,000 of the integers           // linear search
>    > b. roughly 3/4 (750,000) of the integers
>    > c. roughly half (500,000) of the integers
>    > d. roughly 1/10 (100,000)
>    > e. less than 1% (10,000 or fewer) // ✔, log(2)1e6 = x => x ~= 20 => 100 * (20 / 1e6) = 0.001%
>    > ```

> 3. Should you use a sequential or binary search on an array of `Point` objects, and why?
>
>    > Point from java.aws.\* is **not comparable** thus simple search can be done sequentially which is  
>    > order of `O(N)`. Though we can create a custom `Comparator(Point, Point)` and use it to first  
>    > sort the array of points and then use `Arrays.binarySearch(Point[], Point, Comparator<Point>)`.  
>    > Using `Arrays.sort(Point[])` will take `O(NlogN)` time and searching using binary is another  
>    > `O(logN)`, overall it will take `O(NlogN)` time to search the array which is more then the simple  
>    > sequential search `O(N)`.

> 4. Under what circumstances can the `Arrays.binarySearch` and `Collections.binarySearch` methods  
>    be used successfully?
>    > The array and list **must be sorted** according there natural order or by the provided  
>    > Comparator otherwise we will get unexpected result.
>    > `Arrays/Collections.binarySearch(Object[], Object);` // if each object of the array implements  
>    > `Comparable<T>` interface  
>    > `Arrays/Collection.binarySearch(Object[], Object, Comparator<T>);` // if Object doesn't  
>    >  implements the Comparable<T> interface then Comparator<T> must be provided for the search to  
>    > be successful.

> 5. In what order does the `Collections.sort` method arrange a list of strings?  
>    How could you arrange them into a different order?
>    > String class implements the Comparable<T> interface thus when sort method is invoked on  
>    > a list of strings the sorting will be done by the natural order of strings i.e. by the alphabet  
>    > case-sensitive order.
>    > To sort list of string is different order we can provide a custom `Comparator<String>` to the  
>    > `Collections.sort(List<String>, Comparator<String>)` to sort the list in different order.
>    > E.g. `Collections.sort(List<String>, Comparator.comparingInt(String::length))` will sort  
>    > the list by strings length.  
>    > `Collections.sort(List<String>, Comparator.reverseOrder())` will sort the list is reverse order.

> 6. Why wouldn’t the `Collections.sort` method work when used on a list of `Point` objects?  
>    How can you make it so that the sort method can be used on Points or any other type of objects?
>    > `Point` class don't implements `Comparable<T>` interface thus invoking `Collections.sort` on  
>    > a list of `Point` will sort the list in unexpected order.  
>    > We can supply a custom `Comparator<Point>` to `Collections.sort` method.
>    > `Collections.sort(List<Point>, Comparator<Point>)`

> 7. The following `Comparator` class is attempting to arrange `BankAccount` objects by account name,  
>    breaking ties by account balance.  
>    But the code has some syntax errors and some logic errors.  
>    What is wrong with the code? How would you correct it?
>    > ```java
>    > import java.util.*;
>    > public class AccountComparator extends Comparator<BankAccount> {
>    >   public int /* compareTo */compare(BankAccount account1, BankAccount account2) {
>    >     if (account1.getName().equals(account2.getName()))
>    >       return account1.getBalance() - account2.getBalance();
>    >     return account1.getName().compareTo(account2.getName());
>    >   }
>    > }
>    > ```

> 8. In this section, we wrote a `LengthComparator` that would allow a list or array of strings  
>    to be sorted in **ascending order by length**.  
>    How could we easily sort the <u>collection</u> in **descending order by length**, from longest to shortest,  
>    without modifying the code of `LengthComparator`?
>    > ```java
>    > String[] strings = {"Foxtrot", "alpha", "echo", "golf", "bravo", "hotel", "Charlie", "DELTA"};
>    > List<String> stringList = Arrays.asList(strings);
>    > stringList.sort(Comparator.comparingInt(String::length).reversed());
>    > System.out.println(stringList); // => [Foxtrot, Charlie, hotel, DELTA, bravo, alpha, golf, echo]
>    > ```

---

<h3 align="center" id="2"><u>Section 13.2: Program Complexity</u><a href="#home">👆</a></h3>

> 9 - 13. Approximate the runtime of the following code fragment, in terms of `n`:
>
> > ```java
> > int sum = 0;
> > int j = 1;
> > while (j <= n) {
> >   sum++;
> >   j = j * 2; // 1, 2, 4, 8, 16, ... log(2)N
> > }
> > // => O(logN)
> > ```
> >
> > ```java
> > int sum = 0;
> > for (int j = 1; j < n; j++) { // - n
> >     sum++;
> >     if (j % 2 == 0) {
> >         sum++;
> >     }
> > } // => O(N)
> > ```
> >
> > ```java
> > int sum = 0;
> > for (int i = 1; i <= n * 2; i++) { // - 2n
> >     for (int j = 1; j <= n; j++) { // - n
> >         sum++;
> >     }
> > } // => O(2n * n) = O(N^2)
> >
> > for (int j = 1; j < 100; j++) { // - 100
> >     sum++;
> >     sum++;
> > } // => O(100) = O(1)
> >
> > // Overall running time = O(N^2 + 1) = O(N^2)
> > ```
> >
> > ```java
> > int sum = 0;
> > for (int i = 1; i <= n; i++) { // - N
> >     for (int j = 1; j <= i; j += 2) { // - N
> >         sum += 4;
> >     }
> > } // O(N^2)
> >
> > for (int k = -50; k <= -1; k++) { // - |(-1) + (-50) + 1| = O(1)
> >     sum--;
> > }
> >
> > // Overall = O(N^2)
> > ```
> >
> > ```java
> > int sum = 0;
> > for (int i = 1; i <= n; i++) { // - N
> >     for (int j = 1; j <= 1_000_000; j++) { // - 1_000_000 = O(1)
> >         sum += 10;
> >     }
> > }
> > sum += 9999;
> > // Overall = O(N)
> > ```

> 14. Determine the complexity classes of the algorithms that could be used to perform the following tasks:
>     > ```text
>     > a. Finding the average of the numbers in an array of integers                         // N
>     > b. Finding the closest distance between any pair of points in an array of Points      // N^2
>     > c. Finding the maximum value in an unsorted array of real numbers                     // N
>     > d. Counting the median length of the Strings in an array                              // N
>     > e. Raising an integer to a power—for example, A^B                                     // N
>     > f. Examining an array of Points to see how many trios of points are colinear—that is, // N^3
>     > how many groups of three points could be connected by a straight line
>     > g. Counting the number of lines in a file                                             // N
>     > h. Determining whether a given integer representing a year stores a leap year         // 1
>     > (a year divisible by 4, but not divisible by 100 unless also divisible by 400)
>     > ```

> 15. Suppose an algorithm takes exactly the given number of statements for each value below,  
>      in terms of an input size N.
>     Give a tight big-Oh bound for each algorithm, representing the closest complexity class  
>      for that algorithm based on that runtime.
>     > ```
>     > a. 1⁄2(NlogN) + logN // NlogN
>     > b. N^2 - (N + NlogN + 1000) // N^2
>     > c. N^2logN + 2N // N^2logN
>     > d. 1⁄2(3N + 5 + N) // N
>     > e. (2N + 5 + N^4) / N // N^4 / N = N^3
>     > ```

---

<h3 align="center" id="3"><u>Section 13.3: Implementing Searching and Sorting Algorithms</u><a href="#home"> 👆</a></h3>

> 16. What is the runtime complexity class of a sequential search on an unsorted array?  
>      What is the runtime complexity class of the modified sequential search on a sorted array?
>     > Sequential runtime will always be **O(N)** regarding if the array sorted or not.

> 17. Why does the binary search algorithm require the input to be sorted? > Binary search relies on the fact that elements of the array will be ordered because
>     > of the indexes adjustments, if array will be un-sorted binary search is not guaranteed to  
>     > find the target element.

> 18. How many elements (at most) does a binary search examine if the array contains 60 elements?
>     > ```
>     > log2(60) = N => 2^N = 60 <=> 2^6 = 64
>     > ceil(2^N = 60) ~= 6 elements will be examined
>     > ```

> 19. What indexes will be examined as the **middle element** by a binary search for the target  
>      value 8 when the search is run on the following input arrays?  
>      What value will the binary search algorithm return?
>     > ```
>     >              0  1  2  3  4   5   6   7   8
>     > int[] arr = {1, 3, 6, 7, 8, 10, 15, 20, 30};
>     >
>     > mid = (8 + 0) / 2 = 4, arr[mid] = 8 === 8
>     > target value found at index 4
>     >
>     >              0  1  2  3  4  5  6  7   8
>     > int[] arr = {1, 2, 3, 4, 5, 7, 8, 9, 10};
>     > mid = (8 + 0) / 2 = 4, arr[mid] = 5 < 8
>     > mid = (8 + 5) / 2 = 6, arr[6] = 8 == 8
>     > target value found at index 6
>     >
>     >              0  1  2  3  4  5  6  7  8
>     > int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
>     > mid = 8 / 2 = 4, arr[4] = 5 < 8
>     > mid = (8 + 5) / 2 = 6, arr[6] = 7 < 8
>     > mid = (8 + 7) / 2 = 7, arr[7] = 8 == 8
>     > target value found at index 7
>     >
>     >              0  1   2   3   4   5   6   7   8
>     > int[] arr = {8, 9, 12, 14, 15, 17, 19, 25, 31};
>     > mid = 8 / 2 = 4, arr[4] = 15 > 8
>     > mid = 3 / 2 = 1, arr[1] = 9 > 8
>     > mid = 0 / 2 = 0, arr[0] = 8 == 8
>     > target value found at index 0
>     > ```

> 20. What indexes will be examined as the middle element by a binary search for the target  
>      value 8 when the search is run on the following input array?  
>      Notice that the input array isn’t in sorted order.
>     What can you say about the binary search algorithm’s result?
>     > ```
>     >              0  1  2   3  4   5   6   7  8
>     > int[] arr = {6, 5, 8, 19, 7, 35, 22, 11, 9};
>     > mid = 8 / 2 = 4, arr[4] = 7 < 8
>     > mid = (8 + 5) / 2 = 6, arr[6] = 22 > 8
>     > mid = (5 + 5) / 2 = 5, arr[5] = 35 > 8
>     > mid = (4 + 5) => pointers cross each-other return -1
>     > ```
>     >
>     > Although 8 is found in the array it can't be found using binary-search because
>     > for binary search to work properly the array should be in sorted order

> 21. Consider the following **sorted array** of integers.  
>      When a binary search is performed on this array for each of the following integer values,  
>      what indexes are examined in order?  
>      What result value is returned?
>     > ```
>     >               0  1  2  3   4   5   6   7   8   9  10  11  12  13  14
>     > int[] arr = {–1, 3, 5, 8, 15, 18, 22, 39, 40, 42, 50, 57, 71, 73, 74};
>     >
>     > a. 42 > mid = 14 / 2 = 7, arr[7] = 39 < 42
>     > mid = (14 + 8) / 2 = 11, arr[11] = 57 > 42
>     > mid = (10 + 8) / 2 = 9, arr[9] = 42 == 42
>     > indexes examined: 7 11 9
>     > value returned: 9
>     >
>     > b. 11 > mid = 14 / 2 = 7, arr[7] = 39 > 11
>     > mid = 6 / 2 = 3, arr[3] = 8 < 11
>     > mid = (6 + 4) / 2 = 5, arr[5] = 18 > 11
>     > mid = (4 + 4) / 2 = 4, arr[4] = 15 > 15
>     > mid = (3 + 4) stop
>     > indexes examined: 7 3 5 4
>     > value returned: -4 - 1 = -5 (NB: -(insertion point) - 1)
>     >
>     > c. 74 > mid = 14 / 2 = 7, arr[7] = 39 < 74
>     > mid = (14 + 8) / 2 = 11, arr[11] = 57 < 74
>     > mid = (14 + 12) / 2 = 13, arr[13] = 74 < 74
>     > mid = (14 + 14) / 2 = 14, arr[14] = 74 == 74
>     > indexes examined: 7 11 13 14
>     > value returned: 14
>     >
>     > d. 30 > mid = 14 / 2 = 7, mid[7] = 39 > 30
>     > mid = 6 / 2 = 3, mid[3] = 8 < 30
>     > mid = (6 + 4) / 2 = 5, arr[5] = 18 < 30
>     > mid = (6 + 5) / 2 = 5, arr[5] = 18 < 30
>     > mid = (6 + 6) / 2 = 6, arr[6] = 22 < 30
>     > mid = (6 + 7) stop
>     > indexes examined: 7 3 5 5 6
>     > value returned: -7 - 1 = -8
>     > ```

> 22. Consider the following sorted array of integers.
>     When a binary search is performed on this array for each of the following integer values,  
>      what indexes are examined in order?
>     What result value is returned?
>     > ```
>     >                0   1   2   3   4   5  6  7  8   9  10  11  12  13
>     > int[] arr = {–30, –9, –6, –4, –2, –1, 0, 2, 4, 10, 12, 17, 22, 30};
>     >
>     > a. -5 > mid = 13 / 2 = 6, arr[6] = 0 > -5
>     > mid = 5 / 2 = 2, arr[2] = -6 < -5
>     > mid = (5 + 3) / 2 = 4, arr[4] = -2 > -5
>     > mid = (3 + 3) / 2 = 3, arr[3] = -4 > -5
>     > mid = (2 + 3) stop
>     > indexes examined: 6 2 4 3
>     > value returned: -3 - 1 = -4
>     >
>     > b. 0
>     > mid = 13 / 2 = 6, arr[6] = 0
>     > indexes examined: 6
>     > value returned: 6
>     >
>     > c. 11
>     > mid = 13 / 2 = 6, arr[6] = 0 < 11
>     > mid = (13 + 7) / 2 = 10, arr[10] = 12 > 11
>     > mid = (9 + 7) / 2 = 8, arr[8] = 4 < 11
>     > mid = (9 + 9) / 2 = 9, arr[9] = 10 < 11
>     > mid = (9 + 10) stop
>     > indexes examined: 6 10 8 9
>     > value returned: -10 - 1 = -11
>     >
>     > d. -100
>     > mid = 13 / 2 = 6, arr[6] = 0 > -100
>     > mid = 5 / 2 = 2, arr[2] = -6 > -100
>     > mid = 1 / 2 = 0, arr[0] = -30 > -100
>     > mid = (-1 + 0) stop
>     > indexes examined: 6 2 0
>     > value returned: -1
>     > ```

> 23. What modifications would you have to make to the `selectionSort` method to cause it to
>     sort an array of `double` values rather than one of `int` values?
>     > ```java
>     >   public static void selectionSort(/* int */double[] arr) {
>     >     for (int i = 0; i < arr.length - 1; i++) {
>     >       int minIdx = i;
>     >       for (int j = i + 1; j < arr.length; j++) {
>     >         if (arr[j] < arr[minIdx]) {
>     >           minIdx = j;
>     >         }
>     >       }
>     >       swap(arr, i, minIdx);
>     >     }
>     >   }
>     >
>     >   public static void swap(/* int */double[] arr, int i, int j) {
>     >     /* int */double temp = arr[i];
>     >     arr[i] = arr[j];
>     >     arr[j] = temp;
>     >   }
>     > ```

> 24. Consider the following array: `int[] numbers = {29, 17, 3, 94, 46, 8, –4, 12};`
>     After a **single pass** of the `selectionSort` algorithm (a single swap), what would be the state of the array?
>     a. {–4, 29, 17, 3, 94, 46, 8, 12}
>     b. {29, 17, 3, 94, 46, 8, 12}
>     c. {–4, 29, 17, 3, 94, 46, 8, –4, 12}
>     <mark>d. {–4, 17, 3, 94, 46, 8, 29, 12}</mark>
>     e. {3, 17, 29, 94, –4, 8, 46, 12}

> 25. Trace the execution of the `selectionSort` algorithm as shown in this section when run on the  
>      following input arrays.  
>      Show each element that will be selected by the algorithm and where it will be moved, until the array is
>     fully sorted.
>     > ```
>     > a. [29, 17, 3, 94, 46, 8, -4, 12]
>     > [-4, 17, 3, 94, 46, 8, 29, 12]
>     > [-4, 3, 17, 94, 46, 8, 29, 12]
>     > [-4, 3, 8, 94, 46, 17, 29, 12]
>     > [-4, 3, 8, 12, 46, 17, 29, 94]
>     > [-4, 3, 8, 12, 17, 46, 29, 94]
>     > [-4, 3, 8, 12, 17, 29, 46, 94]
>     >
>     > b. [33, 14, 3, 95, 47, 9, -42, 13]
>     > [-42, 14, 3, 95, 47, 9, 33, 13]
>     > [-42, 3, 14, 95, 47, 9, 33, 13]
>     > [-42, 3, 9, 95, 47, 14, 33, 13]
>     > [-42, 3, 9, 13, 47, 14, 33, 95]
>     > [-42, 3, 9, 13, 14, 47, 33, 95]
>     > [-42, 3, 9, 13, 14, 33, 47, 95]
>     >
>     > c. [7, 1, 6, 12, -3, 8, 4, 21, 2, 30, -1, 9]
>     > [-3, 1, 6, 12, 7, 8, 4, 21, 2, 30, -1, 9]
>     > [-3, -1, 6, 12, 7, 8, 4, 21, 2, 30, 1, 9]
>     > [-3, -1, 1, 12, 7, 8, 4, 21, 2, 30, 6, 9]
>     > [-3, -1, 1, 2, 7, 8, 4, 21, 12, 30, 6, 9]
>     > [-3, -1, 1, 2, 4, 8, 7, 21, 12, 30, 6, 9]
>     > [-3, -1, 1, 2, 4, 6, 7, 21, 12, 30, 8, 9]
>     > [-3, -1, 1, 2, 4, 6, 7, 21, 12, 30, 8, 9]
>     > [-3, -1, 1, 2, 4, 6, 7, 8, 12, 30, 21, 9]
>     > [-3, -1, 1, 2, 4, 6, 7, 8, 9, 30, 21, 12]
>     > [-3, -1, 1, 2, 4, 6, 7, 8, 9, 12, 21, 30]
>     >
>     > d. [6, 7, 4, 8, 11, 1, 10, 3, 5, 9]
>     > [1, 7, 4, 8, 11, 6, 10, 3, 5, 9]
>     > [1, 3, 4, 8, 11, 6, 10, 7, 5, 9]
>     > [1, 3, 4, 8, 11, 6, 10, 7, 5, 9]
>     > [1, 3, 4, 5, 11, 6, 10, 7, 8, 9]
>     > [1, 3, 4, 5, 6, 11, 10, 7, 8, 9]
>     > [1, 3, 4, 5, 6, 7, 10, 11, 8, 9]
>     > [1, 3, 4, 5, 6, 7, 8, 11, 10, 9]
>     > [1, 3, 4, 5, 6, 7, 8, 9, 10, 11]
>     > ```

---

<h3 align="center" id="4"><u>Section 13.4: Case Study: Implementing Merge Sort</u><a href="#home"> 👆</a></h3>

> 26. How many calls on the `mergeSort` method are generated by a call to sort a list of length 32?
>     > `mergeSort` calls itself for each left and right sub-arrays thus 32 elements will be
>     > divided 2 times into 16 elements sub-arrays etc.. 32 \* 2 - 1 = 63
>     > `merge` operation will be called 63 / 2 = 31 times

> 27. Consider the following array of int elements:
>     `int[] numbers = {7, 2, 8, 4, 1, 11, 9, 5, 3, 10};`
>     a. Show the state of the elements after five passes of the outermost loop of `selectionSort`  
>      have occurred.
>     b. Show a trace that is two levels deep of the `mergeSort` algorithm.
>     Show the splitting of the overall array, plus one level of the recursive calls.
>     > ```
>     > index            0  1  2  3  4   5  6  7  8   9
>     > int[] numbers = {7, 2, 8, 4, 1, 11, 9, 5, 3, 10};
>     > selectionSort:
>     > index                 0  1  2  3  4   5  6  7  8   9
>     > i = 0, minIdx = 4 => {1, 2, 8, 4, 7, 11, 9, 5, 3, 10};
>     > i = 1, minIdx = 1 => {1, 2, 8, 4, 7, 11, 9, 5, 3, 10};
>     > i = 2, minIdx = 8 => {1, 2, 3, 4, 7, 11, 9, 5, 8, 10};
>     > i = 3, minIdx = 3 => {1, 2, 3, 4, 7, 11, 9, 5, 8, 10};
>     > i = 4, minIdx = 7 => {1, 2, 3, 4, 5, 11, 9, 7, 8, 10};
>     >
>     > mergeSort:
>     >  0  1  2  3  4   5  6  7  8   9
>     > {7, 2, 8, 4, 1, 11, 9, 5, 3, 10};
>     > {7, 2, 8, 4, 1}       - {11, 9, 5, 3, 10}
>     > {7, 2}, {8, 4, 1}     - {11, 9}, {5, 3, 10}
>     > {7}, {2}, {8}, {4, 1} - {11}, {9}, {5}, {3, 10}
>     >              {4}, {1} -                 {3}, {10}
>     > merge
>     > {1, 4}                - {3, 10}
>     > {2, 7}, {8}, {1, 4}
>     > {2, 7, 8}, {1, 4}
>     > {1, 2, 4, 7, 8}       - {9, 11}, {5}, {3, 10}
>     >                       - {5, 9, 11}, {3, 10}
>     >                       - {3, 5, 9, 10, 11}
>     > {1, 2, 3, 4, 5, 7, 8, 9, 10, 11}
>     > ```

> 29. Which one of the following statements about sorting and big-Oh is true?
>     a. Selection sort can sort an array of integers in `O(N)` time.
>     <mark>b. Merge sort achieves an O(N log N) runtime by dividing the array in half at each step and then recursively sorting and merging the halves back together.</mark>
>     c. Merge sort runs faster than selection sort because it is recursive, and recursion is  
>      faster than loops.
>     d. Selection sort runs in `O(N)` time if the array is already sorted to begin with,  
>      or `O(N^2)` if it is not.
>     e. Sorting algorithms that rely on comparing elements can only be used with type `int`,  
>     because values from other types of data cannot be compared to each other.

> 30. **Trace** the complete execution of the `mergeSort` algorithm when called on each array below.  
>      Show the sub-arrays that are created by the algorithm and show the merging of sub-arrays
>     into larger sorted arrays.
>     > ```
>     >      0   1  2   3   4  5   6   7
>     > a. {29, 17, 3, 94, 46, 8, –4, 12}
>     > split 1: {29, 17, 3, 94} {46, 8, –4, 12}
>     > split 2: {29, 17}, {3, 94}, {46, 8}, {–4, 12}
>     > split 3: {29}, {17}, {3}, {94} {46}, {8}, {–4}, {12}
>     > merge 1: {17, 29}, {3, 94}, {8, 46}, {-4, 12}
>     > merge 2: {3, 17, 29, 94}, {-4, 8, 12, 46}
>     > merge 3: {-4, 3, 8, 12, 17, 29, 46, 94}
>     >
>     > b. {6, 5, 3, 7, 1, 8, 4, 2}
>     > split 1: {6, 5, 3, 7}, {1, 8, 4, 2}
>     > split 2: {6, 5}, {3, 7}, {1, 8}, {4, 2}
>     > split 3: {6}, {5}, {3}, {7}, {1}, {8}, {4}, {2}
>     > merge 1: {5, 6}, {3, 7}, {1, 8}, {2, 4}
>     > merge 2: {3, 5, 6, 7}, {1, 2, 4, 8}
>     > merge 3: {1, 2, 3, 4, 5, 6, 7, 8}
>     >
>     > c. {33, 14, 3, 95, 47, 9, -42, 13}
>     > split 1: {33, 14, 3, 95}, {47, 9, -42, 13}
>     > split 2: {33, 14}, {3, 95}, {47, 9}, {-42, 13}
>     > split 3: {33}, {14}, {3}, {95}, {47}, {9}, {-42}, {13}
>     > merge 1: {14, 33}, {3, 95}, {9, 47}, {-42, 13}
>     > merge 2: {14, 33}, {3, 95}, {9, 47}, {-42, 13}
>     > merge 3: {3, 14, 33, 95}, {-42, 9, 13, 47}
>     > merge 4: {-42, 3, 9, 13, 14, 33, 47, 95}
>     > ```
