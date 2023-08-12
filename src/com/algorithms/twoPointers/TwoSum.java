package com.algorithms.twoPointers;

public class TwoSum {
  public int[] twoSum(int[] numbers, int target) {
    int i = 0;
    int j = numbers.length - 1;
    int[] results = new int[2];
    while (i < j) {
      int sum = numbers[i] + numbers[j];
      if(sum == target) {
        results[0] = i;
        results[1] = j;
        break;
      }else if(sum > target) {
        j--;
      }else {
        i++;
      }
    }
    System.out.println(results[0] + "elements" + results[1]);
    return results;
  }
}
