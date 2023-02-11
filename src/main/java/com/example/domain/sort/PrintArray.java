package com.example.domain.sort;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrintArray {


   void printArray(int arr[]){
     log.debug("the array is ");
     for(int i=0; i<arr.length;i++){
       log.debug("{}\t" ,arr[i] );

     }
   }


}
