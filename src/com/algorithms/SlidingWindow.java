package com.algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SlidingWindow {

  public List printNegativeOfWindow(int[] arr,int k) {
    int n = arr.length;
    List<Integer> result = new ArrayList();
    Queue<Integer> queue = new LinkedList<>();
    int i = 0;
    int j = 0;
    while(j < n) {
      if (arr[j] < 0) {
        queue.add(arr[j]);
      }
      if (j - i + 1 < k) {
        j++;
      } else if (j - i + 1 == k) {
        if (queue.size() == 0) {
          result.add(0);
        } else {
          result.add(queue.peek());
          if (arr[i] < 0) {
            queue.poll();
          }
        }
        i++;
        j++;
      }
    }
    return result;
  }
}
