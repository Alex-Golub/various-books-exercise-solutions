> **binarySearchMC1**
> Given the following sorted array of integers:
>
> > ```
> >              0   1  2   3   4   5   6   7   8   9  10  11  12  13
> > int[] a = {-23, -5, 9, 14, 15, 18, 23, 24, 25, 27, 34, 62, 85, 87};
> > What indexes are examined in a search for each value, and what value is returned?
> >
> > sequential search for 27
> > a. examines 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13; returns 9
> > b. examines 0, 1, 2, 3, 4, 5, 6, 7, 8, 9; returns 27
> > c. examines 0, 1, 2, 3, 4, 5, 6, 7, 8, 9; returns 9
> > ✅ d. examines 13, 12, 11, 10, 9; returns 9
> > e. examines 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13; returns 27
> >
> > binary search for 27
> > a. examines 7, 10, 9; returns 9
> > b. examines 6, 8, 10; returns 9
> > ✅ c. examines 6, 10, 8, 9; returns 9
> > d. examines 6, 3, 1; returns -1
> > e. examines 6, 9; returns 9
> > ```

> **binarySearch1**
> Suppose we are performing a binary search on a sorted array initialized as follows:
>
> > ```
> > //    index       0   1   2   3   4   5   6   7   8   9  10  11  12  13  14
> > int[] numbers = {-5, -1,  0,  3,  9, 14, 19, 24, 33, 41, 56, 62, 70, 88, 99};
> > int index = binarySearch(numbers, 18);
> >
> > Write the indexes of the elements that would be examined by the binary search (the mid values in our
> > algorithm's code) and write the value that would be returned from the search.
> >
> > indexes examined:
> > mid = 14 / 2 =      7, numbers[7] = 24 > 18
> > mid = 6 / 2 =       3, numbers[3] = 3 < 18
> > mid = (6 + 4) / 2 = 5, numbers[5] =  14 < 18
> > mid = (6 + 6) / 2 = 6, numbers[6] = 19 > 18
> > mid = (5 + 6) / 2 =    stop (18 was not found)
> >
> > value returned:
> > -1
> > ```

> **binarySearch3**
> Reading an element's value in the array costs 7 units of time;  
> calling any method costs 10 units of time;  
> and all other operations are essentially 0 cost.
>
> > ```
> > //    index        0   1   2   3   4   5   6   7   8   9  10  11  12  13
> > int[] numbers = {-23, -5,  9, 14, 15, 18, 23, 24, 25, 29, 34, 62, 85, 87};
> > int index = binarySearch(numbers, 25);
> >
> > indexes examined:
> > mid = 13 / 2 =       6,  numbers[6] = 23 < 25
> > mid = (13 + 7) / 2 = 10, numbers[10] = 34 > 25
> > mid = (9 + 7) / 2 =  8,  numbers[8] = 25 == 25
> >
> > value returned: 8
> >
> > Sequential search cost: 10 + 9 * 7 = 10 + 63 = 73
> >
> > binary search cost: 10 + 7 + 10 + 7 + 10 + 7 = 51
> > ```
