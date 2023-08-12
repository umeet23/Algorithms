package com.algorithms;

public class RotateArray {
  public void rotate(int[] nums, int k) {
    int len = nums.length;
    int[] newArray = new int[nums.length];
    int midIndex = len - k;
    int i = 0;
    while(midIndex < len) {
      newArray[i] = nums[midIndex];
      i++;
      midIndex++;
    }

    for(int j = 0 ; j < len - k; j++) {
      newArray[i] = nums[j];
    }
    for(int num : newArray) {
      System.out.println(num + " ");
    }
  }

  public int[] rotateSecond(int[] arr, int k) {
    int[] temp = new int[arr.length];

    // if we mode any between ( 0 - n-1 ) with n then we will number between (0 - n-1)
    for(int i = 0; i < arr.length; i++) {
      temp[( i + k) % arr.length] = arr[i];
    }
    return temp;
  }
}
