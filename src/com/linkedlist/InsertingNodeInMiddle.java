package com.linkedlist;

public class InsertingNodeInMiddle {
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
    public void deleteNodeLast()
    {
        if(head == null)
            System.out.println("Linked List is Empty");
        else if(head.ref == null)
            head = null;
        else
        {
            Node temp = head;
            while(temp.ref.ref != null)
            {
                temp = temp.ref;
            }
            temp.ref = null;
        }

    }
    public Object findNode(Object input)
    {
        Node temp = head;
        int index =0;
        while(temp != null)
        {
            index++;
            if(temp.data == input)
            {
                String result =  temp.data+" found at index "+index;
                return result;
            }

            temp = temp.ref;
        }
        return null;
    }
    public void addNodeSpecific(Object afterElement,Object newElement)
    {
        Node newNode = new Node(newElement);
        Node temp = head;

        int index = 0;
        while(temp.data != afterElement)
        {
            index++;
            temp = temp.ref;
        }
        Node left = head;
        Node right = left.ref;
        int index1 =0;
        while(index1 < index)
        {
            index1++;
            left = left.ref;
            right = right.ref;
        }
        newNode.ref = right;
        left.ref = newNode;

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
        InsertingNodeInMiddle obj = new InsertingNodeInMiddle();
        obj.addNodeFirst(56);
        obj.display();
        obj.addNodeLast(70);
        obj.display();
        System.out.println(obj.findNode(70));
        obj.addNodeBetween(30,1);
        obj.display();
        obj.deleteNodeFirst();
        obj.display();
        obj.deleteNodeLast();
        obj.display();
        System.out.println(obj.findNode(70));
        obj.addNodeSpecific(30,55);
        obj.display();
    }
}
