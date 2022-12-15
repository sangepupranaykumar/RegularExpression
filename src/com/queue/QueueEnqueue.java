package com.queue;

public class QueueEnqueue {
    LinkedList list = new LinkedList();
    public void enQueue(Object data)
    {
        list.addNodeFirst(data);
    }
    public void display()
    {
        list.display();
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Stack and Queue Data structure");
        QueueEnqueue queue = new QueueEnqueue();
        queue.enQueue(70);
        queue.enQueue(30);
        queue.enQueue(56);
        queue.display();
    }
}
