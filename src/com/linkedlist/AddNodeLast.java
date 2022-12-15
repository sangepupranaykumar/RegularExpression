package com.linkedlist;

public class AddNodeLast {
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

    public void addNodeLast(Object data)
    {
        Node newNode = new Node(data);
        Node temp = head;
        if(head == null)
            head = newNode;
        else if(head.ref == null)
            head.ref = newNode;
        else
        {
            while(temp.ref != null)
            {
                temp = temp.ref;
            }
            temp.ref = newNode;
        }
    }

    public static void main(String[] args)
    {
        AddNodeLast obj = new AddNodeLast();
        obj.addNodeLast(56);
        obj.display();
        obj.addNodeLast(30);
        obj.display();
        obj.addNodeLast(70);
        obj.display();
    }
}
