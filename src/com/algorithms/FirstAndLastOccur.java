package com.algorithms;

import java.util.ArrayList;
import java.util.List;

public class FirstAndLastOccur {
  public List<Integer> firstAndLastOccur(int[] arr, int key) {
    List<Integer> list  = new ArrayList<>();
    int left = 0 , right = arr.length - 1;
    int ans = -1;
    while(left <= right) {
      int mid = left + (right - left) / 2;
      if(arr[mid] == key) {
        ans = mid;
        right = mid -1;
      }else if(key > arr[mid]) {
        left = mid + 1;
      }else {
        right = mid - 1;
      }
    }
    list.add(ans);
    ans = -1;
    left = 0 ;
    right = arr.length - 1;
    while(left <= right) {
      int mid = left + (right - left) / 2;
      if(arr[mid] == key) {
        ans = mid;
        left = mid  + 1;
      }else if(key > arr[mid]) {
        left = mid + 1;
      }else {
        right = mid - 1;
      }
    }
    list.add(ans);
    return list;
  }
}
