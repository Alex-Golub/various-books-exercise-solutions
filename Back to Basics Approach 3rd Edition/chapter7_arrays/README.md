<h1 align="center" id="home"><u>Self-Check Answers</u></h1>

[Section 7.1: Array Basics](#1)  
[Section 7.2: Array-Traversal Algorithms](#2)  
[Section 7.3: Reference Semantics](#3)  
[Section 7.4: Advanced Array Techniques](#4)
[Section 7.5: Multidimensional Arrays](#5)

<h3 align="center" id="1"><u>Section 7.1: Array Basics</u><a href="#home"> 👆</a></h3>

> 1. Which of the following is the correct syntax to declare an array of ten integers?
>    > ```java
>    > int a[10] = new int[10]; // ✖ lhs [] should not specify array size only rhs
>    > int[10] a = new int[10]; // ✖ lhs [] should not specify array size only rhs
>    > []int a = [10]int;       // ✖ wrong placement of [] on lhs and rhs, also new is absent in rhs
>    > int a[10];               // ✖ rhs [] should not state array size
>    > int[] a = new int[10];   // ✔
>    > ```

> 2. What expression should be used to access the **_first element_** of an array of integers  
>     called `numbers`?
>    What expression should be used to access the **_last element_** of `numbers`, assuming it  
>     contains 10 elements?
>    What expression can be used to access its **_last element_**, regardless of its length?
>    > ```java
>    > int[] numbers = new int[new Random().nextInt(91) + 10];  // random size array [10, 100]
>    > int firstElement = numbers[0];                           // first element
>    > int lastElement = numbers[9];                            // 10th element
>    > int lastElementRegardless = numbers[numbers.length - 1]; // last element regardless of size
>    > ```

> 3. Write code that creates an array of integers named `data` of `size 5` with the following contents:
>    > ```java
>    > int[] data = { 27, 51, 33, -1, 101 };
>    > ```

> 4. Write code that stores all odd numbers between -6 and 38 into an array using a loop.
>    > ```java
>    > int min, max;                   // min = -6, max = 38
>    > min += min % 2 == 0 ? 1 : 0;    // make min and max odd numbers
>    > max -= max % 2 == 0 ? 1 : 0;
>    > int size = (max - min) / 2 + 1; // an = a0 + 2(n - 1)
>    > int[] odds  = new int[size];
>    > for (int i = 0; i < size; i++) {
>    >   odds[i] = 2 * i + min;
>    > }
>    > ```

> 5. What elements does the array `numbers` contain after the following code is executed?
>    > ```java
>    > int[] numbers = new int[8]; // [0, 0, 0, 0, 0, 0, 0, 0]
>    > numbers[1] = 4;             // [0, 4, 0, 0, 0, 0, 0, 0]
>    > numbers[4] = 99;            // [0, 4, 0, 0, 99, 0, 0, 0]
>    > numbers[7] = 2;             // [0, 4, 0, 0, 99, 0, 0, 2]
>    > int x = numbers[1];         // x = 4
>    > numbers[x] = 44;            // [0, 4, 0, 0, 44, 0, 0, 2]
>    > numbers[numbers[7]] = 11;   // [0, 4, 11, 0, 44, 0, 0, 2]
>    > ```

> 6. What elements does the array data contain after the following code is executed?
>    > ```java
>    > int[] data = new int[8];      // [0, 0, 0, 0, 0, 0, 0, 0]
>    > data[0] = 3;                  // [3, 0, 0, 0, 0, 0, 0, 0]
>    > data[7] = -18;                // [3, 0, 0, 0, 0, 0, 0, -18]
>    > data[4] = 5;                  // [3, 0, 0, 0, 5, 0, 0, -18]
>    > data[1] = data[0];            // [3, 3, 0, 0, 5, 0, 0, -18]
>    > int x = data[4];              // x = 5
>    > data[4] = 6;                  // [3, 3, 0, 0, 6, 0, 0, -18]
>    > data[x] = data[0] * data[1];  // [3, 3, 0, 0, 6, 9, 0, -18]
>    > ```

> 7. What is wrong with the following code?
>    > ```java
>    > int[] first = new int[2];
>    > first[0] = 3;
>    > first[1] = 7;
>    > int[] second = new int[2];
>    > second[0] = 3;
>    > second[1] = 7;
>    >
>    > // print the array elements (use Arrays.toString() to print array contents)
>    > System.out.println(first);  // arrays are objects thus first points to memory address
>    >                             // this line will print the memory address where array is
>    >                             // located e.g. [I@35f2
>    > System.out.println(second);
>    >
>    > // see if the elements are the same, (use Arrays.equals(first, second))
>    > if (first == second) { // false. using == on objects checks if they have the same
>    >                        // memory address rather then checking for content equality
>    > System.out.println("They contain the same elements.");
>    > } else {
>    > System.out.println("The elements are different.");
>    > }
>    > ```

> 8. Which of the following is the correct syntax to declare an array of the given  
>     six integer values?
>    > ```java
>    > int[] a = {17, -3, 42, 5, 9, 28};            // ✔
>    > int a {17, -3, 42, 5, 9, 28};                // ✖, assignment operator(=) is missing between a and {..}
>    > int[] a = new int[6] {17, -3, 42, 5, 9, 28}; // ✖, number 6 will cause CE
>    > int[6] a = {17, -3, 42, 5, 9, 28};           // ✖, rhs should not state size of the array
>    > int[] a = int [17, -3, 42, 5, 9, 28] {6};    // ✖, illegal rhs, int and [ ] and {6}
>    > ```

> 9. Write a piece of code that declares an array called `data` with the elements  
>     7, -1, 13, 24, and 6. Use only one statement to initialize the array.
>    > ```java
>    > int[] data = {7, -1, 13, 24, 6};
>    > ```

> 10. Write a piece of code that examines an array of integers and reports the maximum  
>      value in the array.
>     Assume that the array contains at least one element.
>     > ```java
>     > public static int max(int[] arr) {
>     >   int max = arr[0]; // arr.length >= 1
>     >   for (int i : arr)
>     >     max = Math.max(i, max);
>     >   return max;
>     > }
>     > ```

> 11. Write a method called `average` that computes the average (arithmetic mean) of all  
>      elements in an array of integers and returns the answer as a double.
>     > ```java
>     > public static double average(int[] arr) {
>     >   int sum = arr[0];
>     >   int n = arr.length;
>     >   for (int i = 1; i < n; i++)
>     >     sum += arr[i];
>     >   return 1.0 * sum / n;
>     >   // return Arrays.stream(arr).average().getAsDouble();
>     > }
>     > ```

---

<h3 align="center" id="2"><u>Section 7.2: Array-Traversal Algorithms</u><a href="#home"> 👆</a></h3>

> 12. What is an array traversal?
>     Give an example of a problem that can be solved by traversing an array.
>     > A sequential processing of each of an array's elements.
>     > Comparing two arrays for equality.
>     > Printing an array's elements.
>     > Searching an array for a given value.

> 13. Write code that uses a `for` loop to print each element of an array named `data`  
>      that contains five integers:
>     > ```java
>     > int[] data = {14, 5, 27, -3, 2598};
>     > for (int i = 0; i < data.length; i++)
>     >   System.out.printf("element [%d] is %d\n", i, data[i]);
>     > ```

> 14. What elements does the array list contain after the following code is executed?
>     > ```java
>     > int[] list = {2, 18, 6, -4, 5, 1};
>     > for (int i = 0; i < list.length; i++) {
>     >   list[i] = list[i] + (list[i] / list[0]);
>     > } // list = {3, 24, 8, -5, 6, 1}
>     > ```

> 15. Write a piece of code that prints an array of integers in reverse order,  
>      in the same format as the print method from Section 7.2.
>     > ```java
>     > public static void printBackwards(int[] arr) {
>     >   for (int i = arr.length - 1; i >= 0; i--)
>     >     System.out.printf("element [%d] is %d\n", i, arr[i]);
>     > }
>     > ```

> 16. Describe the modifications that would be necessary to change the `count` and `equals`  
>      methods developed in Section 7.2 to process arrays of `Strings` instead of arrays of
>     integers.
>     > ```java
>     > public static int countStrings(String[] arr, String target) {
>     >   int count = 0;
>     >   for (String s : arr)
>     >     if (s.equals(target))
>     >       count++;
>     >     return count;
>     > }
>     >
>     > public static boolean equals(String[] arr1, String[] arr2) {
>     >   if (arr1.length != arr2.length)
>     >     return false;
>     >
>     >   for (int i = 0; i < arr1.length; i++)
>     >     if (!arr1[i].equals(arr2[i]))
>     >       return false;
>     >   return true;
>     > }
>     > ```

> 17. Write a method called `allLess` that accepts two arrays of integers and returns `true`  
>      if each element in the first array is less than the element at the same index in the  
>      second array.
>     > ```java
>     > public static boolean allLess(int[] arr1, int[] arr2) {
>     >   if (arr1.length != arr2.length)
>     >     return false;
>     >
>     >   for (int i = 0; i < arr1.length; i++)
>     >     if (arr1[i] > arr2[i])
>     >       return false;
>     >
>     >   return true;
>     > }
>     > ```

---

<h3 align="center" id="3"><u>Section 7.3: Reference Semantics</u><a href="#home"> 👆</a></h3>

> 18. Why does a method to swap two array elements work correctly when a method to swap two  
>      integer values does not?
>     > Unlike integers, arrays are objects and use reference semantics.

> 19. What is the output of the following program?
>     > ```java
>     > /*
>     > line 1 => 2 [0, 0, 1, 0]
>     > line 2 => 1 [0, 0, 1, 0]
>     > line 3 => 3 [0, 0, 1, 1]
>     > line 4 => 2 [0, 0, 1, 1]
>     > */
>     > ```

> 20. What is the output of the following program?
>     > ```java
>     > /*
>     > line 1 => 2 [0, 1]
>     > line 2 => 1 [0, 1]
>     > line 3 => 1 [1, 2]
>     > line 4 => 0 [1, 2]
>     > */
>     > ```

> 21. Write a method called `swapPairs` that accepts an array of integers and swaps the  
>      elements at adjacent indexes.
>     If the array has an odd length, the final element should be left unmodified.
>     > ```java
>     > public static void swapPairs(String[] arr) {
>     >   String temp;
>     >   for (int i = 0; i < arr.length - 1; i += 2) {
>     >     temp = arr[i];
>     >     arr[i] = arr[i + 1];
>     >     arr[i + 1] = temp;
>     >   }
>     > }
>     > ```

---

<h3 align="center" id="4"><u>Section 7.4: Advanced Array Techniques</u><a href="#home"> 👆</a></h3>

> 22. What are the values of the elements in the array `numbers` after the following code is executed?
>     > `numbers => [20, 30, 40, 50, 60, 70, 80, 90, 100, 100]`

> 23. What are the values of the elements in the array `numbers` after the following code is executed?
>     > `numbers => [10, 10, 10, 10, 10, 10, 10, 10, 10, 10]`

> 24. Consider the following method, `mystery`:
>     What are the values of the elements in array `a1` after the following code executes?
>     > `a1 => [26, 19 , 14, 11, 10]`

> 25. Consider the following method, `mystery2`:
>     > `a1 => [1, 3, -3, 13, -4, -24, -6, -14]`

> 26. Consider the following method, `mystery3`:
>     What are the values of the elements in the array `numbers` after the following code executes?
>     > `numbers => [7, 3, 1, 0, 8, 18, 5, -1, 5]`

> 27. Consider the following method:
>     What value does the method return when passed each of the following arrays?
>     > `arrayMystery4` returns the maximal difference between arr[i] and arr[0]
>     > a. `{5} => 0`
>     > b. `{3, 12} => 9`
>     > c. `{4, 2, 10, 8} => 6`
>     > d. `{1, 9, 3, 5, 7} => 8`
>     > e. `{8, 2, 10, 4, 10, 9} => 2`

> 28. Consider the following method:
>     What are the final contents of each of the following arrays if each is passed to the above method?
>     > a. `{8} => [8]`
>     > b. `{14, 7} => [14, 8]`
>     > c. `{7, 1, 3, 2, 0, 4} => [7, 2, 3, 3, 1, 4]`
>     > d. `{10, 8, 9, 5, 5} => [10, 9, 9, 6, 6]`
>     > e. `{12, 11, 10, 10, 8, 7} => [12, 12, 11, 11, 9, 8]`

> 29. Write a piece of code that computes the average `String` length of the elements of an array of `Strings`.
>     > ```java
>     > public static double averageLength(String[] strings) {
>     >   int characters = 0;
>     >   for (String s : strings)
>     >     characters += s.length();
>     >   return 1.0 * characters / strings.length
>     > }
>     > ```

> 30. Write code that accepts an array of `Strings` as its parameter and indicates whether that array is a palindrome
>     > ```java
>     > public static boolean isPalindrome(String[] arr) {
>     >   int n = arr.length;
>     >   for (int i = 0; i < n / 2; i++)
>     >     if (!arr[i].equals(arr[n - i - 1]))
>     >       return false;
>     >   return true;
>     > }
>     > ```

---

<h3 align="center" id="5"><u>Section 7.5: Multidimensional Arrays</u><a href="#home"> 👆</a></h3>

> 31. What elements does the array `numbers` contain after the following code is executed?
>     > Method assigns to `numbers[i][j]` the sum of `i + j`  
>     > `numbers => [ [0, 1, 2, 3], [1, 2, 3, 4], [2, 3, 4, 5] ]`

> 32. Assume that a two-dimensional rectangular array of integers called `data` has been  
>      declared with four rows and seven columns.
>     Write a loop to initialize the third row of data to store the numbers 1 through 7.
>     > ```java
>     > int[][] data = new int[4][7];
>     > for (int i = 0; i < data[2].length; i++)
>     >   data[2][i] = i + 1
>     > ```

> 33. Write a piece of code that constructs a two-dimensional array of integers with  
>      5 rows and 10 columns.
>     Fill the array with a multiplication table, so that array element `[i][j]` contains  
>      the value i \* j.
>     > ```java
>     > int[][] table = new int[5][10];
>     > for (int i = 0; i < table.length; i++) {
>     >   for (int j = 0; j < table[i].length; j++) {
>     >     table[i][j] = i * j;
>     >   }
>     > }
>     > ```

> 34. Assume that a two-dimensional rectangular array of integers called `matrix` has been  
>      declared with six rows and eight columns.  
>      Write a loop to copy the contents of the second column into the fifth column.
>     > ```java
>     > int[][] matrix = new int[6][8];
>     > for (int i = 0; i < matrix.length; i++) {
>     >   matrix[i][4] = matrix[i][1];
>     > }
>     > ```

> 35. Consider the following method:
>     If a two-dimensional array `numbers` is initialized to store the following integers,  
>      what are its contents after the call shown?
>     > ```java
>     > int[][] numbers = { {3, 4, 5, 6}, {4, 5, 6, 7}, {5, 6, 7, 8} };
>     > mystery2d(numbers);
>     > /*
>     > method shifting each value to left if value at a[i][j + 1] > a[i][j]
>     > numbers => [ [4, 5, 6, 6], [5, 6, 7, 7], [6, 7, 8, 8] ]
>     > */
>     > ```

> 36. Write a piece of code that constructs a jagged two-dimensional array of integers  
>      with five rows and an increasing number of columns in each row
>     The array elements should have increasing values in top-to-bottom,  
>      left-to-right order (also called row-major order).  
>      ` 1`  
>      `2, 3`  
>      `4, 5, 6`  
>      `7, 8, 9, 10`  
>      `11, 12, 13, 14, 15`
>     > ```java
>     > int[][] jagged  = new int[5][];
>     > int val = 1;
>     > for (int row = 0; row < jagged.length; row++) {
>     >   jagged [row] = new int[row + 1]; // each new row length is one more the prev row
>     >   for (int col = 0; col < row + 1; col++) {
>     >     jagged [row][col] = val++;
>     >   }
>     > }
>     > ```

> 37. When examining a 2D array of pixels, how could you figure out the width and height  
>      of the image even if you don’t have access to the `DrawingPanel` object?
>     > width is number of rows in `pixels` thus `pixels.length` is the width of the image.
>     > height is number of columns in `pixels` assuming pixels is a square thus is height
>     > is `pixels[0].length`

> 38. Finish the following code for a method that converts an image into its red channel;  
>      that is, removing any green or blue from each pixel and keeping only the red component.
>     > ```java
>     > public static void toRedChannel(DrawingPanel panel) {
>     >   Color[][] pixels = panel.getPixels();
>     >   for (int row = 0; row < pixels.length; row++) {
>     >     for (int col = 0; col < pixels[0].length; col++) {
>     >       Color pixel = pixels[row][col];
>     >       pixels[row][col] = new Color(pixel.getRed(), 0, 0);
>     >     }
>     >   }
>     >   panel.setPixels(pixels);
>     > }
>     > ```

> 39. What is the result of the following code? What will the image look like?
>     > Gradual increment on the diagonal from black to white
>     >
>     > ```java
>     > public static void pixelMystery(DrawingPanel panel) {
>     >   Color[][] pixels = panel.getPixels();
>     >   for (int row = 0; row < pixels.length; row++) {
>     >     for (int col = 0; col < pixels[0].length; col++) {
>     >       int n = Math.min(row + col, 255);
>     >       pixels[row][col] = new Color(n, n, n);
>     >     }
>     >   }
>     >   panel.setPixels(pixels);
>     > }
>     > ```
