package com.algorithms;

public class FindPivot {

  public int pivotElement(int[] arr) {
    int start = 0;
    int end  = arr.length - 1;
    int mid = start + (end - start) / 2;
    while (start < end) {
      if (arr[mid] >= arr[0]) {
        start = mid + 1;
      } else {
        end = mid;
      }
      mid = start + (end - start) / 2;
    }
    return start;
  }
}
