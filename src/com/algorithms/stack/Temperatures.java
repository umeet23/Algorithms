package com.algorithms.stack;

import java.util.Stack;

public class Temperatures {
  public int[] dailyTemperatures(int[] temp) {
    Stack<Integer> st = new Stack<>();
    int n = temp.length;
    int result[] = new int[n];
    // push the base index
    st.push(0);
    for (int i = 1; i < n; i++) {

      // case 1:  if top of stack is greater than curr temp push curr index in stack
      if (temp[st.peek()] > temp[i]) {
        st.push(i);
        continue;
      }

      // case 2: remove all the element from index for which we have found warmer day
      while (!st.isEmpty() && temp[st.peek()] < temp[i]) {
        result[st.peek()] = i - st.pop();
      }

      // push the curr index to stack
      st.push(i);
    }

    // if stack is not empty, then it contains element for which we dont have any warmer day
    while (!st.isEmpty()) {
      result[st.pop()] = 0;
    }
    return result;
  }
}
