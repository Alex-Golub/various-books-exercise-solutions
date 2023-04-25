package chapter14_stacks_and_queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp5/chapter14/e10-isConsecutive
 * <p>
 * test #1:bottom [3, 4, 5, 6, 7, 8, 9, 10] top
 * console output:
 * true
 * [3, 4, 5, 6, 7, 8, 9, 10]
 * result: pass
 * <p>
 * test #2:bottom [3, 4, 5, 6, 7, 8, 9, 10, 12] top
 * console output:
 * false
 * [3, 4, 5, 6, 7, 8, 9, 10, 12]
 * result: pass
 * <p>
 * test #3:bottom [3, 2, 1] top
 * console output:
 * false
 * [3, 2, 1]
 * result: pass
 */
class isConsecutive {
    public static boolean isConsecutive(Stack<Integer> stack) {
        if (stack.size() < 2)
            return true;

        // s = 6 5 4 3
        //
        // next = 3
        // n = 3
        // q = 6 5 4 3
        Queue<Integer> q = new LinkedList<>();
        int next = stack.pop();
        q.offer(next);
        boolean consecutive = true;

        while (!stack.isEmpty()) {
            int n = stack.pop();
            if (n + 1 != next)
                consecutive = false; // TODO: optimise, exit early

            q.offer(n);
            next = n;
        }

        while (!q.isEmpty())
            stack.push(q.poll());
        while (!stack.isEmpty())
            q.offer(stack.pop());
        while (!q.isEmpty())
            stack.push(q.poll());

        return consecutive;
    }

}
