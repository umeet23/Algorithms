package com.algorithms;

public class Sqrt {
  public int sqrt(int n) {
    if (n == 0)
      return 0;
    int s = 1;
    int e = n;
    while(true) {
      int mid = s + ( e - s ) / 2;
      if(mid > n / mid) {
         e = mid - 1;
      } else {
        if(mid + 1 > n / (mid + 1)) return mid;
        s = s + 1;
      }
    }
  }

  public double morePrecision(int number, int precision, int tempSol) {
    double factor = 1;
    double ans = tempSol;

    for(int i=0; i<precision; i++) {
      factor = factor/10;

      for(double j=ans; j*j<number; j= j+factor ){
        ans = j;
      }
    }
    return ans;
  }
  }

