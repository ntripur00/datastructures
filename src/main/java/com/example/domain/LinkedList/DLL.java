package com.example.domain.LinkedList;

import java.awt.event.ItemEvent;

public class DLL {

  private Node head;
  private Node tail;
  private int size;

  public DLL() {
    this.size = 0;
  }

  public void insertFirst(int val) {
    Node node = new Node(val);
    node.next = head;
    node.prev = null;
    if (head != null) {
      head.prev = node;
    }
    head = node;
    size += 1;
  }

  public void insertLast(int val) {
     Node node = new Node(val);
     Node last = head;
       if (head==null){
         node.prev =null;
         head = node;
         return;
       }
        while(last.next!=null){
          last = last.next;
        }
         last.next = node;
        node.prev = last;

    size+=1;
  }
   public  void insertAtIndex( int val, int index){

      if (index == 0){
        insertFirst(val);
        return;
      }
      if(index == size){
         insertLast(val);
         return;
      }
       Node tempNode = head;
       for ( int i =0;i<index;i++){
         tempNode = tempNode.next;
       }
     Node node = new Node(val,tempNode);
       node.next = tempNode.next;
       tempNode.next = node;
       node.prev = tempNode;
        if(node.next !=null) {
          node.next.prev = node;
        }







       size+=1;
   }


  public Node find(int value) {
    Node node = head;
    while (node != null) {
      if (node.value == value) {
        System.out.print("node  at value  " + value + " is " + node + "\n");
        return node;
      }
      node = node.next;
    }

    return null;
  }

  public void display() {
    Node node = head;
    for (int i = 0; i < size; i++) {
      int val = node.value;
      System.out.print(val + " --> ");
      node = node.next;
    }
    System.out.println("END");
  }

  public void displayReverse() {
    Node last = null;
    Node node = head;
    for (int i = 0; i < size; i++) {
      last = node;
      node = node.next;
    }
    while (last != null) {
      System.out.print(last.value + " --> ");
      last = last.prev;
    }
    System.out.println("START");

  }

  private class Node {
    private int value;
    private Node next;
    private Node prev;

    public Node(int value) {
      this.value = value;
    }

    public Node(int value, Node next, Node prev) {
      this.value = value;
      this.next = next;
      this.prev = prev;
    }

    public Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }
}
