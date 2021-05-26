> <mark>Insertion sort implementation</mark>
>
> > ```java
> > public static void insertionSort(int[] arr) {
> >   for (int i = 1; i < arr.length; i++) {
> >     int ele = arr[i]; // search for correct placement for this element
> >     int j = i - 1;
> >     while (j >= 0; arr[j] > ele) {
> >       arr[j + 1] = arr[j]; // elements to the left are greater, shift one place to the right
> >       j--;
> >     }
> >     arr[j + 1] = ele; // correct place was found, insert here
> >   }
> > }
> > ```

> **insertionSort1**
>
> > ```java
> > // index    0  1  2  3   4   5   6  7
> > // values {15, 2, 8, 1, 17, 10, 12, 5}
> > ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(15, 2, 8, 1, 17, 10, 12, 5));
> > insertionSort(arr);
> >
> > /*
> >   0  1  2   3   4   5   6  7
> > {15, 2, 8,  1, 17, 10, 12, 5}
> > pass 1: 2, 15, 8, 1, 17, 10, 12, 5
> > pass 2: 2, 8, 15, 1, 17, 10, 12, 5
> > pass 3: 1, 2, 8, 15, 17, 10, 12, 5
> > pass 4: 1, 2, 8, 15, 17, 10, 12, 5
> > pass 5: 1, 2, 8, 10, 15, 17, 12, 5
> > pass 6: 1, 2, 8, 10, 12, 15, 17, 5
> > pass 7: 1, 2, 5, 8, 10, 12, 15, 17
> > */
> > ```

> **insertionSort2**
>
> > ```java
> > ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(15, 2, 8, 1, 17, 10, 12, 5));
> > insertionSort(arr);
> > /*
> >   0   1   2   3   4   5   6  7
> > {35, 33, 72, 13, 91, 42, 13, 2}
> > pass 1: 33, 35, 72, 13, 91, 42, 13, 2
> > pass 2: 33, 35, 72, 13, 91, 42, 13, 2
> > pass 3: 13, 33, 35, 72, 91, 42, 13, 2
> > pass 4: 13, 33, 35, 72, 91, 42, 13, 2
> > pass 5: 13, 33, 35, 42, 72, 91, 13, 2
> > pass 6: 13, 13, 33, 35, 42, 72, 91, 2
> > pass 7: 2, 13, 13, 33, 35, 42, 72, 91
> > */
> > ```

> <mark>Selection sort implementation</mark>
>
> > ```java
> >   private static void selectionSort(int[] arr) {
> >     for (int i = 0; i < arr.length - 1; i++) {
> >       int minIdx = i;
> >       for (int j = i + 1; j < arr.length; j++) {
> >         if (arr[minIdx] > arr[j]) {
> >           minIdx = j;
> >         }
> >       }
> >       swap(arr, i, minIdx);
> >     }
> >   }
> >
> >   private static void swap(int[] arr, int i, int j) {
> >     int temp = arr[i];
> >     arr[i] = arr[j];
> >     arr[j] = temp;
> >   }
> > ```

> **selectionSort1**
>
> > ```java
> > // index     0   1  2   3   4   5   6   7
> > // values  {29, 17, 3, 94, 46,  8, -4, 12}
> > ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(29, 17, 3, 94, 46,  8, -4, 12));
> > selectionSort(arr);
> > /*
> >                       0   1  2   3   4   5   6   7
> >                     {29, 17, 3, 94, 46,  8, -4, 12}
> > pass 0; minIdx = 6; {-4, 17, 3, 94, 46,  8, 29, 12}
> > pass 1; minIdx = 2; {-4, 3, 17, 94, 46,  8, 29, 12}
> > pass 2; minIdx = 5; {-4, 3, 8,  94, 46,  17, 29, 12}
> > pass 3; minIdx = 7; {-4, 3, 8,  12, 46,  17, 29, 94}
> > pass 4; minIdx = 5; {-4, 3, 8,  12, 17,  46, 29, 94}
> > pass 5; minIdx = 6; {-4, 3, 8,  12, 17,  29, 46, 94}
> > pass 6; minIdx = 6; {-4, 3, 8,  12, 17,  29, 46, 94}
> > */
> > ```

> **selectionSort2**
>
> > ```java
> > // index     0   1   2   3   4   5   6   7
> > // values  {23, 16, 11, 1, 28, 30, 35, 52}
> > ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(23, 16, 11, 1, 28, 30, 35, 52));
> > selectionSort(arr);
> > /*
> >                       0   1   2   3    4   5   6   7
> >                     {23, 16, 11,   1, 28, 30, 35, 52}
> > pass 0; midIdx = 3; { 1, 16, 11,  23, 28, 30, 35, 52}
> > pass 1; midIdx = 2; { 1, 11, 16,  23, 28, 30, 35, 52}
> > pass 2; minIdx = 2; { 1, 11, 16,  23, 28, 30, 35, 52}
> > */
> > ```

> **Merge sort implementation**
>
> > ```java
> >   public static void mergeSort(int[] a) {
> >     if (a.length > 1) { // sort array of at least 2 elements
> >       int[] left = Arrays.copyOfRange(a, 0, a.length / 2);
> >       int[] right = Arrays.copyOfRange(a, a.length / 2, a.length);
> >
> >       mergeSort(left);
> >       mergeSort(right);
> >
> >       merge(a, left, right);
> >     }
> >   }
> >
> >   private static void merge(int[] a, int[] left, int[] right) {
> >     int i = 0, j = 0;
> >     for (int k = 0; k < a.length; k++) {
> >       if (j >= right.length || (i < left.length && left[i] < right[j])) {
> >         a[k] = left[i++];
> >       } else {
> >         a[k] = right[j++];
> >       }
> >     }
> >   }
> > ```

> **mergeSort1**
>
> > ```java
> > // index    0   1  2   3   4   5   6   7
> > // values {29, 17, 3, 94, 46,  8, -4, 12}
> > ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(29, 17, 3, 94, 46, 8, -4, 12));
> > mergeSort(numbers);
> >
> > // 1st split: {29, 17, 3, 94}, {46,  8, -4, 12}
> > // 2nd split: {29, 17}, {3, 94}, {46,  8}, {-4, 12}
> > // 3rd split: {29}, {17}, {3}, {94}, {46}, {8}, {-4}, {12}
> > // 1st merge: {17, 29}, {3, 94}, {8, 46}, {-4, 12}
> > // 2nd merge: {3, 17, 29, 94}, {-4, 8, 12, 46}
> > // 3rd merge: {-4, 3, 8, 12, 17, 29, 46, 94}
> > ```
