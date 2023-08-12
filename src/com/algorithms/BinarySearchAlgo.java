package com.algorithms;

public class BinarySearchAlgo {

  public int binarySearch(int[] arr, int start , int end, int key) {
    int mid = start + (end - start) / 2;
    while (start <= end) {
      if (arr[mid] == key) {
        return mid;
      }
      else if (key > arr[mid]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
      mid = start + (end - start) / 2;
    }
    return -1;
  }
}
