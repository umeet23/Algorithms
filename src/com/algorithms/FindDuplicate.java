package com.algorithms;

public class FindDuplicate {

  public int findDuplicate(int[] arr) {
   int ans = 0;
    for (int ele: arr) {
      ans = ans ^ ele;
    }
    for(int i = 0; i < arr.length; i++) {
      ans = ans ^ i;
    }
    return ans;
  }
}
