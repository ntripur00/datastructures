package com.example.domain.LinkedList;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
public class SinglyLinkedList {
   private Nodee head;
   private Nodee tail;
   private int size;

   public Nodee createSinglyLinkedList(int nodeValue){
     head = new Nodee();
     Nodee node = new Nodee();
     node.setNodeValue(nodeValue);
     node.setNext(null);
     head = node;
     tail = node;
     size = 1;
//     log.debug("{}",head.getNodeValue());
     //O(1)
      return head;
     }

      //insert Method SinglyLinkedList
     //first
  //last
  //anywhere else
   public void insertInLinkedList(int nodeValue, int location){
      Nodee node = new Nodee();
      node.setNodeValue(nodeValue);
       if(head ==  null){
         createSinglyLinkedList(nodeValue);
         return;
       }
       else if (location == 0){ //first
           node.setNext(head);

           head = node;
       }
       else if(location >= size){ //last
         node.setNext(null);

         tail.setNext(node);
         tail = node;
       }
       else {
         Nodee tempNode = head; //start with head and loop through
          int index = 0;
           while (index < location - 1){ //looping till we reach the specified node
             tempNode  = tempNode.getNext();
             index++;
           }
            Nodee nextNode = tempNode.getNext();
           tempNode.setNext(nextNode);
       }
       size++;
//       log.debug("{}",head.getNodeValue());
   }

    public void traverseSinglyLinkedList(){
      if(head == null){
        return;
      }
      else{
        Nodee tempNode = head;
         for(int i =0;i<size;i++){
           System.out.print(tempNode.getNodeValue());
            if(i != size -1){
              System.out.print(" --> ");
            }
           tempNode = tempNode.getNext();
         }
        System.out.print("\n");
      }
    }
    public boolean searchNode(int nodeValue){
     if(head!=null){
       Nodee tempNode = head;
       for(int i =0; i<size;i++){
         if(tempNode.getNodeValue() == nodeValue){
           System.out.print("found node at location " + i + "\n");
            return true;
         }
         tempNode = tempNode.getNext();
       }
     }
     System.out.print("node not found!");
      return false;
    }

     public void deleteNode(int location){
     if (head ==null){
       System.out.print("single LinkedList does not exist!");
        return;
     }
     else if (location ==0) { //first
       //more than 1
       head = head.getNext();
       size--;
       if (size == 0) {
         head.setNext(null);
         tail.setNext(null); //??
       }
     }
     else if ( location >= size){
         Nodee tempNode = head;
          for(int i =0;i<size-1 ; i++){
             tempNode = tempNode.getNext();
          }
          if(tempNode == head){
            head.setNext(null);
            tail.setNext(null);
            size--;
            return;
          }
          tempNode.setNext(null);
          tail = tempNode;
          size--;
     }
     else {
        Nodee tempNode = head;
        for (int i =0; i< location-1; i++){
          tempNode = tempNode.getNext();
        }
        tempNode.setNext(tempNode.getNext().getNext());
        size --;
     }

     }

   }

