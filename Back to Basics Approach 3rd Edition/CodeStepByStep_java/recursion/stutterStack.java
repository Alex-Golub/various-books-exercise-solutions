package CodeStepByStep.java.recursion;

import java.util.Stack;

/**
 * https://www.codestepbystep.com/problem/view/java/recursion/stutterStack
 *
 * @author Alex Golub
 * @since 22-May-21, 3:51 PM
 */
class stutterStack {
  public static void stutterStack(Stack<Integer> stack) {
    if (stack.isEmpty()) return;
    int top = stack.pop();
    stutterStack(stack);
    stack.push(top);
    stack.push(top);
  }
}

/*
f({13, 27}) -> top = 27; f({13})
 f({13}) -> top = 13; f({})
   f({}) ->
 f({13}) -> top = 13; {}; {13, 13}
f({13, 27}) -> top = 27; {13, 13}; {13, 13, 27, 27}
 */
