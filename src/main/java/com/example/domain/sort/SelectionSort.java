package com.example.domain.sort;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SelectionSort {

   private int n;

   public int[] selectionSort(int[] a){
      n = a.length;
      log.debug("*****************SELECTION SORT*******************");
       for(int i=0;i<n-1;i++){
          int min =i;
          for(int j=i+1;j<n;j++){
             if(a[j] < a[min]){
                min =j;
             }
             if (min!=i){
                int temp;
                temp = a[i];
                a[i] = a[min];
                a[min] = temp; //swap  i th and min th elements
             }
             log.debug(" {} ", a);
             log.debug("**************************************************");
             return a;
          }

       }


       return a;
   }
}
