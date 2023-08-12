package com.algorithms;

public class LongestCommonPrefix {


  public String horizontalScaling(String[] str) {
    if(str == null || str.length == 0) return "";
    String prefix = str[0];
    for(int i = 1 ; i < str.length; i++) {
      while(str[i].indexOf(prefix) != 0) {
          prefix = prefix.substring(0 , prefix.length() - 1);
          if(prefix.isEmpty()) return "";
      }
    }
    return prefix;
  }

  public String verticalScaling(String[] str) {
    if(str == null || str.length == 0) return "";
    for(int i = 0; i < str[0].length(); i++) {
      char c = str[0].charAt(i);
      for(int j = 1; j < str.length; j++) {
        if(i == str[j].length() || str[j].charAt(i) != c) {
          return str[0].substring(0 ,i);
        }
      }
    }
    return str[0];
  }

  public String binarySearch(String[] strs) {
    if(strs == null || strs.length == 0) return "";
    int minLen = Integer.MAX_VALUE;
    for(String str : strs) {
      minLen = Math.min(minLen, str.length());
    }
    int low = 1;
    int high = minLen;
    while(low <= high) {
      int mid = low + ( high - low ) / 2;
      if(isCommonPrefix(strs, mid)) {
        low = mid + 1;
      }else {
        high = mid - 1;
      }
    }
    return strs[0].substring(0, (low + high) / 2);
  }

  private boolean isCommonPrefix(String[] strs, int len) {
    String string = strs[0].substring(0, len);
    for(int i = 1; i < strs.length; i++) {
      if(!strs[i].startsWith(string)) {
        return false;
      }
    }
    return true;
  }
}
