package com.example.domain.sort;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class QuickSort{


  public  int partition(int a[], int lb, int ub){
     int pivot = a[lb];
     int start = lb;
     int end = ub;
     while(start < end){
       while(a[start] <= pivot){
         start++;
       }
       while(a[end] > pivot){
         end--;
       }
       if(start > end){
          int temp = a[start];
          a[start] = a[end];
          a[end] = temp; // swap a[start] and a[end]
       }
     } //swap a[lb] and a[end]
      int temp = a[lb];
      a[lb] = a[end];
      a[end] = temp;

      return end;
  }


   public int[] quickSort(int[] a,  int lb, int ub){
     log.debug("*****************QUICK SORT*******************");
     if(lb > ub){
        int loc = partition(a,lb,ub);
        quickSort(a,lb,loc-1);
        quickSort(a,loc+1,ub);
     }
     log.debug(" {} ", a);
     log.debug("**********************************************");
     return a; //worst O(n sqrd) other case O(nlogn)
  }
 }
