package com.algorithms;

public class SwapAlternative {


  public int[] swapNumbers(int[] arr) {
    for(int i = 0, j = 1; j < arr.length; i = i + 2 , j = j + 2) {
      int tempNumber = arr[i];
      arr[i] = arr[j];
      arr[j] = tempNumber;
    }
    return arr;
  }
}
