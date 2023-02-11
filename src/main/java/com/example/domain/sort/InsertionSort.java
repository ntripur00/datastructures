package com.example.domain.sort;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InsertionSort {
  private int n;

   public int[] insertionSort(int a[]){
//     ArrayInput arrayInput = new ArrayInput();
//      int a[] = arrayInput.takeArrayInput();
     n = a.length;
     log.debug("*****************INSERTION SORT*******************");
     for( int i=1; i<n;i++){
        int temp;
        temp =a[i];
        int j=i-1;
         while (j>=0 && a[j] >temp){
           a[j+1] = a[j];
           j--;
         }
         a[j+1] = temp;
     }
     log.debug("{} ", a);
     log.debug("**************************************************");
     return a;

   }


}
