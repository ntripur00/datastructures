package com.example.domain.sort;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BubbleSort {
  private int n;
  public int[] bubbleSort(int[] a) {
//    ArrayInput arrayInput = new ArrayInput();
//    int a[] = arrayInput.takeArrayInput();
    n = a.length;
    log.debug("*****************BUBBLE SORT*******************");
    for (int i = 0; i < n; i++) {
      boolean swapped = false;
      for (int j = 0; j < n - 1 - i; j++) {
        if (a[j] > a[j + 1]) {
          int temp;
          temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp; //swap
          swapped = true;
        }
      }
      if (!swapped)
        break;   //optimized
    }
    log.debug(" {} ", a);
    log.debug("***********************************************");

    return a;


  }


}
