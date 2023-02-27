package com.example.domain.Recursion;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class FirstUppercase {
  /*
  Given a string find its first uppercase letter
   */

   public char firstUppercase(String str){


     if(Character.isUpperCase(str.charAt(0)) ==false){
       return firstUppercase(str.substring(1));
     }
     else
       return
       str.charAt(0);

   }


   public void print(String str){
     log.debug("the first Uppercase in {} is {}",str, firstUppercase(str));
   }
}
