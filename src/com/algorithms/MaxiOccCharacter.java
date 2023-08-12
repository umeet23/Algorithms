package com.algorithms;

public class MaxiOccCharacter {

  public char getMaxiOccCharacter(String str) {
    int[] arr = new int[26];
    for (int i =0 ; i < str.length(); i++) {
      int n;
      if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
        n = str.charAt(i) - 'a';
        arr[n]++;
      } else {
        n = str.charAt(i) - 'A';
        arr[n]++;
      }
    }
    int maxi = Integer.MIN_VALUE, ans = 0;
    for (int j = 0; j < arr.length; j++) {
      if (maxi <= arr[j]) {
        ans = j;
        maxi = arr[j];
      }
    }
    return (char)('a' + ans);
  }

}
