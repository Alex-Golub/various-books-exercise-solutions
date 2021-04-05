package cse_142.cs1_sections.section02_expressions_for_loops_constants;

/**
 * https://practiceit.cs.washington.edu/problem/view/3616?categoryid=116
 *
 * 'coefficient * count + constant'
 * Problem #   count value             Sequence                       Expression
 *             1, 2, 3, 4, 5, 6, ...   2, 4, 6, 8, 10, 12, ...        2 * count
 * 1           1, 2, 3, 4, 5, 6, ...   4, 19, 34, 49, 64, 79, ...     15 * count - 11
 * 2           1, 2, 3, 4, 5, 6, ...   30, 20, 10, 0, -10, -20, ...   -10 * count + 40
 * 3           1, 2, 3, 4, 5, 6, ...   -7, -3, 1, 5, 9, 13, ...       4 * count - 11
 * 4           1, 2, 3, 4, 5, 6, ...   97, 94, 91, 88, 85, 82, ...    -3 * count + 100
 *
 * @author Alex Golub
 * @since 01-Apr-21 4:24 PM
 */
class loopTable {
/*
  Problem #1: Applying linear equation
  (1, 4), (2, 19)
  m = (19 - 4) / (2 - 1) = 15
  y - 4 = 15(x - 1)
  y = 15x - 11

  Problem #2: Same approach as Problem #1
  (1, 30), (2, 20)
  m = (30 - 20) / (1 - 2) = -10
  y - 20 = -10(x - 2)
  y = -10x + 40

  Problem #3 and #4 same approach
*/
}
