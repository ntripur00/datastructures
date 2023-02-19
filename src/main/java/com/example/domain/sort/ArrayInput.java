package com.example.domain.sort;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;
@Slf4j
public class ArrayInput {

    private int n;
     private  int size;
      private int capacity;

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
  public int[] takeHeapArrayInput(){
    Scanner scanner = new Scanner(System.in);
    log.debug("enter the number of elements in the array");
    n = scanner.nextInt();
    size = n;
    capacity = n;


    int a[] = new int[n];
    log.debug("enter the elements in the array ");
    for(int i=0; i<n;i++) {
      a[i] = scanner.nextInt();
    }
    log.debug("the input array is {}",a);

    return a;
  }
  // to add an element at the end
  public  int[]  addElement( int a[],int element){
    // double the capacity if all the allocated space is utilized
    if (size == capacity){
     a=   ensureCapacity(a,n);
    }
    a[size] = element;
    size++;
     return trimToSize(a);
  }

  // to remove an element at a particular index
  public int[] remove(int [] a,int index){
    if(index>=size || index<0){
      System.out.println("No element at this index");
    }else{
      for(int i=index;i<size-1;i++){
        a[i] = a[i+1];
      }
      a[size-1]=0;
      size--;
    }
    return a;
  }
  /* method to increase the capacity, if necessary, to ensure it can hold at least the
   *  number of elements specified by minimum capacity argument
   */
  public  int [] ensureCapacity( int[] a,int minCapacity){
    int temp[] = new int[capacity*minCapacity];
    for (int i=0; i < capacity; i++){
      temp[i] = a[i];
    }
    a = temp;
    capacity = capacity * minCapacity;
    return a;

  }
  public int[] trimToSize(int a[]){
    System.out.println("Trimming the array");
    int temp[] = new int[size];
    for (int i=0; i < size; i++){
      temp[i] = a[i];
    }
    a = temp;
    capacity = a.length;
    return  a;
  }


}
