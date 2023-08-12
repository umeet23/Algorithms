package com.algorithms;

public class SubStr {

  public int subStr(String hayStack, String needle) {
    if(needle.length() == 0) return 0;

    int len = hayStack.length() - needle.length();
    for(int i = 0; i <= len; i++){
      if(hayStack.charAt(i) != needle.charAt(0)) continue;

      boolean substring = true;

      for(int j = i; j < i + needle.length(); j++){
        if(hayStack.charAt(j) != needle.charAt(j-i)) substring = false;
      }

      if(substring) return i;
    }

    return -1;
  }
}
