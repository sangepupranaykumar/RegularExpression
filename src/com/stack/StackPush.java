package com.stack;

public class StackPush {
    LinkedList list = new LinkedList();
    public void push(Object data)
    {
        list.addNodeLast(data);
    }
    public void display()
    {
        list.display();
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to Stack and Queue Data structure");
        StackPush stack = new StackPush();
        stack.push(56);
        stack.push(30);
        stack.push(70);
        stack.display();
    }
}
