package com.example.domain.LinkedList;

public class LL {

  private Node head;
  private Node tail;
  private int size;

  public LL() {
    this.size = 0;
  }


  // insertions in singlyLinked List
  public void insertFirst(int value) {
    Node node = new Node(value);
    node.next = head;
    head = node;
    if (tail == null) {
      tail = head;
    }
    size += 1;
  }

  public void insertLast(int value) {
    Node node = new Node(value);
    if (size == 0) {
      insertFirst(value);
      return;
    }
    tail.next = node;
    tail = node;
    size += 1;
  }

  public void insertAtIndex(int value, int index) {
    if (index == 0) {
      insertFirst(value);
      return;
    }
    if (index == size) {
      insertLast(value);
      return;
    }
    Node tempNode = head;
    for (int i = 0; i < index; i++) {
      tempNode = tempNode.next;
    }
    Node node = new Node(value, tempNode.next);
    tempNode.next = node;
    size += 1;
  }

  public  void insertRecursion( int value, int index){
      head = insertRecursion( value,index,head);

  }

   public  Node insertRecursion( int value, int index, Node node){
     if( index == 0){
        Node temp = new Node(value,node);
         size ++;
         return temp;
     }

      node.next = insertRecursion( value,index-1,node.next);
      return node;
   }



    public void insertEndRecursion(int value){
     head = insertEndRecursion(value,head);
    }

    public   Node  insertEndRecursion( int value, Node head){
     if(head == null){
       Node node = new Node(value);
       size++;
        return  node;
     }
       head.next = insertEndRecursion( value,head.next);
      return head;
    }

  public int deleteFirst() {
    int val = head.value;
    head = head.next;
    if (tail == null) {
      tail = null;
    }
    size--;
    return val;
  }

  public int deleteLast() {
    Node node = get(size - 2); //last but 1 node
    if (size <= 1) {
      return deleteFirst();
    }
    int val = tail.value;
    tail = node;
    tail.next = null;
    size--;
    return val;
  }

  public int deleteAtIndex(int index) {
     if(index == 0){
       return deleteFirst();
     }
     if(index == size -1){
       return deleteLast();
     }
     Node prev = get(index -1);
     int val = prev.next.value;
     prev.next = prev.next.next;
     size--;
     return val;
  }

  public Node get(int index) {
    Node node = head;
    for (int i = 0; i < index; i++) {
      node = node.next;
    }
    System.out.print("node at index " + index + " is " + node.value + "\n");
    return node;
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
    Node tempNode = head;
    for (int i = 0; i < size; i++) {
      System.out.print(tempNode.value + " --> ");
      tempNode = tempNode.next;
    }
    System.out.println("END");
  }

   //
  public void removeDuplicates(){
     Node node  = head;
      while (node.next!=null){
        if(node.value == node.next.value){
          node.next = node.next.next;
          size--;
        }
        else{
          node = node.next;
        }
      }
      tail = node;
      tail.next = null;

  }
  //merge 2 sorted lists


  public static void main(String[] args) {

//    ll.insertLast(1);
//    ll.insertLast(1);
//    ll.insertLast(2);
//    ll.insertLast(3);
//    ll.insertLast(3);
//    ll.insertLast(4);
//    ll.insertLast(4);
//    ll.display();
//    ll.removeDuplicates();
//    ll.display();
     LL first = new LL();
     LL second = new LL();

    first.insertLast(1);
    first.insertLast(3);
    first.insertLast(5);

    second.insertLast(1);
    second.insertLast(2);
    second.insertLast(9);
    second.insertLast(14);

     LL ans = LL.merge2SortedListed(first,second);
    ans.display();



  }

  private static LL merge2SortedListed(LL first, LL second) {
      Node f = first.head;
      Node s = second.head;
       LL ans = new LL();
       while (f!= null && s!=null){
          if(f.value <s.value){
            ans.insertLast(f.value);
            f = f.next;
          }
          else {
            ans.insertLast(s.value);
            s = s.next;
          }
       }
        while (f!=null){
          ans.insertLast(f.value);
          f = f.next;
        }
        while (s!=null){
          ans.insertLast(s.value);
          s = s.next;
        }

        return  ans;
  }


  private class Node {
    private int value;
    private Node next;

    public Node(int value) {
      this.value = value;
    }

    public Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }

}
