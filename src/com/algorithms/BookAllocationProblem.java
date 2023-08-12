package com.algorithms;

public class BookAllocationProblem {

  public int bookAllocationProblem(int[] arr, int m) {
    int s = 0;
    int sum = 0;
    if (arr.length < m) return -1;
    for(int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    int e = sum;
    int ans = -1;
    int mid = s + (e - s ) / 2;
    while (s <= e) {
      if(isPossibleSolution(arr, m, mid)) {
        ans = mid;
        e = mid - 1;
      } else {
        s = mid + 1;
      }
      mid = s + (e - s ) / 2;
    }
    return ans;
  }

  private boolean isPossibleSolution(int[] arr, int m, int mid) {
      int studentCount = 1;
      int pageSum = 0;
      for(int j = 0; j < arr.length; j++) {
        if (pageSum + arr[j] <= mid) {
          pageSum += arr[j];
        } else {
          studentCount++;
          if(studentCount > m || arr[j] > mid) {
            return false;
          }
          pageSum = arr[j];
        }
      }
      return true;
  }
}
