package com.example.domain.sort;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CountingSort {

  public int [] countSort(int[] a, int n ,  int maxElement){

     log.debug("the initial Array is {}",a);

     int[] countArray = new int[maxElement+1];
       int[] sortedArray = new int[n];

       for(int i =0; i<n ;i++){
          ++countArray[(a[i]) % 10];
       }
       log.debug("the count array is {}",countArray);
        //update countArray summation
       for(int i=1; i<=n-1;i++){
          countArray[i] = countArray[i] + countArray[i-1];
       }
       log.debug("the count array summation is {}",countArray);
        //r -> l
      for(int i=n-1; i>=0;i--){
         sortedArray[--countArray[a[i]]] = a[i];
      }
       log.debug("the sorted array is {}",sortedArray);
       for(int i=0;i<n;i++){
          a[i] = sortedArray[i];
       }
       log.debug("the final sorted Array is {}",a);
       return a;
   }
}
