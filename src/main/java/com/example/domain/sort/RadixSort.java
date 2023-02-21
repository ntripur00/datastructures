package com.example.domain.sort;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RadixSort {
  int maxElement ;
   public void radixSort(int a[], int n){
       log.debug("the initial array is {}",a);
      int[] sortedArray = new int[n];

       maxElement = a[0];
       for( int x : a){
          if(x>maxElement)
             maxElement = x;
       }
       log.debug("the max element is {}",maxElement);

       for(int position = 1 ;maxElement/position >0;position*=10){
          sortedArray = countSort(a,n,position);
          log.debug("the sorted Array  {} at {}th",sortedArray,position);
//          position*10;

       }
        log.debug("the sorted Array is {}",a);
   }

   private int[] countSort(int[] a, int n, int position) {
      log.debug(" a {}, n {}, position {}",a,n,position);
       int countArray[] = new int[n];
      int[] sortedArray = new int[n];

      for(int i=0;i<n;i++){

           ++countArray[(a[i] / position) % 10];
        }
             log.debug("the count array is {}",countArray);
        for( int i=1;i<countArray.length;i++){
           countArray[i] = countArray[i] + countArray[i-1];
        }
             log.debug("the count array summation is {}",countArray);

      for(int i=n-1;i>=0;i--){
        log.debug("a[{}] {}",i,a[i]);
        log.debug("position is {}",position);
        log.debug("the (a[{}]/ position) % 10  is {}",i,(a[i]/ position) % 10);
//        log.debug("countArray[(a[i]/ position) % 10]--) {}",countArray[(a[i]/ position) % 10]--);
//        log.debug("--countArray[(a[i]/ position) % 10]) {}",--countArray[(a[i]/ position) % 10]);

            sortedArray[--countArray[(a[i]/ position) % 10]] = a[i];
//            countArray[(a[i]/position) % 10]--;
         }

       return  sortedArray;
   }
}
