package com.example.domain.Recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GCDof2Numbers {

   public int gcd(int a , int b){
     if(a<0 ||b<0)
       return -1;
      if(b==0)
        return a;
    //eucledian algo

      return  gcd(b,a%b);
   }
    public void printGCD(int a, int b){
     log.debug("the GCD of {} and {} is ...",a,b);
      log.debug("{}",gcd(a,b));

    }
}
