package com.example.domain.Recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RecursiveRange {
  /*
  Write a function called recursiveRange which accepts a number and
    adds up all the numbers from 0 to the number passed to the function.
   Examples
    recursiveRange(6)  // 21
     recursiveRange(10) // 55
   */

   public int recursiveRange(int n){
      if(n<0)
       return 0;
      return  n + recursiveRange(n-1);
   }
     public void printRecursiveRange(int n){
     log.debug("the recursiveRange for {} is ...",n);
     log.debug("{}",recursiveRange(n));
     }
}
