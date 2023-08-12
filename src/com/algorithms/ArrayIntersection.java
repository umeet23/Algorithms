package com.algorithms;

import java.util.ArrayList;
import java.util.List;

public class ArrayIntersection {

  public List<Integer> arrayIntersection(int[] arr1, int[] arr2) {
    List<Integer> result = new ArrayList<>();
    int i = 0 , j = 0;
    while(i < arr1.length && j < arr2.length) {
      if(arr1[i] == arr2[j]) {
        result.add(arr1[i]);
        i++;
        j++;
      }else if(arr1[i] < arr2[j]) {
        i++;
      }else {
        j++;
      }
    }
    return result;
  }
}
