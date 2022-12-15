package com.linkedlist;

public class AddNodeFirst {
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

    public void addNodeFirst(Object data)
    {
        Node newNode = new Node(data);
        newNode.ref = head;
        head = newNode;
    }

    public void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            if(temp.ref!=null)
                System.out.print(temp.data + "->");
            else
                System.out.println(temp.data);
            temp=temp.ref;
        }
    }

    public static void main(String[] args)
    {
        AddNodeFirst obj = new AddNodeFirst();
        obj.addNodeFirst(70);
        obj.display();
        obj.addNodeFirst(30);
        obj.display();
        obj.addNodeFirst(56);
        obj.display();
    }
}
