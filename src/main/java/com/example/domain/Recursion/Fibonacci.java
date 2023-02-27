package com.example.domain.Recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Fibonacci {

   int[] fibArr ;
  public int fibonacci(int n) {
     if(n<=1)
       return n;
     return fibonacci(n-1) + fibonacci(n-2);

  }
   public void findFibonacciSeries(int n){
     log.debug("the fibo series is ...");
      int [] a = new int[n];

     for( int i=0;i<n;i++){
        a[i] = fibonacci(i);
     }
      log.debug("{}",a);
   }
}
