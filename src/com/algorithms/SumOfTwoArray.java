package com.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumOfTwoArray {


  public List<Integer> sumOfTwoArray(int[] arr1, int[] arr2) {

    List<Integer> result = new ArrayList<>();
    int i = arr1.length - 1;
    int j = arr2.length - 1;
    int carry = 0;

    while (i >= 0 && j >= 0) {
      int sum = arr1[i] + arr2[j] + carry;
      carry = sum / 10;
      sum = sum % 10;
      result.add(sum);
      i--;
      j--;
    }

    // First Array One is Greater
    while (i >= 0) {
      int sum = arr1[i] + carry;
      carry = sum / 10;
      sum = sum % 10;
      result.add(sum);
      i--;
    }

    // Second Array One is Greater
    while (j >= 0) {
      int sum = arr2[j] + carry;
      carry = sum / 10;
      sum = sum % 10;
      result.add(sum);
      j--;
    }

    // When Both array are equal
     while (carry != 0) {
       int sum = carry;
       carry = sum/10;
       sum = sum%10;
       result.add(sum);
     }
    Collections.reverse(result);
     return result;
  }
}
