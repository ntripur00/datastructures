package com.example.domain.sort;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;
@Slf4j
public class ArrayInput {

    private int n;

     public int[] takeArrayInput(){
       Scanner scanner = new Scanner(System.in);
       log.debug("enter the number of elements in the array");
       n = scanner.nextInt();
       int a[] = new int[n];
       log.debug("enter the elements in the array ");
         for(int i=0; i<n;i++) {
           a[i] = scanner.nextInt();
         }
         log.debug("the input array is {}",a);

       return a;
     }
}
