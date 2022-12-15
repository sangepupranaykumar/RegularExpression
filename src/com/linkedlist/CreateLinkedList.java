package com.linkedlist;

public class CreateLinkedList {
    Node head;

    class Node
    {
        Object data;
        Node ref;
        Node(Object data)
        {
            this.data = data;
        }
    }
    /*
     * Function to create a Linked List
     */
    public void elements(Object data)
    {
        Node newNode = new Node(data);
        System.out.print(newNode.data+"->");
    }

    public static void main(String[] args)
    {
        CreateLinkedList obj = new CreateLinkedList();
        obj.elements(56);
        obj.elements(30);
        obj.elements(70);
    }
}
