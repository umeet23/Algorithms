package com.algorithms;

import java.util.Arrays;

public class AggressiveCow {

  public int aggressiveCow(int[] arr, int k) {
    int s = 0;
    int maxi = -1;
    for (int i = 0 ; i < arr.length; i++) {
      maxi = Math.max(maxi, arr[i]);
    }
    Arrays.sort(arr);
    int e = maxi;
    int mid = s + ( e - s) / 2;
    int ans = -1;
    while (s <= e) {
      if(isPossible(arr, k, mid)) {
        ans = mid;
        s = mid +1;
      }else {
        e = mid - 1;
      }
      mid = s + ( e - s) / 2;
    }
    return ans;
  }

  private boolean isPossible(int[] arr, int k, int mid) {
    int cowCount = 1;
    int lastPos = arr[0];
    for (int i = 0 ; i < arr.length; i++) {
      if ( arr[i] - lastPos >= mid) {
        cowCount++;
        if (cowCount == k) return true;
        lastPos = arr[i];
      }
    }
    return false;
  }
}
