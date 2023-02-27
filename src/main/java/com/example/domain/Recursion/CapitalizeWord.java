package com.example.domain.Recursion;

import lombok.extern.slf4j.Slf4j;

import java.util.StringTokenizer;

@Slf4j
public class CapitalizeWord {


  //not executedd

   /*

   pseudocode
   public static String capitalizeWord(String str) {

    if(str.isEmpty()) {
        return str;
    }
    char chr = str.charAt(str.length()-1);
    if(str.length()==1) {
        return Character.toString(Character.toUpperCase(chr));
    }
    if((str.substring(str.length()-2, str.length()-1).equals(" "))) {
        chr = Character.toUpperCase(chr);
    }
    return capitalizeWord(str.substring(0,str.length()-1))+ Character.toString(chr);
}







    */
  public  void capitalizeWord(String str){
     char[] c = str.toCharArray();

      for(int i=0;i<c.length;i++){
        if(Character.compare(c[i],' ')==0){
          Character.toUpperCase(c[i+1]);
        }
      }
       String s="";
       for(int i =0; i<c.length; i++){
         s+=c[i];
       }

       log.debug("the string is {}",s);


  }
}
