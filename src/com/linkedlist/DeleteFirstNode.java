package com.linkedlist;

public class DeleteFirstNode {
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
    public void addNodeBetween(Object data , int position)
    {
        Node newNode = new Node(data);
        int index = 0;
        Node left = head;
        Node right  = left.ref;
        while(index < (position-1))
        {
            left = left.ref;
            right = right.ref;
            index++;
        }
        newNode.ref = right;
        left.ref = newNode;

    }
    public void deleteNodeFirst()
    {
        head = head.ref;

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
        DeleteFirstNode obj = new DeleteFirstNode();
        obj.addNodeFirst(56);
        obj.display();
        obj.addNodeLast(70);
        obj.display();
        obj.addNodeBetween(30,1);
        obj.display();
        obj.deleteNodeFirst();
        obj.display();
    }
}
