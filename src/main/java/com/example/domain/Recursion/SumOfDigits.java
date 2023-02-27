package com.example.domain.Recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SumOfDigits {

  //example 234 = 2+3+4

   public int sumofDigits(int n)
   {
      if(n==0)
        return 0;
       if(n<0)
         return -1;

      return sumofDigits(n/10) + n%10;
   }

   public void printSumofDigits(int n){

     log.debug("the sum of digits is ...");
     log.debug("{}",sumofDigits(n));
   }

}
