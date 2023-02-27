package com.example.domain.Recursion;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class SomeRecursive {

  /*
  someRecursive
Write a recursive function called someRecursive which accepts an array and a callback.
The function returns true if a single value in the array returns true
when passed to the callback. Otherwise it returns false.
   */

   public  boolean someRecursive(int a[]){

     if(a.length==0)
       return false;
       if (isOdd(a[0])==false)
         return someRecursive(Arrays.copyOfRange(a,1,a.length));
       else {
          return true;
       }
   }

   public boolean isOdd(int n){
      if(n%2 == 0)
     return false;
      else
        return true;
   }
    public void printSomeRecursive (int []a){
      log.debug("does  the array {} have odd values ??? {}", a,someRecursive(a));
    }
}
