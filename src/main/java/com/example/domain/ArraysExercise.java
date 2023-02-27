package com.example.domain;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@Slf4j
public class ArraysExercise {


  public void missingNumber(int[] a) {

    log.debug("in the missingNumber method ...");
//    for(int i =a.length-1; i>0;i--){
////       log.debug("a[{}] {} , a[{}-1] {}",i,a[i],i,a[i-1]);
//       if(a[i] != a[i-1] +1){
//         log.debug("{}",a[i]-1);
//       }
//    }
     int sumOfArray=0;
     int sumOne2N =0;
     for(int i=1;i<=12;i++){
       sumOne2N +=i;
    }
     for(int i=0;i<a.length;i++){
       sumOfArray+=a[i];
     }
      int missingElement = sumOne2N - sumOfArray;
     log.debug("the missing element is {}",missingElement);
  }
   public  void pairs2Sum( int a[],int target){
    /*
    Pairs / Two Sum - LeetCode 1
    Write a program to find all pairs of integers whose sum is equal to a given number.
    Input: nums = [2,7,11,15], target = 9
     Output: [0,1]
     Output: Because nums[0] + nums[1] == 9, we return [0, 1]

     Input: nums = [3,2,4], target = 6
     Output: [1,2]
     */
     for(int i=0;i<a.length;i++){
        for(int j=i+1;j<a.length;j++){
           if(a[i]+a[j]==target){
             log.debug("the answer is {}",new int[] {i,j});
           }

        }
     }
   }
    public void findValueInArray(int a[], int value){
     for(int i=0; i<a.length;i++){
       if(a[i]==value){
         log.debug("the value is found at {}  index",i);
       }
     }
    }

    public void maxProduct(int a[]){

    /*
    Max Product of Two Integers
How to find maximum product of two integers in the array
where all elements are positive.
int[] intArray = {10,20,30,40,50};
maxProduct(intArray) (40,50)
     */
      int maxProduct = 0;
       String pairs = "";
       for(int i=0; i<a.length;i++){
         for(int j=i+1;j<a.length;j++){
           if(a[i] * a[j] >maxProduct) {
             maxProduct = a[i] * a[j];
               pairs =  "("+Integer.toString(a[i]) + ","+Integer.toString(a[j]) +")";
           }
         }
       }
        log.debug("pair is {}",pairs);
    }

     public void isUnique (int a[]){
    /*
    IsUnique / Contains Duplicate - LeetCode 217
Write a program to check if an array is unique or not.
Example
int[] intArray = {1,2,3,4,5,6};
isUnique(intArray) // true
     */
        boolean flag = true;
       for(int i=0; i<a.length;i++){
         for(int j =i+1; j<a.length;j++){
           if (a[i]==a[j]){
             flag = false;
           }
         }
       }
       log.debug("{}",flag);
     }

/*
Given a fixed-length integer array arr, duplicate each occurrence of zero,
shifting the remaining elements to the right.

 */
  public void duplicateZeros(int[] a) {
    log.debug("the array is {}",a);
      for(int j=0; j<a.length;j++){
         log.debug("a[{}] = {}",j,a[j]);
        if(a[j]==0){
          int value = a[j];
          a= addPos(a,j,value);
          j++;
          log.debug("after addPos {}",a);
        }
      }

    log.debug("result       {}",a);
    }
  public int[] addPos(int[] a,int pos,int value){
    // initially set to value parameter so the first iteration, the value is replaced by it
    int prevValue = value;

    // Shift all elements to the right, starting at pos
    for (int i = pos; i < a.length; i++) {
      int tmp = prevValue;
      prevValue = a[i];
      a[i] = tmp;
    }
   return a;
  }

  public void merge2ArraysInNonDescendingOrder(int[]a,int[] b){
    int c[] = new int[a.length+b.length];
    for(int i=0;i<a.length;i++){
      c[i] = a[i];
    }
     log.debug("after a in c {}",c);

    for(int j =0;j<b.length;j++){
      c[j+a.length] =b[j];
    }
    log.debug("after b in c {}",c);

    log.debug("the unsorted c {}",c);
    //bubbleSort
     for(int i=0;i<c.length-1;i++){
       boolean swapped = false;
       for(int j=0;j<c.length-1-i;j++){
           if(c[j] > c[j+1]){
              int temp = c[j];
              c[j] = c[j+1];
               c[j+1] = temp;
           }               swapped = true;

       } if(!swapped)
         break;
     }
    log.debug("the sorted c {}",c);
  }
   public int[] deleteElement(int[]a, int position){
     log.debug("the array a                            {}",a);
     int length = a.length;
     for (int i=position;i<length;i++){
       a[i-1] = a[i];
     }
      length--;
     log.debug("the array after deletion at position {} is {}",position,a);
      return a;
   }

   public void deleteCertainValues(int a[],int val){
    log.debug("array is {}",a);
     int k=0;
    int length = a.length;
     for( int i=0;i<length;i++){
       if(a[i]==val){
         a =deleteElement(a,i+1);
          length--;
       }
     }
     log.debug("the final array after deletion {}, length is {} ",a, length);
   }
   public void checkIfNAndItsDoubleExists(int a[]){
    int length = a.length;

     for (int i=0;i<length;i++){
       for(int j=0;j<length;j++){
       if(a[i] ==2*a[j]){
         log.debug("condition Met..i {} j {} for {} and {}", i,j,a[i] ,a[j]);
       }
       }

     }

   }
  public void checkIfMountainArray(int a[]){
      int  counter=0;
      boolean isUpHill =false;
      boolean isDownHill = false;
       int val = a[0];
     for(int i=0;i<a.length;i++){
       if(a[i]>a[i+1]){
         isUpHill =true;
         counter++;
          if(isUpHill==false){
            break;
          }
       }
       if(a[i]<a[i+1]){
         isDownHill =true;
         counter--;
       }
     }


  }

  /*
  Replace Elements with Greatest Element on Right Side
Given an array arr, replace every element in that array with the
greatest element among the elements to its right, and replace the last element with -1.
Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]
   */
  public void replaceElements(int[] a){
     if(a.length==1){
       log.debug("{}",-1);
     }
      int b[] =  new int [a.length];
      for(int i=0;i<a.length;i++){
         log.debug(" in the for loop  i = {}",i);
         if(i+1 <a.length)
          a[i] = findGreatestInAnArray(Arrays.copyOfRange(a,i+1,a.length));
          else
            a[i] = -1;
        log.debug("{}",a);
      }


  }
   public int findGreatestInAnArray(int subArr[]){
     int greatest = subArr[0];


      for( int i =0; i<subArr.length;i++){
         if(subArr[i]>greatest)
           greatest = subArr[i];
      }

     log.debug("the sub array is {}, and greatest is {}",subArr,greatest);

     return greatest;

   }

    public void removeDuplicates(int [] a){
     int b [] = new int[a.length];
     for(int i=0; i<b.length;i++){
        b[i] = Integer.MIN_VALUE;
     }
      int positionIndex = 0;
     for ( int i=0;i<a.length;i++){
        if( i==0 || a[i]!=a[i-1]) {
          b[positionIndex] = a[i];
          positionIndex++;
        }
     }
      log.debug("{}",b);
    }

     public void moveZeroes(int[]a){
    /*
    Move Zeroes
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.
     */

        int b[] = new int[a.length];
          int numberOfZeros = 0; //no of passes
          for(int i=0 ; i<a.length; i++){
             if  (a[i] ==0)
               numberOfZeros++;

          }

//           for(int j=0; j<numberOfZeros;j++) {
//              a = loop(a,insertIndex);
//               log.debug("a {}",a);
//           }
        for(int i =0;i<numberOfZeros;i++){
          if(a[i]==0){
            a = loop(a);
          }
                  log.debug("{}",a);
        }
     }
      public int []  loop(int [] a){
        for (int i = 0; i < a.length - 1; i++) {
           log.debug("i {} , insertIndex {}",i);
          if ( a[i] == 0  ) {
            log.debug(" swapped a[1] {} and a[i+1] {}", a[1],a[1+1]);
            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;


          }
           else {
             log.debug("dint swap...");
          }
        }
         return a;
      }


  public void display2DArray(int[][] a){

    log.debug("...............");
     for(int i = 0; i<a.length;i++){
       for( int j = 0; j<a[0].length;j++){
//         log.debug("{}",a[i]);
          System.out.print(a[i][j] + "\t");
       }
       System.out.println("\n");
     }
    log.debug("...............");
  }
   public void printMatrixStars( int n){
     for (int i=1; i<=n; i++){
        for( int j =1;j<=i;j++){
          System.out.print("*" );
        }
        System.out.println();
     }
     log.debug("\n................................\n");
     for (int i=1; i<=n; i++){
       for( int j =n;j>=i;j--){
         System.out.print("*" );
       }
       System.out.println();
     }
     log.debug("\n................................\n");
     for ( int i =0;i<n;i++){
       for(int j=1;j<i;j++) {
         System.out.print("* \t");
       }System.out.println("\n");
     }

   }

  public int[][] arrayInput2D (){

    Scanner  scanner = new Scanner(System.in);
     log.debug(" input no. of rows ...");
      int rows = scanner.nextInt();
      log.debug("inout no. of cols...");
      int cols = scanner.nextInt();
       int a[][] = new int[rows][cols];
      log.debug("input each element in 2d array ...");
//       for (int i = 0; i <=a.length; i++){
//         for(int j = 0; i<=a[0].length;j++){
//           log.debug(" a[{}][{}] = ",i,j);
//           a[i][j] = scanner.nextInt();
//         }
//       }

    for(int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {
        a[i][j] = scanner.nextInt();
      }


    }

    display2DArray(a);
    return a;

  }

   /*
   to rotate a matrix 90 degrees 1) transpose top triangle 2) reverse each row
    for 180 degrees transpose+ reverse , transpose + reverse
    */

   public void transpose2D(int a[][]){

      for(int i=0;i<a.length;i++) {
        for (int j = i; j < a[0].length; j++) {
          int temp = a[i][j];
          a[i][j] = a[j][i];
          a[j][i] = temp;
        }
      }
     log.debug(" transpose is ...{}");

      display2DArray(a);
   }

   public void reverse2DArray(int a[][]){
      for (int i =0; i<a.length;i++){
           int li = 0;
           int ri = a[i].length-1;
            while (li < ri){
               int temp =a[i][li];
               a[i][li] = a[i][ri];
               a[i][ri] = temp;
              li++;
              ri--;
           }
      }
     log.debug("rotated array  (each row reversed)");
     display2DArray(a);
   }

    public void rotate2DArray(){
      int a[][] = arrayInput2D();
      transpose2D(a);
      reverse2DArray(a);
      transpose2D(a);
       reverse2DArray(a);
      display2DArray(a);
    }

  public int thirdMaxinArray(int[] a) {
        log.debug("a           {}",a);
      int maxArray[] = new int [a.length];
       Arrays.sort(a);
        log.debug(" after sort {}",a);
         int max = a[0];
         log.debug("max = {}",max);
          for(int i = a.length-1; i>=0; i--){
            if(a[i] >=max){
              max = a[i];

            }
          }
          log.debug("max array is {}",maxArray);

         return 1;
  }
  public List<Integer> findDisappearedNumbers(int[] a) { //TODO
      Arrays.sort(a);
      log.debug("{}",a);
       int b []  =  new int [a.length];
        List<Integer> integers = new ArrayList<>();

       int positionIndex = 0;
        for(int i=0;i<a.length;i++){
          if( i==0 || a[i] != a[i-1]){
            b[positionIndex] = a[i];
            positionIndex++;
          }
        }
         log.debug("b {}",b);
         for(int i =0;i<b.length;i++){
           if(b[i]==i+1){

           }else {
             integers.add(i+1);
           }
         }
       log.debug("the list is {}",integers);

      return integers;
  }

  public int[] middle(int[] arr) {
    // TODO
     int middleList[] = new int [arr.length-2];
      log.debug("{}",arr);

        middleList =Arrays.copyOfRange(arr,1,arr.length-1);
       log.debug("arr {}",middleList);
       return middleList;

  }
   public int sumOfDiagonal(int a[][]){

      int sum = 0;
      for(int i=0;i<a.length;i++){
        for(int j=0;j<a[0].length;j++){
           if(i==j){
             sum+=a[i][j];
           }
        }
      }
       log.debug("sum {}",sum);
       return sum;
   }
    public   void firstSecondBestScores(int []a){

      Arrays.sort(a);
       log.debug("  string is {}",Integer.toString(a[a.length-1]) + "," + Integer.toString(a[a.length-2]) );
    }

  public void missingNumber(int[] a, int n) {
    // TODO
     int sum = (n*(n+1))/2 ;
      int arraySum =0;
     for(int i=0;i<a.length;i++){
       arraySum+=a[i];
     }
      int missingNumber = sum-arraySum;
     log.debug("{}",missingNumber);
  }
   public  void removeDup(int[]a){
      int noOfDupes = 0;
       Arrays.sort(a);
        for(int i =1;i<a.length;i++){
           log.debug("a[i-1] = {} , a[i] = {}",a[i-1],a[i]);
          if(a[i-1] == a[i]) {
            noOfDupes+=1;
            a = del(a, i);

          }
        }
         log.debug(" no fo dupes = {}",noOfDupes);

        log.debug("arr {}", Arrays.copyOfRange(a,0,a.length-noOfDupes));
   }
  public int [] del(int a[], int index) {
    int length = a.length;

    for (int i = index; i < length; i++) {
      a[i - 1] = a[i];
    }
    length--;

    return a;
  }

  public  String pairSum(int[] a, int sum) {
    // TODO
     String str = "";
      for(int i =0;i<a.length;i++){
        for(int j=i;j<a.length;j++){
           if(a[i]+a[j]==sum){
             str+=Integer.toString(a[i]) + ":" + Integer.toString(a[j]) +" ";
           }
        }
      }
       log.debug("{}",str);
       return str;
  }

}
