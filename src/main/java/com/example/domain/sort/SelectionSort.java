package com.example.domain.sort;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SelectionSort {


   public void selectionSort(int[] a){
//     int  n = a.length;
//       for(int i=0;i<n-1;i++){
//          int min =i;
//          for(int j=i+1;j<n;j++){
//             if(a[j] < a[min]){
//                min =j;
//             }
////             if (min!=i){
//                int temp = a[min];
//                a[min] = a[i];
//                a[i] = temp; //swap  i th and min th elements
////             }
//
//
//          }
//
//       }
      int n = a.length;

      // One by one move boundary of unsorted subarray
      for (int i = 0; i < n-1; i++)
      {
         // Find the minimum element in unsorted array
         int min_idx = i;
         for (int j = i+1; j < n; j++)
            if (a[j] < a[min_idx])
               min_idx = j;

         // Swap the found minimum element with the first
         // element
         int temp = a[min_idx];
         a[min_idx] = a[i];
         a[i] = temp;
      }

   }


   public void printArray(int arr[])
   {
      log.debug("*****************SELECTION SORT*******************");
      int n = arr.length;
      log.debug("{}",arr);
      log.debug("**************************************************");

   }
}
