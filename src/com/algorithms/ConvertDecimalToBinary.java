package com.algorithms;

public class ConvertDecimalToBinary {


  public int tempFunc(int n) {
    n = Math.abs(n);

    //storing binary in an array
    int[] arr = new int[32];
    int j =1;
    while(n!=0){
      int bit = n & 1;
      n = n>> 1;
      arr[32-j] = bit;
      j+=1;
    }
    int i = -1;
    for(i = arr.length - 1; i>=0 ; i-- ) {
      if(arr[i] == 1) break;
    }
    for(int k = i - 1; k >=0; k--){
      if(arr[k] == 1) {
        arr[k] = 0;
      }else {
        arr[k] = 1;
      }
    }
    int ans =0;
    for (int x=24;x<32;x++)// Representing answer in 8 bit format, because we cannot store full number in integer
      ans = ans *10 + arr[x];

    return ans;
  }


  public int convertNegativeNumberToBinary(int n) {
    n = Math.abs(n);

    //storing binary in an array
    int[] arr = new int[32];
    int j =1;
    while(n!=0){
      int bit = n & 1;
      n = n>> 1;
      arr[32-j] = bit;
      j+=1;
    }
    // Taking 2s compliment
    boolean check=false;
    int first_bit =-1;
    // Starting loop from right to left
    for (int i=31;i>=0;i--){
      if (check ==false && arr[i] ==1){ // look for the first 1
        check =true;
        first_bit =i;
      }
      if (first_bit!=i && check==true){ // First 1 has been found, invert all the other bits
        if (arr[i]==0){ // Inverting bits
          arr[i]=1;
        }
        else{
          arr[i]=0;
        }
      }
    }
    int ans =0;
    for (int i=24;i<32;i++)// Representing answer in 8 bit format, because we cannot store full number in integer
      ans = ans *10 + arr[i];

    return ans;
  }
}
