package com.example.domain.sort;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SwapArrayElements {


  static int [] swap(int a [] , int i, int j)
  {

    int tempo = a[i];
    a[i] = a[j];
    a[j] = tempo;
    return a;
  }

}
