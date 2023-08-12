package com.algorithms;

public class SortingAlgo {


  private void swapElement(int[] array, int firstPos, int secondPos) {
    int temp = array[firstPos];
    array[firstPos] = array[secondPos];
    array[secondPos] = temp;
  }

  //
  public void bubbleSort(int[] arr) {
    int n = arr.length - 1;
    for(int i = 0 ; i < n; i++) {
      for (int j = 0;  j < n; j++) {
        if (arr[j] > arr[j + 1]) {
          swapElement(arr, j ,j + 1);
        }
      }
    }
  }

  // Select One Element
  // Find minimium element from i+1 < n -1
  // Then replace it with currentPosition
  public void selectionSort(int[] arr) {
    int n  = arr.length;
    for(int i = 0; i < arr.length; i++) {
      int currentIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[currentIndex] > arr[j]) {
          currentIndex = j;
        }
      }
      swapElement(arr, i, currentIndex);
    }
  }

  public void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int temp = arr[i];
      int j;
      for (j = i - 1 ; j >= 0 ; j--) {
        if (arr[j] > temp) {
            arr[j + 1] = arr[j];
        } else {
          break;
        }
      }
      arr[j + 1] = temp;
    }
  }
}
