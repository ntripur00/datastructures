package com.example.domain.Recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PowerOfANumber {
  public int power(int n, int pwr){
    if(n<0)
      return -1;
    if(pwr==0)
       return  1;
    if(pwr==1)
      return n;

    return n * power(n,pwr-1);
  }

  public void printPowerofANumber(int n , int pow){
    log.debug("{} power {} is ...",n,pow);
    log.debug("{}",power(n,pow));
  }
}
