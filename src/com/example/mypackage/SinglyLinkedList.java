package com.example.mypackage;

public class SinglyLinkedList {
    private Node first;
    private Node last;

    public SinglyLinkedList(){
    }

    public boolean isEmpty(){
        return first==null;
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.setData(data);
        newNode.setNext(first);
        if(isEmpty()){
            last = newNode;
        }
        first = newNode;

    }

    public void insertLast(int data){

        Node newNode = new Node();
        newNode.setData(data);
        last.setNext(newNode);
        last = newNode;

    }

    public Node deleteFirst(){
        Node temp = first;
        if(first.getNext()==null){
            last=null;
        }
        first = first.getNext();
        return temp;
    }

    public void displayList(){
        System.out.println("List (first ---> last)");
        Node current = first;
        while(current !=null){
            current.displayNode();
            current = current.getNext();
        }
        System.out.println("End");

    }
}
