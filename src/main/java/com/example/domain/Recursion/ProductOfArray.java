package com.example.domain.Recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProductOfArray {

  /*Write a function called productOfArray which takes in an array of numbers
   and returns the product of them all.
   Examples
    int arr[] = { 1, 2, 3, 4, 5 };
        productofArray(arr, arr.length); #120
   */

  public int productOFArray(int [] a, int n){
    if(n<0)
      return 1;
    return a[n] * productOFArray(a,n-1);
  }
   public void printProductArray(int[]a, int n){
    log.debug("the product array   for array {} is ...",a);
    log.debug("{}",productOFArray(a,n));
   }
}
