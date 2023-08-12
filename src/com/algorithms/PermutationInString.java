package com.algorithms;

public class PermutationInString {

  private boolean checkCount(int[] count1, int[] count2) {
    for (int i = 0 ; i < 26; i++) {
      if (count1[i] != count2[i]) {
        return false;
      }
    }
    return true;
  }

  public boolean checkPermutationInString(String str1, String str2) {

    int[] countOne = new int[26];
    for (int i =0 ; i < str1.length(); i++) {
      int index = str1.charAt(i) - 'a';
      countOne[index]++;
    }

    int j = 0;
    int windowSize = str1.length();
    int[] countTwo = new int[26];

    // Checking first window
    while (j < windowSize && j < str2.length()) {
      int index = str2.charAt(j) - 'a';
      countTwo[index]++;
      j++;
    }
    if (checkCount(countOne, countTwo)) {
      return true;
    }

    // Check rest of the String Two
    while (j < str2.length()) {
      int newIndex = str2.charAt(j) - 'a';
      countTwo[newIndex]++;

      int oldIndex = str2.charAt(j - windowSize) - 'a';
      countTwo[oldIndex]--;
      j++;
      if (checkCount(countOne, countTwo)) {
        return true;
      }
    }
    return false;
  }
}
