package com.algorithms;

import java.util.ArrayList;
import java.util.List;

public class WaveMatrix {

  public void printMatrixInWaveForm(int[][] arr) {

    int r = arr.length;;
    int c = arr[0].length;

    for (int col = 0; col < c; col++) {
      if ( (col & 1) == 1) {
        for (int row = r - 1; row >= 0; row--) {
          System.out.print(arr[row][col]);
        }
      } else {
        for (int row = 0; row < r; row++) {
          System.out.print(arr[row][col]);
        }
      }
      System.out.println();
    }
  }

  public List<Integer> spiralOrder(int[][] matrix) {

    List<Integer> ans = new ArrayList<>();

    int r = matrix.length;
    int c = matrix[0].length;

    int count = 0;
    int total = r * c;

    int startRow = 0;
    int startCol = 0;
    int endRow = r - 1;
    int endCol = c - 1;

    while (count < total) {
      // print first row
      for (int i = startCol; i <= endCol && count < total; i++) {
        ans.add(matrix[startCol][i]);
        count++;
      }
      startRow++;

      // print last column
      for (int i = startRow; i <= endRow && count < total; i++) {
        ans.add(matrix[i][endCol]);
        count++;
      }
      endCol--;

      // print last row
      for (int i = endCol; i >= startCol && count < total; i--) {
        ans.add(matrix[endRow][i]);
        count++;
      }
      endRow--;

      // print last Col
      for (int i = endRow; i >= startRow && count < total; i--) {
        ans.add(matrix[i][startCol]);
        count++;
      }
      startCol++;
    }


    return ans;
  }
}
