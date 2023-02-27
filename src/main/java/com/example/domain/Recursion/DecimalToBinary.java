package com.example.domain.Recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecimalToBinary {

  public int deci2Bin(int n){
     if(n==0)
       return 0;
     if(n==1)
       return  1;


    return  n%2 + (10 * deci2Bin(n/2));
  }


  public void printBinaryofDecimalAndViceVersa(int n ){
    log.debug(" binary of {} is ...",n);
     int binary = deci2Bin(n);
    log.debug("{}",binary);
    log.debug("the decimal of {} is ...",binary);
    int decimal = binTODec(binary);
    log.debug("{}",decimal);
  }

   public int binTODec(int bin){
    if(bin<0)
      return -1;
    if(bin==0)
      return 0;
     return  bin%10 + (2*binTODec(bin/10));
   }
}
