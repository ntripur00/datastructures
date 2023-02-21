package com.example.domain.Recursion;

public class NFactorial {

    public  int factorial(int n){
       if(n<0)
         return 0;
       if(n==0 || n==1)
         return 1;
       return n*factorial(n-1);
    }
}
