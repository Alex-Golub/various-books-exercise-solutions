<h1 align="center" id="home"><u>CheckPoint Answers</u></h1>

[8.2 Two-Dimensional Array Basics](#2)  
[8.3 Processing Two-Dimensional Arrays](#3)  
[8.4 Passing Two-Dimensional Arrays to Methods](#4)  
[8.5 Case Study: Grading a Multiple-Choice Test](#5)  
[8.6 Case Study: Finding the Closest Pair](#6)  
[8.7 Case Study: Sudoku](#7)  
[8.8 Multidimensional Arrays](#8)

<h3 align="center" id="2"><u>8.2 Two-Dimensional Array Basics</u><a href="#home"> 👆</a></h3>

> 8.2.1 Declare an array reference variable for a two-dimensional array of `int` values,
> create a **4-by-5** `int` matrix, and assign it to the variable.
>
> > ```java
> > int[][] matrix = new int[4][5];
> > /*  [
> >      [0, 0, 0, 0, 0],
> >      [0, 0, 0, 0, 0],
> >      [0, 0, 0, 0, 0],
> >      [0, 0, 0, 0, 0]
> >     ]
> > */
> > ```

> 8.2.2 Which of the following statements are valid?
>
> > ```java
> > int[][] r = new int[2];          // ✖, lhd is 2d array reference while rhs is creating 1d array - compilation error
> > int[] x = new int[];             // ✖, 1d array upon creating must be with size value - compilation error
> > int[][] y = new int[3][];        // ✔, y contain 3 references to an 1d array that latter be creating with variable size
> > int[][] z = {{1, 2}};            // ✔, z is 2d array that has only one sub-array
> > int[][] m = {{1, 2}, {2, 3}};    // ✔, declaring, creating and initializing in one line
> > int[][] n = {{1, 2}, {2, 3}, };  // ✖, extra ',' should be removed - compilation error
> > ```

> 8.2.3 Write an expression to obtain the row size of a two-dimensional array `x`  
> and an expression to obtain the size of the first row.
>
> > ```java
> > x.length;    // number of rows in x
> > x[0].length; // x's first row length
> > ```

> 8.2.4 Can the rows in a two-dimensional array have different lengths?
>
> > **Yes**. Such an array called `Ragged-Array`.
> > Ragged array contains `n` rows and each row can have different number of elements
> > i.e. different number of columns.
> > E.g. `int[][] ragged = { {1,2,3}, {1,2}, {1} };`

> 8.2.5 What is the output of the following code?
>
> > ```java
> > int[][] array = new int[5][6]; // { {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0} }
> > int[] x = {1, 2};
> > array[0] = x; // { {1,2}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0} }
> > System.out.println("array[0][1] is " + array[0][1]); // 2
> > ```

---

<h3 align="center" id="3"><u>8.3 Processing Two-Dimensional Arrays</u><a href="#home"> 👆</a></h3>

> 8.3.1 Show the output of the following code:
>
> > ```java
> > int[][] array = { {1, 2}, {3, 4}, {5, 6} };
> > for (int i = array.length − 1; i >= 0; i--) {
> >   for (int j = array[i].length − 1; j >= 0; j--)
> >     System.out.print(array[i][j] + " ");
> >   System.out.println();
> > }
> > // 6 5
> > // 4 3
> > // 2 1
> > // Print 2d array in reverse order
> > ```

> 8.3.2 Show the output of the following code:
>
> > ```java
> > int[][] array = { {1, 2}, {3, 4}, {5, 6} };
> > int sum = 0;
> > for (int i = 0; i < array.length; i++)
> >   sum += array[i][0];
> > System.out.println(sum); // 9
> > // sum first element of each row
> > ```

---

<h3 align="center" id="4"><u>8.4 Passing Two-Dimensional Arrays to Methods</u><a href="#home"> 👆</a></h3>

> 8.4.1 Show the output of the following code:
>
> > ```java
> > public class Test {
> >   public static void main(String[] args) {
> >     int[][] array = { {1, 2, 3, 4}, {5, 6, 7, 8} };
> >     System.out.println(m1(array)[0]); // 2, i.e. number of rows
> >     System.out.println(m1(array)[1]); // 4, number of columns
> >     }
> >
> >   public static int[] m1(int[][] m) {
> >     int[] result = new int[2];
> >     result[0] = m.length;    // rows
> >     result[1] = m[0].length; // column in row 0
> >     return result;
> >   }
> > }
> > ```

---

<h3 align="center" id="5"><u>8.5 Case Study: Grading a Multiple-Choice Test</u><a href="#home"> 👆</a></h3>

> 8.5.1 How do you modify the code so it also displays the highest count and the student
> with the highest count?
>
> > ```java
> > public class GradeExam {
> >   public static void main(String[] args) {
> >     // ... answers and key arrays
> >
> >     int highestCount            = -1;
> >     int studentWithHighestCount = -1;
> >     for (int i = 0; i < answers.length; i++) {
> >
> >       // Grade one student
> >       int correctCount = 0;
> >       for (int j = 0; j < answers[i].length; j++) {
> >         if (answers[i][j] == keys[j])
> >           correctCount++;
> >       }
> >
> >       System.out.println("Student " + (i + 1) + "'s correct count is " +
> >                          correctCount);
> >
> >       if (highestCount < correctCount) {
> >         highestCount = correctCount;
> >         studentWithHighestCount = i;
> >       }
> >     }
> >
> >     System.out.println("\nStudent " + (studentWithHighestCount + 1) +
> >                        " has the highest count of " + highestCount);
> >   }
> > }
> > ```

---

<h3 align="center" id="6"><u>8.6 Case Study: Finding the Closest Pair</u><a href="#home"> 👆</a></h3>

> 8.6.1 What happens if the input has **only one point**?
>
> > `java.lang.ArrayIndexOutOfBoundsException` when we reference `closestPoints[p2][0]`  
> > `p2` will be 1 but there is no point at index 1

---

<h3 align="center" id="7"><u>8.7 Case Study: Sudoku</u><a href="#home"> 👆</a></h3>

> 8.7.1 What happens if the code in line 51 in Listing 8.4 is changed to
> `if (row != i && col != j && grid[row][col] == grid[i][j])`
>
> > This will only check four cells because the cells in the same row as `i` would not  
> > be checked and the cells in the same column as `j` would not be checked.  
> > The correct code is `if (!(row == i && col == j) && grid[row][col] == grid[i][j])`

This checks every cell in the 3 by 3 box except the cell for grid[i][j] itself.

---

<h3 align="center" id="8"><u>8.8 Multidimensional Arrays</u><a href="#home"> 👆</a></h3>

> 8.8.1 Declare an array variable for a three-dimensional array, create a 4 x 6 x 5 `int`
> array, and assign its reference to the variable.
>
> > ```java
> > int[][][] multiDimArray = new int[4][6][5];
> > ```

> 8.8.2 Assume `char[][][] x = new char[12][5][2]`, how many elements are in the array?  
> What are `x.length`, `x[2].length`, and `x[0][0].length`?
>
> > Total number of elements = 12 x 5 x 2 = 120  
> > `x.length` = 12  
> > `x[2].length` = 5  
> > `x[0][0].length` = 2

> 8.8.3 Show the output of the following code:
>
> > ```java
> > int[][][] array = { { {1, 2}, {3, 4} }, { {5, 6},{7, 8} } };
> > System.out.println(array[0][0][0]); // 1
> > System.out.println(array[1][1][1]); // 8
> > ```
