package com.algorithms;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArray {

  public List<Integer> mergeSorted(int[] arr1, int[] arr2) {
    List<Integer> ls = new ArrayList<>();
    int i = 0, j = 0;
    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] < arr2[j]) {
        ls.add(arr1[i]);
        i++;
      } else {
        ls.add(arr2[j]);
        j++;
      }
    }
    while (i < arr1.length) {
      ls.add(arr1[i]);
      i++;
    }
    while (j < arr2.length) {
      ls.add(arr2[j]);
      j++;
    }
    return ls;
  }
}
