package com.algorithms;

public class FindUnique {

  public int findUnique(int[] arr) {
    int ans = 0;
    for(int element: arr) {
      ans = ans ^ element;
    }
    return ans;
  }
}
