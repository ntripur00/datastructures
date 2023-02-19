package com.example.domain.sort;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.Aware;

import java.util.Scanner;

@Slf4j
public class Heap {

  public void insertMaxHeap() {
    ArrayInput arrayInput = new ArrayInput();
    int[] a = arrayInput.takeHeapArrayInput();
    Scanner scanner = new Scanner(System.in);
    log.debug("enter the element to be inserted in the heap ...");
    int elementToBeInserted = scanner.nextInt();

    a = arrayInput.addElement(a, elementToBeInserted);
    log.debug("a after insert {} ", a);
    int n = a.length;

//    n = n+1;
    int pointer = n - 1;

    //find parent
    while (pointer > 1) {
//       log.debug("in the while loop.. ");
//       log.debug("pointer {} ",pointer);
      int parent = (pointer - 1) / 2;
//       log.debug("parent {} ",parent);

//       log.debug("a {}",a);
//       log.debug("a[n] {}",a[n]);
//       log.debug("a[parent] {} a[pointer] {}",a[parent],a[pointer]);
      if (a[parent] < a[pointer]) {

        int temp = a[parent];
        a[parent] = a[pointer];
        a[pointer] = temp;
        log.debug("  max heap  ... {}", a);
        pointer = parent;

      } else {
        return;
      }
      log.debug(" a {}", a);
    }
  }

  public void insertMinHeap() {
    ArrayInput arrayInput = new ArrayInput();
    int[] a = arrayInput.takeHeapArrayInput();
    Scanner scanner = new Scanner(System.in);
    log.debug("enter the element to be inserted in the heap ...");
    int elementToBeInserted = scanner.nextInt();

    a = arrayInput.addElement(a, elementToBeInserted);
    log.debug("a after insert {} ", a);
    int n = a.length;

//    n = n+1;
    int pointer = n - 1;

    //find parent
    while (pointer > 1) {
//       log.debug("in the while loop.. ");
//       log.debug("pointer {} ",pointer);
      int parent = (pointer - 1) / 2;
//       log.debug("parent {} ",parent);

//       log.debug("a {}",a);
//       log.debug("a[n] {}",a[n]);
//       log.debug("a[parent] {} a[pointer] {}",a[parent],a[pointer]);
      if (a[parent] > a[pointer]) {

        int temp = a[parent];
        a[parent] = a[pointer];
        a[pointer] = temp;
        log.debug("  min heap  ... {}", a);
        pointer = parent;

      } else {
        return;
      }
    }
    log.debug(" a {}", a);

  }

  public int[] heapArray(int[] a, int size) {
    log.debug("the array is {}", a);
    int[] b = new int[size + 1];
    b[0] = 0;
    for (int i = 1; i < size + 1; i++) {
      b[i] = a[i - 1];
    }
    log.debug("the heap array is {}", b);
    return b;
  }

  public void maxHeapify(int a[], int n, int index) {
//     log.debug("initial array is {}",a);
    int largest = index;
    int leftChild = (2 * index);
    int rightChild = (2 * index) + 1;
//    log.debug("\nlargest {}, \nindex {} \nleft child {}, \nright child {}\nn {}", largest, index, leftChild, rightChild, n);
    while (leftChild < n && a[leftChild] > a[largest]) {
      largest = leftChild;
    }
    while (rightChild < n && a[rightChild] > a[largest]) {
      largest = rightChild;
    }
//    log.debug("\nthe largest {} \nindex {}", largest, index);
    if (largest != index) {
//      log.debug("in the if loop ...");
//      log.debug("swapping a[largest] {} and a[index] {}", a[largest], a[index]);
      int temp = a[largest];
      a[largest] = a[index];
      a[index] = temp; // swap
//      log.debug("the array after swap {}", a);
      maxHeapify(a, n, largest);
    }

//    log.debug("max heapified array is {}", a);

  }


  public void  heapSort(int a[], int n) {
//    ArrayInput arrayInput = new ArrayInput();
//      int[] a = arrayInput.remove(b,0);

    for (int i = (n / 2); i >= 1; i--) {
//       log.debug("maxHeapify ({},{},{})",a,n,i);
      maxHeapify(a, n, i);
//      log.debug("the heapified array is {}",a);
    }
    for (int i = n-1; i >= 1; i--) {
      log.debug("i {}",i);
       log.debug("a[1] {}, a[i] {} ,a {}", a[1],a[i],a);
      int temp = a[1];
      a[1] = a[i];
      a[i] = temp;
      log.debug("after swap...");
      log.debug("a[1] {}, a[i] {}, a {}", a[1],a[i],a);
//      log.debug("the array after swap {}", a);

      maxHeapify(a, n,1 );
      log.debug("the heapified array is {}",a);
    }
//    maxHeapify(a,n,1);
//          log.debug("after heapify a {}",a);

  }
}
