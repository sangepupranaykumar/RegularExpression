package com.queue;

public class QueueDequeue {
    LinkedList list = new LinkedList();
    public void enQueue(Object data)
    {
        list.addNodeFirst(data);
    }
    public void deQueue()
    {
        list.deleteNodeFirst();
    }
    public void display()
    {
        list.display();
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to Stack and Queue Data structure");
        QueueDequeue queue = new QueueDequeue();
        queue.enQueue(70);
        queue.enQueue(30);
        queue.enQueue(56);
        queue.display();
        queue.deQueue();
        queue.display();
        queue.deQueue();
        queue.display();
        queue.deQueue();
        queue.display();

    }
}
