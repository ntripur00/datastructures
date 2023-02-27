package com.example.domain.Recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Palindrome {

  /*
  Write a recursive function called isPalindrome
  which returns true if the string passed to it is a palindrome
   (reads the same forward and backward). Otherwise it returns false.

   isPalindrome('awesome') # false
   isPalindrome('foobar') # false
   isPalindrome('tacocat') # true
   */

  public boolean isPalindrome(String str){
     Reverse rev = new Reverse();
    return rev.reverse(str).equals(str);

  }



  public void  printPalindromeFn(String str){

     log.debug(" is {} a palindrome ... ?? {}",str, isPalindrome(str));

  }
}
