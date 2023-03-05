package com.example.domain.LinkedList;

class MyLinkedList {

  Node head;
  Node tail;
  int size;

  public class Node {
    int value;
    Node next;

    public Node(int value) {
      this.value = value;
    }

    public Node(int value, Node node) {
      this.value = value;
      this.next = node;
    }
  }

  public MyLinkedList() {
    this.size = 0;
  }

  public int get(int index) {
    System.out.println("--------------------------------------");
    display();
    System.out.print(" index is " + index + "\n");

    int val;
    System.out.print(" size is " + size + "\n");
    display();
    if (index > size - 1) {
      val = -1;
    } else if (index == size) {
      val = head.value;
    } else {
      Node node = head;
      for (int i = 0; i < index; i++) {
        node = node.next;
      }
      System.out.println("--------------------------------------");

      val = node.value;
      System.out.println("get(" + index + ") = " + val);

    }
    return val;

  }

  public Node getNode(int index) {
    if (index > size) {
      return new Node(-1);
    } else {
      Node node = head;
      for (int i = 0; i < index; i++) {
        node = node.next;
      }
      return node;
    }

  }

  public void addAtHead(int val) {
    System.out.println("--------------------------------------");
    display();
    System.out.println("------ addAtHead()-----");

    Node node = new Node(val);
    node.next = head;
    head = node;
    if (tail == null) {
      tail = head;
    }
    size++;
    display();
    System.out.println("--------------------------------------");


  }

  public void addAtTail(int val) {
    System.out.println("--------------------------------------");
    display();
    System.out.println("------ addAtTail()-----");
    Node node = new Node(val);
    if (size == 0) {
      addAtHead(val);
      return;
    }
    tail.next = node;
    tail = node;
    size++;
    display();
    System.out.println("--------------------------------------");

  }

  public void display() {
    Node node = head;
    for (int i = 0; i < size; i++) {
      System.out.print(node.value + " --> ");
      node = node.next;
    }
    System.out.println("END");

  }

  public void addAtIndex(int index, int val) {

    System.out.println("--------------------------------------");
    display();
    System.out.println("------ addAtIndex()----- " + index + " value is " + val);

    if (index == 0) {
      addAtHead(val);
      return;
    }
    if (index == size) {
      addAtTail(val);
      return;
    }

    Node temp = head;
    for (int i = 0; i < index - 1; i++) {
      temp = temp.next;
    }
    System.out.println("temp value " + temp.value);
    if (temp != null) {
      Node node = new Node(val, temp.next);
      temp.next = node;
      size++;
    }
    display();
    System.out.println("--------------------------------------");


  }

  public void deleteAtFirst() {

    head = head.next;
    size--;


  }

  public void deleteAtEnd() {
    Node node = getNode(size - 2);
    if (size <= 1) {
      deleteAtFirst();
      return;
    }
    tail = node;
    tail.next = null;
    size--;
  }

  public void deleteAtIndex(int index) {
    System.out.println("--------------------------------------");
    display();
    System.out.println("------ deleteAtIndex()----- " + index);
    if (index == 0) {
      deleteAtFirst();
    }
    if (index == size - 1) {
      deleteAtEnd();
    }
    if (index < size) {
      Node prev = getNode(index - 1);
      prev.next = prev.next.next;
      size--;
    }
    display();
    System.out.println("--------------------------------------");

  }
}


/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
