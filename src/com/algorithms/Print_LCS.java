package com.algorithms;

public class Print_LCS {

  public String LCS(String X, String Y) {
    if (X.length() == 0 || Y.length() == 0) {
      return "";
    }

    int M = X.length() + 1;
    int N = Y.length() + 1;

    int[][] t = new int[M][N];

    for(int i = 0; i < M; i ++){
        t[i][0] = 0;
    }

    for(int j = 0; j < N; j ++){
        t[0][j] = 0;
    }

    // fill Matrix longest common subsequences
    for(int i = 1; i < M; i++) {
      for(int j = 1; j < N; j++) {
        if(X.charAt(i - 1) == Y.charAt(j - 1)){
            t[i][j] = 1 + t[i - 1][j - 1];
        } else {
          t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
        }
      }
    }
    StringBuilder sb = new StringBuilder();
    int i = X.length();
    int j = Y.length();

    // Store longest common subsequences and print it
    while(i > 0 && j > 0) {
      if(X.charAt(i - 1) == Y.charAt(j - 1)){
          sb.append(X.charAt(i - 1));
          i--;
          j--;
      } else {
        if (t[i][j - 1] > t[i - 1][j]) {
          j--;
        } else {
          i--;
        }
      }
    }
    return sb.reverse().toString();
  }
}
