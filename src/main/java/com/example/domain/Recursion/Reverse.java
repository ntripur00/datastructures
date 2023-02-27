package com.example.domain.Recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Reverse {

  public String reverse(String str){

     if(str.isEmpty())
       return str;
      return reverse(str.substring(1))+str.charAt(0);
  }
    public void printReverseString(String str){
    log.debug("the reverse string for \n{}  is {}",str, reverse(str));
    }
}
